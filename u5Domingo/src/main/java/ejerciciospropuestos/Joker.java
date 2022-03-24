/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospropuestos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Joker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numRandom = new Random();
        int[] array = new int[7];
        int numero;
        
        
        // Ingreso los numeros aleatorios
        for (int i = 0; i < array.length; i++){
            array[i] = numRandom.nextInt(10);
        }
        
        // Compruebo
        comprobarJokerBueno(array);
    }
    
    public static void comprobarJokerBueno(int[] array){
        Scanner teclado = new Scanner(System.in);
        int[] arrayUser = new int[array.length];
        
        // Pido numeros
        for (int i=0; i < array.length; i++){
            System.out.println("Introduzca su número en posición " + (i+1) +":");
            int numero = teclado.nextInt();
            arrayUser[i] = numero;
        }
        
        // Compruebo array para Joker bueno
        if (Arrays.equals(array, arrayUser)){
            System.out.println("El boleto ha sido premiado");
        } else{
            comprobarJokerMalo(array, arrayUser);
        }
    }
    
    public static void comprobarJokerMalo(int[] array, int[] arrayUser){
        Arrays.sort(array);
        Arrays.sort(arrayUser);
        
        // Compruebo array para Joker malo
        if (Arrays.equals(array, arrayUser)){
            System.out.println("El boleto ha sido premiado en menor cantidad");
        } else{
            System.out.println("El boleto no ha sido premiado");
        }
    }
    
}
