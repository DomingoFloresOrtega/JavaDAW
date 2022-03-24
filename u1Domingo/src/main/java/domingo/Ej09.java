/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo;

/**
 *
 * @author domingo
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro e inicializo variables int
        int a = 10;
        int b = 20;
        
        // Declaro variables booleanas
        boolean aMenorB;
        boolean aMayorB;
        boolean aIgualB;
        boolean aDistintoB;
        
        // Inicializamos claves booleanas
        aMenorB = a<b;
        aMayorB = a>b;
        aIgualB = a==b;
        aDistintoB = a!=b;
        
        // Mostramos resultados
        System.out.println("El resultado de la variable 1 es: " + aMenorB);
        System.out.println("El resultado de la variable 2 es: " + aMayorB);
        System.out.println("El resultado de la variable 3 es: " + aIgualB);
        System.out.println("El resultado de la variable 4 es: " + aDistintoB);
        
    }
    
}
