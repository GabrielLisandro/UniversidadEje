package universidadeje.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
            if (Columna == 2) {
                return true;
            }
            return false;
        }
    };

    public CargaDeNotas() {
        iData = new InscripcionData();
        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>) aData.listaAlumno();
        mData = new MateriaData();
        Alumno alu = new Alumno();
        listaI = (ArrayList<Inscripcion>) iData.listaInscrPorAlum(alu.getIdAlumno());

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

        // TODO add your handling code here:
        //seleccion de fila
        int fila = jTtabla.getSelectedRow();
        if (fila != -1) {

            //declaracion de variables para enviar al metodo actualizar nota
            int i = jTtabla.getSelectedRow();
            double nota = Double.parseDouble(jTtabla.getModel().getValueAt(i, 2).toString());

            //if para que la nota este entre 1 y 10
            //Le puse entre 0 y 10 por si es muy aplazado el alumne. atte Gabriel
            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(null, "La nota debe ser entre 1 y 10.");
            } else {

                //declaracion de variables para enviar al metodo actualizar nota
                String nombre = jCalumnos.getSelectedItem().toString();
                int idAlumno = buscarIdAlumnoPorNombre(nombre);
                int idMateria = Integer.parseInt(jTtabla.getModel().getValueAt(i, 0).toString());

                //metodo para actualizar nota
                iData.actualizarNota(idAlumno, idMateria, nota);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno");

        }
    }//GEN-LAST:event_jBguardarActionPerformed


    private void jCalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalumnosActionPerformed

        mostrarNota();

    }//GEN-LAST:event_jCalumnosActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();

    }//GEN-LAST:event_jBsalirActionPerformed

    //Cargamos los aLumnos al ComboBox
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
                if (alumno.toString().equals(selectedAlumnoName)) {
                    List<Inscripcion> listaI = iData.listaInscrPorAlum(alumno.getIdAlumno());
                    for (Inscripcion inscrip : listaI) {
                        Materia mate = inscrip.getMateria();
                        modelo.addRow(new Object[]{
                            mate.getIdMateria(),
                            mate.getNombre(),
                            inscrip.getNota()
                        });
                    }
                    break; // Salir del bucle una vez que encuentres el alumno
                }
            }
        }
    }

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private int buscarIdAlumnoPorNombre(String nombre) {
        int idAlumno = -1; // Valor por defecto si no se encuentra

        for (Alumno alumno : listaA) {
            if (alumno.toString().equals(nombre)) {
                idAlumno = alumno.getIdAlumno();
                break; // Salir del bucle una vez que encuentres el alumno
            }

        }
        return idAlumno;

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

    private Iterable<Alumno> listaA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
