/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author DELL
 */
public class Producto {
    private String numSerie;
    private String nombre;
    private String descripcion;
    private double precio;
    private Marca marca;

    public Producto(String numSerie, String nombre, String descripcion, double precio, Marca marca) {
        this.numSerie = numSerie;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.marca = marca;
    }
    
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" + "numSerie=" + numSerie + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", marca=" + marca + '}';
    }
    
}
