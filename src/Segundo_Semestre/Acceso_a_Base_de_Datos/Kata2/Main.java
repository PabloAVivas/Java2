package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata2;

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


            Categoria categoria1 = new Categoria("Electrónica", "Dispositivos electrónicos");
            categoriaService.crear(categoria1); // ID se generará automáticamente
            System.out.println("Categoría creada: " + categoria1.getNombre() + " con ID: " + categoria1.getId());


            System.out.println("Lista de categorías:");
            for (Categoria c : categoriaService.listar()) {
                System.out.println(c.getId() + ": " + c.getNombre());
            }


            Categoria categoriaLeida = categoriaService.leer(categoria1.getId());
            if (categoriaLeida != null) {
                System.out.println("Categoría leída: " + categoriaLeida.getNombre());
            } else {
                System.out.println("Categoría no encontrada.");
            }


            if (categoriaLeida != null) {
                categoriaLeida.setDescripcion("Dispositivos eléctricos y electrónicos");
                categoriaService.actualizar(categoriaLeida);
                System.out.println("Categoría actualizada: " + categoriaLeida.getNombre());
            }


            if (categoriaLeida != null) {
                categoriaService.eliminar(categoriaLeida.getId());
                System.out.println("Categoría eliminada: " + categoriaLeida.getNombre());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
