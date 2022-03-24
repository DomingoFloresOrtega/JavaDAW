/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.recursividad;

/**
 *
 * @author domingo
 */
public class SumaElementosArray {
    
    public static void main(String[] args) {
        int [] numeros = {7,1,2,3,4};
        System.out.println(sumar(numeros,numeros.length));
    }
    
    public static int sumar(int[] array, int tamanio){
        if (tamanio == 1){
            return array[0]; // Inicia el ciclo pasivo
        } else {
            return array[tamanio-1] + sumar(array, tamanio-1); // Ciclo activo
        }
    }
}
