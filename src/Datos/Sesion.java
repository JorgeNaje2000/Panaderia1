package Datos;

public class Sesion {
    private String nombre;
    private String tipo;
    private String contraseña;

    public Sesion(String nombre, String tipo, String contraseña) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.contraseña = contraseña;
    }

    public Sesion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
