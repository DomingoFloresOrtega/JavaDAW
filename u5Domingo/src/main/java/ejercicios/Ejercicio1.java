/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author domingo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6}; // Podria ponerse sin new int
        int suma = 0;
        
        
        for (int i=0; i < num.length; i++){ // ¡Cuidado! No poner <=
            System.out.println("Array Nº" + i + ":" + num[i]); 
            suma += num[i];
        };
        
        System.out.println("=======================");
        System.out.println("La suma de los números es " + suma);
    }
    
}
