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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        // Preguntamos al usuario el cateto 1
        System.out.println("Introduzca la medida del lado 1:");
        double x1 = entradaTeclado.nextDouble();
        
        System.out.println("Introduzca la medida del cateto 1:");
        double x2 = entradaTeclado.nextDouble();
        
        System.out.println("Introduzca la medida del cateto 1:");
        double y1 = entradaTeclado.nextDouble();
        
        // Preguntamos al usuario el cateto 2
        System.out.println("Introduzca la medida del cateto 2:");
        double y2 = entradaTeclado.nextDouble();
       
        // Math.abs() --> valor absoluto;
        // Math.pow() --> eleva un numero
        // Math.sqrt() --> raiz cuadrada de un numero
        
        // Realizamos calculos
        double resultadoy = Math.abs(y1 - y2);
        double resultadox = Math.abs(x1 - x2);
        
        double diag = Math.sqrt(resultadox + resultadoy);
        
        System.out.println("El resultado es: " + diag);
    }
    
}
