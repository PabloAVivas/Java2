package Repaso;

import java.util.Date;
import java.util.Random;

public class Pago {
    private String id;
    private Date fecha_de_pago;
    private float total;
    private String detalle;

    public Pago(Date fecha_de_pago, float total, String detalle) {
        Random random = new Random();
        int Id = random.nextInt(100);
        String ID = Id + "";
        this.id = ID;
        this.fecha_de_pago = fecha_de_pago;
        this.total = total;
        this.detalle = detalle;
    }
    public void pagar(){
        System.out.println("Se ha pagadao el pedido");
    }
}
