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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int numero = 1;
        int contador = 0;
        
        // Bucle
        do{
            // Pido numeros
            System.out.println("Introduce un numero en la posición " + contador + ":");
            numero = teclado.nextInt();
            
            // Inserto valores
            array[contador] = numero;
            
            if (contador != 19){
                contador++;
            } else{
                break;
            }
        } while(numero != 0);  
        
        
    }  
}
