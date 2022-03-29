/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio13;

/**
 *
 * @author domingo
 */
public class Estudiante extends Persona {
    
    private String id;

    public Estudiante() {
    }

    public Estudiante(String id, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "id=" + id + '}';
    }
    
    public void identificate(){
        System.out.println("Es estudiante");
    }
}
