package Segundo_Semestre.Interfaces_Excepciones.Ecomerce;

import java.util.List;

public class Pedido implements Pagable{
    private Cliente clientes;
    private Estado estado;
    private List<Producto> productos;

    public Pedido(Cliente clientes, String estado) {
        Estado esta = Estado.valueOf(estado);
        this.clientes = clientes;
        this.estado = esta;
    }

    public Pedido(List<Producto> producto) {
        this.productos = producto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = Estado.valueOf(nuevoEstado);
        clientes.notificar("Su pedido ha cambiado de estado a: " + estado);
    }


    @Override
    public double calcular_total(){
        double total = 0;
        for (Producto producto: productos){
            total += producto.calcular_total();
        }
        return total;
    }
}
