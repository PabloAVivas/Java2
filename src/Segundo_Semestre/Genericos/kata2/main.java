package Segundo_Semestre.Genericos.kata2;


public class main {
    public static void main(String[] args) {
        Carrito<Producto<?>> carrito = new Carrito<>();
        carrito.agregarProducto(new Producto<>("SKU123", "Producto A", 10.99));
        carrito.agregarProducto(new Producto<>(1, "Producto B", 15.49));

        System.out.println("Productos en el carrito:");
        carrito.mostrarProductos();
        System.out.println("Total: " + carrito.obtenerTotal());
    }
}
