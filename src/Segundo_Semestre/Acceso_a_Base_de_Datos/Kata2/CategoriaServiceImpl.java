package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata2;

import java.sql.SQLException;
import java.util.List;

public class CategoriaServiceImpl implements GenericService<Categoria> {
    private CategoriaDAOImpl categoriaDao;

    public CategoriaServiceImpl(CategoriaDAOImpl categoriaDao) {
        this.categoriaDao = categoriaDao;
    }

    @Override
    public void crear(Categoria c) throws SQLException {
        if (c.getNombre() == null || c.getNombre().isEmpty()) {
            throw new SQLException("El nombre no puede estar vacío.");
        }
        categoriaDao.crear(c);
    }

    @Override
    public Categoria leer(int id) throws SQLException {
        return categoriaDao.leer(id);
    }

    @Override
    public void actualizar(Categoria c) throws SQLException {
        categoriaDao.actualizar(c);
    }

    @Override
    public void eliminar(int id) throws SQLException {
        categoriaDao.eliminar(id);
    }

    @Override
    public List<Categoria> listar() throws SQLException {
        return categoriaDao.listar();
    }
}

