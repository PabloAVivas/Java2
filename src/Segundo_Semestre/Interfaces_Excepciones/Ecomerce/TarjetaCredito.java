package Segundo_Semestre.Interfaces_Excepciones.Ecomerce;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto){
        System.out.println("El total es de: "+ monto + "\nSe cargara a la tarjeta:" + numeroTarjeta);
    }
    public double aplicarDescuento(double porcentaje){
        double descuento = 1-porcentaje/100;
        return descuento;
    }
}
