package Segundo_Semestre.PracticaPrimerParcial.Compras_Online;

import java.util.Date;
import java.util.List;

public class Pedido {
    private String numero;
    private Date fechaDePedido;
    private Date fechaDeEnvio;
    private String enviarA;
    private EstadoDePedido estado;
    private float total;

    public Pedido(String numero) {
        this.numero = numero;
        this.fechaDePedido = new Date();
        this.estado = EstadoDePedido.NUEVO;
        this.total = 0;
    }

    public void calcularTotal(List<ProductoDeLinea> productos) {
        total = 0; // Reiniciar total antes de calcular
        for (ProductoDeLinea producto : productos) {
            total += producto.getSubtotal(); // Sumar el subtotal de cada producto
        }
    }

    public float getTotal() {
        return total; // Getter para el total
    }

    public void cambiarEstado(EstadoDePedido nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Getters
    public String getNumero() {
        return numero;
    }

    public EstadoDePedido getEstado() {
        return estado;
    }
}
