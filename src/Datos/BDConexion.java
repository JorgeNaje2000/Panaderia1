package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BDConexion {
    private Connection conexion=null;
    private Statement sentenciasql;
    private ResultSet resultado;
    
    public BDConexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        String controlador="com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        String URL="jdbc:mysql://localhost:3306/bdpanaderia?zeroDateTimeBehavior=convertToNull";
        String usuario="root";
        String contraseña="";
        conexion=DriverManager.getConnection(URL,usuario,contraseña);
        
    }
    public Connection Conectarse(){
        return conexion;
    }
    public void CerrarConexion() throws SQLException{
        if(resultado!=null){resultado.close();}
        if(sentenciasql!=null){sentenciasql.close();}
        if(conexion!=null){conexion.close();}
    }
}
