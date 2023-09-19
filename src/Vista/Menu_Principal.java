
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
        jMenuItem2 = new javax.swing.JMenuItem();
        jMinscripciones = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMnotas = new javax.swing.JMenuItem();
        jMalumxmat = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
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

        jMenuItem2.setText("Formulario de Materia");
        jMformMat.add(jMenuItem2);

        jMenuBar1.add(jMformMat);

        jMinscripciones.setText("Administración");

        jMenuItem3.setText("Manejo de Inscripciones");
        jMinscripciones.add(jMenuItem3);

        jMnotas.setText("Manipulación de Notas");
        jMinscripciones.add(jMnotas);

        jMenuBar1.add(jMinscripciones);

        jMalumxmat.setText("Consultas");

        jMenuItem5.setText("Alumnos por Materia");
        jMalumxmat.add(jMenuItem5);

        jMenuBar1.add(jMalumxmat);

        jMsalir.setText("Salir");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jMalumnoActionPerformed

    
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
    private javax.swing.JMenu jMalumno;
    private javax.swing.JMenu jMalumxmat;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMformAlum;
    private javax.swing.JMenu jMformMat;
    private javax.swing.JMenu jMinscripciones;
    private javax.swing.JMenuItem jMnotas;
    private javax.swing.JMenu jMsalir;
    // End of variables declaration//GEN-END:variables
}
