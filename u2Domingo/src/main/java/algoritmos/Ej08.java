/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaValor;
        entradaValor = new Scanner(System.in);
        
        // Pedimos al usuario el precio
        System.out.println("Introduzca el precio del articulo:");
        double precio = entradaValor.nextDouble();
        
        // Pedimos al usuario el IVA a aplicar
        System.out.println("Introduzca el IVA que desea aplicar:");
        double iva = entradaValor.nextDouble();
        
        final double IVATOTAL = iva / 100;
        
        // Realizamos el calculo aplicando el IVA
        final double PRECIOCALCULADO = precio * IVATOTAL;
        final double PRECIOFINAL = PRECIOCALCULADO + precio;
        
        // Mostramos el resultado
        System.out.println("El precio total es de " + PRECIOFINAL + "€ ");
    }
    
}
