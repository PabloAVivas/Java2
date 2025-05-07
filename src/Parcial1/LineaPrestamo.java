package Parcial1;

import java.util.Date;

public class LineaPrestamo {
    private Date fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamo(Date fechaDevolucionEstimada, Ejemplar ejemplar) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString() {
        return "LineaPrestamo{" +
                "fechaDevolucionEstimada=" + fechaDevolucionEstimada +
                ", ejemplar=" + ejemplar +
                '}';
    }
}
