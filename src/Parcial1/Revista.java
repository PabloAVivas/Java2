package Parcial1;

import java.util.ArrayList;

public class Revista extends Publicacion {
    private int volumen;
    private int numero;

    public Revista(String titulo, int anio, ArrayList<Ejemplar> ejemplares, Genero genero, int volumen, int numero) {
        super(titulo, anio, ejemplares, genero);
        this.volumen = volumen;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "volumen=" + volumen +
                ", numero=" + numero +
                '}';
    }
}
