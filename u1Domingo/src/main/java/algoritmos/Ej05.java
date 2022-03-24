/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Añadimos Scanner
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        // Preguntamos kilometros recorridos
        System.out.println("Indique los kilometros recorridos:");
        double kmRecorridos = entrada.nextDouble();
        
        // Calculamos precio de kilometros
        final double KMTOTAL = kmRecorridos * 0.153;
        
        // Preguntamos sueldo
        System.out.println("Introduzca su sueldo:");
        double sueldo = entrada.nextDouble();
        
        // Introducimos el precio de kilometros
        System.out.println("Su sueldo es de: " + sueldo + "€");
        System.out.println("El plus por kilometro es: " + KMTOTAL + "€");
        // Realizamos la suma
        final double SUELDOTOTAL = sueldo + KMTOTAL;
        // Imprimimos resultado
        System.out.println("========================");
        System.out.println("Su sueldo total es: " + SUELDOTOTAL + "€");
    }
    
}
