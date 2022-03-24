/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_seleccion;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
         // Apartado a
        System.out.println("Introduzca un numero:");
        int numero = teclado.nextInt();
        String resultado = (numero>=135) ? "Mayor" : "Menor";
        System.out.println("Apartado a: " + resultado);
        
        // Apartado b
        String resultado1 = (numero<=0) ? "Menor que cero" : "Mayor que cero";
        System.out.println("Apartado b: " + resultado1);
        
        // Apartado c
        System.out.println("Introduzca un numero:");
        int entero = teclado.nextInt();
        String resultado2 = (numero<0) ? entero : entero * -1;
    } 
}
