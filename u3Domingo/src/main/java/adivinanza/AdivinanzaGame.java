/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanza;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class AdivinanzaGame {
    
    private static int GenerarNumeroAuto(){
        // Creamos random
        Random aleatorio = new Random();
        // Constantes rango
        final int NUM1 = 100;
        final int NUM2 = 2;
        
        // Creamos numero aleatorio segun los parametros seleccionados
        int numeroAleatorio = aleatorio.nextInt(NUM1-NUM2);
        
        // Devolvemos valor
        return numeroAleatorio;
        
    }
    
    private static int GenerarNumeroManu(int a, int b){
        // Creamos variables e inicializamos con valores asignados por el usuario
        int numero1 = a;
        int numero2 = b;
        
        // Creamos random
        Random aleatorio = new Random();
        
        // Creamos numero aleatorio segun los parametros del usuario
        int numeroAleatorio = aleatorio.nextInt(numero1 - numero2 + 1) + numero2;
        
        // Devolvemos resultado
        return numeroAleatorio;
        
    }
    
    private static void menuPrincipal(){
        System.out.println("==========================");
        System.out.println("===== AdivinanzaGame =====");
        System.out.println("==========================");
        System.out.println("======= SELECCIONE UNA OPCION =======");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Salir");
    }
    
    private static void menuAjustes(){
        System.out.println("==============================");
        System.out.println("== Seleccione una modalidad ==");
        System.out.println("==============================");
        System.out.println("1. Configuración personalizada");
        System.out.println("2. Configuración autonoma");
    }
    
    private static int seleccionAjustes(){
        // Creamos scanner
        Scanner numero = new Scanner(System.in);
        int ajuste = 0;
        
        try {
            // Pedimos valor de ajuste
            ajuste = numero.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Introduzca solo números");
        };
        
        // Limpiamos buffer
        numero.nextLine();
        
        // Devolvemos valor
        return ajuste;
        
    }
    
    public static void main(String[] args) {
        // Creamos variables
        Scanner teclado = new Scanner(System.in);
        String opcion; 
        
        // Iniciamos bucle
        do{
            menuPrincipal();
            opcion = teclado.nextLine();
            
            switch (opcion){
                case "1":
                    // Variables
                    int numeroAlea = 0;
                    int ajuste;
                    int num1 = 0;
                    int num2 = 0;
                    int numeroIntro = 0;
                    // Constantes
                    final int NUMEROINTENTOS = 3;
                   
                    // Solicitamos configuración
                    menuAjustes();
                    ajuste = seleccionAjustes();
                    
                    // ==== MODALIDAD 1 ====
                    if (ajuste == 1){
                        try {
                            System.out.println("Seleccione un número:");
                            num1 = teclado.nextInt();
                            System.out.println("Seleccione otro número:");
                            num2 = teclado.nextInt();
                        } catch (InputMismatchException ime) {
                            System.out.println("Introduzca solo números");
                        };
                        
                        // Generamos número aleatorio
                        numeroAlea = GenerarNumeroManu(num1, num2);
                        
                        // Limitamos el número de intentos
                        for (int i=1; i <= NUMEROINTENTOS; i++){
                            try{
                            // Pedimos al usuario que introduzca un número
                            System.out.println("Introduzca un número el cual este entre " + num1 + " y " + num2 + ":");
                            numeroIntro = teclado.nextInt();
                            } catch(InputMismatchException ime){
                                System.out.println("Introduzca solo números");
                            };
                            // Comprobamos si hemos acertado
                            if (numeroIntro == numeroAlea){
                                System.out.println("¡Enhorabuena! Has adivinado el número");
                                break;
                            } else if (numeroIntro < numeroAlea){
                                System.out.println("¡Casi! El número es mayor");
                            }else{
                                System.out.println("¡Casi! El número es menor");
                            }
                        }
                        System.out.println("==============================================");
                        System.out.println("El numero seleccionado ha sido: " + numeroAlea);
                        System.out.println("==============================================");
                    }
                    // ==== MODALIDAD 1 ====
                    
                    // ==== MODALIDAD 2 ====
                    if (ajuste == 2){
                        
                        // Generamos número aleatorio
                        numeroAlea = GenerarNumeroAuto();

                        // Limitamos el número de intentos
                        for (int i = 1; i <= NUMEROINTENTOS; i++) {
                            
                            try{
                            // Pedimos al usuario que introduzca un número
                            System.out.println("Introduzca un número:");
                            numeroIntro = teclado.nextInt();
                            } catch(InputMismatchException ime){
                                System.out.println("Introduzca solo números");
                            }
                            
                            // Comprobamos si hemos acertado
                            if (numeroIntro == numeroAlea) {
                                System.out.println("¡Enhorabuena! Has adivinado el número");
                                break;
                            } else if (numeroIntro < numeroAlea) {
                                System.out.println("¡Casi! El número es mayor");
                            } else {
                                System.out.println("¡Casi! El número es menor");
                            }
                        }
                        System.out.println("==============================================");
                        System.out.println("El numero seleccionado ha sido: " + numeroAlea);
                        System.out.println("==============================================");
                    }
                    // ==== MODALIDAD 2 ====  
                    
                    // Limpiamos buffer
                    teclado.nextLine();
                    
                    break;
                case "2":
                    System.out.println("Hasta luego. Gracias por jugar");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            // Salimos cuando se pulse 2
        } while(!opcion.equals("2"));
    }
}
