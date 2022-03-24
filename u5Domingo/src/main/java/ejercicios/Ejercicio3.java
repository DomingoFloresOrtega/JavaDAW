/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author domingo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo array con 20 posiciones
        double[] array = new double[20];
        
        // Relleno array con Arrays.fill
        Arrays.fill(array, 7.5);
        
        // Copia array en array2
        double[] array2 = new double[array.length];
        array2 = Arrays.copyOf(array, array.length);
        
        // Imprimo arrays con Arrays.toString
        System.out.println("El array 1 contiene");
        System.out.println(Arrays.toString(array));
        
        System.out.println("El array 2 contiene");
        System.out.println(Arrays.toString(array2));
        
        // Comparar arrays con Arrays.equals
        if (Arrays.equals(array, array2)){
            System.out.println("Los arrays son iguales");
        } else{
            System.out.println("Los arrays son distintos");
        }
        
        // Comparar arrays con operadores ternarios
        System.out.println(Arrays.equals(array, array2)? "Los arrays son iguales" : "Los arrays son distintos");
        
        // Insertar numero en posicion aleatoria
        
        int max = 6;
        int min = 0;
        Random numRandom = new Random();
    }
    
}
