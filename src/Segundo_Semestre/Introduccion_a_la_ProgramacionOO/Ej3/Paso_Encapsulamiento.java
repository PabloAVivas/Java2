package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej3;

public class Paso_Encapsulamiento {
    public static void main(String[]args){

        Libro libro1 = new Libro("Todos los soles mienten", "Esteban Valentino", 1999);
        libro1.setAnioPublicacion(1865); //Parametro invalido para comprobar validacion del setter
        libro1.setAnioPublicacion(1970);
        libro1.getTitulo();
        libro1.getAutor();
        libro1.getAnioPublicacion();
    }
}