/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Marca;
import dominio.Producto;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class Fachada implements IFachada {

    private final ProductoDAO productoDao = new ProductoDAO();
    private final MarcaDAO marcaDao = new MarcaDAO();
    
    public Fachada() {
        this.llenadoPrevioProducto();
    }

    @Override
    public boolean guardarMarca(Marca entidad) {
        return this.marcaDao.guardar(entidad);
    }

    @Override
    public Marca buscarNombreMarca(String busqueda) {
        return this.marcaDao.buscarNombre(busqueda);
    }

    @Override
    public List<Marca> buscarTodasMarca() {
        return this.marcaDao.buscarTodas();
    }

    @Override
    public void llenadoPrevioMarca() {
        this.marcaDao.llenadoPrevio();
    }

    @Override
    public boolean guardarProducto(Producto entidad) {
        return this.productoDao.guardar(entidad);
    }

    @Override
    public Producto buscarNombreProducto(String busqueda) {
        return this.productoDao.buscarNombre(busqueda);
    }

    @Override
    public List<Producto> buscarTodasProducto() {
        return this.productoDao.buscarTodas();
    }

    @Override
    public void llenadoPrevioProducto() {
        this.productoDao.guardar(new Producto("QA1", "Pilas", "pilas triple a", 21, this.marcaDao.buscarNombre("Panasonic")));
        this.productoDao.guardar(new Producto("QA2", "Refrigerador", "refrigerador inteligente", 76.5, this.marcaDao.buscarNombre("Sony")));
        this.productoDao.guardar(new Producto("QA3", "Estufa", "estufa de gas", 56.3, this.marcaDao.buscarNombre("Microsoft")));
        this.productoDao.guardar(new Producto("QA4", "Celular", "celular con pantalla tactil", 42.1, this.marcaDao.buscarNombre("Sony")));
        this.productoDao.guardar(new Producto("QA5", "Computadora", "computadora de ultima generacion", 50, this.marcaDao.buscarNombre("Steren")));
        this.productoDao.guardar(new Producto("QA6", "Bocinas", "bocinas con audio 3.1", 22.2, this.marcaDao.buscarNombre("Samsung")));
        this.productoDao.guardar(new Producto("QA7", "Taladro", "taladro de uso cotidiano", 31, this.marcaDao.buscarNombre("Microsoft")));
        this.productoDao.guardar(new Producto("QA8", "Bateria", "bateria de automovil", 51.1, this.marcaDao.buscarNombre("Great Value")));
        this.productoDao.guardar(new Producto("QA9", "Soldadora", "soldadora version 2.0", 76, this.marcaDao.buscarNombre("Great Value")));
        this.productoDao.guardar(new Producto("QA10", "Martillo", "martillo de uso cotidiano", 20, this.marcaDao.buscarNombre("Philips")));
        this.productoDao.guardar(new Producto("QA11", "Extensiones", "extensiones de 20m", 11, this.marcaDao.buscarNombre("Panasonic")));
        this.productoDao.guardar(new Producto("QA12", "Lampara", "lampara led", 31.5, this.marcaDao.buscarNombre("Steren")));
        this.productoDao.guardar(new Producto("QA13", "Multimetro", "multimetro sony", 63, this.marcaDao.buscarNombre("Microsoft")));
        this.productoDao.guardar(new Producto("QA14", "Radio", "radio de alto alcance", 42, this.marcaDao.buscarNombre("Samsung")));
        this.productoDao.guardar(new Producto("QA15", "Gabinete", "gabinete de gran tamaño", 74, this.marcaDao.buscarNombre("Microsoft")));
    }

}
