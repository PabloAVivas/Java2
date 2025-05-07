package Parcial1;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni, ArrayList<Prestamo> prestamos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = prestamos;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void mostrarHistorialPrestamos(){
        for (Prestamo prestamo : prestamos){
            System.out.println(prestamos);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", prestamos=" + prestamos +
                '}';
    }
}
