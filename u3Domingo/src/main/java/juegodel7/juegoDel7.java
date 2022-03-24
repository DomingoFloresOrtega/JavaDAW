/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegodel7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class juegoDel7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos random
        Random numRandom = new Random();
        // Creamos Scanner
        Scanner teclado = new Scanner(System.in);
        // Creamos variables para rondas
        int numeroRonda = 1;
        // Creamos variables de numeros
        int numRandom1, numRandom2;
        // Creamos variables de almacen de resultados
        int numRandomCalculo;
        // Creamos variables para puntuaciones
        int puntuacionJ1 = 0, puntuacionJ2 = 0;
        
            do {
            // Generamos números aleatorios
            numRandom1 = numRandom.nextInt(5) + 1;
            numRandom2 = numRandom.nextInt(5) + 1;

            // Indicamos número de ronda
                System.out.println("=================");
                System.out.println("=== RONDA Nº" + numeroRonda + " ===");
                System.out.println("=================");
                
            // Mostramos resultados de números
            System.out.println("El jugador 1 ha elegido el número: " + numRandom1);
            System.out.println("El jugador 2 ha elegido el número: " + numRandom2);

            // Realizamos calculos
            numRandomCalculo = numRandom1 + numRandom2;

            // Comprobamos resultado
            if (numRandomCalculo < 7) {
                // Sumamos un punto al contador de puntuación
                puntuacionJ1++;
                // Indicamos si es el ganador
            System.out.println("=============================");
            System.out.println("El jugador ganador es: Jugador 1");
            System.out.println("=============================");
            numeroRonda++;
            } else if (numRandomCalculo > 7) {
                // Sumamos un punto al contador de puntuación
                puntuacionJ2++;
                // Indicamos si es el ganador
            System.out.println("=============================");
            System.out.println("El jugador ganador es: Jugador 2");
            System.out.println("=============================");
            numeroRonda++;
            } else {
                System.out.println("=============================");
                System.out.println("Ronda anulada. Se repite");
                System.out.println("=============================");
            }
        } while (numeroRonda != 6);
        
        // Indicamos el jugador con más puntuación
        if (puntuacionJ1 > puntuacionJ2){
            System.out.println("El jugador con más puntuación es el número 1, el cual acumula " + puntuacionJ1 + " puntos");
        } else{
            System.out.println("El jugador con más puntuación es el número 2, el cual acumula " + puntuacionJ2 + " puntos");
        }
    }
    
}
