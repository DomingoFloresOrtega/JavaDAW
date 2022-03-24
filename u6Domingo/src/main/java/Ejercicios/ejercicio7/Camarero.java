/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio7;

/**
 *
 * @author domingo
 */
public class Camarero extends Trabajador {
    private String rango;

    public Camarero(String rango, String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
        this.rango = rango;
    }

    public Camarero() {
        super(); // Se puede poner o no
    }
    
    public Camarero(String rango){
        super();
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override // Sobreescribe el metodo de la clase Trabajador
    public String toString() {
        return super.toString() + "\n" + "Camarero{" + "rango=" + rango + '}';
    }
    
    @Override
    public void cotizar(){
        System.out.println("Cotizando como camarero");
    }
    
    public void servirMesa(String id){
        System.out.println("Camarero sirviendo la mesa " + id);
    }
}
