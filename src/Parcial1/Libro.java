package Parcial1;

import java.util.ArrayList;

public class Libro extends Publicacion{
    private String isbn;
    private ArrayList<Autor> autores;
    private Editorial editorial;

    public Libro(String titulo, int anio, ArrayList<Ejemplar> ejemplares, Genero genero, String isbn, ArrayList<Autor> autores, Editorial editorial) {
        super(titulo, anio, ejemplares, genero);
        this.isbn = isbn;
        this.autores = autores;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", autores=" + autores +
                ", editorial=" + editorial +
                '}';
    }
}
