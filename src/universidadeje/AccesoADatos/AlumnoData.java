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

        String guarAluSql = "INSERT INTO alumno (dni, apellido, nombre, fechadenacimiento, estado) "
                + "+ VALUES (?,?,?,?,?)";

        try {
            PreparedStatement guarAlumPs = con.prepareStatement(guarAluSql, Statement.RETURN_GENERATED_KEYS);

            guarAlumPs.setInt(1, alumno.getDni());
            guarAlumPs.setString(2, alumno.getApellido());
            guarAlumPs.setString(3, alumno.getNombre());
            guarAlumPs.setDate(4, Date.valueOf(alumno.getFechaNac()));
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

}
