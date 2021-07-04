package datos;

import dominio.Marca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class MarcaDataUtil {

    //colección de entidades simulada
    private final List<Marca> listaMarcas = new ArrayList<>();

    public List<Marca> getListaMarcas() {
        return this.listaMarcas;
    }

}
