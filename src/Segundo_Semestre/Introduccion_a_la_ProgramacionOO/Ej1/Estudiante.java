package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej1;

public class Estudiante {

    //Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private Double calificaciones;

    //Constructor de la clase Estudiante
    public Estudiante(String nombre, String apellido, String curso, Double calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        if(calificaciones<0 || calificaciones > 10){
            this.calificaciones = 0.0;
            System.out.println("Debido a que la calificacion ingresada no es valida, le colocaremos " + this.calificaciones + " como calificacion.");
            System.out.println("Datos cargados correctamente");
        } else {
            this.calificaciones = calificaciones;
            System.out.println("Datos cargados correctamente");
        }
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Double calificaciones) {
        this.calificaciones = calificaciones;
    }

    //Metodos
    public void mostarInfo(){
        System.out.println("El estudiante " + this.apellido + " " + this.nombre + " tiene la siguiente calificación " + this.calificaciones);
    };
    public void subirCalificacion(double puntos){
        if(0 <= puntos && puntos <= 10){
            if(this.calificaciones + puntos <= 10){
                this.calificaciones += puntos;
                System.out.println("Se han guardado los datos sobre la nueva calificacion");
            } else {
                this.calificaciones = 10.00;
                System.out.println("Se han guardado los datos sobre la nueva calificacion");
            }
        } else {
            System.out.println("Los puntos ingresados no son validos");
        }
    }
    public void bajarCalificacion(double puntos){
        if(0 <= puntos && puntos <= 10){
            if(this.calificaciones - puntos >= 0){
                this.calificaciones -= puntos;
                System.out.println("Se han guardado los datos sobre la nueva calificacion");
            } else {
                this.calificaciones = 0.00;
                System.out.println("Se han guardado los datos sobre la nueva calificacion");
            }
        } else {
            System.out.println("Los puntos ingresados no son validos");
        }
    }
}