package Negocios;

import Datos.MSesion;
import Datos.Sesion;


public class NegocioSesion {
    MSesion ma;
    
    public String PuenteAcceso(Sesion sesion) {
        ma = new MSesion();
        String tipo = ma.Acceso(sesion);
        return tipo;
    }
}
