/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospropuestos;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Productos {
    private String numSerie;
    private String producto;
    private String descripcion;
    private double precio;

    public Productos() {
    }

    public Productos(String numSerie, String producto, String descripcion, double precio) {
        this.numSerie = numSerie;
        this.producto = producto;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
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

    @Override
    public String toString() {
        return "Productos{" + "numSerie=" + numSerie + ", producto=" + producto + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.numSerie);
        hash = 19 * hash + Objects.hashCode(this.producto);
        hash = 19 * hash + Objects.hashCode(this.descripcion);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Productos other = (Productos) obj;
        return Objects.equals(this.numSerie, other.numSerie);
    }
    
    
}
