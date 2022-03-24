/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioBucles;

/**
 *
 * @author domingo
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 1;
        
        // Este bucle se repite mientras x sea menor o igual que 100
        // Cuando x sea 101 se para el bucle

        while (x <= 100) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1; // x++ | ++x | x+=1
        }
        System.out.println("");
        System.out.println("X vale " + x);
    }
}
