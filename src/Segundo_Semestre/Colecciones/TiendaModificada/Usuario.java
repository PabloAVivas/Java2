package Segundo_Semestre.Colecciones.TiendaModificada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    private List<Producto> inventario = new ArrayList<>();

    public void agregarProducto(String id, String nombre, int cantidad, double precio, Categoria categoria) {
        Producto producto = new Producto(id, nombre, cantidad, precio, categoria);
        inventario.add(producto);
        System.out.println("Producto agregado.");
    }

    public void listarProductos() {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

    public void buscarProducto(int opcionEle) {
        Scanner scanner = new Scanner(System.in);
        String dato;
        boolean encontrado = false;

        switch (opcionEle) {
            case 1:
                System.out.println("Ingrese ID del producto:");
                dato = scanner.nextLine();
                for (Producto producto : inventario) {
                    if (producto.getId().equals(dato)) {
                        System.out.println(producto);
                        encontrado = true;
                    }
                }
                break;
            case 2:
                System.out.println("Ingrese nombre del producto:");
                dato = scanner.nextLine();
                for (Producto producto : inventario) {
                    if (producto.getNombre().equalsIgnoreCase(dato)) {
                        System.out.println(producto);
                        encontrado = true;
                    }
                }
                break;
            case 3:
                System.out.println("Ingrese categoría del producto:");
                dato = scanner.nextLine();
                for (Producto producto : inventario) {
                    if (producto.getCategoria().name().equalsIgnoreCase(dato)) {
                        System.out.println(producto);
                        encontrado = true;
                    }
                }
                break;
            default:
                System.out.println("Opción no válida.");
                return; // Salir del método si la opción no es válida
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }


    public void actualizarStock(String id, Scanner scanner) {
        for (Producto producto : inventario) {
            if (producto.getId().equals(id)) {
                System.out.println("Ingrese nueva cantidad:");
                int nuevaCantidad = scanner.nextInt();
                producto.setCantidad(nuevaCantidad);
                System.out.println("Stock actualizado.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void eliminarProducto(String id) {
        boolean eliminado = inventario.removeIf(producto -> producto.getId().equals(id));
        if (eliminado) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public int totalProductosEnStock() {
        int total = 0;
        for (Producto producto : inventario) {
            total += producto.getCantidad();
        }
        return total;
    }

    public void productoConMayorStock() {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        Producto mayorStock = inventario.get(0);
        for (Producto producto : inventario) {
            if (producto.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = producto;
            }
        }
        System.out.println("Producto con mayor stock: " + mayorStock);
    }

    public void productosEnRangoDePrecios(double precioMin, double precioMax) {
        boolean encontrado = false;
        for (Producto producto : inventario) {
            if (producto.getPrecio() >= precioMin && producto.getPrecio() <= precioMax) {
                System.out.println(producto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }

    public void alertasDeStockBajo() {
        System.out.println("Productos con stock bajo (5 o menos):");
        boolean encontrado = false;
        for (Producto producto : inventario) {
            if (producto.getCantidad() <= 5) {
                System.out.println(producto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos con stock bajo.");
        }
    }
}

