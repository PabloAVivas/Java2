package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej1;

public class Registro_Estudiantes {

    public static void main(String[]args){

        Estudiante estudiante1 = new Estudiante("Santiago", "Morales", "Ingenieria Informatica", 8.0);
        estudiante1.mostarInfo();
        estudiante1.subirCalificacion(8);
        System.out.println("Calificacion actual: " + estudiante1.getCalificaciones()); //Este println es para
        // corroborar si se sumaron los puntos a la calificacion
        estudiante1.bajarCalificacion(3);
        System.out.println("Calificacion actual: " + estudiante1.getCalificaciones()); //Este print es para
        // corroborar si se restaron los puntos
    }
}