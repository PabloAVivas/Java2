package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "";


        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false); // Para manejar la transacción

            PedidoDAOImpl pedidoDao = new PedidoDAOImpl(connection);
            ProductoDAOImpl productoDao = new ProductoDAOImpl(connection);
            PedidoServiceImpl pedidoService = new PedidoServiceImpl(pedidoDao, productoDao);


            List<ItemPedido> items = new ArrayList<>();
            Producto producto1 = productoDao.leer(6); // Suponiendo que el ID 6 existe
            Producto producto2 = productoDao.leer(7); // Suponiendo que el ID 7 existe


            items.add(new ItemPedido(0, producto1, 2, producto1.getPrecio() * 2)); // ID como 0, se podría manejar en la base de datos
            items.add(new ItemPedido(0, producto2, 1, producto2.getPrecio())); // ID como 0


            double total = items.stream().mapToDouble(ItemPedido::getSubtotal).sum();
            Pedido nuevoPedido = new Pedido(0, LocalDate.now(), items, total); // ID inicial como 0


            pedidoService.crearPedido(nuevoPedido);
            System.out.println("Pedido creado con ID: " + nuevoPedido.getId());


            pedidoService.mostrarDetallePedido(nuevoPedido.getId());

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();

            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
        } finally {

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException closeEx) {
                    closeEx.printStackTrace();
                }
            }
        }
    }
}



