package Segundo_Semestre.Introduccion_a_la_ProgramacionOO.Ej3;

public class Libro {

    //Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;

    //Constructor de la clase
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        System.out.println("Libro guardado con exito");
    }

    //Getters and Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void getTitulo(){
        System.out.println("El titulo del libro es: "+ this.titulo);
    }

    public void getAutor(){
        System.out.println("El autos del libro es: "+ this.autor);
    }

    public void getAnioPublicacion(){
        System.out.println("El año de publicacion es: "+ this.anioPublicacion);
    }

    public void setAnioPublicacion(int nuevoAnio){
        if(nuevoAnio < 1900 || nuevoAnio > 2025){ //Validacion de la nueva fecha ingresada
            System.out.println("No se puede modificar el año de publicacion, debido a que la fecha ingresada es menor" +
                    " al año 1900 o superior a la actual");
        } else {
            this.anioPublicacion = nuevoAnio;
            System.out.println("Fecha del libro actualizada correctamente");
        }
    }
}