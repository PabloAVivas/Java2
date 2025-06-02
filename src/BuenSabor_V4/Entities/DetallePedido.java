package BuenSabor_V4.Entities;

public class DetallePedido extends Base{
    private int cantidad;
    private Double subTotal;

    private Pedido pedido;

    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(Long id, int cantidad, Double subTotal) {
        super(id);
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    /*@Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", pedido=" + pedido +
                ", articulo=" + articulo +
                '}';
    }*/
}
