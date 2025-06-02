package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata4;

import java.sql.SQLException;
import java.util.List;

public class PedidoServiceImpl {
    private PedidoDAOImpl pedidoDao;
    private ProductoDAOImpl productoDao;

    public PedidoServiceImpl(PedidoDAOImpl pedidoDao, ProductoDAOImpl productoDao) {
        this.pedidoDao = pedidoDao;
        this.productoDao = productoDao;
    }

    public void crearPedido(Pedido pedido) throws SQLException {
        if (pedido.getItems().isEmpty()) {
            throw new SQLException("El pedido debe tener al menos un ítem.");
        }

        for (ItemPedido item : pedido.getItems()) {
            if (item.getCantidad() <= 0) {
                throw new SQLException("Cada ítem debe tener cantidad > 0.");
            }
            if (!productoDao.existeProducto(item.getProducto().getId())) { // Cambiar a existeProducto
                throw new SQLException("El producto debe existir.");
            }
            if (productoDao.obtenerStock(item.getProducto().getId()) < item.getCantidad()) {
                throw new SQLException("Stock insuficiente para el producto: " + item.getProducto().getNombre());
            }

            productoDao.actualizarStock(item.getProducto().getId(), item.getCantidad());
        }


        pedidoDao.crear(pedido);
    }



    public void mostrarDetallePedido(int pedidoId) throws SQLException {
        Pedido pedido = pedidoDao.leer(pedidoId);
        if (pedido != null) {
            System.out.println("Detalles del pedido ID: " + pedido.getId());
            for (ItemPedido item : pedido.getItems()) {
                System.out.println("Producto: " + item.getProducto().getNombre() +
                        ", Cantidad: " + item.getCantidad() +
                        ", Subtotal: " + item.getSubtotal());
            }
            System.out.println("Total del pedido: " + pedido.getTotal());
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }

}

