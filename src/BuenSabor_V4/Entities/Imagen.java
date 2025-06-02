package BuenSabor_V4.Entities;

public class Imagen extends Base{
    private String denominacion;

    public Imagen() {
    }

    public Imagen(Long id, String denominacion) {
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
        return "Imagen{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }*/
}
