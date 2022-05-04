/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.tarea7b;

import java.util.Objects;
import java.util.stream.DoubleStream;

/**
 *
 * @author domingo
 */
public class App {
    private int codigoUnico;
    private String nombre;
    private String descripcion;
    private double kB;
    private int numDescargas;

    public App() {
        int contador = 0;
        
        this.codigoUnico = contador++;
        this.nombre = "app" + this.codigoUnico + "";
        this.descripcion = descripcion;
        this.kB = kB;
        this.numDescargas = numDescargas;
    }

    public App(int codigoUnico, String nombre, String descripcion, double kB, int numDescargas) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.kB = kB;
        this.numDescargas = numDescargas;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
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

    public double getkB() {
        return kB;
    }

    public void setkB(double kB) {
        this.kB = kB;
    }

    public int getNumDescargas() {
        return numDescargas;
    }

    public void setNumDescargas(int numDescargas) {
        this.numDescargas = numDescargas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.codigoUnico;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.descripcion);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.kB) ^ (Double.doubleToLongBits(this.kB) >>> 32));
        hash = 13 * hash + this.numDescargas;
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
        final App other = (App) obj;
        if (this.codigoUnico != other.codigoUnico) {
            return false;
        }
        if (Double.doubleToLongBits(this.kB) != Double.doubleToLongBits(other.kB)) {
            return false;
        }
        if (this.numDescargas != other.numDescargas) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

    @Override
    public String toString() {
        return codigoUnico + ";" + nombre + ";" + descripcion + ";" + kB + ";" + numDescargas + ';';
    }
}
