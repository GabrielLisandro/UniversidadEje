package universidadeje;


import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadeje.AccesoADatos.AlumnoData;
import universidadeje.AccesoADatos.MateriaData;
import universidadeje.Entidades.Alumno;
import universidadeje.Entidades.Materia;

public class UniversidadEje {

    public static void main(String[] args) {

        //Alumno alumnonuevo = new Alumno(35124784, "Bermudez", "Carolina", LocalDate.of(1987, 05, 07), true);
        AlumnoData alumno = new AlumnoData();
        //alumno.guardarAlumno(alumnonuevo);
        //alumno.buscarAlumno(1);
       // Alumno alumnoEncontrado;
        //alumnoEncontrado = alumno.buscarAlumnoDni(35124784);
        //JOptionPane.showMessageDialog(null,alumnoEncontrado.toString());
        
        /*for (Alumno alum : alumno.listaAlumno()) {
           JOptionPane.showMessageDialog(null, alum.getDni()+"\n"+alum.getApellido()+"\n"+
                   alum.getNombre()+"\n"+alum.getFechaNacimiento()+"\n");
        }
        Alumno alumnonuevo = new Alumno(2, 35124784, "Bermudez Martin", "Carolina Eugenia", LocalDate.of(1957, 05, 07), true);
        
        alumno.modificarAlumno(alumnonuevo);
        
                alumno.eliminarAlumno(2);
*/
        Materia materia =new Materia(1, "Quimica general", 1, true);
        MateriaData mater = new MateriaData();
        mater.guardarMateria(materia);
    }

}
