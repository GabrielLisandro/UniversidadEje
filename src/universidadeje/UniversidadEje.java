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
 /* Materia materia =new Materia(3, "Matematica", 1, true);*/
        MateriaData mater = new MateriaData();
        /*  mater.guardarMateria(materia);*/

 /* mater.buscarMateria(3);
        Materia materiaEncontrada = mater.buscarMateria(3);
        JOptionPane.showMessageDialog(null, materiaEncontrada.toString());*/
 /*for(Materia materia : mater.listaMateria()) {
           JOptionPane.showMessageDialog(null, materia.getIdMateria()+"\n"+materia.getNombre()+"\n"+
                   materia.getAnioMateria()+"\n"+materia.isEstado()+"\n");*/
     /*   Materia materia = new Materia(3, "Matematica", 2, true);
        mater.modificarMateria(materia);*/

        mater.eliminarMateria(2); 
        
        
    }

}
