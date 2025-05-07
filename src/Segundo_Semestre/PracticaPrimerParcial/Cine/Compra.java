package Segundo_Semestre.PracticaPrimerParcial.Cine;

import java.util.Date;

public class Compra {
    protected Date fecha;

    public Compra(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
