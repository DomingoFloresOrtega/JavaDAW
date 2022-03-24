/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[10];
        boolean seguir;
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int aux = 0;
        
        for (int i=0; i < array.length; i++){
            do {
                seguir = true;
                // Comprobamos que se ha introducido correctamente
                try {
                    System.out.println("Introduzca el numero " + (i+1));
                    numero = teclado.nextInt();
                    array[i] = numero;
                    seguir = false;
                } catch (InputMismatchException ime){
                    System.out.println("Ha introducido un valor incorrecto");
                   
                    // Limpiar buffer
                    teclado.nextLine();
                }
            } while(seguir);
        }
        
        
        System.out.println("===== CALCULOS =====");
        
        // Contar positivos
        for (int i=0; i < array.length; i++){
            if (array[i] > 0){
                aux++;
            }
        }
        
        System.out.println("Hay " + aux + " numeros positivos");
        aux = 0;
        
        // Contar negativos
        for (int i=0; i < array.length; i++){
            if (array[i] < 0){
                aux++;
            }
        }
        
        System.out.println("Hay " + aux + " numeros negativos");
        aux = 0;
        
        // Contar ceros
        for (int i=0; i < array.length; i++){
            if (array[i] == 0){
                aux++;
            }
        }
        
        System.out.println("Hay " + aux + " numeros iguales a cero");
        aux = 0;
        
        // Mostrar array
        System.out.println("======= ARRAY =======");
        for (int i=0; i < array.length; i++){
            System.out.println("El valor en la posición " + i + " es: " + array[i]);
        }
        
        // Calcular media positiva
        int mediaPositivos = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] > 0){
                mediaPositivos += array[i];
                aux++;
            }
        }
        mediaPositivos = mediaPositivos / aux;
        System.out.println("Media de positivos: " + mediaPositivos);
        
        // Calcular media negativa
        int mediaNegativos = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] < 0){
                mediaNegativos += array[i];
                aux++;
            }
        }
        mediaNegativos = mediaNegativos / aux;
        System.out.println("Media de negativos: " + mediaNegativos);
    }
    
}
