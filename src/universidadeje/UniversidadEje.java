package universidadeje;

import java.sql.Connection;
import universidadeje.AccesoADatos.Conexion;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadeje.AccesoADatos.AlumnoData;
import universidadeje.Entidades.Alumno;

public class UniversidadEje {

    public static void main(String[] args) {

        //Alumno alumnonuevo = new Alumno(35124784, "Bermudez", "Carolina", LocalDate.of(1987, 05, 07), true);

        AlumnoData alumno = new AlumnoData();
       // alumno.guardarAlumno(alumnonuevo);

        
        alumno.buscarAlumno(1);
    }

}
