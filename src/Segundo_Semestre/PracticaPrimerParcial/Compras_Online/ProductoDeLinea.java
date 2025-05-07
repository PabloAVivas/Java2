package Segundo_Semestre.PracticaPrimerParcial.Compras_Online;

public class ProductoDeLinea {
    private Producto producto;
    private int cantidad;
    private float precio;

    public ProductoDeLinea(Producto producto, int cantidad, float precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public float getSubtotal() {
        return cantidad * precio;
    }

    // Getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }
}
