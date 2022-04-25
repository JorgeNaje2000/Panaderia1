package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MSesion {
    Statement sentenciaSQL;
    ResultSet rs;
    BDConexion con;

    public String Acceso(Sesion sesion) {
        String tipo = "";
        try {
            con = new BDConexion();
            String sql;
            sql = "SELECT tipo FROM tblsesion WHERE nombre='"
                    + sesion.getNombre()+ "' AND contraseña='" + sesion.getContraseña()+ "'";
            sentenciaSQL = con.Conectarse().createStatement();
            rs = sentenciaSQL.executeQuery(sql);

            if (rs.next()) {
                tipo = rs.getString("tipo");
            }

            con.CerrarConexion();
            sentenciaSQL.close();
            rs.close();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return tipo;
    }    
}
