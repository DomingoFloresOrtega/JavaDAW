/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio4;

/**
 *
 * @author domingo
 */
public class Deportivo extends Vehiculo {
    private int cilindrada;

    public Deportivo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, int cilindrada) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos() + " Cilindrada (cm3): " + this.cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "Deportivo{" + "cilindrada=" + cilindrada + '}';
    }
}
