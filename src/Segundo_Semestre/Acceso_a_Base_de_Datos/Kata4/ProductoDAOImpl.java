package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements GenericDAO<Producto> {
    private Connection connection;

    public ProductoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public int obtenerStock(int idProducto) throws SQLException {
        String sql = "SELECT cantidad FROM productos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idProducto);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("cantidad");
            }
        }
        return 0;
    }


    public void crear(Producto p) throws SQLException {
        String sql = "INSERT INTO productos (nombre, descripcion, precio, cantidad, id_categoria) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getDescripcion());
            stmt.setDouble(3, p.getPrecio());
            stmt.setInt(4, p.getCantidad());
            stmt.setInt(5, p.getCategoria().getId());
            stmt.executeUpdate();


            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    p.setId(generatedKeys.getInt(1)); // Asigna el ID generado al objeto Producto
                } else {
                    throw new SQLException("No se pudo obtener el ID generado.");
                }
            }
        }
    }

    @Override
    public Producto leer(int id) throws SQLException {
        String sql = "SELECT * FROM productos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"),
                        rs.getDouble("precio"), rs.getInt("cantidad"),
                        new Categoria(rs.getInt("id_categoria"), "", ""));
            }
        }
        return null;
    }


    public void actualizar(Producto p) throws SQLException {
        String sql = "UPDATE productos SET nombre = ?, descripcion = ?, precio = ?, cantidad = ?, id_categoria = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getDescripcion());
            stmt.setDouble(3, p.getPrecio());
            stmt.setInt(4, p.getCantidad());
            stmt.setInt(5, p.getCategoria().getId());
            stmt.setInt(6, p.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM productos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    public void actualizarStock(int idProducto, int cantidad) throws SQLException {
        String sql = "UPDATE productos SET cantidad = cantidad - ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, cantidad);
            stmt.setInt(2, idProducto);
            stmt.executeUpdate();
        }
    }
    @Override
    public List<Producto> listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                productos.add(new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"),
                        rs.getDouble("precio"), rs.getInt("cantidad"),
                        new Categoria(rs.getInt("id_categoria"), "", "")));
            }
        }
        return productos;
    }


    public boolean existeProducto(int idProducto) throws SQLException {
        String sql = "SELECT COUNT(*) FROM productos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idProducto);
            ResultSet rs = stmt.executeQuery();
            return rs.next() && rs.getInt(1) > 0;
        }
    }
}
