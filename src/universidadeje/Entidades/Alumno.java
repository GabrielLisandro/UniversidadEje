
package universidadeje.Entidades;

import java.time.LocalDate;

/**
 *
 * @author kamar
 */
public class Alumno {
    
    private int idAlumno;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private boolean estado;
    private int dni;
   
    public Alumno(){
    }
    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNac, boolean estado, int dni){
        this.idAlumno=idAlumno;
        this.apellido=apellido;
        this.nombre=nombre;
        this.fechaNac=fechaNac;
        this.estado=estado;
        this.dni=dni;
    }

    public Alumno(String apellido, String nombre, LocalDate fechaNac, boolean estado, int dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac=fechaNac;
        this.estado=estado;
        this.dni=dni;    
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", apellido=" + apellido + ", nombre=" + nombre + ", dni="+ dni +'}';
    }
    
    
}
