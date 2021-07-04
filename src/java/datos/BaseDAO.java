package datos;

import java.util.List;

/**
 *
 * @author Bryan
 * @param <T>
 */
abstract class BaseDAO<T> {

    public abstract boolean guardar(T entidad);
    public abstract T buscarNombre(String busqueda);
    public abstract List<T> buscarTodas();
    public abstract void llenadoPrevio();
    
}
