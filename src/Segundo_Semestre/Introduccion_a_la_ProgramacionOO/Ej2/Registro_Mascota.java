package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej2;

public class Registro_Mascota {
    public static void main(String[]args){

        Mascota mascota1 = new Mascota("Ritter", "Perro", 3);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    }
}