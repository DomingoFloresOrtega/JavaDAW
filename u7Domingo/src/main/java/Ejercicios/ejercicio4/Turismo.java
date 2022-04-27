/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio4;

/**
 *
 * @author domingo
 */
public class Turismo extends Vehiculo {

    private int puertas;
    private boolean marchaAutomatica;

    public Turismo() {
    }
    
    public Turismo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, int puertas, boolean marchaAutomatica) {

        super(bastidor, matricula, marca, modelo, color, tarifa);

        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public boolean getMarchaAutomatica() {
        return this.marchaAutomatica;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos() + " Puertas: " + this.puertas + " Marcha automática: " + this.marchaAutomatica;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + puertas + ";" + marchaAutomatica;
    }
}
