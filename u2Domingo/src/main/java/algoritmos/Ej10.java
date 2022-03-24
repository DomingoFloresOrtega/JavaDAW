/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        final int PASOKILOMETROS = 1000;
        
        // Solicitamos al usuario los kilometros
        System.out.println("Introduzca los kilometros: ");
        double kilometros = entradaTeclado.nextDouble();
        
        // Solicitamos al usuario el tiempo
        System.out.println("Introduzca el tiempo (en horas): ");
        double tiempoMinutos = entradaTeclado.nextInt();
        
        // Realizamos calculos
        double conversionHoras = tiempoMinutos / 60;
        double distanciaRecorrida = kilometros * conversionHoras;
        double distanciaRecorridaMetros = distanciaRecorrida * PASOKILOMETROS;
        
        // Mostramos resultado
        System.out.println("La distancia recorrida es de " + distanciaRecorrida + " kilometros");
        
        // Mostramos resultado en metros
        System.out.printf("La distancia recorrida es de %.0f metros", distanciaRecorridaMetros);
    }
    
}
