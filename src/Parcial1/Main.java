package Parcial1;
//{}
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Direccion di1 = new Direccion("Falsa", 123, "Springfield", "6574");

        Genero genF = new Genero("Fantasia", "Relatos magicos");
        Genero genM = new Genero("Moda", "Diseños");
        Editorial ed1 = new Editorial("Dedede", "Dedede.com", di1);

        Autor au1 = new Autor("Juan", "Argentina", LocalDate.of(2000, 05, 04));
        Autor au2 = new Autor("Pedro", "Chile", LocalDate.of(1990, 07, 26));
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(au1);
        autores.add(au2);

        Libro li1 = new Libro("La Perla", 2007, null, genF, "asd", autores, ed1);
        Ejemplar ej1 = new Ejemplar("AA00", EstadoEjemplar.DISPONIBLE, li1);
        Ejemplar ej2 = new Ejemplar("AA01", EstadoEjemplar.DISPONIBLE, li1);
        ArrayList<Ejemplar> ejemLi1 = new ArrayList<>();
        ejemLi1.add(ej1);
        ejemLi1.add(ej2);

        Ejemplar ejR1 = new Ejemplar("AA00", EstadoEjemplar.DISPONIBLE, li1);
        Ejemplar ejR2 = new Ejemplar("AA01", EstadoEjemplar.DISPONIBLE, li1);
        ArrayList<Ejemplar> ejemRe1 = new ArrayList<>();
        ejemRe1.add(ejR1);
        ejemRe1.add(ejR2);
        Revista re1 = new Revista("Modista", 2015, ejemRe1, genM, 1, 23);

        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(li1);
        publicaciones.add(re1);
        Biblioteca bib1 = new Biblioteca(publicaciones);

        LineaPrestamo liP1 = new LineaPrestamo(new Date(2020,05,04), ej1);
        ArrayList<LineaPrestamo> lineaPrestamo = new ArrayList<>();
        lineaPrestamo.add(liP1);

        Prestamo pre1= new Prestamo(new Date(2020,05,04), new Date(2020,06,15), lineaPrestamo);
        ArrayList<Prestamo> prestamo1 = new ArrayList<>();
        prestamo1.add(pre1);

        Usuario usu1 = new Usuario("Pablo", "Vivas", "45720098", prestamo1);
    }
}
