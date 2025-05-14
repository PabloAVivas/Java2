package Segundo_Semestre.Genericos.kata4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido(1, LocalDate.of(2023, 10, 1));
        pedido1.agregarProducto(new Producto<>("SKU123", "Producto A", 10.99));

        Pedido pedido2 = new Pedido(2, LocalDate.of(2023, 10, 2));
        pedido2.agregarProducto(new Producto<>("SKU124", "Producto B", 15.49));

        pedidos.add(pedido1);
        pedidos.add(pedido2);

        Buscador<Pedido, Integer> buscador = new Buscador<>();
        Pedido encontrado = buscador.buscar(pedidos, 1);
        System.out.println("Pedido encontrado: " + encontrado);
    }
}
