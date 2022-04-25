package Datos;

import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

/**
 *
 * @author Julio
 */
public class MProd {
BDConexion con;
    private Statement sentenciaSQL;
    public void RegistroNuevo(Prod prod){
        String insertar="INSERT INTO tblproductos(clave,descripcion,stock,precio,fecha_ingreso,codigo_barras,ruta_imagen,imagen)VALUES(?,?,?,?,?,?,?,?)";
        try {
            
            ///////************ Convertir imagen ************///////
            
            FileInputStream archivofoto;
            archivofoto=new FileInputStream(prod.getImagen());
            
            ///////************ Convertir imagen ************///////
            
            con=new BDConexion();
            PreparedStatement pst=con.Conectarse().prepareStatement(insertar);
            pst.setInt(1, prod.getClave());
            pst.setString(2, prod.getDescripcion());
            pst.setInt(3, prod.getStock());
            pst.setFloat(4, prod.getPrecio());
            pst.setDate(5, prod.getFecha_ingreso());
            pst.setString(6, prod.getCodigo_barras());
            pst.setString(7, prod.getRuta_imagen());
            pst.setBinaryStream(8, archivofoto);
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
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error, Archivo de imagen no encontrada: "+ex,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public JTable MostrarTabla(JTable tablaDatos){
         try {
            String sql;
            con=new BDConexion();
            sentenciaSQL=con.Conectarse().createStatement();
            sql="SELECT * FROM tblproductos";
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
    public void Actualizar(Prod prod) throws SQLException{
        String sql="UPDATE tblproductos SET clave=?,descripcion=?,stock=?,precio=?,fecha_ingreso=?,codigo_barras=?,ruta_imagen=?,imagen=? WHERE clave=?";
        try {
            
            ///////************ Convertir imagen ************///////
            
            FileInputStream archivofoto;
            archivofoto=new FileInputStream(prod.getImagen());
            
            ///////************ Convertir imagen ************///////
            
            con=new BDConexion();
            PreparedStatement pst=con.Conectarse().prepareStatement(sql);
            pst.setInt(1, prod.getClave());
            pst.setString(2, prod.getDescripcion());
            pst.setInt(3, prod.getStock());
            pst.setFloat(4, prod.getPrecio());
            pst.setDate(5, prod.getFecha_ingreso());
            pst.setString(6, prod.getCodigo_barras());
            pst.setString(7, prod.getRuta_imagen());
            pst.setBinaryStream(8, archivofoto);
            pst.setInt(9,prod.getClave());
            int n=pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prueba", "n= "+n, JOptionPane.INFORMATION_MESSAGE);
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | FileNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex, "Verificar", JOptionPane.ERROR_MESSAGE);
        }
        con.CerrarConexion();
    }
    public void ActualizarS(Prod prod) throws SQLException{
        String sql="UPDATE tblproductos SET clave=?,stock=? WHERE clave=?";
        try {
            con=new BDConexion();
            PreparedStatement pst=con.Conectarse().prepareStatement(sql);
            pst.setInt(1, prod.getClave());
            pst.setInt(2, prod.getStock());
            pst.setInt(3, prod.getClave());
            int n=pst.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex, "Verificar", JOptionPane.ERROR_MESSAGE);
        }
        con.CerrarConexion();
    }
    public void Eliminar(Prod prod){
        try {
            String sql="DELETE FROM tblproductos WHERE clave="+prod.getClave();
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
