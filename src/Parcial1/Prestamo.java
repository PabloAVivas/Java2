package Parcial1;
import java.util.Date;
import java.util.ArrayList;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private ArrayList<LineaPrestamo> lineas;

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, ArrayList<LineaPrestamo> lineas) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", lineas=" + lineas +
                '}';
    }
}
