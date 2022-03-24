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
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        // Pedimos al usuario los galones entregados
        System.out.println("Introduzca los litros");
        double litros = entradaTeclado.nextDouble();
        
        // Realizamos calculos
        double GALONES = litros / 3.78;
        double PRECIO = GALONES * 1.20;
        
        // Imprimimos el resultado
        System.out.println("Al realizar la entrega de " + litros + " litros de "
                + "leche obtenemos un total de " + PRECIO + "€");
    }
    
}
