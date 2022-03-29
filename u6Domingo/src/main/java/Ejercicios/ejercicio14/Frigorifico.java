/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio14;

/**
 *
 * @author domingo
 */
public class Frigorifico extends Electrodomestico implements Silencioso, Comparable<Frigorifico> {
    private double capacidad;

    public Frigorifico(double consumo, String modelo) {
        super(consumo, modelo);
    }

    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Frigorifico{" + "capacidad=" + capacidad + '}';
    }
    
    public void silencio(){
        System.out.println("El frigorifico emite 50dB");
    }

    @Override
    public int compareTo(Frigorifico o) {
        return 0;
    }
}
