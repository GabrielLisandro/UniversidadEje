/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidadeje.AccesoADatos.AlumnoData;
import universidadeje.AccesoADatos.InscripcionData;
import universidadeje.AccesoADatos.MateriaData;
import universidadeje.Entidades.*;
/**
 *
 * @author sucom
 */
public class InscripcionVista extends javax.swing.JInternalFrame {

    
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
         

    
    
    public InscripcionVista() {
        initComponents();
    

   
    aData = new AlumnoData();
    listaA = (ArrayList<Alumno>) aData.listaAlumno();
    modelo = new DefaultTableModel();
    CargaAlumnos();
    
    
    
    
    
    }
    
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jBinscribir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRnoinscriptas = new javax.swing.JRadioButton();
        jBanular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCalumnos = new javax.swing.JComboBox<>();
        jRinscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();

        setTitle("Inscripciones");

        jLabel1.setText("Seleccione un Alumno: ");

        jBsalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBinscribir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBinscribir.setText("Inscribir");
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setText("Formulario de Inscripción");

        jRnoinscriptas.setText("Materias No Inscriptas");

        jBanular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBanular.setText("Anular Inscripcion");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel7.setText("Listado de Materias");

        jCalumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRinscriptas.setText("Materias Inscriptas");
        jRinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRinscriptasActionPerformed(evt);
            }
        });

        jTtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTtabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jBinscribir)
                                    .addGap(38, 38, 38)
                                    .addComponent(jBanular)
                                    .addGap(35, 35, 35)
                                    .addComponent(jBsalir))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jRinscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRnoinscriptas)))
                            .addGap(16, 16, 16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRinscriptas)
                    .addComponent(jRnoinscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBanular)
                    .addComponent(jBsalir)
                    .addComponent(jBinscribir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jRinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRinscriptasActionPerformed
        
        
        
        
        
        
    }//GEN-LAST:event_jRinscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBanular;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRinscriptas;
    private javax.swing.JRadioButton jRnoinscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables
}
