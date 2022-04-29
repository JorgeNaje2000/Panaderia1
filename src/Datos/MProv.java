package Datos;

import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MProv {
BDConexion con;
    private Statement sentenciaSQL;
    public void RegistroNuevo(Prov prov){
        String insertar="INSERT INTO tblproveedores(claveprov,producto,nombre,rfc,telefono,direccion,correo)VALUES(?,?,?,?,?,?,?)";
        try {
            con=new BDConexion();
            PreparedStatement pst=con.Conectarse().prepareStatement(insertar);
            pst.setInt(1, prov.getClaveprov());
            pst.setString(2, prov.getProducto());
            pst.setString(3, prov.getNombre());
            pst.setString(4, prov.getRfc());
            pst.setInt(5, prov.getTelefono());
            pst.setString(6, prov.getDireccion());
            pst.setString(7, prov.getCorreo());
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            }
            con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada: "+ex,"Error", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de instancia: "+ex,"Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Mal acceso a la BD: "+ex,"Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia: "+ex,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public JTable MostrarTabla(JTable tablaDatos){
         try {
            String sql;
            con=new BDConexion();
            sentenciaSQL=con.Conectarse().createStatement();
            sql="SELECT * FROM tblproveedores";
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();
            int col=rsm.getColumnCount();
             DefaultTableModel modelo=new DefaultTableModel();
             for(int i=1;i<=col;i++){
                 modelo.addColumn(rsm.getColumnLabel(i)); //Para nombre de encabezados
             }
                 while(rs.next()){
                     String[] fila=new String[col];
                     for(int j=0;j<=col-1;j++){
                         fila[j]=rs.getString(j+1);
                     }
                     modelo.addRow(fila);
                 }
                 tablaDatos.setModel(modelo);
                 rs.close();
                 con.CerrarConexion();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex,"Error", JOptionPane.ERROR_MESSAGE);
        }
         return tablaDatos;
    }
    public ImageIcon ObtenerImagen(int clv) throws SQLException{
        InputStream is=null;
        ImageIcon img=null;
        String sql="SELECT imagen FROM tblproveedores WHERE claveprov="+clv;
        try {
            con=new BDConexion();
            sentenciaSQL=con.Conectarse().createStatement();
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            if(rs.next()){
                is=rs.getBinaryStream(1);
                BufferedImage bi=ImageIO.read(is);
                img=new ImageIcon(bi);
            }
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex,"Error", JOptionPane.ERROR_MESSAGE);
        }
        con.CerrarConexion();
        sentenciaSQL.close();
        return img;
    }
    public void Actualizar(Prov prov) throws SQLException{
        String sql="UPDATE tblproveedores SET claveprov=?,producto=?,nombre=?,rfc=?,telefono=?,direccion=?,correo=? WHERE claveprov=?";
        try {
            con=new BDConexion();
            PreparedStatement pst=con.Conectarse().prepareStatement(sql);
            pst.setInt(1, prov.getClaveprov());
            pst.setString(2, prov.getProducto());
            pst.setString(3, prov.getNombre());
            pst.setString(4, prov.getRfc());
            pst.setInt(5, prov.getTelefono());
            pst.setString(6, prov.getDireccion());
            pst.setString(7, prov.getCorreo());
            pst.setInt(8, prov.getClaveprov());
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex, "Verificar", JOptionPane.ERROR_MESSAGE);
        }
        con.CerrarConexion();
    }
    public void Eliminar(Prov prov){
        try {
            String sql="DELETE FROM tblproveedores WHERE claveprov="+prov.getClaveprov();
            con=new BDConexion();
            sentenciaSQL=con.Conectarse().createStatement();
            int n=sentenciaSQL.executeUpdate(sql);
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro eliminado", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            }
            con.CerrarConexion();
            sentenciaSQL.close();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
