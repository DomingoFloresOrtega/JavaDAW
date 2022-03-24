/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coche;

/**
 *
 * @author domingo
 */
public class MisVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo miCacharro = new Vehiculo("4987 FDJ", "Opel", "Corsa", "Rojo", 200.0);
        
        System.out.print("Datos del vehículo: " + miCacharro.getMatricula() + " , " 
                + miCacharro.getMarca() + " , " + miCacharro.getModelo() 
                        + " , " + miCacharro.getColor() + " , " 
                + miCacharro.getTarifa());
        
        miCacharro.generarCoche();
    }
}
