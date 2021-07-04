package datos;

import dominio.Producto;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class ProductoDAO extends BaseDAO<Producto> {

    private final ProductoDataUtil listaProductos;

    public ProductoDAO() {
       this.listaProductos = new ProductoDataUtil();
    }

    @Override
    public boolean guardar(Producto entidad) {
        if (entidad != null) {
            this.listaProductos.getListaProductos().add(entidad);
            return true;
        }
        return false;
    }

    @Override
    public Producto buscarNombre(String busqueda) {
        for (int i = 0; i < this.listaProductos.getListaProductos().size(); i++) {
            if (this.listaProductos.getListaProductos().get(i).getNombre().equalsIgnoreCase(busqueda)) {
                return this.listaProductos.getListaProductos().get(i);
            }
        }
        return null;
    }

    @Override
    public List<Producto> buscarTodas() {
        return this.listaProductos.getListaProductos();
    }

    @Override
    public void llenadoPrevio() {
        
    }

}
