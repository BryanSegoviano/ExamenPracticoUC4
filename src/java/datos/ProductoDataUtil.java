package datos;

import dominio.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class ProductoDataUtil {

    //colección de entidades simulada
    private final List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> getListaProductos() {
        return this.listaProductos;
    }
}
