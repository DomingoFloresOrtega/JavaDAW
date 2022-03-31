/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.vuelos;

/**
 *
 * @author domingo
 */
public class Pasajero extends Persona{
    private int codigoPasajero;

    public Pasajero() {
    }

    public Pasajero(int codigoPasajero, String nombre, String apellidos, String nif) {
        super(nombre, apellidos, nif);
        this.codigoPasajero = codigoPasajero;
    }

    public int getCodigoPasajero() {
        return codigoPasajero;
    }

    public void setCodigoPasajero(int codigoPasajero) {
        this.codigoPasajero = codigoPasajero;
    }

    @Override
    public String toString() {
        return super.toString() + "Pasajero{" + "codigoPasajero=" + codigoPasajero + '}';
    }
}
