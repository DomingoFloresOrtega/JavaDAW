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
public class Ej09_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaArea;
        entradaArea = new Scanner(System.in);
        
        // Pedimos al usuario la diagonal 1
        System.out.println("Introduzca la medida de la diagonal 1:");
        double d1 = entradaArea.nextDouble();
        
        // Pedimos al usuario la diagonal 2
        System.out.println("Introduzca la medida de la diagonal 2:");
        double d2 = entradaArea.nextDouble();
        
        // Realizamos calculos
        double diagonalTotal = (d1 * d2) / 2;
        
        // Mostramos el resultado
        System.out.printf("El área de la cometa es %.3f cm al cuadrado ", diagonalTotal );
    }
    
}
