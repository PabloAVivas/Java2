package Segundo_Semestre.PracticaPrimerParcial.Compras_Online;

import java.util.Date;

public class Pago {
    private String id;
    private Date fechaDePago;
    private float total;
    private String detalles;

    public Pago(String id, float total, String detalles) {
        this.id = id;
        this.fechaDePago = new Date();
        this.total = total;
        this.detalles = detalles;
    }

    // Getter para el total
    public float getTotal() {
        return total;
    }
}


