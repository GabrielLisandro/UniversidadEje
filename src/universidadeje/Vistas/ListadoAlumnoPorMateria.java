
package universidadeje.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadeje.AccesoADatos.AlumnoData;
import universidadeje.AccesoADatos.InscripcionData;
import universidadeje.AccesoADatos.MateriaData;
import universidadeje.Entidades.Alumno;
import universidadeje.Entidades.Materia;

public class ListadoAlumnoPorMateria extends javax.swing.JInternalFrame {
    
    private List<Materia> listaM;
    private ArrayList<Alumno> listaA;
    private MateriaData mData;
    private AlumnoData aData;
    private InscripcionData iDate;
    
    private DefaultTableModel modelo = new DefaultTableModel (){ 
    public boolean isCellEditable(int fila, int Columna){
        return false;
    } 
    };
   
    public ListadoAlumnoPorMateria() {
        initComponents();
                
        //listaM = mData.listaMateria();
        mData = new MateriaData();
        aData = new AlumnoData();
        iDate = new InscripcionData();
        
        //obtener alumnos por materias desde inscripcion 
        //cargarDatos();
        armarCabeceraTabla();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCmateria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();

        setTitle("Consulta de Alumnos");

        jBsalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setText("Listado de Alumnos por Materia");

        jCmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmateriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione una Materia: ");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(406, 406, 406)
                            .addComponent(jBsalir)
                            .addGap(129, 129, 129)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel5)))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmateriaActionPerformed
       
       String filasSel = (String) jCmateria.getSelectedItem();
        if (filasSel != null) {
           String[] divi = filasSel.split(", ");
           int id = Integer.parseInt(divi[0]);
            System.out.println("Imprimir "+ id);
            borrarFilasTabla();
            CargarTabla(id);
        }
        
    }//GEN-LAST:event_jCmateriaActionPerformed

    public void CargarTabla(int id){
       
        //Alumno mat = mData.buscarMateria(id);
        for (Alumno alumno : iDate.obtenerAlumnoPorMateria(id)) {
           modelo.addRow(new Object[]{
                alumno.getIdAlumno(), alumno.getDni(),
               alumno.getApellido(), alumno.getNombre()
        }); 
        }
      
    }
    
    public void cargarCombo(){
         for (Materia materia : mData.listaMateria()) {
            jCmateria.addItem(materia.getIdMateria()+", "+materia.getNombre());
        }
    }
    
//    public void cargarDatos(){
//    jTtabla.getModel();
//    modelo.setRowCount(0);
//    jTtabla.repaint();
//    
//    if (materia != null) {
//        List <Alumno> alu= iDate.obtenerAlumnoPorMateria(materia.getIdMateria());
//        for (Alumno alum : alu) {
//            modelo.addRow(new Object[]{
//                alum.getIdAlumno(), alum.getDni(), alum.getApellido(),
//                alum.getNombre()
//            });
//        }
//    }
//}
    
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
             filaCabecera.add("ID");
             filaCabecera.add("DNI");
             filaCabecera.add("Apellido");
             filaCabecera.add("Nombre");
          
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
            jTtabla.setModel(modelo);
    }
    
      private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCmateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables

 

}
