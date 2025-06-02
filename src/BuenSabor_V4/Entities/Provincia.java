package BuenSabor_V4.Entities;

public class Provincia extends Base{
    private String nombre;

    //muchos a uno
    private Pais pais;

    public Provincia(){}

    public Provincia(Long id, String nombre) {
        super(id);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /*@Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + pais +
                '}';
    }*/
}
