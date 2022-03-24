/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        boolean controlSalida = true;
        do {
            System.out.println("=================");
            System.out.println("1. Cuenta atrás");
            System.out.println("2. Juego de dados");
            System.out.println("3. Salir");
            System.out.println("Introduzca una opción:");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    break;
                case "2":
                    int caraCruz,
                     i = 1;
                    Random moneda = new Random();
                    // Inicia bucle
                    for (int j = 1; j <= 20; j++) {
                        System.out.println("=========================");
                        System.out.println("¡Bienvenido al sorteo!");
                        System.out.println("========== J" + i + " ===========");
                        System.out.println("Seleccionando cara o cruz");
                        caraCruz = moneda.nextInt(2);

                        if (caraCruz == 0) {
                            // Es cara
                            int numeroTirado;
                            System.out.println("Ha salido cara");
                            System.out.println("Tirando dado...");
                            numeroTirado = moneda.nextInt(6) + 1;
                            System.out.println("Ha salido el número " + numeroTirado);

                            if (numeroTirado == 1 || numeroTirado == 3) {
                                System.out.println("¡Enhorabuena! Ha ganado un viaje a la charca de la Nutrias");
                            } else if (numeroTirado == 2 || numeroTirado == 6) {
                                System.out.println("¡Enhorabuena! Ha ganado un viaje al parque de los Pedregales");
                            } else {
                                System.out.println("¡Enhorabuena! Ha ganado un viaje a los dólmenes de Corominas");
                            }
                        } else {
                            // Es cruz
                            System.out.println("Ha salido cruz");
                            System.out.println("Ha perdido la oportunidad de ganar el viaje. Lo sentimos");
                        }
                        i++;
                    }
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
