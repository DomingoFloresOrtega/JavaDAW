/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domingo;

/**
 *
 * @author domingo
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean adivina = ((97 == 'a') && true);
        System.out.println(adivina);
        
        int a = 'a';
        System.out.println(a);
        
        int pi = 3.14;
        System.out.println(pi);
        // No funcionará debido a que estamos almacenando un numero decimal en una variable tipo int
        
        double pi = 3,14;
        System.out.println(pi);
        
        boolean adivina = (1==4);
        System.out.println(adivina);
    }

}
