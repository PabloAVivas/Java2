package Segundo_Semestre.Interfaces_Excepciones.Ecomerce;

public class PayPal implements PagoConDescuento{
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public void procesarPago(double monto){
        System.out.println("El total es de: "+ monto + "\nSe cargara a la cuenta de: " + email);
    }
    public double aplicarDescuento(double porcentaje){
        double descuento = 1-porcentaje/100;
        return descuento;
    }
}
