package Repaso;

import java.util.ArrayList;

public class ProductoDeLinea {
    private int cantidad;
    private float precio;
    private Producto producto;
    private static ArrayList<ProductoDeLinea> productosDeLinea = new ArrayList<>();

    public ProductoDeLinea(Producto producto ,int cantidad, float precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void agregarProductosEnLinea(ProductoDeLinea productoDeLinea){
        productosDeLinea.add(productoDeLinea);
        System.out.println("El producto se ha agregado al servidor");
    }

    public Producto getProducto() {
        return producto;
    }

    public float getPrecio() {
        return precio;
    }
}
