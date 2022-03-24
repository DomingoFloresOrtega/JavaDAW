/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
 * URL para acceder a repositorio (https://github.com/DomingoFloresOrtega/Pares-Nones.git)
 */
package paresnones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class ParesNones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        
        // Creamos Scanner y declaramos variables
        Scanner teclado = new Scanner(System.in);
        String opcion;
        // Creamos variables para selección de rol
        String optJ1;
        String optJ2;
        // Creamos variables para selección de números
        int numJ1 = 0;
        int numJ2 = 0;
        // Creamos variable para guardar el resultado de operación
        int sumaNumeros;
        // Creamos random
        Random numeroRan = new Random();
        // Creamos variables de control
        boolean controlJ1 = true;
        boolean controlJ2 = true;
        
        
        // Inicio del menu
        do{
            System.out.println("=======================");
            System.out.println("==== Pares & Nones ====");
            System.out.println("=======================");
            System.out.println("1. Juego amistoso");
            System.out.println("2. Juego contra maquina");
            System.out.println("0. Salir");
            
            System.out.println("Introduzca una opción:");
            opcion = teclado.nextLine();
            
            // Creamos switch
            switch (opcion){
                case "1":
                    
                    // Creamos bucle para comprobar elección del jugador 1
                    do{
                        // Solicitamos elección
                        System.out.println("Jugador 1, elija pares (p) o nones (n)");
                        optJ1 = teclado.nextLine();
                      // Comprobamos que el texto introducida sea correcto
                    } while(!optJ1.equals("p") && !optJ1.equals("P") && !optJ1.equals("N") && !optJ1.equals("n"));
                    
                    // Indicamos al jugador 2 el rol contrario
                    if (optJ1.equals("p") || optJ1.equals("P")){
                        System.out.println("Jugador 2, juega con nones");
                    } else{
                        System.out.println("Jugador 2, juega con pares");
                    }
                    
                    // Pedimos número al jugador 1 y comprobamos la elección
                    do {
                        do {
                            // Creamos sistema de excepciones
                            try {

                                System.out.println("Empieza Jugador 1.");
                                System.out.println("Jugador 1, escoja un número del 1 al 10:");
                                numJ1 = teclado.nextInt();

                                // Cambiamos valor de la variable de control
                                controlJ1 = false;

                                // Mostramos mensaje de error
                            } catch (InputMismatchException ime) {
                                System.out.println("===================================");
                                System.out.println("===== Introduzca solo números =====");
                                System.out.println("===================================");
                                teclado.nextLine();
                            }
                        } while (numJ1 < 0 || numJ1 > 10);
                    } while (controlJ1);
                    
                    // Pedimos número al jugador 2 y comprobamos la elección
                    do {
                        do {
                            // Creamos sistema de excepciones
                            try {
                                System.out.println("Continua Jugador 2.");
                                System.out.println("Jugador 2, escoja un número del 1 al 10:");
                                numJ2 = teclado.nextInt();
                                
                                // Cambiamos valor de la variable de control
                                controlJ2 = false;
                                
                                // Mostramos mensaje de error
                            } catch (InputMismatchException ime) {
                                System.out.println("===================================");
                                System.out.println("===== Introduzca solo números =====");
                                System.out.println("===================================");
                                teclado.nextLine();
                            }
                        } while (numJ2 < 0 || numJ2 > 10);
                    } while (controlJ2);
                    
                    // Realizamos calculos y almacenamos resultado
                    sumaNumeros = numJ1 + numJ2;              
                    
                    // Si opcion escogida es pares, comprobamos e imprimimos resultados
                    if (optJ1.equals("p") || optJ1.equals("P")) {
                        if (sumaNumeros % 2 == 0) {
                            System.out.println("Gana el Jugador 1");
                        } else {
                        System.out.println("Gana el Jugador 2");
                        }
                    } 
                    
                    // Si opcion escogida es nones, comprobamos e imprimimos resultados
                    if (optJ1.equals("n") || optJ1.equals("N")) {
                        if (sumaNumeros % 2 != 0) {
                            System.out.println("Gana el Jugador 1");
                        } else {
                        System.out.println("Gana el Jugador 2");
                        }
                    } 
                    
                    // Limpiamos el buffer
                    teclado.nextLine();
                    break;
                case "2":
                    
                    // Creamos bucle para comprobar elección del jugador 1
                    do{
                        // Solicitamos elección
                        System.out.println("Jugador, elija pares (p) o nones (n)");
                        optJ1 = teclado.nextLine();
                     // Comprobamos que el texto introducida sea correcto
                    } while(!optJ1.equals("p") && !optJ1.equals("P") && !optJ1.equals("N") && !optJ1.equals("n"));
                    
                    // Indicamos al jugador 2 el rol contrario
                    if (optJ1.equals("p") || optJ1.equals("P")){
                        System.out.println("Máquina, juega con nones");
                    } else{
                        System.out.println("Máquina, juega con pares");
                    }
                    
                    // Pedimos número al jugador 1 y comprobamos la elección
                    do {
                        do {
                            // Creamos sistema de excepciones
                            try {
                                System.out.println("Empieza Jugador.");
                                System.out.println("Jugador, escoja un número del 1 al 10:");
                                numJ1 = teclado.nextInt();
                                
                                // Cambiamos valor de la variable de control
                                controlJ1 = false;
                                
                                // Mostramos mensaje de error
                            } catch (InputMismatchException ime) {
                                System.out.println("===================================");
                                System.out.println("===== Introduzca solo números =====");
                                System.out.println("===================================");
                                teclado.nextLine();
                            }
                        } while (numJ1 < 0 || numJ1 > 10);
                    } while (controlJ1);
                    
                    // Pedimos número al jugador 2 y comprobamos la elección
                    do{
                        System.out.println("Continua máquina.");
                        numJ2 = numeroRan.nextInt(10 - 0 + 1) + 0;
                    } while (numJ2 < 0 || numJ2 > 10);
                    
                    // Realizamos calculos y almacenamos resultado
                    sumaNumeros = numJ1 + numJ2;              
                    
                    // Si opcion escogida es pares, comprobamos e imprimimos resultados
                    if (optJ1.equals("p") || optJ1.equals("P")) {
                        if (sumaNumeros % 2 == 0) {
                            System.out.println("Gana Jugador");
                        } else {
                        System.out.println("Gana máquina");
                        }
                    }
                    
                    // Si opcion escogida es nones, comprobamos e imprimimos resultados
                    if (optJ1.equals("n") || optJ1.equals("N")) {
                        if (sumaNumeros % 2 != 0) {
                            System.out.println("Gana Jugador");
                        } else {
                        System.out.println("Gana máquina");
                    }
                    }
                    
                    // Limpiamos el buffer
                    teclado.nextLine();
                    break;
                    
                case "0":
                    // Indicamos al usuario que ha seleccionado salir del programa
                    System.out.println("Ha seleccionado salir");
                    break;
                default:
                    // Indicamos que la opción introducida no es valida
                    System.out.println("Opción no valida");
                    break;
                }
        // Si seleccionamos 0 nos sacará del programa
        } while(!opcion.equals("0"));  
    }  
}

