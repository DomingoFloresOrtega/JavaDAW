/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explicacionesclase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numeroRan = new Random();
        String opcion;
        long numeroSolRan;
        double cocienteNum;
 
        do {
            System.out.println("=====================");
            System.out.println("=== ¡Bienvenidos! ===");
            System.out.println("=====================");
            System.out.println("1. Introducir numero propio");
            System.out.println("2. Generar numero aleatorio");
            System.out.println("0. Salir");

            System.out.println("Introduzca una opcion");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Introduzca el número:");
                    numeroSolRan = teclado.nextInt();
                    
                    if (numeroSolRan % 2 == 0) {
                            System.out.println("No es primo");
                    } else{
                        System.out.println("Es primo");
                    }
                    
                    teclado.nextLine();
                    break;

                case "2":
                    numeroSolRan = numeroRan.nextInt(600000000 - 2 + 1) + 2;
                    System.out.println("El numero generado es:" + numeroSolRan);
                    System.out.println("==============================");

                    if (numeroSolRan % 2 != 0) {
                        System.out.println("Es primo");
                    } else {
                        System.out.println("No es primo");
                    }
                    
                    break;
                    
                case "0":
                    System.out.println("¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            
        } while (!opcion.equals("0"));
    }
}
