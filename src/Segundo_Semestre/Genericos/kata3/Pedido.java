package Segundo_Semestre.Genericos.kata3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Comparable<Pedido> {
    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto<?> producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto<?> producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", fecha=" + fecha + ", total=" + calcularTotal() + '}';
    }
}
