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
public class EdadTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradadeTeclado;
        entradadeTeclado = new Scanner(System.in);
        
        // Preguntamos nombre
        System.out.println("¿Cual es tu nombre?");
        String name = entradadeTeclado.nextLine();
        
        // Preguntamos dia
        System.out.println("¿Qué dia naciste?");
        int day = entradadeTeclado.nextInt();
        
        // Preguntamos mes
        System.out.println("¿Qué mes naciste?");
        entradadeTeclado.nextLine();
        String month = entradadeTeclado.nextLine();
        
        // Preguntamos año
        System.out.println("¿Que año naciste?");
        int year = entradadeTeclado.nextInt();
        
        // Mostramos
        System.out.println("Hola " + name + ", naciste el día " + day + " el mes " + month + " en el año " + year);
    }
    
}
