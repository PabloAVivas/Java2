package Parcial1;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(ArrayList<Publicacion> publicaciones, ArrayList<Usuario> usuarios) {
        this.publicaciones = publicaciones;
        this.usuarios = usuarios;
    }
    public Biblioteca(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "publicaciones=" + publicaciones +
                ", usuarios=" + usuarios +
                '}';
    }
}
