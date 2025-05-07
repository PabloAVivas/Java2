package Segundo_Semestre.PracticaPrimerParcial.Cine;

import java.util.Date;

public class Venta {
    private Date fecha;

    public Venta(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
