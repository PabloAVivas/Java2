package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej5;

public class Comportamiento_Objeto {
    public static void main(String[]args){

        NaveEspacial nave1 = new NaveEspacial("Finn", 50);
        nave1.despegar();
        nave1.avanzar(60);
        nave1.recargarCombustible(40);
        nave1.avanzar(60);
        nave1.mostrarEstado();

    };
}