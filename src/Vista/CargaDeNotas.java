package Vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadeje.AccesoADatos.AlumnoData;
import universidadeje.AccesoADatos.InscripcionData;
import universidadeje.AccesoADatos.MateriaData;
import universidadeje.Entidades.Alumno;
import universidadeje.Entidades.Inscripcion;
import universidadeje.Entidades.Materia;

public class CargaDeNotas extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    private List<Inscripcion> listaI;
    private MateriaData mData;
    private AlumnoData aData;
    private InscripcionData iData;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int Columna) {
            return false;
        }
    };

    public CargaDeNotas() {
        iData = new InscripcionData();
        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>) aData.listaAlumno();
        mData = new MateriaData();
//        Alumno alu = new Alumno();
//        listaI = (ArrayList<Inscripcion>) iData.listaInscrPorAlum(alu.getIdAlumno());

        initComponents();
        cargarAlumnos();
        armarCabeceraTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCalumnos = new javax.swing.JComboBox<>();

        setTitle("Actualización de Notas");

        jLabel1.setText("Seleccione un Alumno: ");

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

        jBsalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBguardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel5.setText("Carga de Notas");

        jCalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel5)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBguardar)
                        .addGap(206, 206, 206)
                        .addComponent(jBsalir)
                        .addGap(61, 61, 61))))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBguardar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed


    }//GEN-LAST:event_jBguardarActionPerformed


    private void jCalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalumnosActionPerformed

        mostrarNota();

    }//GEN-LAST:event_jCalumnosActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();

    }//GEN-LAST:event_jBsalirActionPerformed
    private void cargarAlumnos() {
        for (Alumno item : listaA) {
            jCalumnos.addItem(item + "");
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Código");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTtabla.setModel(modelo);
    }

    private void mostrarNota() {
       borrarFilasTabla();
    String selectedAlumnoName = (String) jCalumnos.getSelectedItem();
    if (selectedAlumnoName != null) {
        for (Alumno alumno : listaA) {
        
                List<Inscripcion> listaI = iData.listaInscrPorAlum(alumno.getIdAlumno());
                for (Inscripcion inscrip : listaI) {
                    Materia mate = inscrip.getMateria();
                    modelo.addRow(new Object[]{
                        mate.getIdMateria(),
                        mate.getNombre(),
                        inscrip.getNota()
                    });
                }
                break; // Exit the loop once you find the matching alumno.
            }
        
    }

    }

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables
}
