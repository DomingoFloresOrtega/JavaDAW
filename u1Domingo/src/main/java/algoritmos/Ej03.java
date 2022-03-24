/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaNotas;
        entradaNotas = new Scanner(System.in);
        
        // Leemos la primera nota
        System.out.println("Introduzca la primera nota:");
        double nota1 = entradaNotas.nextDouble();
        
        // Leemos la segunda nota
        System.out.println("Introduzca la segunda nota: ");
        double nota2 = entradaNotas.nextDouble();
        
        // Leemos la tercera nota
        System.out.println("Introduzca la tercera nota: ");
        double nota3 = entradaNotas.nextDouble();
        
        // Realizamos la media
        double sumaNotas = nota1 + nota2 + nota3;
        double media = sumaNotas / 3;
        
        // Cargamos los resultados
        System.out.println("==========================");
        System.out.println("La nota media es: " + media);
        System.out.println("==========================");
    }
    
}
