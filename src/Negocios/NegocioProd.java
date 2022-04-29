package Negocios;

import Datos.MProd;
import Datos.Prod;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class NegocioProd {
    
    MProd mp;
    MProd mpp;
    public void PuenteRegistroNvo(Prod prod){
        mp=new MProd();
        mp.RegistroNuevo(prod);  
    }
    public JTable PuenteMostrarTabla(JTable tabladatos){
        mp=new MProd();
        JTable tbl;
        tbl=mp.MostrarTabla(tabladatos);
        return tbl;
    }
    public ImageIcon PuenteObtenerImagen(int clv){
        mp=new MProd();
        ImageIcon img=null;
        try {
            img=mp.ObtenerImagen(clv);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return img;
    }
    public void PuenteActualizar(Prod prod) throws SQLException{
        mp=new MProd();
        mp.Actualizar(prod);
    }
    public void PuenteActualizarS(Prod prod) throws SQLException{
        mpp=new MProd();
        mpp.ActualizarS(prod);
    }
    public void PuenteEliminar(Prod prod) throws SQLException{
        mp=new MProd();
        mp.Eliminar(prod);
    }
}
