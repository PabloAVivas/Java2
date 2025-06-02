package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestorCategorias {
    private Connection connection;

    public GestorCategorias(Connection connection) {
        this.connection = connection;
    }

    public void agregarCategoria(String nombre, String descripcion) throws SQLException {
        if (existeCategoria(nombre)) {
            throw new SQLException("La categoría ya existe.");
        }
        String sql = "INSERT INTO categorias (nombre, descripcion) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.executeUpdate();
        }
    }

    public void mostrarCategoria(int id) throws SQLException {
        String sql = "SELECT * FROM categorias WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Descripción: " + rs.getString("descripcion"));
            } else {
                System.out.println("Categoría no encontrada.");
            }
        }
    }

    public List<String> listarCategorias() throws SQLException {
        List<String> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categorias";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                categorias.add(rs.getString("nombre"));
            }
        }
        return categorias;
    }

    public void actualizarCategoria(int id, String nombre, String descripcion) throws SQLException {
        String sql = "UPDATE categorias SET nombre = ?, descripcion = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        }
    }

    public void eliminarCategoria(int id) throws SQLException {
        String sql = "DELETE FROM categorias WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    private boolean existeCategoria(String nombre) throws SQLException {
        String sql = "SELECT COUNT(*) FROM categorias WHERE nombre = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            return rs.next() && rs.getInt(1) > 0;
        }
    }
}

