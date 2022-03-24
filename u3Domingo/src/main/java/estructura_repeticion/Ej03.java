/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

/**
 *
 * @author domingo
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int N=15;
        final int REPETICIONES = 25;
        final int FACTOR_MULTIPLICATIVO = 2;
        int aux = N;
        
        for (int i = 1; i <= REPETICIONES; i++) {
            System.out.println("Número " + i + " es: " + aux);
            aux=aux*FACTOR_MULTIPLICATIVO;
        }
    }
    
}
