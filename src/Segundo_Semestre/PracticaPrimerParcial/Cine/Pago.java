package Segundo_Semestre.PracticaPrimerParcial.Cine;

public class Pago {
    private double monto;
    private TipoDePago tipo;

    public Pago(double monto, TipoDePago tipo) {
        this.monto = monto;
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TipoDePago getTipo() {
        return tipo;
    }

    public void setTipo(TipoDePago tipo) {
        this.tipo = tipo;
    }
}
