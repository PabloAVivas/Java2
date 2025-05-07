package Segundo_Semestre.PracticaPrimerParcial.Compras_Online;
import java.util.UUID;
import java.util.Date;

public class Mian {
    public static void main(String[] args) {
        // 1. Registro de un cliente y creación de cuenta y carrito
        Cliente cliente = new Cliente("1", "123 Calle Falsa", "555-1234", "correo@ejemplo.com");
        Cuenta cuenta = new Cuenta("1", "123 Calle Falsa");
        CarritoDeCompra carrito = new CarritoDeCompra();

        // 2. Agregar productos al carrito
        Producto producto1 = new Producto("101", "Laptop", "Proveedor A");
        Producto producto2 = new Producto("102", "Mouse", "Proveedor B");
        carrito.agregarProducto(new ProductoDeLinea(producto1, 1, 1000));
        carrito.agregarProducto(new ProductoDeLinea(producto2, 2, 50));

        // 3. Confirmar el carrito para generar un pedido
        if (carrito.estaVacio()) {
            System.out.println("El carrito está vacío. No se puede generar un pedido.");
            return;
        }
        Pedido pedido = new Pedido(UUID.randomUUID().toString());
        pedido.calcularTotal(carrito.getProductos());
        System.out.println("Total del pedido: $" + pedido.getTotal());

        // 4. Realizar un pago asociado al pedido
        Pago pago = new Pago(UUID.randomUUID().toString(), pedido.getTotal(), "Pago con tarjeta de crédito");
        System.out.println("Pago realizado por: $" + pago.getTotal());

        // Desafío extra: Cambiar estado del pedido
        pedido.cambiarEstado(EstadoDePedido.PENDIENTE);
        System.out.println("Estado del pedido: " + pedido.getEstado());
        pedido.cambiarEstado(EstadoDePedido.ENVIADO);
        System.out.println("Estado del pedido: " + pedido.getEstado());
        pedido.cambiarEstado(EstadoDePedido.ENTREGADO);
        System.out.println("Estado del pedido: " + pedido.getEstado());
        pedido.cambiarEstado(EstadoDePedido.CERRADO);
        System.out.println("Estado del pedido: " + pedido.getEstado());
    }
}