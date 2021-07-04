package datos;

import dominio.Marca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class MarcaDAO extends BaseDAO<Marca> {

    private final MarcaDataUtil listaMarcas;

    public MarcaDAO() {
        this.listaMarcas = new MarcaDataUtil();
        this.llenadoPrevio();
    }

    @Override
    public boolean guardar(Marca entidad) {
        if (entidad != null) {
            this.listaMarcas.getListaMarcas().add(entidad);
            return true;
        }
        return false;
    }

    @Override
    public Marca buscarNombre(String busqueda) {
        for (int i = 0; i < this.listaMarcas.getListaMarcas().size(); i++) {
            if (this.listaMarcas.getListaMarcas().get(i).getNombre().equalsIgnoreCase(busqueda)) {
                return this.listaMarcas.getListaMarcas().get(i);
            }
        }
        return null;
    }

    @Override
    public List<Marca> buscarTodas() {
        return this.listaMarcas.getListaMarcas();
    }

    @Override
    public void llenadoPrevio() {
        if (this.listaMarcas.getListaMarcas().isEmpty()) {
            this.guardar(new Marca(1, "Sony"));
            this.guardar(new Marca(2, "Panasonic"));
            this.guardar(new Marca(3, "Microsoft"));
            this.guardar(new Marca(4, "Steren"));
            this.guardar(new Marca(5, "Samsung"));
            this.guardar(new Marca(6, "Great Value"));
            this.guardar(new Marca(7, "Philips"));
        }
    }

}
