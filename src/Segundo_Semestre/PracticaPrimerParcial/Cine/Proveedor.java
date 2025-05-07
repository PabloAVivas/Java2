package Segundo_Semestre.PracticaPrimerParcial.Cine;

public class Proveedor {
    private String nombre;
    private String telefono;
    private String direccion;

    public Proveedor(String telefono, String direccion, String nombre) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
