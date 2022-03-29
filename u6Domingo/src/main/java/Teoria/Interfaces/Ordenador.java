/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.Interfaces;

/**
 *
 * @author domingo
 */
public class Ordenador implements SeArranca, SePara{
    
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + '}';
    }
    
    public boolean arrancar(){
        System.out.println("El ordenador ha arrancado...");
        return true;
    }
    
    public boolean parar(){
        System.out.println("El ordenador ha parado...");
        return false;
    }
}
