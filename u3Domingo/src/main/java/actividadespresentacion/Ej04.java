/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadespresentacion;

/**
 *
 * @author domingo
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5; // n se inicializa a 5 para calcular 5!
        int factorial = 1; // factorial se inicializa a 1
        int i;
        for (i=0;i<n;i++){
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de " + n + " es " + factorial);
    }

}
