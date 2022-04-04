/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.vuelos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Vuelo {
    private int codigoVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double duracion;
    private ArrayList<Persona> pasajeros;

    public Vuelo() {
    }

    public Vuelo(int codigoVuelo, String ciudadOrigen, String ciudadDestino, double duracion, ArrayList<Persona> pasajeros) {
        this.codigoVuelo = codigoVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracion = duracion;
        this.pasajeros = pasajeros;
    }

    public int getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(int codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Persona> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codigoVuelo=" + codigoVuelo + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", duracion=" + duracion + ", pasajeros=" + pasajeros + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigoVuelo;
        hash = 83 * hash + Objects.hashCode(this.ciudadOrigen);
        hash = 83 * hash + Objects.hashCode(this.ciudadDestino);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.duracion) ^ (Double.doubleToLongBits(this.duracion) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.pasajeros);
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
        final Vuelo other = (Vuelo) obj;
        if (this.codigoVuelo != other.codigoVuelo) {
            return false;
        }
        if (Double.doubleToLongBits(this.duracion) != Double.doubleToLongBits(other.duracion)) {
            return false;
        }
        if (!Objects.equals(this.ciudadOrigen, other.ciudadOrigen)) {
            return false;
        }
        if (!Objects.equals(this.ciudadDestino, other.ciudadDestino)) {
            return false;
        }
        return Objects.equals(this.pasajeros, other.pasajeros);
    }
    
    
}
