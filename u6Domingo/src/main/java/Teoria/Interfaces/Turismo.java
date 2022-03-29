/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.Interfaces;

/**
 *
 * @author domingo
 */
public class Turismo extends Vehiculo {
    
    private int puertas;

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString() + "Turismo{" + "puertas=" + puertas + '}';
    }

    @Override
    public void repostar(String tipoCombustible) {
        System.out.println("El turismo está repostando" + tipoCombustible);
    }
    
    
}
