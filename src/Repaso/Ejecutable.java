package Repaso;
import java.util.Date;
public class Ejecutable {
    private static Date LocalDate;

    public static void main(String[]args) {

        Producto p1 = new Producto("1", "LaptopHP", "HPTech");
        Producto p2 = new Producto("2", "LaptopAcer", "AcerTach");
        Producto p3 = new Producto("3", "LaptopAsus", "AsusTech");

        ProductoDeLinea productoDeLinea1 = new ProductoDeLinea(p1, 10, 200000);
        ProductoDeLinea productoDeLinea2 = new ProductoDeLinea(p2, 15, 300000);
        ProductoDeLinea productoDeLinea3 = new ProductoDeLinea(p3, 12, 250000);

        Cliente cliente1 = new Cliente("1", "Barrio Atsa", "2616177756", "sebadiazmoyano@gmail.com");
        Cuenta cuenta1 = new Cuenta("1", "Barrio Atsa", false, new Date(), null);
        CarritoDeCompra carritoDeCompra = new CarritoDeCompra(new Date());
        carritoDeCompra.agregarProductoCarrito(productoDeLinea1);
        carritoDeCompra.agregarProductoCarrito(productoDeLinea2);

        carritoDeCompra.confirmarCarrito(new Date(2025,8,25), cuenta1.getDireccion_de_facturacion());
        Pago pago = new Pago(new Date(), carritoDeCompra.calcularTotal(), carritoDeCompra.detallePedido());
        pago.pagar();

    }
}
