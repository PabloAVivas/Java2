package Segundo_Semestre.PracticaPrimerParcial.Compras_Online;

public class Producto {
    private String id;
    private String nombre;
    private String proveedor;

    public Producto(String id, String nombre, String proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.proveedor = proveedor;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProveedor() {
        return proveedor;
    }
}
