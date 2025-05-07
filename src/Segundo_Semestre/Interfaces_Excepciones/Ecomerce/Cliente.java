package Segundo_Semestre.Interfaces_Excepciones.Ecomerce;

public class Cliente  implements Notificable{
    private String nombre;
    private PayPal correo;

    public Cliente(String nombre, PayPal correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public PayPal getCorreo() {
        return correo;
    }

    @Override
    public void notificar(String notifica){
        System.out.println("Notificación para " + getNombre() + " (" + getCorreo()+ "): " + notifica);
    }
}
