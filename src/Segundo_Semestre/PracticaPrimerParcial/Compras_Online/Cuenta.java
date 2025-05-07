package Segundo_Semestre.PracticaPrimerParcial.Compras_Online;

import java.util.Date;

public class Cuenta {
    private String id;
    private String direccionDeFacturacion;
    private Date abierta;
    private Date cerrada;

    public Cuenta(String id, String direccionDeFacturacion) {
        this.id = id;
        this.direccionDeFacturacion = direccionDeFacturacion;
        this.abierta = new Date(); // Fecha de creación de la cuenta
        this.cerrada = null; // Inicialmente, la cuenta no está cerrada
    }

    public void cerrarCuenta() {
        this.cerrada = new Date(); // Actualiza la fecha de cierre
    }

    // Getters
    public Date getAbierta() {
        return abierta;
    }

    public Date getCerrada() {
        return cerrada;
    }

    public boolean estaCerrada() {
        return cerrada != null; // La cuenta está cerrada si la fecha de cierre no es nula
    }
}

