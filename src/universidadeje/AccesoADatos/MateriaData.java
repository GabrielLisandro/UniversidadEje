
package universidadeje.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadeje.Entidades.Materia;


public class MateriaData {
     private Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();
}
    public void guardarMateria(Materia materia) {

        String guarMateriaSql = "INSERT INTO Materia (idMateria, nombre, anioMateria, estado) "
                + " VALUES (?,?,?,?)";
        
        try {
            PreparedStatement guarMateriaPs = con.prepareStatement(guarMateriaSql, Statement.RETURN_GENERATED_KEYS);

            guarMateriaPs.setInt(1, materia.getIdMateria());
            guarMateriaPs.setString(2, materia.getNombre());
            guarMateriaPs.setInt(3, materia.getAnioMateria());
            guarMateriaPs.setBoolean(4, materia.isEstado());

            guarMateriaPs.executeUpdate();
            ResultSet rs = guarMateriaPs.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Materia Ingresada");

            }
            guarMateriaPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error la materia no fue Ingresada " + ex.getMessage());
        }

    }
    
    
    
    }   
