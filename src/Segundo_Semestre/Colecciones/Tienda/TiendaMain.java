package Segundo_Semestre.Colecciones.Tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("Manzana", 5, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("Televisor", 75000, 20, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("Remera", 200, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("Sillon", 7000, 10, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("Computadora", 300000, 5, CategoriaProducto.ELECTRONICA));


        System.out.println("Lista de productos:");
        inventario.listarProductos();

        System.out.println("¿Quieres buscar un producto?1=si 0=no");
        int buscar = scanner.nextInt();

        if (buscar == 1){
            System.out.println("Introduzca el id del producto que desea buscar");
            int idBuscar = scanner.nextInt();

            System.out.println("Buscando producto con ID: " + idBuscar);
            Producto productoBuscado = inventario.buscarProductoPorId(idBuscar);

            if (productoBuscado != null) {
                productoBuscado.mostrarInfo();
            } else {
                System.out.println("Producto no encontrado.");
            }
        }

        System.out.println("¿Quieres filtrar un producto?1=si 0=no");
        int filtro = scanner.nextInt();

        if (filtro == 1) {
            System.out.println("¿Que producto desea filtrar? elija el numero de la categoria:");
            CategoriaProducto[] categoria = CategoriaProducto.values();
            for (int i = 0; i < categoria.length; i++) {
                System.out.println((i + 1) +") " + categoria[i]);
            }
            int categoriaSelec = scanner.nextInt();
            categoriaSelec = categoriaSelec - 1;
            System.out.println("Productos de la categoría: " + categoria[categoriaSelec]);
            ArrayList<Producto> filtros = inventario.filtrarPorCategoria(categoria[categoriaSelec]);
            for (Producto p : filtros) {
                p.mostrarInfo();
            }
        }

        System.out.println("¿Quiere eliminar un producto? 1=si 0=no");
        int preEli = scanner.nextInt();

        if (preEli == 1) {
            System.out.println("Elija el producto que desea eliminar introduciendo su id:");
            System.out.println("Lista de productos:");
            inventario.listarProductos();
            int eli = scanner.nextInt();
            inventario.eliminarProducto(eli);
            System.out.println("Productos restantes:");
            inventario.listarProductos();
        }

        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());

        System.out.println("Producto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        System.out.println("Filtrar productos con precios entre $100 y $3000:");
        ArrayList<Producto> filtradosPorPrecio = inventario.filtrarProductosPorPrecio(100, 3000);
        for (Producto p : filtradosPorPrecio) {
            p.mostrarInfo();
        }

        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}
