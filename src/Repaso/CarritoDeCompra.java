package Repaso;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class CarritoDeCompra {
    private Date creado;
    private static Boolean confirmacion;
    private static ArrayList<ProductoDeLinea> productos = new ArrayList<>();

    public CarritoDeCompra(Date creado) {
        this.creado = creado;
        System.out.println("Se ha creado el carrito");
    }
    public void agregarProductoCarrito(ProductoDeLinea producto){
        productos.add(producto);
        System.out.println("Producto cargado correctamente");
    }
    public void confirmarCarrito(Date fecha_entrega, String enviar_a){
        Random random = new Random();
        int numeroPedido = random.nextInt(100);
        String numPedido = numeroPedido + "";
        Pedido pedido = new Pedido(numPedido, new Date(), fecha_entrega, enviar_a, EstadoDePedido.PENDIENTE,
                calcularTotal());
    }
    public float calcularTotal(){
        float total = 0;
        for (ProductoDeLinea producto : productos){
            total = total + producto.getPrecio();
        }
        return total;
    }
    public String detallePedido(){
        String detalles = "";
        for (ProductoDeLinea producto:productos){
            detalles = detalles + producto.getProducto().getNombre();
        }
        return "Productos: " + detalles;
    }

}
