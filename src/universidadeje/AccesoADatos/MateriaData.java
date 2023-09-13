
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
    
     
    public Materia buscarMateria(int id) {
        String buscarMaterSql = "SELECT `nombre`, `aniomateria`, `estado` FROM `materia` WHERE idMateria = ? AND estado = true";
        Materia materia = null;
        try {

            PreparedStatement buscarMateriaPs = con.prepareStatement(buscarMaterSql);
            buscarMateriaPs.setInt(1, id);
            ResultSet rs = buscarMateriaPs.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);             
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No se encontro la Materia");

            }
            buscarMateriaPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda de la Materia " + ex.getMessage());
        }
        return materia;

    }
      
     
     public List<Materia> listaMateria() {
        String sql = "SELECT * FROM materia WHERE estado = 1";

        List<Materia> mater = new ArrayList<Materia>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet setr = ps.executeQuery();

            Materia materia;

            while (setr.next()) {
                materia = new Materia();
                materia.setIdMateria(setr.getInt("idMateria"));      
                materia.setNombre(setr.getString("nombre"));   
                materia.setAnioMateria(setr.getInt("anioMateria"));
                materia.setEstado(true);

                mater.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro la lista de materias" + ex.getMessage());
        }

        return mater;
    }
     
     
     public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre=?, anioMateria=? WHERE idMateria=?";
        try {
            PreparedStatement my = con.prepareStatement(sql);
            
            my.setString(1, materia.getNombre());
            my.setInt(2, materia.getAnioMateria());
            my.setInt(3, materia.getIdMateria());
            
            int exito = my.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modification exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "La Materia no exite");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a materia" + ex.getMessage());
        }
    }
     
     
     public void eliminarMateria(int id) {
        String mysql = "UPDATE materia SET estado=0 WHERE idMateria =?";
        try {
            PreparedStatement fr = con.prepareStatement(mysql);
            fr.setInt(1, id);
            int filas=fr.executeUpdate();
            
            if (filas==1) {
                JOptionPane.showMessageDialog(null, "Materia Eliminada.");
            }else{JOptionPane.showMessageDialog(null, "No se pudo Eliminar la Materia");}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el estado" + ex.getMessage());

        }
     
     }
}
