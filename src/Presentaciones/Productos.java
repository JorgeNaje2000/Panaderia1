package Presentaciones;

import Datos.Prod;
import Negocios.NegocioProd;
import com.imagen.ClaseImagen;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Productos extends javax.swing.JFrame {

    String nombreImagen="";
    ClaseImagen image=new ClaseImagen();
    public Productos() {
        initComponents();
        this.setDefaultCloseOperation(2);
        image.AjustarImagenL(lbCB,"imagenes","CB","jpg");
        this.setLocationRelativeTo(this);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        txtClave.setEnabled(false);
        txtCodigoB.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtFecha.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtStock.setEnabled(false);
        LLT();
    }
    void Limpiar(){
        txtClave.setText("");
        txtDescripcion.setText("");
        txtCodigoB.setText("");
        txtStock.setText("");
        txtPrecio.setText("");
        lbImagen.setIcon(null);
        txtFecha.setDate(null);
    }
    boolean verificar(){
       boolean V;
        if(txtClave.getText().isEmpty()||txtDescripcion.getText().isEmpty()||txtStock.getText().isEmpty()
           ||txtPrecio.getText().isEmpty()||lbImagen.getIcon()==null||txtFecha.getDate()==null){
           JOptionPane.showMessageDialog(null, "Llenar todos los datos", "Datos faltantes",JOptionPane.INFORMATION_MESSAGE);
           V=false;
        }else{
            V=true;
        }
        return V;
    } 
    public void LLT(){
        try {
            NegocioProd tbl=new NegocioProd();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoB = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbCB = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        btnCargarImagen = new javax.swing.JButton();
        lbImagen = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel2.setText("Codigo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel3.setText("Descripcion");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel4.setText("Existencias");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 20));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel5.setText("Precio");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 20));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel6.setText("Fecha ingreso");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 20));

        txtCodigoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoBKeyTyped(evt);
            }
        });
        jPanel2.add(txtCodigoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 180, -1));

        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });
        jPanel2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 180, -1));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 180, -1));

        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        jPanel2.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 180, -1));
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        jLabel8.setText("Codigo de barras");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 20));

        lbCB.setBackground(new java.awt.Color(255, 255, 255));
        lbCB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CB.jpg"))); // NOI18N
        lbCB.setOpaque(true);
        jPanel2.add(lbCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 40));
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 180, -1));

        btnCargarImagen.setFont(new java.awt.Font("Segoe Script", 0, 11)); // NOI18N
        btnCargarImagen.setText("Cargar Imagen");
        btnCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarImagenActionPerformed(evt);
            }
        });
        jPanel2.add(btnCargarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 120, 30));
        jPanel2.add(lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 210, 190));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 660, 260));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CerrarSesion_16.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 130, 110));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Guardar_16.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 130, 110));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Borrar_16.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 130, 110));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Editar_16.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 130, 110));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1200, 230));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Limpiar_16.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(verificar()){
        Prod prod=new Prod();
        prod.setClave(Integer.parseInt(txtClave.getText()));
        prod.setDescripcion(txtDescripcion.getText());
        prod.setStock(Integer.parseInt(txtStock.getText()));
        prod.setPrecio(Float.parseFloat(txtPrecio.getText()));
        
        ///////********** Obtener Imagen ************////////
        
        prod.setImagen(nombreImagen);
        prod.setRuta_imagen(nombreImagen);
        
        ///////********** Establecer Fecha ************////////
        
        Date fecha=txtFecha.getDate();
        long d=fecha.getTime();
        java.sql.Date solofecha=new java.sql.Date(d);
        prod.setFecha_ingreso(solofecha);
        
        ///////********** Obtener codigo de barras ************////////
        
        prod.setCodigo_barras(txtCodigoB.getText());
        
        ///////********** Establecer imagen ************////////
        
        new NegocioProd().PuenteRegistroNvo(prod);
        Limpiar();
        LLT();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtClave.setEnabled(true);
        txtCodigoB.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtFecha.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtStock.setEnabled(true);
        btnAgregar.setEnabled(true);
        Limpiar();
        txtClave.grabFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImagenActionPerformed
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("JPG & PNG", "jpg","png");
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setFileFilter(filtro);
        fileChooser.setDialogTitle("Abrir archivo");
        File ruta=new File("C:\\ImagenesProductos");
        fileChooser.setCurrentDirectory(ruta);
        int resultado=fileChooser.showOpenDialog(this);
        if(resultado!=JFileChooser.CANCEL_OPTION){
            File nombreArchivo=fileChooser.getSelectedFile();
            nombreImagen=String.valueOf(nombreArchivo);
            Image foto=getToolkit().getImage(nombreImagen);
            foto=foto.getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), Image.SCALE_DEFAULT);
            lbImagen.setIcon(new ImageIcon(foto));
        }else{
            
        }
    }//GEN-LAST:event_btnCargarImagenActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        txtCodigoB.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtFecha.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtStock.setEnabled(true);
        btnAgregar.setEnabled(true);
        if(evt.getButton()==1){
            txtClave.setEnabled(false);
            int fila=TablaDatos.getSelectedRow();
            String fe=TablaDatos.getValueAt(fila,4).toString();
            DateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date fecha=formato.parse(fe);
                txtFecha.setDate(fecha);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Error: "+ex);
            }
            txtClave.setText(TablaDatos.getValueAt(fila, 0).toString());
            txtDescripcion.setText(TablaDatos.getValueAt(fila, 1).toString());
            txtStock.setText(TablaDatos.getValueAt(fila, 2).toString());
            txtPrecio.setText(TablaDatos.getValueAt(fila, 3).toString());
            txtCodigoB.setText(TablaDatos.getValueAt(fila, 5).toString());
            nombreImagen=TablaDatos.getValueAt(fila, 6).toString();
            
            ///////********** ************////////
            
            int clv=Integer.parseInt(txtClave.getText());
            ImageIcon img=new NegocioProd().PuenteObtenerImagen(clv);
            Icon icono=new ImageIcon(img.getImage().getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), Image.SCALE_DEFAULT));
            if(img!=null){
                lbImagen.setIcon(icono);
            }
            
            ///////********** ************////////
            
            btnEliminar.setEnabled(true);
            btnModificar.setEnabled(true);
            btnAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(verificar()){
            int n=JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar?");
            if(n==0){
                Prod prod=new Prod();
                prod.setClave(Integer.parseInt(txtClave.getText()));
                try {
                    new NegocioProd().PuenteEliminar(prod);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: "+ex,"Verificar",JOptionPane.ERROR_MESSAGE);
                }
                Limpiar();
                LLT();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(verificar()){
        Prod prod=new Prod();
        prod.setClave(Integer.parseInt(txtClave.getText()));
        prod.setDescripcion(txtDescripcion.getText());
        prod.setStock(Integer.parseInt(txtStock.getText()));
        prod.setPrecio(Float.parseFloat(txtPrecio.getText()));
        
        ///////********** Obtener Imagen ************////////
        
        prod.setImagen(nombreImagen);
        prod.setRuta_imagen(nombreImagen);
        
        ///////********** Establecer Fecha ************////////
        
        Date fecha=txtFecha.getDate();
        long d=fecha.getTime();
        java.sql.Date solofecha=new java.sql.Date(d);
        prod.setFecha_ingreso(solofecha);
        
        ///////********** Obtener codigo de barras ************////////
        
        prod.setCodigo_barras(txtCodigoB.getText());
            try {
                new NegocioProd().PuenteActualizar(prod);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: "+ex,"Verificar",JOptionPane.ERROR_MESSAGE);
            }
        Limpiar(); 
        LLT();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCodigoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBKeyTyped
        if(txtCodigoB.getText().length()==13){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoBKeyTyped

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        if(txtClave.getText().length()<11){
        char V=evt.getKeyChar();
        if(Character.isDigit(V)){
        }else if(Character.getType(V)!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
        }
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txtClaveKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        if(txtStock.getText().length()<11){
        char V=evt.getKeyChar();
        if(Character.isDigit(V)){
        }else if(Character.getType(V)!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
        }
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txtStockKeyTyped

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargarImagen;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCB;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCodigoB;
    private javax.swing.JTextField txtDescripcion;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
