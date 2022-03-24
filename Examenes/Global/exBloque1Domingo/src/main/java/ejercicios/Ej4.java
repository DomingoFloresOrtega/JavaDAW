/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Variables
        String opcion;
        boolean controlSalida = true;
        
        do{
            // Mostramos menú
            System.out.println("1. Cuenta atrás");
            System.out.println("2. Juego de dados");
            System.out.println("3. Salir");
            System.out.println("Introduzca una opción:");
            opcion = teclado.nextLine();
            
            switch(opcion){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    // Pedimos confirmación
                    System.out.println("¿Desea salir? Para salir escriba SI");
                    String salirTexto = teclado.nextLine();
                    
                    if (salirTexto.equals("SI") || salirTexto.equals("si") || salirTexto.equals("Si") || salirTexto.equals("sI")){
                        controlSalida = false;
                    } else{
                        System.out.println("Debe escribir SI");
                    }
                    break;
                    
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (controlSalida);
    }  
}
