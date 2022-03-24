/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author domingo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teatro teatro = new Teatro();
        
        // Muestro asientos
        teatro.mostrarAsientos();
        System.out.println("------------------");
        
        // Reservo asientos y muestro
        teatro.reservarAsientos(1, 1);
        teatro.mostrarAsientos();
        System.out.println("------------------");
        
        // Reservo asientos (ya reservado) y muestro
        teatro.reservarAsientos(1, 1);
        teatro.mostrarAsientos();
        System.out.println("------------------");
    }
    
}
