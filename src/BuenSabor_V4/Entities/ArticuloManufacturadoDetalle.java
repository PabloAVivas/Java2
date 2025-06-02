package BuenSabor_V4.Entities;

public class ArticuloManufacturadoDetalle extends Base {
    private int cantidad;

    private ArticuloInsumo articuloInsumo;

    public ArticuloManufacturadoDetalle(){}

    public ArticuloManufacturadoDetalle(Long id, int cantidad, ArticuloInsumo articuloInsumo) {
        super(id);
        this.cantidad = cantidad;
        this.articuloInsumo = articuloInsumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public ArticuloInsumo getArticuloInsumo() {
        return articuloInsumo;
    }

    public void setArticuloInsumo(ArticuloInsumo articuloInsumo) {
        this.articuloInsumo = articuloInsumo;
    }

    /*@Override
    public String toString() {
        return "ArticuloManufacturadoDetalle{" +
                "cantidad=" + cantidad +
                ", articuloManufacturado=" + articuloManufacturado +
                ", articuloInsumo=" + articuloInsumo +
                '}';
    }*/
}
