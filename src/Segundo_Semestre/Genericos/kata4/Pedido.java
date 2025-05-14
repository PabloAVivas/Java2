package Segundo_Semestre.Genericos.kata4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Identificable<Integer> {
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
    public Integer getID() {
        return id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.id == id;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", fecha=" + fecha + ", total=" + calcularTotal() + '}';
    }
}
