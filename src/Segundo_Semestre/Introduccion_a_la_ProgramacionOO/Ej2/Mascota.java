package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej2;

public class Mascota {

    //Atributos
    private String Nombre;
    private String Especie;
    private int edad;

    //Constructor de la clase
    public Mascota(String nombre, String especie, int edad) {
        this.Nombre = nombre;
        this.Especie = especie;
        this.edad = edad;
    }

    //Getters and Setters
    public String getNombre() { return Nombre; }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecie() { return Especie; }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos
    public void mostrarInfo(){
        System.out.println("Informacion sobre la mascota"+"\n Nombre: " + this.Nombre + "\n Especie: " + this.Especie + "\n Edad: " + this.edad);
    }
    public void cumplirAnios(){
        this.edad += 1;
        System.out.println("Edad actualizda correctamente");
    }
}