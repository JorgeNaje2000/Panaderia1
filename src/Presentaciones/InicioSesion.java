package Presentaciones;

import Datos.Sesion;
import Negocios.NegocioSesion;
import com.imagen.ClaseImagen;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {

    ClaseImagen imagen=new ClaseImagen();
    String usuario1="Usuario";
    int intento;
    Principal P;
    public InicioSesion() {
        initComponents();
        imagen.AjustarImagenL(lbImagen, "Imagenes", "Logo", "png");
        this.setLocationRelativeTo(this);
        this.intento=1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnI = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        pfContraseña = new javax.swing.JPasswordField();
        btnS = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 240, 170));

        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 50, 20));

        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 70, 20));

        btnI.setMnemonic('i');
        btnI.setText("Ingresar");
        btnI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), null));
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        jPanel1.add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 80, -1));

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 150, -1));

        pfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(pfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 150, -1));

        btnS.setMnemonic('s');
        btnS.setText("Salir");
        btnS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), null));
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        jPanel1.add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 80, 20));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Panaderia el exito");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        if (intento<5) {
            try {
                Sesion sesion=new Sesion();
                String contra=new String(pfContraseña.getPassword());
                sesion.setNombre(txtUsuario.getText());
                NegocioSesion ns=new NegocioSesion();
                sesion.setContraseña(contra);
                String tipo=ns.PuenteAcceso(sesion);
                if (tipo.equals("Admin")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido "+txtUsuario.getText(),"Inicio de Sesion", JOptionPane.INFORMATION_MESSAGE);
                    P=new Principal(tipo);
                    P.setVisible(true);
                } else if (tipo.equalsIgnoreCase("Usuario")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido "+txtUsuario.getText(), "Inicio de Sesion", JOptionPane.INFORMATION_MESSAGE);
                    P=new Principal(tipo);
                    P.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Intento numero: "+intento, JOptionPane.ERROR_MESSAGE);
                    intento++;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e, "Error Sesion", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Revalidar porfavor", "Sesion cerrada", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btnIActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char V=evt.getKeyChar();
        if(Character.isAlphabetic(V)){
        }else if(Character.getType(V)!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void pfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfContraseñaKeyTyped
        if(pfContraseña.getPassword().length<=15){
        }else{
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "La contraseña no puede tener mas de 15 caracteres");
            }
    }//GEN-LAST:event_pfContraseñaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
