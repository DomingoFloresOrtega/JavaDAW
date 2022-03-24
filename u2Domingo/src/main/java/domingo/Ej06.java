/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo;

/**
 *
 * @author domingo
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos variables
        // Declaramos e inicializamos a
        int a = 2;
        // Declaramos e inicializamos b
        int b = 5;
        // Declaramos e inicializamos c
        int c = 8;
        
        System.out.println("El valor a contiene: " + a);
        System.out.println("El valor b contiene: " + b);
        
        // Intercambiamos variables
        // Intercambiamos a por b
        a = b;
        // Intercambiamos b por c
        b = c;
        // Intercambiamos c por a
        c = a;
        
        System.out.println("------ X ------");
        System.out.println("El valor a contiene ahora: " + a);
    }
    
}
