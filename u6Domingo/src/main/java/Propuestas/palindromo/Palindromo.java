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
        separarLetras("holaloh");
    }
    
    public static void separarLetras(String palabra){
        ArrayList<Character> lista = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            lista.add(palabra.charAt(i));
        }
    }

    public static void revisarLetras(ArrayList<Character> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == lista.get(lista.size()-1)) {
                System.out.println("Ho");
            } else{
                System.out.println("La");
            }
        }

    }

}
