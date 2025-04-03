package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej4;

public class Gallina {

    //Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    //Constructor de la clase
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.edad = edad;
        this.idGallina = idGallina;
        this.huevosPuestos = huevosPuestos;
        System.out.println("Gallina registrada exitosamente");
    }

    //Getters and Setters
    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    //Metodos
    public void ponerHuevos(){
        this.huevosPuestos += 1;
        System.out.println("La gallina " + this.idGallina + " ha puesto un huevo");
    }
    public void envejecer(){
        this.edad += 1;
        System.out.println("La gallina " + this.idGallina + " ha envejecido 1 año");
    }
    public void mostrarEstado(){
        System.out.println("Está accediendo a la gallina: "+ this.idGallina + "\n Esta misma tiene: " + this.edad + " años" + "\n Ha puesto: " + this.huevosPuestos + " huevos");
    }
}