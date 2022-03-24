/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para calcular el area usaremos la formula A = π r²
        
        Scanner entradaRadio;
        entradaRadio = new Scanner(System.in);
        
        // Pedimos al usuario el radio y la almacenamos
        System.out.println("Introduzca el valor del radio:");
        double radio = entradaRadio.nextDouble(); // Constantes arriba ^
        
        // Calculamos el radio
        double radioTotal = radio * radio;
            // Realizarlo con Math
               // Math.pow(radio, 2);
        // Calculamos el area del cuadrado
        double areaTotal = Math.PI * radioTotal;
        
        // Indicamos resultado
        System.out.println("El area de su cuadrado es: " + areaTotal);
        
    }
    
}
