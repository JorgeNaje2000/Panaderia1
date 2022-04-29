package Negocios;


import Datos.MVenta;
import Datos.Venta;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class NegocioVenta {
    MVenta mp;
    public void PuenteRegistroNvo(Venta venta) throws SQLException{
        mp=new MVenta();
        mp.RegistroNuevo(venta);  
    }
    public JTable PuenteMostrarTabla(JTable tabladatos){
        mp=new MVenta();
        JTable tbl;
        tbl=mp.MostrarTabla(tabladatos);
        return tbl;
    }
    public JTable PuenteMostrarTablaP(JTable tabladatos){
        mp=new MVenta();
        JTable tbl;
        tbl=mp.MostrarTablaP(tabladatos);
        return tbl;
    }
    public ImageIcon PuenteObtenerImagen(int clv) throws IOException{
        mp=new MVenta();
        ImageIcon img=null;
        try {
            img=mp.ObtenerImagen(clv);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return img;
    }
}
