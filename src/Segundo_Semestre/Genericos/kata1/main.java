package Segundo_Semestre.Genericos.kata1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Producto<?>> productos = new ArrayList<>();

        // Agregar productos con diferentes tipos de identificadores
        productos.add(new Producto<String>("SKU123", "Producto A", 29.99));
        productos.add(new Producto<Integer>(101, "Producto B", 19.99));
        productos.add(new Producto<String>("SKU456", "Producto C", 39.99));
        productos.add(new Producto<Integer>(102, "Producto D", 49.99));

        // Imprimir la lista de productos
        for (Producto<?> producto : productos) {
            System.out.println(producto);
        }
    }
}
