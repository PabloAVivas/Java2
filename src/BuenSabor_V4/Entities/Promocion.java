package BuenSabor_V4.Entities;

import BuenSabor_V4.Entities.Enums.TipoPromocion;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Promocion {
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalDate HoraDesde;
    private LocalDate HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    private Set<Imagen> imagenes = new HashSet<>();

    private Set<Articulo> articulos = new HashSet<>();

    private Set<Sucursal> sucursal = new HashSet<>();

    public Promocion() {}

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalDate horaDesde, LocalDate horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        FechaDesde = fechaDesde;
        FechaHasta = fechaHasta;
        HoraDesde = horaDesde;
        HoraHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public LocalDate getFechaDesde() {
        return FechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        FechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return FechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        FechaHasta = fechaHasta;
    }

    public LocalDate getHoraDesde() {
        return HoraDesde;
    }

    public void setHoraDesde(LocalDate horaDesde) {
        HoraDesde = horaDesde;
    }

    public LocalDate getHoraHasta() {
        return HoraHasta;
    }

    public void setHoraHasta(LocalDate horaHasta) {
        HoraHasta = horaHasta;
    }

    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public Double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(Double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    public Set<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Set<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }



    /*@Override
    public String toString() {
        return "Promocion{" +
                "denominacion='" + denominacion + '\'' +
                ", FechaDesde=" + FechaDesde +
                ", FechaHasta=" + FechaHasta +
                ", HoraDesde=" + HoraDesde +
                ", HoraHasta=" + HoraHasta +
                ", descripcionDescuento='" + descripcionDescuento + '\'' +
                ", precioPromocional=" + precioPromocional +
                ", tipoPromocion=" + tipoPromocion +
                ", imagenes=" + imagenes +
                ", articulos=" + articulos +
                ", sucursal=" + sucursal +
                '}';
    }*/
}
