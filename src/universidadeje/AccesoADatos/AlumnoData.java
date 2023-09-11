package universidadeje.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void buscarAlumno(int id) {
        String buscarAlumSql = "SELECT `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado` FROM `alumno` WHERE idAlumno = ? AND estado = true";

        try {
            PreparedStatement buscarAlumPs = con.prepareStatement(buscarAlumSql);

            ResultSet rs = buscarAlumPs.executeQuery();
            buscarAlumPs.setInt(1,id );
            
            if (rs.next()) {
              Alumno alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                
                
            }
            else {
                JOptionPane.showMessageDialog(null, "No se encontro el Alumno");
                
            }
            
            buscarAlumPs.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error en la busqueda del Alumno " + ex.getMessage());
        }

        
        
        
        
    }


    
    
}
