/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Cruceros {
    private String nombre;
    private ArrayList<> destinos;
    private double precio;
    private int numeroNoches;
    private String puertoSalida;
    private String buque;

    public Cruceros() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getDestinos() {
        return destinos;
    }

    public void setDestinos(String[] destinos) {
        this.destinos = destinos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public String getPuertoSalida() {
        return puertoSalida;
    }

    public void setPuertoSalida(String puertoSalida) {
        this.puertoSalida = puertoSalida;
    }

    public String getBuque() {
        return buque;
    }

    public void setBuque(String buque) {
        this.buque = buque;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Arrays.deepHashCode(this.destinos);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 59 * hash + this.numeroNoches;
        hash = 59 * hash + Objects.hashCode(this.puertoSalida);
        hash = 59 * hash + Objects.hashCode(this.buque);
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
        final Cruceros other = (Cruceros) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.numeroNoches != other.numeroNoches) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.puertoSalida, other.puertoSalida)) {
            return false;
        }
        if (!Objects.equals(this.buque, other.buque)) {
            return false;
        }
        if (!Arrays.deepEquals(this.destinos, other.destinos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cruceros{" + "nombre=" + nombre + ", destinos=" + Arrays.toString(getDestinos()) + ", precio=" + precio + ", numeroNoches=" + numeroNoches + ", puertoSalida=" + puertoSalida + ", buque=" + buque + '}';
    }
}
