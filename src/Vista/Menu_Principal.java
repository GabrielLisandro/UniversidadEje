
package Vista;


public class Menu_Principal extends javax.swing.JFrame {

    
    public Menu_Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMalumno = new javax.swing.JMenu();
        jMformAlum = new javax.swing.JMenuItem();
        jMformMat = new javax.swing.JMenu();
        jMforMateria = new javax.swing.JMenuItem();
        jMinscripciones = new javax.swing.JMenu();
        jMInscripciones = new javax.swing.JMenuItem();
        jMnotas = new javax.swing.JMenuItem();
        jMalumxmat = new javax.swing.JMenu();
        jMalumxMat = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );

        jMalumno.setText("Alumno");
        jMalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalumnoActionPerformed(evt);
            }
        });

        jMformAlum.setText("Formulario de Alumno");
        jMformAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformAlumActionPerformed(evt);
            }
        });
        jMalumno.add(jMformAlum);

        jMenuBar1.add(jMalumno);

        jMformMat.setText("Materia");

        jMforMateria.setText("Formulario de Materia");
        jMforMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMforMateriaActionPerformed(evt);
            }
        });
        jMformMat.add(jMforMateria);

        jMenuBar1.add(jMformMat);

        jMinscripciones.setText("Administración");

        jMInscripciones.setText("Manejo de Inscripciones");
        jMInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInscripcionesActionPerformed(evt);
            }
        });
        jMinscripciones.add(jMInscripciones);

        jMnotas.setText("Manipulación de Notas");
        jMnotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnotasActionPerformed(evt);
            }
        });
        jMinscripciones.add(jMnotas);

        jMenuBar1.add(jMinscripciones);

        jMalumxmat.setText("Consultas");
        jMalumxmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalumxmatActionPerformed(evt);
            }
        });

        jMalumxMat.setText("Alumnos por Materia");
        jMalumxMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalumxMatActionPerformed(evt);
            }
        });
        jMalumxmat.add(jMalumxMat);

        jMenuBar1.add(jMalumxmat);

        jMsalir.setText("Salir");
        jMsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMformAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformAlumActionPerformed
      
        escritorio.removeAll();
        escritorio.repaint();
        Alumnos bps = new Alumnos();
        bps.setVisible(true);
        escritorio.add(bps);
        escritorio.moveToFront(bps);
        
        
    }//GEN-LAST:event_jMformAlumActionPerformed

    private void jMalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalumnoActionPerformed
       
    }//GEN-LAST:event_jMalumnoActionPerformed

    private void jMforMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMforMateriaActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        MateriaVista bps = new MateriaVista();
        bps.setVisible(true);
        escritorio.add(bps);
        escritorio.moveToFront(bps);
    }//GEN-LAST:event_jMforMateriaActionPerformed

    private void jMInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        InscripcionVista bps = new InscripcionVista();
        bps.setVisible(true);
        escritorio.add(bps);
        escritorio.moveToFront(bps);
    }//GEN-LAST:event_jMInscripcionesActionPerformed

    private void jMnotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeNotas bps = new CargaDeNotas();
        bps.setVisible(true);
        escritorio.add(bps);
        escritorio.moveToFront(bps);
    }//GEN-LAST:event_jMnotasActionPerformed

    private void jMalumxmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalumxmatActionPerformed

    }//GEN-LAST:event_jMalumxmatActionPerformed

    private void jMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMsalirActionPerformed

    private void jMalumxMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalumxMatActionPerformed
     
    }//GEN-LAST:event_jMalumxMatActionPerformed

    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMInscripciones;
    private javax.swing.JMenu jMalumno;
    private javax.swing.JMenuItem jMalumxMat;
    private javax.swing.JMenu jMalumxmat;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMforMateria;
    private javax.swing.JMenuItem jMformAlum;
    private javax.swing.JMenu jMformMat;
    private javax.swing.JMenu jMinscripciones;
    private javax.swing.JMenuItem jMnotas;
    private javax.swing.JMenu jMsalir;
    // End of variables declaration//GEN-END:variables
}
