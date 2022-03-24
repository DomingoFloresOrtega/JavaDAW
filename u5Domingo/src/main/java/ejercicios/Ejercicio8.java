/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        int numero;
        
        // Creo array
        int[] array = new int[opcion];
        
        // Inserto valores en array pedidos por teclado
        for (int i = 0; i < array.length; i++){
            System.out.println("Introduzca numero " + i + ":");
            numero = teclado.nextInt();
            array[i] = numero;
        }
        
        // Imprimo *
        for (int i = 0; i < array.length; i++){
            for (int j=0; j < array.length;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
