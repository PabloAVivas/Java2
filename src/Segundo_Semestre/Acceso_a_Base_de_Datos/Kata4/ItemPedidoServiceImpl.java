package Segundo_Semestre.Acceso_a_Base_de_Datos.Kata4;

import java.sql.SQLException;
import java.util.List;

public class ItemPedidoServiceImpl {
    private ItemPedidoDAOImpl itemPedidoDao;

    public ItemPedidoServiceImpl(ItemPedidoDAOImpl itemPedidoDao) {
        this.itemPedidoDao = itemPedidoDao;
    }

    public void crear(ItemPedido item) throws SQLException {
        itemPedidoDao.crear(item);
    }


}
