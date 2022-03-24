/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Propuestas.palindromo;

import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (esPalindromo("memoomem")){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }

    public static boolean esPalindromo(String palabra){
        if (palabra.length() <= 1){
            return true;
        }else{
            if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)){
                return esPalindromo(palabra.substring(1,palabra.length() - 1 ));
            }else {
                return false;
            }
        }
    }
}
