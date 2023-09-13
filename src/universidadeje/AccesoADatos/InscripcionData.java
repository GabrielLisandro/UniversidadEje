
package universidadeje.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadeje.Entidades.Inscripcion;



public class InscripcionData {
    
    private Connection con = null;

    public InscripcionData() {

        con = Conexion.getConexion();
    }
    
   public void guarInscripcion (){
     String guarInscripSql = "INSERT INTO `inscripcion`(`idMateria`, `idAlumno`, `nota`)"
     + "VALUES ('?','?','?')" ;

     Inscripcion ins = new Inscripcion();
     
     
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

            }else{
                JOptionPane.showMessageDialog(null, "La Inscripcion no se pudo realizar" );
            }
            guarInscripPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse en Inscripcion " + ex.getMessage());
        }

    }
    
    
    
    
    
    
    
    
    
    
    
}
