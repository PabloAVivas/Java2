package Segundo_Semestre.PracticaPrimerParcial.Compras_Online;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarritoDeCompra {
    private Date creado;
    private List<ProductoDeLinea> productos;

    public CarritoDeCompra() {
        this.creado = new Date();
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoDeLinea productoDeLinea) {
        productos.add(productoDeLinea);
    }

    public List<ProductoDeLinea> getProductos() {
        return productos;
    }

    public boolean estaVacio() {
        return productos.isEmpty();
    }
}
