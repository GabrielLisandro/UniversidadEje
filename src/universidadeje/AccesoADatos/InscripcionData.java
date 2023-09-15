package universidadeje.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
            JOptionPane.showMessageDialog(null, "Error al conectarse en Inscripcion " + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "No se encontro lista de Inscripcion" + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "No se encontro lista de Inscripcion" + ex.getMessage());
        }
        return Inscr;
    }   
     
    public List<Inscripcion> listaInscrPorMater(int idMateria) {
        String sqlInMat = "SELECT * FROM Inscripcion WHERE idMateria = ? AND idMateria.estado = 1";

        List<Inscripcion> InMat = new ArrayList<Inscripcion>();
        try {
            PreparedStatement InMatpsq = con.prepareStatement(sqlInMat);
            InMatpsq.setInt(1, idMateria);
            ResultSet rS = InMatpsq.executeQuery();

            Inscripcion inscripcion;

            while (rS.next()) {
                inscripcion = new Inscripcion();
                
                inscripcion.setIdInscripcion(rS.getInt("idInscripcion"));
                Alumno Alum = ad.buscarAlumno(rS.getInt("idAlumno"));
                Materia Mater = md.buscarMateria(rS.getInt("idMateria"));
                
                inscripcion.setAlumno(Alum);
                inscripcion.setMateria(Mater);
                inscripcion.setNota(rS.getDouble("nota"));
                
                InMat.add(inscripcion);
            }
            InMatpsq.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro lista de Inscripcion" + ex.getMessage());
        }
        return InMat;
    }   
     
        public List<Inscripcion> listaInscrPorMaterNoCursadas(int idMateria) {
        String sqlInMat = "SELECT * FROM Inscripcion WHERE idMateria = ? AND idMateria.estado = 0";

        List<Inscripcion> InMat = new ArrayList<Inscripcion>();
        try {
            PreparedStatement InMatpsq = con.prepareStatement(sqlInMat);
            InMatpsq.setInt(1, idMateria);
            ResultSet rS = InMatpsq.executeQuery();

            Inscripcion inscripcion;

            while (rS.next()) {
                inscripcion = new Inscripcion();
                
                inscripcion.setIdInscripcion(rS.getInt("idInscripcion"));
                Alumno Alum = ad.buscarAlumno(rS.getInt("idAlumno"));
                Materia Mater = md.buscarMateria(rS.getInt("idMateria"));
                
                inscripcion.setAlumno(Alum);
                inscripcion.setMateria(Mater);
                inscripcion.setNota(rS.getDouble("nota"));
                
                InMat.add(inscripcion);
            }
            InMatpsq.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro lista de Inscripcion" + ex.getMessage());
        }
        return InMat;
    }
        
        
        
        
}


