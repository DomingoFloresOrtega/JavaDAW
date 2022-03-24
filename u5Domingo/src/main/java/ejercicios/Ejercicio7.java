/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarArray();
    }

    public static void rellenarArray() {
        // Leemos por teclado
        Scanner teclado = new Scanner(System.in);
        int tamanio = 0;
        boolean seguir;

        // Bucle para revisar que se insertan solo numeros
        do {
            seguir = true;
            try {
                System.out.println("Introduzca el tamaño de los array:");
                tamanio = teclado.nextInt();
                seguir = false;
                
                // En caso de introducir un negativo, paso a positivo
                if (tamanio < 0){
                    tamanio = -(tamanio);
                }
                
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor erroneo");
                teclado.nextLine();
            }
        } while (seguir);

        // Creo arrays
        int array[] = new int[tamanio];
        int array2[] = new int[tamanio];

        // Creo números aleatorios
        for (int i = 0; i < array.length; i++) {
            Random numaleatorio = new Random();
            array[i] = numaleatorio.nextInt(100 - 1 + 1) + 1;
            array2[i] = numaleatorio.nextInt(100 - 1 + 1) + 1;
        }

        // Envio arrays a multiplicar()
        multiplicar(array, array2);

        // Recojo array nuevo y lo mando a imprimir()
        int[] arrayFinal2 = multiplicar(array, array2);
        imprimir(arrayFinal2);
    }

    public static int[] multiplicar(int[] array1, int[] array2) {
        int[] arrayA = array1;
        int[] arrayB = array2;
        int[] arrayFinal = new int[arrayA.length];

        // Calculo los arrays
        for (int i = 0; i < arrayA.length; i++) {
            arrayFinal[i] = arrayA[i] * arrayB[i];
        }

        // Devuelvo resultado
        return arrayFinal;
    }

    public static void imprimir(int[] array) {
        int[] arrayFinal = array;

        // Imprimo valores
        System.out.println("===============================");
        System.out.println("Los valores de los arrays son:");
        System.out.println("===============================");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor en posición " + i + ": " + arrayFinal[i]);
        }
    }
}
