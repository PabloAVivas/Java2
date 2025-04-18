package Segundo_Semestre.Colecciones.TiendaModificada;

public class Producto {
    private String id;
    private String nombre;
    private int cantidad;
    private double precio;
    private Categoria categoria;

    public Producto(String id, String nombre, int cantidad, double precio, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public double getPrecio() { return precio; }
    public Categoria getCategoria() { return categoria; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio + " | Cantidad: " + cantidad;
    }
}