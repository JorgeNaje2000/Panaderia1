package Presentaciones;

import Datos.Prov;
import Negocios.NegocioProv;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Proveedores extends javax.swing.JFrame {

    public Proveedores() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(2);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        txtID.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtProducto.setEnabled(false);
        txtNombre.setEnabled(false);
        txtRFC.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCorreo.setEnabled(false);
        LLT();
    }
    void Limpiar(){
        txtID.setText("");
        txtProducto.setText("");
        txtNombre.setText("");
        txtRFC.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
    }
    boolean verificar(){
       boolean V;
        if(txtID.getText().isEmpty()||txtCorreo.getText().isEmpty()||txtDireccion.getText().isEmpty()||txtTelefono.getText().isEmpty()
           ||txtNombre.getText().isEmpty()||txtProducto.getText().isEmpty()||txtRFC.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Llenar todos los datos", "Datos faltantes",JOptionPane.INFORMATION_MESSAGE);
           V=false;
        }else{
            V=true;
        }
        return V;
    } 
    public void LLT(){
        try {
            NegocioProv tbl=new NegocioProv();
            tbl.PuenteMostrarTabla(TablaDatos);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Proveedor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, -1));
        jPanel2.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 350, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Producto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 20));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 350, -1));

        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        jPanel2.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("R.F.C");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 350, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Direccion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 20));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefono");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 20));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarSesion_16.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 90, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Guardar_16.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 110, 100));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Editar_16.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 110, 100));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Borrar_16.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 110, 100));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Limpiar_16.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Correo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 20));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 350, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 350, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 240));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 830, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(verificar()){
            int n=JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar?");
            if(n==0){
                Prov prov=new Prov();
                prov.setClaveprov(Integer.parseInt(txtID.getText()));
                try {
                    new NegocioProv().PuenteEliminar(prov);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: "+ex,"Verificar",JOptionPane.ERROR_MESSAGE);
                }
                Limpiar();
                LLT();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtID.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtNombre.setEnabled(true);
        txtProducto.setEnabled(true);
        txtRFC.setEnabled(true);
        txtTelefono.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        Limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(verificar()){
        Prov prov=new Prov();
        prov.setClaveprov(Integer.parseInt(txtID.getText()));
        prov.setProducto(txtProducto.getText());
        prov.setNombre(txtNombre.getText());
        prov.setRfc(txtRFC.getText());
        prov.setTelefono(Integer.parseInt(txtTelefono.getText()));
        prov.setDireccion(txtDireccion.getText());
        prov.setCorreo(txtCorreo.getText());
            try {
                new NegocioProv().PuenteRegistroNvo(prov);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        Limpiar();
        LLT();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        txtCorreo.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtNombre.setEnabled(true);
        txtProducto.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtRFC.setEnabled(true);
        btnGuardar.setEnabled(true);
        if(evt.getButton()==1){
            txtID.setEnabled(false);
            int fila=TablaDatos.getSelectedRow();
            txtID.setText(TablaDatos.getValueAt(fila, 0).toString());
            txtProducto.setText(TablaDatos.getValueAt(fila, 1).toString());
            txtNombre.setText(TablaDatos.getValueAt(fila, 2).toString());
            txtRFC.setText(TablaDatos.getValueAt(fila, 3).toString());
            txtTelefono.setText(TablaDatos.getValueAt(fila, 4).toString());
            txtDireccion.setText(TablaDatos.getValueAt(fila, 5).toString());
            txtCorreo.setText(TablaDatos.getValueAt(fila, 6).toString());
            btnEliminar.setEnabled(true);
            btnEditar.setEnabled(true);
            btnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(verificar()){
        Prov prov=new Prov();
        prov.setClaveprov(Integer.parseInt(txtID.getText()));
        prov.setProducto(txtProducto.getText());
        prov.setNombre(txtNombre.getText());
        prov.setRfc(txtRFC.getText());
        prov.setTelefono(Integer.parseInt(txtTelefono.getText()));
        prov.setDireccion(txtDireccion.getText());
        prov.setCorreo(txtCorreo.getText());
            try {
                new NegocioProv().PuenteActualizar(prov);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR:" +ex,"Verificar",JOptionPane.ERROR_MESSAGE);
            }
            btnGuardar.setVisible(true);
            Limpiar(); 
            LLT();
            }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if(txtID.getText().length()<11){
        char V=evt.getKeyChar();
        if(Character.isDigit(V)){
        }else if(Character.getType(V)!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
        }
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if(txtTelefono.getText().length()<10){
            char V=evt.getKeyChar();
        if(Character.isDigit(V)){
            }else if(Character.getType(V)!=KeyEvent.VK_BACK_SPACE){
                evt.consume();
            }
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        if(txtRFC.getText().length()<13){
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txtRFCKeyTyped

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
