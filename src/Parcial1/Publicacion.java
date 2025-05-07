package Parcial1;

import java.util.ArrayList;

public class Publicacion {
    private String titulo;
    private int anio;
    private ArrayList<Ejemplar> ejemplares;
    private Genero genero;

    public Publicacion(String titulo, int anio, ArrayList<Ejemplar> ejemplares, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.genero = genero;
    }

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public ArrayList<Ejemplar> getEjemplaresDisponibles(){
        ArrayList<Ejemplar> disponibles = new ArrayList<>();
        for (Ejemplar ejemplar: ejemplares){
            if (ejemplar.estaDisponible(ejemplar) == true){
                disponibles.add(ejemplar);
            }
        }
        return disponibles;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", ejemplares=" + ejemplares +
                ", genero=" + genero +
                '}';
    }
}
