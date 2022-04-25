package Datos;

public class Prov{
    private int claveprov;
    private String producto;
    private String nombre;
    private String rfc;
    private int telefono;
    private String direccion;
    private String correo;

    public Prov(int claveprov, String producto, String nombre, String rfc, int telefono, String direccion, String correo) {
        this.claveprov = claveprov;
        this.producto = producto;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }
    
    public Prov() {
    }


    public int getClaveprov() {
        return claveprov;
    }

    public void setClaveprov(int claveprov) {
        this.claveprov = claveprov;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
