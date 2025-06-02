package BuenSabor_V4;

import BuenSabor_V4.Entities.*;
import BuenSabor_V4.Entities.Enums.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // ------------------------------------------------------------------------------------
        // Instancias
        // ------------------------------------------------------------------------------------

        // Empresa
        Empresa empresa = new Empresa(1L, "Empresa 1", "SRL", 1234566774);

        // Sucursal
        Sucursal sucursal1 = new Sucursal(1L, "Sucursal 1", LocalTime.of(8, 30), LocalTime.of(20, 0));
        Sucursal sucursal2 = new Sucursal(2L, "Sucursal 2", LocalTime.of(9, 0), LocalTime.of(21, 0));

        // Domicilio
        Domicilio domicilio1 = new Domicilio(1L, "Calle 1", 123, 4567);
        Domicilio domicilio2 = new Domicilio(2L, "Calle 2", 456, 8910);

        // Localidad
        Localidad localidad1 = new Localidad(1L, "Localidad 1");
        Localidad localidad2 = new Localidad(2L, "Localidad 2");

        // Provincia
        Provincia provincia1 = new Provincia(1L, "Provincia 1");
        Provincia provincia2 = new Provincia(2L, "Provincia 2");

        // País
        Pais pais = new Pais(1L, "Argentina");

        // Categorías
        Categoria categoriaPadre = new Categoria(1L, "Categoría Padre");
        Categoria subCategoria1 = new Categoria(2L, "Subcategoría 1");
        Categoria subCategoria2 = new Categoria(3L, "Subcategoría 2");

        // Artículos
        ArticuloInsumo insumo1 = new ArticuloInsumo(1L, "Insumo 1", 100.0, 50.0, 20, 100, true);
        ArticuloManufacturado manufacturado1 = new ArticuloManufacturado(2L, "Manufacturado 1", 200.0, "Descripción 1", 30, "Preparación 1");

        // Unidad de Medida
        UnidadMedida unidadMedida = new UnidadMedida(1L, "Kilogramos");

        // Imagen
        Imagen imagen1 = new Imagen(1L, "Imagen 1");
        Imagen imagen2 = new Imagen(2L, "Imagen 2");

        // Cliente
        Cliente cliente = new Cliente(1L, "Juan", "Pérez", "123456789", "juan.perez@example.com", LocalDate.of(1990, 1, 1));

        // Usuario
        Usuario usuario = new Usuario(1L, "auth0Id123", "juanperez");

        // Pedido
        Pedido pedido = new Pedido(1L, LocalTime.of(12, 0), 500.0, 550.0, Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.now());

        // Factura
        Factura factura = new Factura(1L, LocalDate.now(), 12345, 67890, "pref123", "MercadoPago", FormaPago.MERCADOPAGO, 550.0);

        // Detalle de Pedido
        DetallePedido detallePedido = new DetallePedido(1L, 2, 200.0);

        // Promoción
        Promocion promocion = new Promocion("Promoción 1", LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31), LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31), "Descuento 10%", 180.0, TipoPromocion.HAPPYHOUR);


        // Relaciones

        // Empresa a Sucursal
        empresa.getSucursales().add(sucursal1);
        empresa.getSucursales().add(sucursal2);
        sucursal1.setEmpresa(empresa);
        sucursal2.setEmpresa(empresa);

        // Sucursal a Domicilio
        sucursal1.setDomicilio(domicilio1);
        sucursal2.setDomicilio(domicilio2);

        // Domicilio a Localidad
        domicilio1.setLocalidad(localidad1);
        domicilio2.setLocalidad(localidad2);

        // Localidad a Provincia
        localidad1.setProvincia(provincia1);
        localidad2.setProvincia(provincia2);

        // Provincia a Pais
        provincia1.setPais(pais);
        provincia2.setPais(pais);

        // Categoria a Subcategorias
        categoriaPadre.getSubcategorias().add(subCategoria1);
        categoriaPadre.getSubcategorias().add(subCategoria2);
        subCategoria1.setCategoriaPadre(categoriaPadre);
        subCategoria2.setCategoriaPadre(categoriaPadre);

        // Sucursal a Categoria
        sucursal1.getCategorias().add(categoriaPadre);

        // ArticuloInsumo a UnidadMedida
        insumo1.setUnidadMedida(unidadMedida);

        // ArticuloManufacturado a Imagen
        manufacturado1.getImagenes().add(imagen1);
        manufacturado1.getImagenes().add(imagen2);

        // Cliente a Usuario
        cliente.setUsuario(usuario);

        // Pedido a Cliente
        pedido.setCliente(cliente);

        // Pedido a DetallePedido
        pedido.getDetallesPedido().add(detallePedido);
        detallePedido.setPedido(pedido);

        // Factura a Pedido
        factura.setPedido(pedido);
        pedido.setFactura(factura);

        // Sucursal a Promoción
        sucursal1.getPromociones().add(promocion);


        /*System.out.println(empresa);
        System.out.println(sucursal1);
        System.out.println(domicilio1);
        System.out.println(localidad1);
        System.out.println(provincia1);
        System.out.println(pais);
        System.out.println(categoriaPadre);
        System.out.println(insumo1);
        System.out.println(manufacturado1);
        System.out.println(cliente);
        System.out.println(pedido);
        System.out.println(factura);
        System.out.println(promocion);*/
    }
}
