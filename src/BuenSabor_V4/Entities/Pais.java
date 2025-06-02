package BuenSabor_V4.Entities;

public class Pais extends Base{
    private String nombre;

    public Pais(){}

    public Pais(Long id, String nombre) {
        super(id);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*@Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }*/
}
