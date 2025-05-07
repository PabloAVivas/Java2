package Segundo_Semestre.PracticaPrimerParcial.Cine;

public class Pelicula {
    private String titulo;
    private Genero genero;

    public Pelicula(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
