/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        String fraseLower;
        
        System.out.println("Introduzca una frase:");
        frase = teclado.nextLine();
        char[] array = new char[frase.length()];
        
        fraseLower = frase.toLowerCase();
        
        for(int i=0; i < frase.length();i++){
            array[i] = fraseLower.charAt(i);
        }
        
        // Ordenar array
        
        for(int i=0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
