package Parcial1;

public class Editorial {
    private String nombre;
    private String sitioWeb;
    private Direccion direccion;

    public Editorial(String nombre, String sitioWeb, Direccion direccion) {
        this.nombre = nombre;
        this.sitioWeb = sitioWeb;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", sitioWeb='" + sitioWeb + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
