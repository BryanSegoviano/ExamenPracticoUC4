package datos;

import dominio.Marca;
import dominio.Producto;
import java.util.List;

/**
 *
 * @author Bryan
 */
public interface IFachada {
    
    //Marca
    public boolean guardarMarca(Marca entidad);
    public Marca buscarNombreMarca(String busqueda);
    public List<Marca> buscarTodasMarca();
    public void llenadoPrevioMarca();
    //Producto
    public boolean guardarProducto(Producto entidad);
    public Producto buscarNombreProducto(String busqueda);
    public List<Producto> buscarTodasProducto();
    public void llenadoPrevioProducto();
    
}
