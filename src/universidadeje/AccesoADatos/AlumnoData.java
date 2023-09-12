package universidadeje.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadeje.Entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {

        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {

        String guarAluSql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) "
                + " VALUES (?,?,?,?,?)";

        try {
            PreparedStatement guarAlumPs = con.prepareStatement(guarAluSql, Statement.RETURN_GENERATED_KEYS);

            guarAlumPs.setInt(1, alumno.getDni());
            guarAlumPs.setString(2, alumno.getApellido());
            guarAlumPs.setString(3, alumno.getNombre());
            guarAlumPs.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            guarAlumPs.setBoolean(5, alumno.isEstado());

            guarAlumPs.executeUpdate();
            ResultSet rs = guarAlumPs.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Alumno agendado");

            }
            guarAlumPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error el alumno no se inscribio " + ex.getMessage());
        }

    }

    public Alumno buscarAlumno(int id) {
        String buscarAlumSql = "SELECT `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado` FROM `alumno` WHERE idAlumno = ? AND estado = true";
        Alumno alumno = null;
        try {

            PreparedStatement buscarAlumPs = con.prepareStatement(buscarAlumSql);
            buscarAlumPs.setInt(1, id);
            ResultSet rs = buscarAlumPs.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontro el Alumno");

            }
            buscarAlumPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda del Alumno " + ex.getMessage());
        }
        return alumno;

    }

    public Alumno buscarAlumnoDni(int dni) {
        String buscarAlumSql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento,"
                + "estado FROM alumno WHERE dni = ? AND estado = true";
        Alumno alumno = null;
        try {

            PreparedStatement buscarAlumPs = con.prepareStatement(buscarAlumSql);
            buscarAlumPs.setInt(1, dni);
            ResultSet rs = buscarAlumPs.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el dni del Alumno buscado");
            }
            buscarAlumPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda del Alumno " + ex.getMessage());
        }
        return alumno;
    }

    public List<Alumno> listaAlumno() {
        String qer = "SELECT * FROM alumno WHERE estado = 1";

        List<Alumno> alum = new ArrayList<Alumno>();
        try {
            PreparedStatement psq = con.prepareStatement(qer);
            ResultSet setr = psq.executeQuery();

            Alumno alumno;

            while (setr.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(setr.getInt("idAlumno"));
                alumno.setDni(setr.getInt("dni"));
                alumno.setApellido(setr.getString("apellido"));
                alumno.setNombre(setr.getString("nombre"));
                alumno.setFechaNacimiento(setr.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

                alum.add(alumno);
            }
            psq.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro lista" + ex.getMessage());
        }

        return alum;
    }

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimiento=? WHERE idAlumno=?";
        try {
            PreparedStatement my = con.prepareStatement(sql);
            my.setInt(1, alumno.getDni());
            my.setString(2, alumno.getApellido());
            my.setString(3, alumno.getNombre());
            my.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            my.setInt(5, alumno.getIdAlumno());
            int exito = my.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modification escitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumnado no habria de existir.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a alumno" + ex.getMessage());
        }
    }

    public void eliminarAlumno(int id) {
        String mysql = "UPDATE alumno SET estado=0 WHERE idAlumno =?";
        try {
            PreparedStatement fr = con.prepareStatement(mysql);
            fr.setInt(1, id);
            int filas=fr.executeUpdate();
            
            if (filas==1) {
                JOptionPane.showMessageDialog(null, "Alumno expulsado.");
            }else{JOptionPane.showMessageDialog(null, "Alumno no eliminado");}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar estado" + ex.getMessage());

        }
    }}
