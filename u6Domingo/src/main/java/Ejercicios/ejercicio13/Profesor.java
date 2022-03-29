/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio13;

/**
 *
 * @author domingo
 */
public class Profesor extends Persona{
    
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String especialidad, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    public void identificate(){
        System.out.println("Es profesor");
    }
}
