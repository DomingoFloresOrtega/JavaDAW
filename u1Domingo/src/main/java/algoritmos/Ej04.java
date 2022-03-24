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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entradaGramos;
        entradaGramos = new Scanner(System.in);
        
        // Leemos el valor de los gramos
        System.out.println("Introduzca el valor de los gramos:");
        double gramos = entradaGramos.nextDouble();
        
        // Calculamos libras
        double libras = gramos * 0.00220462;
        
        // Mostramos resultado
        System.out.println("===============================================");
        System.out.println("La cantidad de gramos equivale a " + libras + " libras");
        System.out.println("===============================================");

    }
    
}
