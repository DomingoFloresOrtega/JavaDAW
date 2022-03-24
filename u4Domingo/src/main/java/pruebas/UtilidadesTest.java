/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class UtilidadesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean ejecutar = true;
        
        // Metodo leer numero por scanner
        do{
            System.out.println("========= MENU =========");
            System.out.println("1. Leer numeros");
            System.out.println("2. Generar aleatorios");
            System.out.println("0. Salir");
            System.out.println("Introducir opcion:");
            String opcion = teclado.nextLine();
            
            switch (opcion){
                case "1":
                    Utilidades leerNumero = new Utilidades();
                    System.out.println("Introduzca un numero:");
                    int numero = teclado.nextInt();
                    
                    leerNumero.leerEnteros(numero);
                    
                    System.out.println("El numero seleccionado es: " + leerNumero.leerEnteros(numero));
                    teclado.nextLine();
                    break;
                case "2":
                    Utilidades generarNumero;
                    break;
                case "0":
                    System.out.println("Adios");
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Tecla incorrecta, amigo");
                    break;
            }
        } while (ejecutar);
    }    
}
