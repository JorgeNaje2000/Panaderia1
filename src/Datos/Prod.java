
package Datos;

import java.sql.Date;

public class Prod{
    private int clave;
    private String descripcion;
    private int stock;
    private float precio;
    private Date fecha_ingreso;
    private String codigo_barras;
    private String ruta_imagen;
    private String imagen;
   
    

    public Prod(int clave, String descripcion, int stock, float precio, Date fecha_ingreso, String codigo_barras, String ruta_imagen, String imagen) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.fecha_ingreso = fecha_ingreso;
        this.codigo_barras = codigo_barras;
        this.ruta_imagen = ruta_imagen;
        this.imagen = imagen;
    }
    public Prod() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    /**
     * int clave, String descripcion, int stock, float precio, Date fecha_ingreso, 
     * String codigo_barras, String ruta_imagen, String imagen
     */
}
