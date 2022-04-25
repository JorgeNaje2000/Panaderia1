package Datos;

import java.sql.Date;

public class Venta {
    private int folio;
    private int calvep;
    private Date fecha;
    private int cantidad;
    private float total;

    public Venta(int folio, int calvep, Date fecha, int cantidad, float total) {
        this.folio = folio;
        this.calvep = calvep;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = total;
    }
    public Venta(){
        
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getCalvep() {
        return calvep;
    }

    public void setCalvep(int calvep) {
        this.calvep = calvep;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
