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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,5,3,7,2,8,9};
        boolean[] array2 = new boolean[array.length];
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean valor;
        
        System.out.println("Introduzca numero a buscar:");
        numero = teclado.nextInt();
            
        for (int i=0; i < array.length; i++){
            if (array[i] == numero){
                valor = true;
                array2[i] = valor;
            } else{
                valor = false;
                array2[i] = valor;
            }
        } 
    }
}
