package BuenSabor_V4.Entities;

import BuenSabor_V4.Entities.Enums.FormaPago;

import java.time.LocalDate;

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private int mpPaymentId;
    private int mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;

    private Pedido pedido;

    public Factura() {
    }

    public Factura(Long id, LocalDate fechaFacturacion, int mpPaymentId, int mpMerchantOrderId, String mpPreferenceId, String mpPaymentType, FormaPago formaPago, Double totalVenta) {
        super(id);
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPreferenceId = mpPreferenceId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public int getMpPaymentId() {
        return mpPaymentId;
    }

    public void setMpPaymentId(int mpPaymentId) {
        this.mpPaymentId = mpPaymentId;
    }

    public int getMpMerchantOrderId() {
        return mpMerchantOrderId;
    }

    public void setMpMerchantOrderId(int mpMerchantOrderId) {
        this.mpMerchantOrderId = mpMerchantOrderId;
    }

    public String getMpPreferenceId() {
        return mpPreferenceId;
    }

    public void setMpPreferenceId(String mpPreferenceId) {
        this.mpPreferenceId = mpPreferenceId;
    }

    public String getMpPaymentType() {
        return mpPaymentType;
    }

    public void setMpPaymentType(String mpPaymentType) {
        this.mpPaymentType = mpPaymentType;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /*@Override
    public String toString() {
        return "Factura{" +
                "fechaFacturacion=" + fechaFacturacion +
                ", mpPaymentId=" + mpPaymentId +
                ", mpMerchantOrderId=" + mpMerchantOrderId +
                ", mpPreferenceId='" + mpPreferenceId + '\'' +
                ", mpPaymentType='" + mpPaymentType + '\'' +
                ", formaPago=" + formaPago +
                ", totalVenta=" + totalVenta +
                ", pedido=" + pedido +
                '}';
    }*/
}
