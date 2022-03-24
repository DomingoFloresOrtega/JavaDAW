/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    
    // Funcion: Mientras el numero x no sea menor o igual que el introducido
    // por teclado nos sacara x - (sumara a x 1)
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
}
