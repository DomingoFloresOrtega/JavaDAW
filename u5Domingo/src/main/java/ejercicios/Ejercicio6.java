/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Arrays;

/**
 *
 * @author domingo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // Comparo arrays
        System.out.println("---- MODO AUTOMATICO ----");
        // Metodo arrays
        if (Arrays.equals(array, array2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son distintos");
        }
        
        System.out.println("---- MODO MANUAL ----");
        // Metodo manual
        if (compararManual(array, array2) == true){
            System.out.println("Los arrays son iguales");
        } else{
            System.out.println("Los arrays son distintos");
        }

    }

    public static boolean comparar(int[] array1, int[] array2) {
        boolean aux = false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                aux = true;
            } else {
                aux = false;
            }
        }

        return aux;
    }

    public static boolean compararManual(int[] array1, int[] array2) {
        boolean aux = false;

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
