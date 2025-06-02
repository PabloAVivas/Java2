package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAOImpl implements GenericDAO<Pedido> {
    private Connection connection;

    public PedidoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void crear(Pedido pedido) throws SQLException {
        String sql = "INSERT INTO pedidos (fecha, total) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setDate(1, Date.valueOf(pedido.getFecha()));
            stmt.setDouble(2, pedido.getTotal());
            stmt.executeUpdate();


            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                int pedidoId = generatedKeys.getInt(1);

                for (ItemPedido item : pedido.getItems()) {
                    crearItemPedido(item, pedidoId);
                }
            }
        }
    }

    private void crearItemPedido(ItemPedido item, int pedidoId) throws SQLException {
        String sql = "INSERT INTO items_pedido (pedido_id, producto_id, cantidad, subtotal) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, pedidoId);
            stmt.setInt(2, item.getProducto().getId());
            stmt.setInt(3, item.getCantidad());
            stmt.setDouble(4, item.getSubtotal());
            stmt.executeUpdate();
        }
    }

    @Override
    public Pedido leer(int id) throws SQLException {
        String sql = "SELECT * FROM pedidos WHERE id = ?";
        Pedido pedido = null;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pedido = new Pedido(rs.getInt("id"), rs.getDate("fecha").toLocalDate(), listarItemsPedido(id), rs.getDouble("total"));
            }
        }
        return pedido;
    }

    private List<ItemPedido> listarItemsPedido(int pedidoId) throws SQLException {
        List<ItemPedido> items = new ArrayList<>();
        String sql = "SELECT * FROM items_pedido WHERE pedido_id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, pedidoId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Producto producto = new ProductoDAOImpl(connection).leer(rs.getInt("producto_id"));
                ItemPedido item = new ItemPedido(rs.getInt("id"), producto, rs.getInt("cantidad"), rs.getDouble("subtotal"));
                items.add(item);
            }
        }
        return items;
    }

    @Override
    public void actualizar(Pedido pedido) throws SQLException {
        String sql = "UPDATE pedidos SET fecha = ?, total = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDate(1, Date.valueOf(pedido.getFecha()));
            stmt.setDouble(2, pedido.getTotal());
            stmt.setInt(3, pedido.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void eliminar(int id) throws SQLException {
        // Primero, eliminar los ítems del pedido
        String sqlItems = "DELETE FROM items_pedido WHERE pedido_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sqlItems)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }

        // Luego, eliminar el pedido
        String sql = "DELETE FROM pedidos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    @Override
    public List<Pedido> listar() throws SQLException {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Pedido pedido = new Pedido(rs.getInt("id"), rs.getDate("fecha").toLocalDate(), listarItemsPedido(rs.getInt("id")), rs.getDouble("total"));
                pedidos.add(pedido);
            }
        }
        return pedidos;
    }
}
