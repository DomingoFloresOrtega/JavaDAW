/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numeroPersonas = 0;
        int altura = 0;
        boolean numeroCorrecto = false;
        boolean alturaCorrecta;
        
        do {
            try {
                System.out.println("Introduce el numero de personas");
                numeroPersonas = teclado.nextInt();
                numeroCorrecto = true;
            } catch (InputMismatchException ime){
                System.out.println("Tienes que introducir valores");
                teclado.nextLine();
            }
        } while (altura <1 || !numeroCorrecto);
        
        do {
            try {
                System.out.println("Introduce la altura en cm de la persona");
                numeroPersonas = teclado.nextInt();
                numeroCorrecto = true;
            } catch (InputMismatchException ime){
                System.out.println("Tienes que introducir valores");
                teclado.nextLine();
            }
        } while (altura <1 || !numeroCorrecto);
    }
    
}
