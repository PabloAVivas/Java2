package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej5;

public class NaveEspacial {

    //Atributos
    private String nombre;
    private int combustible;

    //Constructor de la clase
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        System.out.println("Nave creada exitosamente");
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    //Metodos
    public void despegar(){
        if(combustible < 10){
            System.out.println("La nave " + this.nombre + " no tiene el combustible necesario para poder despegar. \n Disponibles: " + this.combustible + "\n Necesarios: 10");
        } else {
            this.combustible -= 10;
            System.out.println("La nave" + this.nombre + " ha despegado");
        }
    }
    public void avanzar(int distancia){
        if (this.combustible < distancia){
            System.out.println("La nave " + nombre + " no tiene el combustible necesario para recorrer esa distancia. \n Combustible necesario: " + distancia + "\n Combustible disponible: " + this.combustible);
        } else {
            this.combustible -= distancia;
            System.out.println("La nave" + this.nombre + " pudo avanzar correctamente");
        }
    }
    public void recargarCombustible(int cantidad){
        if(this.combustible + cantidad > 100){
            System.out.println("Esta carga sobrepasa el limite del tanque. \n Limite del tanque: 100 \n Actual: " + this.combustible);
        } else {
            this.combustible += cantidad;
            System.out.println("Carga de combustible para la nave " + this.nombre + " ha sido exitosa");
        }
    }
    public void mostrarEstado(){
        System.out.println("La nave " + this.nombre + " tiene " + this.combustible + " unidades de cobustible");
    }

}