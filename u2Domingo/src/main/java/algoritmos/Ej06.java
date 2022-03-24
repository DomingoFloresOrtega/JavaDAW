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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaNumeros;
        entradaNumeros = new Scanner(System.in);
        
        // Pedimos al usuario el primer número
        System.out.println("Introduzca el primer número:");
        int a = entradaNumeros.nextInt();
        
        // Pedimos al usuario el segundo número
        System.out.println("Introduzca el segundo número:");
        int b = entradaNumeros.nextInt();
        
        // Realizamos operaciones e imprimimos
        int op1 = a / b;
        int op2 = a % b;
        
        System.out.println("El resultado de a/b es: " + op1);
        System.out.println("El resultado de a%b es: " + op2);
    }
    
}
