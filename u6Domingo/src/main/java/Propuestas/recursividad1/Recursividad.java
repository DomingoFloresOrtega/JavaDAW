/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Propuestas.recursividad1;

/**
 *
 * @author domingo
 */
public class Recursividad {
    public static void main(String[] args) {
        int [] numeros = {7,1,2,3,4};
        System.out.println(buscarNumero(numeros,numeros.length, 3));
    }
    
    public static int buscarNumero(int[] array, int tamanio, int numero){
        if (tamanio == 1){
            return array[0]; // Inicia el ciclo pasivo
        } else {
            return array[tamanio-1] + buscarNumero(array, tamanio-1, 3); // Ciclo activo
        }
    }
}
