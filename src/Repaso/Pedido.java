package Repaso;

import java.util.Date;

public class Pedido {
    private String numero;
    private Date fecha_de_pedido;
    private Date fecha_de_entrega;
    private String enviar_a;
    private EstadoDePedido estado;
    private float total;

    public Pedido(String numero, Date fecha_de_pedido, Date fecha_de_entrega, String enviar_a, EstadoDePedido estado, float total) {
        this.numero = numero;
        this.fecha_de_pedido = fecha_de_pedido;
        this.fecha_de_entrega = fecha_de_entrega;
        this.enviar_a = enviar_a;
        this.estado = estado;
        this.total = total;
        System.out.println("Se ha confirmado el carrito");
    }

    public float getTotal() {
        return total;
    }

}
