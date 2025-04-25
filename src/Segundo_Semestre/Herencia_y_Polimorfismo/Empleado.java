package Segundo_Semestre.Herencia_y_Polimorfismo;

import java.time.LocalDate;

public abstract class Empleado {
    private int DNI;
    private String Nombre;
    private String Apellido;
    private int anioIngreso;

    public Empleado(int DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        Nombre = nombre;
        Apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public int antiguedadEnAnios() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioIngreso;
    }

    public String nombreCompleto() {
        return Nombre + " " + Apellido;
    }

    public abstract double obtenerSalario();

}
