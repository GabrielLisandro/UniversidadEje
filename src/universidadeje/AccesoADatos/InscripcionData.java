package universidadeje.AccesoADatos;

import static java.awt.event.PaintEvent.UPDATE;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadeje.Entidades.Alumno;
import universidadeje.Entidades.Inscripcion;
import universidadeje.Entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    private final MateriaData md = new MateriaData();
    private final AlumnoData ad = new AlumnoData();
    public InscripcionData() {

    con = Conexion.getConexion();
    }

    public void guarInscripcion(Inscripcion ins) {
        
        String guarInscripSql = "INSERT INTO `inscripcion`(`idMateria`, `idAlumno`, `nota`)"
                + "VALUES (?,?,?)";

        try {
            PreparedStatement guarInscripPs = con.prepareStatement(guarInscripSql, Statement.RETURN_GENERATED_KEYS);

            guarInscripPs.setInt(1, ins.getMateria().getIdMateria());
            guarInscripPs.setInt(2, ins.getAlumno().getIdAlumno());
            guarInscripPs.setDouble(3, ins.getNota());

            guarInscripPs.executeUpdate();
            ResultSet rs = guarInscripPs.getGeneratedKeys();
            
            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Inscripcion Agendada");

            } else {
                JOptionPane.showMessageDialog(null, "La Inscripcion no se pudo realizar");
            }
            guarInscripPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse en Inscripcion: " + ex.getMessage());
        }
    }

        
     public List<Inscripcion> listaInscripcion() {
         
        String qer = "SELECT * FROM Inscripcion ";

        List<Inscripcion> Inscr = new ArrayList<Inscripcion>();
        
        try {
            PreparedStatement psq = con.prepareStatement(qer);
            ResultSet setr = psq.executeQuery();

            Inscripcion inscripcion;

            while (setr.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(setr.getInt("idInscripcion"));
                Alumno Alum = ad.buscarAlumno(setr.getInt("idAlumno"));
                Materia Mater = md.buscarMateria(setr.getInt("idMateria"));
                inscripcion.setAlumno(Alum);
                inscripcion.setMateria(Mater);
                inscripcion.setNota(setr.getDouble("nota"));
                
                Inscr.add(inscripcion);
           }
            psq.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con Inscripcion: " + ex.getMessage());
        }
        return Inscr;
    }   
        
     
     public List<Inscripcion> listaInscrPorAlum(int idAlumno) {
         
        String qer = "SELECT * FROM Inscripcion WHERE idAlumno = ? ";

        List<Inscripcion> Inscr = new ArrayList<Inscripcion>();
        
        try {
            PreparedStatement psq = con.prepareStatement(qer);
            psq.setInt(1, idAlumno);
            ResultSet setr = psq.executeQuery();

            Inscripcion inscripcion;

            while (setr.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(setr.getInt("idInscripcion"));
                Alumno Alum = ad.buscarAlumno(setr.getInt("idAlumno"));
                Materia Mater = md.buscarMateria(setr.getInt("idMateria"));
                inscripcion.setAlumno(Alum);
                inscripcion.setMateria(Mater);
                inscripcion.setNota(setr.getDouble("nota"));
                
                Inscr.add(inscripcion);
            }
            psq.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con Inscripcion: " + ex.getMessage());
        }
        return Inscr;
    }   
     
     
    public List<Materia> obtenerMateriaCursadas(int idAlumno) {
        
        String sqlInMat = "SELECT inscripcion.idMateria , nombre , anioMateria FROM inscripcion, materia "
                + "WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";

        List<Materia> InMat = new ArrayList<Materia>();
        
        try {
            PreparedStatement InMatpsq = con.prepareStatement(sqlInMat);
            InMatpsq.setInt(1, idAlumno);
            ResultSet rS = InMatpsq.executeQuery();

            Materia materia;

            while (rS.next()) {
                materia = new Materia();
                materia.setIdMateria(rS.getInt("idMateria"));           
                materia.setNombre(rS.getString("nombre"));
                materia.setAnioMateria(rS.getInt("anioMateria"));
                materia.setEstado(true);
                
                InMat.add(materia);
            }
            InMatpsq.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con Inscripcion: " + ex.getMessage());
        }
        return InMat;
    }   
     
    
        public List<Materia> obtenerMateriaNoCursadas(int idAlumno) {
            
        String sqlInMat = "SELECT * FROM materia WHERE estado = 1 AND "
                + "idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";

        List<Materia> InMat = new ArrayList<Materia>();
        
        try {
            PreparedStatement InMatpsq = con.prepareStatement(sqlInMat);
            InMatpsq.setInt(1, idAlumno);
            ResultSet rS = InMatpsq.executeQuery();

            Materia materia;

            while (rS.next()) {
                materia = new Materia();
                
                materia.setIdMateria(rS.getInt("idMateria"));           
                materia.setNombre(rS.getString("nombre"));
                materia.setAnioMateria(rS.getInt("anioMateria"));
                materia.setEstado(true);
                InMat.add(materia);
            }
            InMatpsq.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con Inscripcion: " + ex.getMessage());
        }
        return InMat;
    }   
     
        
    public void eliminarInscripcion(int idMateria, int idAlumno) {
    
        String elim = "DELETE FROM `inscripcion` WHERE idMateria = ? AND idAlumno = ?";
        
        try {
            
            PreparedStatement elimin = con.prepareStatement(elim);
            elimin.setInt(1, idMateria);
            elimin.setInt(2, idAlumno);
            
            int supr = elimin.executeUpdate();
            
            if (supr > 0) {
                JOptionPane.showMessageDialog(null, "Se elimino excitosamente la Inscripcion");
            
            }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la Inscripcion");
            }
            elimin.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Inscripcion: "+ ex.getMessage());
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
    String sqlNota = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
    
        try {
            PreparedStatement psNota = con.prepareStatement(sqlNota);
            
            psNota.setDouble(1, nota);
            psNota.setInt(2, idAlumno);
            psNota.setInt(3, idMateria);
            
            int rest = psNota.executeUpdate();
            
            if (rest>0){
            JOptionPane.showMessageDialog(null, "¡Nota Modificada!");
            
            }else{
            JOptionPane.showMessageDialog(null, "No se pudo hacer la modificación");
            }
            psNota.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al hacer la modificación: " + ex.getMessage());
        }
}
    
    
    public List<Alumno> obtenerAlumnoPorMateria (int idMateria){
    
        ArrayList <Alumno> aluMat = new ArrayList<>();
        
    String sqlMat = "SELECT * FROM inscripcion, alumno "
            + "WHERE inscripcion.idAlumno = alumno.idAlumno AND idMateria = ? AND estado = 1";
    
    try{
    PreparedStatement psAluMat = con.prepareStatement(sqlMat);
    
    psAluMat.setInt(1, idMateria);
    ResultSet rs = psAluMat.executeQuery();
    
    Alumno alumno;
    
    while (rs.next()){
    
        alumno = new Alumno();
        
        alumno.setIdAlumno(rs.getInt("idAlumno"));
        alumno.setApellido(rs.getString("apellido"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setDni(rs.getInt("dni"));
        alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
        alumno.setEstado(true);
        
        aluMat.add(alumno);
    }
    psAluMat.close(); 
       
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al conectarse: " + ex.getMessage());
    }
    return aluMat;
    }
}
      



