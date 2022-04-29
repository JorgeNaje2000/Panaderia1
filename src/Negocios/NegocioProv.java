package Negocios;

import Datos.MProv;
import Datos.Prov;
import java.sql.SQLException;
import javax.swing.JTable;


public class NegocioProv {
    MProv mp;
    public void PuenteRegistroNvo(Prov prov) throws SQLException{
        mp=new MProv();
        mp.RegistroNuevo(prov);  
    }
    public JTable PuenteMostrarTabla(JTable tabladatos){
        mp=new MProv();
        JTable tbl;
        tbl=mp.MostrarTabla(tabladatos);
        return tbl;
    }
    public void PuenteActualizar(Prov prov) throws SQLException{
        mp=new MProv();
        mp.Actualizar(prov);
    }
    public void PuenteEliminar(Prov prov) throws SQLException{
        mp=new MProv();
        mp.Eliminar(prov);
    }
}
