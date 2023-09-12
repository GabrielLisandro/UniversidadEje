package universidadeje;


import javax.swing.JOptionPane;
import universidadeje.AccesoADatos.AlumnoData;
import universidadeje.Entidades.Alumno;

public class UniversidadEje {

    public static void main(String[] args) {

        //Alumno alumnonuevo = new Alumno(35124784, "Bermudez", "Carolina", LocalDate.of(1987, 05, 07), true);
        AlumnoData alumno = new AlumnoData();
        //alumno.guardarAlumno(alumnonuevo);
        //alumno.buscarAlumno(1);
        Alumno alumnoEncontrado;
        alumnoEncontrado = alumno.buscarAlumnoDni(35124784);
        JOptionPane.showMessageDialog(null,alumnoEncontrado.toString());
    }

}
