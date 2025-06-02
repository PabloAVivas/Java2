package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            GestorCategorias gestor = new GestorCategorias(connection);


            gestor.agregarCategoria("Electrónica", "Dispositivos electrónicos");
            System.out.println("Categoría agregada.");


            List<String> categorias = gestor.listarCategorias();
            System.out.println("Lista de categorías:");
            for (String nombre : categorias) {
                System.out.println(nombre);
            }


            gestor.mostrarCategoria(1);


            gestor.actualizarCategoria(1, "Electrónica Avanzada", "Dispositivos electrónicos avanzados.");
            System.out.println("Categoría actualizada.");


            gestor.eliminarCategoria(1);
            System.out.println("Categoría eliminada.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
