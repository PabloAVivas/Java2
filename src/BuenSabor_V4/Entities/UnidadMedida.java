package BuenSabor_V4.Entities;

public class UnidadMedida extends Base {
    private String denominacion;

    public UnidadMedida() {
    }

    public UnidadMedida(Long id, String denominacion) {
        super(id);
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /*@Override
    public String toString() {
        return "UnidadMedida{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }*/
}
