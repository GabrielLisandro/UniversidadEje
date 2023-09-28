
package universidadeje.Vistas;

import javax.swing.JOptionPane;
import universidadeje.AccesoADatos.MateriaData;
import universidadeje.Entidades.Materia;

public class MateriaVista extends javax.swing.JInternalFrame {
    MateriaData materiadata = new MateriaData();

    public MateriaVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTnombre = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jTanio = new javax.swing.JTextField();
        jRestado = new javax.swing.JRadioButton();
        jBeliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBguardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();

        setTitle("Gestion de Materias");

        jBbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jRestado.setText("Activa");

        jBeliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        jBguardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jBsalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBnuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setText("Materia");

        jLabel6.setText("Año:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jBnuevo)
                .addGap(18, 18, 18)
                .addComponent(jBeliminar)
                .addGap(18, 18, 18)
                .addComponent(jBguardar)
                .addGap(18, 18, 18)
                .addComponent(jBsalir)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRestado)
                            .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jBbuscar))
                    .addComponent(jTanio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir)
                    .addComponent(jBnuevo))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
try{
        Materia materiaBuscada = materiadata.buscarMateria(Integer.parseInt(jTcodigo.getText()));

        if (materiaBuscada != null) {
            jTnombre.setText(materiaBuscada.getNombre());
            jTanio.setText(materiaBuscada.getAnioMateria()+ "");
            jRestado.setSelected(true);

            activarBotones();

        } else {
            limpiarCampos();
        }
        }catch (NumberFormatException e){
        JOptionPane.showMessageDialog(this, "Ingrese un número valido");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    
    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    
    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        try{
         
        String nombre = jTnombre.getText();
        int anioMateria = Integer.parseInt(jTanio.getText());
        boolean estado = jRestado.isSelected();
   
    // Crear un objeto Materia con los datos ingresados
    Materia nuevaMateria = new Materia(nombre,anioMateria,estado);

    // Llamar al método para guardar el alumno en la base de datos
    materiadata.guardarMateria(nuevaMateria);
            
    // Limpiar los campos después de guardar
        limpiarCampos(); 
        
        }catch (NumberFormatException e){
        JOptionPane.showMessageDialog(this, "Error: Ingrese un dato válido");
        }
        limpiarCampos();        
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
               
        try {
            int codigo = Integer.parseInt(jTcodigo.getText());
            
            if (jTcodigo.getText()!=null) {
                materiadata.eliminarMateria(codigo);
            }
//limpiarCampos();            
        jTcodigo.setText("");
        jTnombre.setText("");
        jTanio.setText("");
        jRestado.setSelected(false);
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: No se pudo eliminar ");
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try{
        int codigo = Integer.parseInt(jTcodigo.getText());    
        String nombre = jTnombre.getText();
        int anioMateria = Integer.parseInt(jTanio.getText());
        boolean estado = jRestado.isSelected();
   
    // Crear un objeto Materia con los datos ingresados
    Materia nuevaMateria = new Materia(codigo,nombre,anioMateria,estado);

    // Llamar al método para guardar el alumno en la base de datos
    materiadata.modificarMateria(nuevaMateria);
            
    // Limpiar los campos después de guardar
        limpiarCampos(); 
        
        }catch (NumberFormatException e){
        JOptionPane.showMessageDialog(this, "Error: Ingrese un dato válido");
        }
    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JTextField jTanio;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables

    
    private void activarBotones() {
        jBeliminar.setEnabled(true);
        jBguardar.setEnabled(true);
    }

    private void limpiarCampos() {
        jTcodigo.setText("");
        jTnombre.setText("");
        jTanio.setText("");
        jRestado.setSelected(false);
    }
}
