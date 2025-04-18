package Segundo_Semestre.Colecciones.Tienda;

public class Producto {
    private int id;
    private static int idCon;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        idCon++;
        this.id = idCon;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id +
                ", Nombre: " + nombre +
                ", Precio: " + precio +
                ", Cantidad: " + cantidad +
                ", Categoría: " + categoria +
                " (" + categoria.getDescripcion() + ")");
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
