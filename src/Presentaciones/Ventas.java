package Presentaciones;

import Datos.Prod;
import Datos.Venta;
import Negocios.NegocioProd;
import Negocios.NegocioVenta;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventas extends javax.swing.JFrame {

    Date fecha=new Date();
    SimpleDateFormat FF=new SimpleDateFormat("YYYY/MM/dd");
    public Ventas() {
        initComponents();
        this.setDefaultCloseOperation(2);
        this.setLocationRelativeTo(this);
        tpAceptar.setVisible(false);
        pnAgregar.setEnabled(false);
        JST.setVisible(true);
        JSTF.setVisible(false);
        lbCP.setVisible(false);
        lbE.setVisible(false);
        Limpiar();
        LLT();
        LLTF();
    }
    public Ventas(String U) {
        initComponents();
        this.setDefaultCloseOperation(2);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }
    void Limpiar(){
        lbPrecio.setText("");
        txtAgregar.setText("");
        lbPanes.setIcon(null);
    }
    boolean verificar(){
       boolean V;
        if(TablaDatos.isFocusOwner()||txtAgregar.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Llenar todos los datos", "Datos faltantes",JOptionPane.INFORMATION_MESSAGE);
           V=false;
        }else{
            V=true;
        }
        return V;
    } 
    public void LLT(){
        try {
            NegocioVenta tbl=new NegocioVenta();
            tbl.PuenteMostrarTablaP(TablaDatos);
        } catch (Exception e) {
        }
    }
    public void LLTF(){
        try {
            NegocioVenta tbl=new NegocioVenta();
            tbl.PuenteMostrarTabla(TablaDatosF);
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnVenta = new javax.swing.JPanel();
        tpAceptar = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnAceptarF = new javax.swing.JButton();
        btnCancelarF = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbPanes = new javax.swing.JLabel();
        pnAgregar = new javax.swing.JPanel();
        lbPrecio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbP = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        pnAgregar1 = new javax.swing.JPanel();
        txtAgregar = new javax.swing.JTextField();
        lbAgregar = new javax.swing.JLabel();
        JST = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        JSTF = new javax.swing.JScrollPane();
        TablaDatosF = new javax.swing.JTable();
        lbE = new javax.swing.JLabel();
        lbCP = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mVenta = new javax.swing.JMenu();
        miVenta = new javax.swing.JMenuItem();
        miVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 722));

        pnVenta.setBackground(new java.awt.Color(153, 102, 0));
        pnVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarF.setMnemonic('p');
        btnAceptarF.setText("Aceptar");
        btnAceptarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarFActionPerformed(evt);
            }
        });
        jPanel5.add(btnAceptarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btnCancelarF.setMnemonic('n');
        btnCancelarF.setText("Cancelar");
        btnCancelarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 3, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("finalizar la venta actual?");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 40));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 3, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("¿Seguro que desea ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 40));

        tpAceptar.addTab("Vender", jPanel5);

        pnVenta.add(tpAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 260, 210));
        pnVenta.add(lbPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 290, 230));

        pnAgregar.setBackground(new java.awt.Color(153, 153, 153));
        pnAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPrecio.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        lbPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnAgregar.add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 130, 50));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("$");
        pnAgregar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 40, 50));

        lbP.setBackground(new java.awt.Color(153, 153, 153));
        lbP.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        lbP.setText("Precio:");
        lbP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        pnAgregar.add(lbP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        pnVenta.add(pnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 290, 50));

        btnTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Precio_16.png"))); // NOI18N
        btnTerminar.setMnemonic('t');
        btnTerminar.setText("Vender");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        pnVenta.add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 570, 150, 50));

        pnAgregar1.setBackground(new java.awt.Color(153, 153, 153));
        pnAgregar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAgregar.setToolTipText("Cantidad de pan a vender (el pan seleccionado)");
        txtAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgregarKeyTyped(evt);
            }
        });
        pnAgregar1.add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 30));

        lbAgregar.setBackground(new java.awt.Color(153, 153, 153));
        lbAgregar.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        lbAgregar.setText("Agregar:");
        lbAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        pnAgregar1.add(lbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        pnVenta.add(pnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 290, 50));

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
        JST.setViewportView(TablaDatos);

        pnVenta.add(JST, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 880, 590));

        TablaDatosF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JSTF.setViewportView(TablaDatosF);

        pnVenta.add(JSTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 880, 590));
        pnVenta.add(lbE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 10));
        pnVenta.add(lbCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, 20));
        pnVenta.add(lbDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 20));

        getContentPane().add(pnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        mVenta.setMnemonic('v');
        mVenta.setText("Venta");

        miVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        miVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ventas_16.png"))); // NOI18N
        miVenta.setText("Nueva venta");
        miVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVentaActionPerformed(evt);
            }
        });
        mVenta.add(miVenta);

        miVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        miVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ticket_16.png"))); // NOI18N
        miVentas.setText("Ventas (folios)");
        miVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVentasActionPerformed(evt);
            }
        });
        mVenta.add(miVentas);

        jMenuBar1.add(mVenta);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVentaActionPerformed
        JSTF.setVisible(false);
        JST.setVisible(true);
    }//GEN-LAST:event_miVentaActionPerformed

    private void txtAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgregarKeyTyped
        char V=evt.getKeyChar();
        if(Character.isDigit(V)){
            
        }else if (Character.getType(V)!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_txtAgregarKeyTyped

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        tpAceptar.setVisible(true);
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void miVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVentasActionPerformed
        JST.setVisible(false);
        JSTF.setVisible(true);
    }//GEN-LAST:event_miVentasActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila=TablaDatos.getSelectedRow();
        lbE.setText((String) TablaDatos.getValueAt(fila, 2));
        lbCP.setText((String) TablaDatos.getValueAt(fila, 0));
        String fe=TablaDatos.getValueAt(fila,4).toString();
        DateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fecha=formato.parse(fe);
            //txtDate.setDate(fecha);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        int clv=Integer.parseInt((String) TablaDatos.getValueAt(fila, 0));
            ImageIcon img;
        try {
            img = new NegocioVenta().PuenteObtenerImagen(clv);
            Icon icono=new ImageIcon(img.getImage().getScaledInstance(lbPanes.getWidth(), lbPanes.getHeight(), Image.SCALE_DEFAULT));
            if(img!=null){
                lbPanes.setIcon(icono);
            }
        } catch (IOException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbPrecio.setText(TablaDatos.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnAceptarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarFActionPerformed
        Venta venta=new Venta();
        Prod prod=new Prod();
        if((Integer.parseInt(txtAgregar.getText()))<=(Integer.parseInt(lbE.getText()))){
        tpAceptar.setVisible(false);
        if(verificar()){
        int Folio=TablaDatosF.getRowCount();
        int Stock,Cantidad=Integer.parseInt(txtAgregar.getText()),Clave=(Integer.parseInt(lbCP.getText()));
        float Total=(Integer.parseInt(lbPrecio.getText()))*Cantidad;
        if(Folio==0){
            Folio=1;
        }else{
        Folio=Folio+1;
        }
        venta.setFolio(Folio);
        venta.setCalvep(Clave);
        //Date fecha=txtDate.getDate();
        long d=fecha.getTime();
        java.sql.Date solofecha=new java.sql.Date(d);
        venta.setFecha(solofecha);
        venta.setCantidad(Cantidad);
        venta.setTotal(Total);
        Stock=(Integer.parseInt(lbE.getText()))-Cantidad;
        prod.setClave(Clave);
        prod.setStock(Stock);
            try {
                new NegocioVenta().PuenteRegistroNvo(venta);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            }try {
                new NegocioProd().PuenteActualizarS(prod);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: "+ex,"Verificar",JOptionPane.ERROR_MESSAGE);
            }
        Limpiar();
        LLT();
        LLTF();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay stock suficiente");
            tpAceptar.setVisible(false);
        }
    }//GEN-LAST:event_btnAceptarFActionPerformed

    private void btnCancelarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFActionPerformed
        tpAceptar.setVisible(false);
    }//GEN-LAST:event_btnCancelarFActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JST;
    private javax.swing.JScrollPane JSTF;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTable TablaDatosF;
    private javax.swing.JButton btnAceptarF;
    private javax.swing.JButton btnCancelarF;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbAgregar;
    private javax.swing.JLabel lbCP;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbE;
    private javax.swing.JLabel lbP;
    private javax.swing.JLabel lbPanes;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JMenu mVenta;
    private javax.swing.JMenuItem miVenta;
    private javax.swing.JMenuItem miVentas;
    private javax.swing.JPanel pnAgregar;
    private javax.swing.JPanel pnAgregar1;
    private javax.swing.JPanel pnVenta;
    private javax.swing.JTabbedPane tpAceptar;
    private javax.swing.JTextField txtAgregar;
    // End of variables declaration//GEN-END:variables
}
