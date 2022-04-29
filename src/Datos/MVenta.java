package Datos;

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

public class MVenta {
BDConexion con;
    private Statement sentenciaSQL;
    public void RegistroNuevo(Venta venta) throws SQLException{
        String insertar="INSERT INTO tblventas(folio,clave_prod,fecha,cantidad,total)VALUES(?,?,?,?,?)";
        try {
            con=new BDConexion();
            PreparedStatement pst=con.Conectarse().prepareStatement(insertar);
            pst.setInt(1, venta.getFolio());
            pst.setInt(2, venta.getCalvep());
            pst.setDate(3, venta.getFecha());
            pst.setInt(4, venta.getCantidad());
            pst.setFloat(5, venta.getTotal());
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
            sql="SELECT * FROM tblventas";
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
        String sql="SELECT imagen FROM tblproductos WHERE clave="+clv;
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
    public JTable MostrarTablaP(JTable tablaDatos){
         try {
            String sql;
            con=new BDConexion();
            sentenciaSQL=con.Conectarse().createStatement();
            sql="SELECT clave,descripcion,stock,precio,fecha_ingreso,imagen FROM tblproductos";
            ResultSet rs=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();
            int col=rsm.getColumnCount();
             DefaultTableModel modelo=new DefaultTableModel();
             for(int i=1;i<col;i++){
                 modelo.addColumn(rsm.getColumnLabel(i)); //Para nombre de encabezados
             }
                 while(rs.next()){
                     String[] fila=new String[col];
                     for(int j=0;j<col-1;j++){
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
}
