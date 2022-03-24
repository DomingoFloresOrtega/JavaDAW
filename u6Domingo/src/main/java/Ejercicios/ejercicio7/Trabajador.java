/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio7;

/**
 *
 * @author domingo
 */
public abstract class Trabajador {
    private String nombre;
    private String apellido;
    protected String nif;

    public Trabajador(String nombre, String apellido, String nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }
    
    public Trabajador(){
        // Los inicializa todos a null
    }

    @Override // Sobreescribe el metodo de la clase Object
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + '}';
    }
    
    public void cotizar(){
        System.out.println("Cotizando como un trabajador");
    }
}
