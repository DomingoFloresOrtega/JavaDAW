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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        boolean controlSalida = true;
        
        do{
            System.out.println("1. Cuenta atrás");
            System.out.println("2. Juego de dados");
            System.out.println("3. Salir");
            System.out.println("Introduzca una opción:");
            opcion = teclado.nextLine();
            
            switch(opcion){
                case "1":
                    System.out.println("==== Iniciada cuenta atrás ====");
                    for (int i=1000; i >= 100; i++){
                        System.out.println(i);
                        i = i-6;
                    }
                    System.out.println("==== Cuenta atrás finalizada ====");
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println("¿Desea salir? Para salir escriba SI");
                    String salirTexto = teclado.nextLine();
                    
                    if (salirTexto.equals("SI") || salirTexto.equals("si") || salirTexto.equals("Si") || salirTexto.equals("sI")){
                        controlSalida = false;
                    } else{
                        System.out.println("Debe escribir SI");
                    }
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (controlSalida);
    }
}
  
