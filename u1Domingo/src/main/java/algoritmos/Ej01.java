/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDinero;
        entradaDinero = new Scanner(System.in);
        
        // Preguntamos dinero para convertir
        System.out.println("Indique la cantidad a convertir | € --> rupias indias");
        double cantidad = entradaDinero.nextDouble();
        
        // Convertimos dinero
        double conversion = cantidad * 86.69;
        
        // Sacamos dinero convertido
        System.out.println("La conversión de " + cantidad + "€ es " + conversion + " rupias indias");
        
    }
    
}
