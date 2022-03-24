/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;
// El paquete java.lang ya viene importado

/**
 *
 * @author domingo
 */
public class Teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Para leer por teclado estandar usamos
        // la clase Scanner
        // Declaración de un objeto Scanner y otro String
        Scanner teclado;
        String miNombre;
        
        // Construyo el objeto Scanner con su constructor
        // pasando como parametro el flujo de entrada estandar
        // Entrada estandar es System.in
        // new para poder reservar memoria
        teclado = new Scanner(System.in);
        
        // Se guarda en la variable miNombre el
        // resultado de introducir caracteres por teclado
        // hasta que se pulsa enter
        System.out.println("Introduce tu nombre: ");
        miNombre = teclado.nextLine();
        System.out.println("Has puesto: " + miNombre);
    }
    
}
