package BuenSabor_V4.Entities;

import java.util.HashSet;
import java.util.Set;

public class Categoria extends Base {
    private String denominacion;
    private Categoria categoriaPadre; //null
    private Set<Categoria> subcategorias = new HashSet<>();

    private Set<Articulo> articulo = new HashSet<>();

    public Categoria() {
    }

    public Categoria(Long id, String denominacion) {
        super(id);
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public Set<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(Set<Categoria> subcategorias) {
        this.subcategorias = subcategorias;
    }


    /*@Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", categoriaPadre=" + categoriaPadre +
                ", subcategorias=" + subcategorias +
                ", sucursales=" + sucursales +
                '}';
    }*/
}
