package universidadeje.Vistas;

import java.sql.Date;
import java.time.ZoneId;
import java.util.Calendar;
import javax.swing.JOptionPane;
import universidadeje.AccesoADatos.AlumnoData;
import universidadeje.Entidades.Alumno;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class Alumnos extends javax.swing.JInternalFrame {
    
    AlumnoData alumnodata = new AlumnoData();
    Alumno alumnoBuscado = new Alumno();
    
    public Alumnos() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jRestado = new javax.swing.JRadioButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jDfechanac = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(102, 153, 255));
        setTitle("Gestion de Alumnos");

        jLabel1.setText("Documento");

        jLabel2.setText("Apellido");

        jLabel3.setText("Fecha de Nacimiento");

        jLabel4.setText("Estado");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setText("  Alumno");

        jLabel6.setText("Nombre");

        jBbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jRestado.setText("Activo");
        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });

        jBeliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTdni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jTnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jTapellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jRestado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDfechanac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jBnuevo)
                        .addGap(41, 41, 41)
                        .addComponent(jBeliminar)
                        .addGap(41, 41, 41)
                        .addComponent(jBguardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBbuscar)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBsalir)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBbuscar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRestado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDfechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir)
                    .addComponent(jBnuevo))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed
    

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        
        alumnoBuscado = alumnodata.buscarAlumnoDni(Integer.parseInt(jTdni.getText()));
        
        if (alumnoBuscado != null) {
            jTapellido.setText(alumnoBuscado.getApellido());
            jTnombre.setText(alumnoBuscado.getNombre());
            jRestado.setSelected(true);
            jDfechanac.setDate(java.sql.Date.valueOf(alumnoBuscado.getFechaNacimiento()));
            /*El profesor Luis la fecha de nacimiento la hace:;
            LocalDate lc = alumnoBuscado.getFechaNacimiento();
            java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDfechanac.setDate(date);
             */
            activarBotones();
        } else {
            limpiarCampos();
            alumnoBuscado = null;
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        try {
            int dni = Integer.parseInt(jTdni.getText());
            String apellido = jTapellido.getText();
            String nombre = jTnombre.getText();
            LocalDate fechaNac = jDfechanac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            Alumno al = new Alumno();
            
            Period verificarEdad = Period.between(fechaNac, LocalDate.now());
            
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar los datos");
                
            } else {
                if (verificarEdad.getYears() >= 17) {
                    al.setApellido(apellido);
                    al.setNombre(nombre);
                    al.setDni(dni);
                    al.setFechaNacimiento(fechaNac);
                    al.setEstado(jRestado.isSelected());
                    
                    alumnodata.guardarAlumno(al);
                }else{
                JOptionPane.showMessageDialog(null, "Debe ingresar un Alumno mayor de 17 años");}
                
            }
            
        } catch (Exception e)  {
            JOptionPane.showMessageDialog(null,"Revise los datos");
        }
        
        limpiarCampos();
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        
        try {
            int dni = Integer.parseInt(jTdni.getText());
            
            if (jTdni.getText() != null) {
                alumnodata.eliminarAlumnodni(dni);
            }
            limpiarCampos();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        
        try {
            int dni = Integer.parseInt(jTdni.getText());
            String apellido = jTapellido.getText();
            String nombre = jTnombre.getText();
            if (apellido.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            boolean estado = jRestado.isSelected();
            LocalDate fechaNacimiento = jDfechanac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            /*El profe lo hace asi
                java.util.Date sFecha = jDfechanac.getDate();
        LocalDate fecha = sFecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();*/
//            if (alumnoBuscado == null) {
//                alumnoBuscado = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
//                alumnodata.guardarAlumno(alumnoBuscado);
//            } else {
            alumnoBuscado.setDni(dni);
            alumnoBuscado.setNombre(nombre);
            alumnoBuscado.setApellido(apellido);
            alumnoBuscado.setFechaNacimiento(fechaNacimiento);
            alumnodata.modificarAlumno(alumnoBuscado);
            
            limpiarCampos();
            System.out.println("Funciona");
            alumnoBuscado = null;
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI valido");
        }
    }//GEN-LAST:event_jBguardarActionPerformed
    

    private void jRestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRestadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDfechanac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables

    private void activarBotones() {
        jBeliminar.setEnabled(true);
        jBguardar.setEnabled(true);
    }
    
    private void limpiarCampos() {
        jTdni.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jRestado.setSelected(false);
        jDfechanac.setDate(null);
    }
}
