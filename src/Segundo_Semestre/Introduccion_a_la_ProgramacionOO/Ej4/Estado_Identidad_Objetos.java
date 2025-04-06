package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej4;
public class Estado_Identidad_Objetos{
public static void main(String[]args){

    Gallina gallina1 = new Gallina(1, 4, 6);
    Gallina gallina2 = new Gallina(2, 5, 4);

    gallina1.ponerHuevos();
    gallina2.ponerHuevos();
    gallina1.envejecer();
    gallina2.envejecer();
    gallina1.mostrarEstado();
    gallina2.mostrarEstado();
}
}