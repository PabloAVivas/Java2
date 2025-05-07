package Repaso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Producto {
    private String id;
    private String nombre;
    private String prveedor;

    public Producto(String id, String nombre, String prveedor) {
        this.id = id;
        this.nombre = nombre;
        this.prveedor = prveedor;

    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", prveedor='" + prveedor + '\'' +
                '}';
    }
}
