
package Vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidadeje.AccesoADatos.AlumnoData;
import universidadeje.AccesoADatos.InscripcionData;
import universidadeje.AccesoADatos.MateriaData;
import universidadeje.Entidades.*;

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
    inscData = new InscripcionData();
    mData = new MateriaData();
    
    cargaAlumnos();
    armarCabeceraTabla();
    
    
    
    
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
        jBinscribir.setEnabled(false);
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setText("Formulario de Inscripción");

        jRnoinscriptas.setText("Materias No Inscriptas");
        jRnoinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRnoinscriptasActionPerformed(evt);
            }
        });

        jBanular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBanular.setText("Anular Inscripcion");
        jBanular.setEnabled(false);
        jBanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel7.setText("Listado de Materias");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(jBinscribir)
                                .addGap(38, 38, 38)
                                .addComponent(jBanular)
                                .addGap(35, 35, 35)
                                .addComponent(jBsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jRinscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRnoinscriptas)
                        .addGap(80, 80, 80)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
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
        
        int filaSeleccionada = jTtabla.getSelectedRow();
        if (filaSeleccionada !=-1) {
            
            Alumno a = (Alumno) jCalumnos.getSelectedItem();
            
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia (idMateria, nombreMateria, anio,true);
            
            
            Inscripcion in = new Inscripcion(m, a, 0);
            inscData.guarInscripcion(in);
            
            borrarFilasTabla();
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jRinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRinscriptasActionPerformed
        borrarFilasTabla();
        jRnoinscriptas.setSelected(false);
        cargaDatosInscriptas();
        jBanular.setEnabled(true);
        jBinscribir.setEnabled(false);
        
        
        
        
        
    }//GEN-LAST:event_jRinscriptasActionPerformed

    private void jRnoinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRnoinscriptasActionPerformed
        borrarFilasTabla();
        jRinscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        jBanular.setEnabled(false);
        jBinscribir.setEnabled(true);
    }//GEN-LAST:event_jRnoinscriptasActionPerformed

    private void jBanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularActionPerformed
        
       int filaSeleccionada = jTtabla.getSelectedRow();
        if (filaSeleccionada !=-1) {
            
            Alumno a = (Alumno) jCalumnos.getSelectedItem();
            
             int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            
        inscData.eliminarInscripcion(idMateria , a.getIdAlumno());
        
        borrarFilasTabla();
        
        }
    }//GEN-LAST:event_jBanularActionPerformed

    private void cargaAlumnos(){
        for (Alumno item: listaA) {
            jCalumnos.addItem(item);
            
        }
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTtabla.setModel(modelo);
    }

     private void borrarFilasTabla() {
         int indice = modelo.getRowCount() -1;
         
         for (int i = indice; i>=0; i--){
             modelo.removeRow(i);
             
         }   
     }
   
      private void cargaDatosNoInscriptas(){
          Alumno selec = (Alumno) jCalumnos.getSelectedItem();
          listaM = (ArrayList) inscData.obtenerMateriaNoCursadas(selec.getIdAlumno());
          for (Materia m: listaM){
              modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(), m.getAnioMateria()}); 
              
              
          }
      }
          private void cargaDatosInscriptas(){
            Alumno selec = (Alumno) jCalumnos.getSelectedItem();
          listaM = (ArrayList) inscData.obtenerMateriaCursadas(selec.getIdAlumno());
          for (Materia m: listaM){
              modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(), m.getAnioMateria()});   
          }
          }
          
      
      
      
      
            
            
            
            
                 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBanular;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRinscriptas;
    private javax.swing.JRadioButton jRnoinscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables
}
