package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemPedidoDAOImpl implements GenericDAO<ItemPedido> {
    private Connection connection;

    public ItemPedidoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void crear(ItemPedido item) throws SQLException {
        String sql = "INSERT INTO items_pedido (pedido_id, producto_id, cantidad, subtotal) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, item.getId()); // Aquí podría ser la referencia al pedido que se debe pasar como parámetro
            stmt.setInt(2, item.getProducto().getId());
            stmt.setInt(3, item.getCantidad());
            stmt.setDouble(4, item.getSubtotal());
            stmt.executeUpdate();
        }
    }

    @Override
    public ItemPedido leer(int id) throws SQLException {
        // Implementar lógica para leer un ítem de pedido por ID si es necesario
        return null;
    }

    @Override
    public void actualizar(ItemPedido item) throws SQLException {
        // Implementar lógica para actualizar un ítem de pedido si es necesario
    }

    @Override
    public void eliminar(int id) throws SQLException {
        // Implementar lógica para eliminar un ítem de pedido por ID
    }

    @Override
    public List<ItemPedido> listar() throws SQLException {
        // Implementar lógica para listar ítems de pedidos si es necesario
        return null;
    }
}
