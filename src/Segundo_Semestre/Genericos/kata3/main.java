package Segundo_Semestre.Genericos.kata3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido(1, LocalDate.of(2023, 10, 1));
        pedido1.agregarProducto(new Producto<>("SKU123", "Producto A", 10.99));
        pedido1.agregarProducto(new Producto<>(1, "Producto B", 15.49));

        Pedido pedido2 = new Pedido(2, LocalDate.of(2023, 10, 2));
        pedido2.agregarProducto(new Producto<>("SKU124", "Producto C", 5.49));

        pedidos.add(pedido1);
        pedidos.add(pedido2);

        pedidos.sort(Comparator.naturalOrder());
        System.out.println("Pedidos ordenados por total:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
