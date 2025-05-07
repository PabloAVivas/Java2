package Repaso;

import java.util.Date;

public class Cuenta {
    private String id;
    private String direccion_de_facturacion;
    private Boolean esta_cerrada;
    private Date abierta;
    private Date cerrada;

    public Cuenta(String id, String direccion_de_facturacion, Boolean esta_cerrada, Date abierta, Date cerrada) {
        this.id = id;
        this.direccion_de_facturacion = direccion_de_facturacion;
        this.esta_cerrada = esta_cerrada;
        this.abierta = abierta;
        this.cerrada = cerrada;
        System.out.println("Se ha creado la cuenta");
    }

    public String getDireccion_de_facturacion() {
        return direccion_de_facturacion;
    }
}
