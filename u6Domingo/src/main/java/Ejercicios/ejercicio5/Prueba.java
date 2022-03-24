/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio5;

/**
 *
 * @author domingo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Maria", "75468930I", 20);
        Cliente c3 = new Cliente("Maria", "75468930I", 20);
        Cliente c4 = new Cliente("Maria", "75468930I", 20);
        Cliente c5 = new Cliente("Pedro","34129078U",26);
        
        System.out.println(c2.equals(c5));
    }
    
}
