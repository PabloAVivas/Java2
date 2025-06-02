package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {


            CategoriaDAOImpl categoriaDao = new CategoriaDAOImpl(connection);
            CategoriaServiceImpl categoriaService = new CategoriaServiceImpl(categoriaDao);


            Categoria categoria = categoriaDao.leer(1); // Cambia el ID según sea necesario
            if (categoria == null) {
                categoria = new Categoria("Electrónica", "Dispositivos electrónicos");
                categoriaService.crear(categoria);
            }

            ProductoDAOImpl productoDao = new ProductoDAOImpl(connection);
            ProductoServiceImpl productoService = new ProductoServiceImpl(productoDao);


            Producto producto = new Producto("Teléfono", "Teléfono inteligente", 699.99, 50, categoria);
            productoService.crear(producto);
            System.out.println("Producto creado: " + producto.getNombre());


            System.out.println("Lista de productos:");
            for (Producto p : productoDao.listar()) {
                System.out.println(p.getNombre());
            }


            producto.setPrecio(649.99);
            productoService.actualizar(producto);
            System.out.println("Producto actualizado: " + producto.getNombre());


            productoService.eliminar(producto.getId());
            System.out.println("Producto eliminado: " + producto.getNombre());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}

