package Segundo_Semestre.Colecciones.TiendaModificada;

import java.util.Scanner;

public class MainTienda {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:\n 1. Agregar Producto \n 2. Listar Productos \n 3. Buscar Producto \n 4. Actualizar Stock \n 5. Eliminar Producto \n 6. Total Stock \n 7. Producto con mas Stock \n 8. Rango de Precio\n 9. Stock Bajo\n 10. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese ID del producto:");
                    String id = scanner.nextLine();
                    System.out.println("Ingrese nombre del producto:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese cantidad disponible:");
                    int cantidad = scanner.nextInt();
                    System.out.println("Ingrese precio:");
                    double precio = scanner.nextDouble();
                    System.out.println("Seleccione categoría (ELECTRONICA, ALIMENTOS, ROPA, HOGAR):");
                    Categoria categoria = Categoria.valueOf(scanner.next().toUpperCase());

                    usuario.agregarProducto(id, nombre, cantidad, precio, categoria);
                    break;
                case 2:
                    usuario.listarProductos();
                    break;
                case 3:
                    System.out.println("¿Desea buscar por:\n1. ID\n2. Nombre\n3. Categoría?");
                    int opcionEl = scanner.nextInt();
                    scanner.nextLine();
                    usuario.buscarProducto(opcionEl);
                    break;
                case 4:
                    System.out.println("Ingrese ID del producto a actualizar:");
                    String idActualizar = scanner.nextLine();
                    usuario.actualizarStock(idActualizar, scanner);
                    break;
                case 5:
                    System.out.println("Ingrese ID del producto a eliminar:");
                    String idEliminar = scanner.nextLine();
                    usuario.eliminarProducto(idEliminar);
                    break;
                case 6:
                    System.out.println("Total de productos en stock: " + usuario.totalProductosEnStock());
                    break;
                case 7:
                    usuario.productoConMayorStock();
                    break;
                case 8:
                    System.out.println("Ingrese el rango de precios (min y max):");
                    double precioMin = scanner.nextDouble();
                    double precioMax = scanner.nextDouble();
                    usuario.productosEnRangoDePrecios(precioMin, precioMax);
                    break;
                case 9:
                    usuario.alertasDeStockBajo();
                    break;
                case 10:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
