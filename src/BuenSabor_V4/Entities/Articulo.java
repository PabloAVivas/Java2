package BuenSabor_V4.Entities;

import java.util.HashSet;
import java.util.Set;

public abstract class Articulo extends Base{

    protected String denominacion;
    protected Double precioVenta;

    private UnidadMedida unidadMedida;

    private Set<Imagen> imagenes = new HashSet<>();

    private Categoria categoria;

    public Articulo() {}

    public Articulo(Long id, String denominacion, Double precioVenta) {
        super(id);
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Set<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Set<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
