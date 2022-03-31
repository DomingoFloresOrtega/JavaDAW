/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio16;

import java.util.Random;

/**
 *
 * @author domingo
 */
public class Robot implements Comparable<Robot>{
    private int numSerie;
    private int vida;
    private Random aleatorio;

    public Robot() {
        aleatorio = new Random();
        this.numSerie = aleatorio.nextInt(10);
        this.vida = aleatorio.nextInt(100-1+1)-1;
    }

    public Robot(int numSerie, int vida) {
        this.numSerie = numSerie;
        this.vida = vida;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Robot{" + "numSerie=" + numSerie + ", vida=" + vida + '}';
    }

    @Override
    public int compareTo(Robot t) {
        return (int) (this.numSerie - t.getNumSerie());
    }
}
