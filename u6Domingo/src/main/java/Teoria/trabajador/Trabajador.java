/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.trabajador;

/**
 *
 * @author domingo
 */
public class Trabajador {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override // Sobreescribe el metodo de la clase Object
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + '}';
    }
    
    public void cotizar(){
        System.out.println("Cotizando como un trabajador");
    }
}
