package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata3;

import java.sql.SQLException;
import java.util.List;

public class ProductoServiceImpl implements GenericService<Producto> {
    private ProductoDAOImpl productoDao;

    public ProductoServiceImpl(ProductoDAOImpl productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    public void crear(Producto p) throws SQLException {
        if (p.getNombre() == null || p.getNombre().isEmpty()) {
            throw new SQLException("El nombre no puede estar vacío.");
        }
        if (p.getPrecio() <= 0) {
            throw new SQLException("El precio debe ser mayor a cero.");
        }
        if (p.getCantidad() <= 0) {
            throw new SQLException("La cantidad debe ser mayor a cero.");
        }
        // Verificar que la categoría existe
        if (!productoDao.existeCategoria(p.getCategoria().getId())) {
            throw new SQLException("La categoría no existe.");
        }
        productoDao.crear(p);
    }

    @Override
    public Producto leer(int id) throws SQLException {
        return productoDao.leer(id);
    }

    @Override
    public void actualizar(Producto p) throws SQLException {
        productoDao.actualizar(p);
    }

    @Override
    public void eliminar(int id) throws SQLException {
        productoDao.eliminar(id);
    }

    @Override
    public List<Producto> listar() throws SQLException {
        return productoDao.listar();
    }
}


