package Presentaciones;

import com.imagen.ClaseImagen;
import javax.swing.JFrame;


public class Principal extends javax.swing.JFrame {

    Productos prod;
    Proveedores prov;
    Ventas venta;
    String Tipo;
    ClaseImagen imagen=new ClaseImagen();
    public Principal() {
        initComponents();
    }
    public Principal(String U) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.Tipo=U;
        if("Admin".equals(this.Tipo)){
        }else if("user".equals(this.Tipo)){
            miProductos.setEnabled(false);
            miProveedores.setEnabled(false);
        }else{
            miProveedores.setEnabled(false);
            miVentas.setEnabled(false);
        }
        imagen.AjustarImagenL(lbLogo, "Imagenes", "LogoBN", "png");
        this.setDefaultCloseOperation(2);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        pnPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        miVentas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        miProductos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        miProveedores = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO A PANADERIA BIZCOCHITOS");
        pnPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 1190, 100));
        pnPrincipal.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 550, 380));

        getContentPane().add(pnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 530));

        jMenu6.setText("Archivo");

        miVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ventas_16.png"))); // NOI18N
        miVentas.setText("Ventas");

        jMenuItem1.setText("Abrir ventas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        miVentas.add(jMenuItem1);

        jMenu6.add(miVentas);

        miProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Productos_16.png"))); // NOI18N
        miProductos.setText("Productos");

        jMenuItem3.setText("Abrir Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        miProductos.add(jMenuItem3);

        jMenu6.add(miProductos);

        miProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Proveedor_16.png"))); // NOI18N
        miProveedores.setText("Proveedores");

        jMenuItem5.setText("Abrir Proveedores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        miProveedores.add(jMenuItem5);

        jMenu6.add(miProveedores);

        miSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarSesion_16.png"))); // NOI18N
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu6.add(miSalir);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        prod=new Productos();
        prod.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        prov=new Proveedores();
        prov.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        venta=new Ventas();
        venta.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JMenu miProductos;
    private javax.swing.JMenu miProveedores;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JMenu miVentas;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
