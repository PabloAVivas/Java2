package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata4;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private int id;
    private LocalDate fecha;
    private List<ItemPedido> items;
    private double total;



    public Pedido(int id, LocalDate fecha, List<ItemPedido> items, double total) {
        this.id = id;
        this.fecha = fecha;
        this.items = items;
        this.total = total;
    }

    public Pedido(LocalDate fecha, List<ItemPedido> items, double total) {
        this.fecha = fecha;
        this.items = items;
        this.total = total;
    }

    public Pedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setItems(List<ItemPedido> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

