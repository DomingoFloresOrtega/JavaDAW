/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

/**
 *
 * @author domingo
 */
public class iplus_plusi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        // Primero usa el valor de i en la instruccion
        // cuando termina la linea entonces le suma 1 a i
        System.out.println("i vale: " + (i++));
        // En esta linea, i vale 1
        System.out.println("i vale: " + i);
        // Imprimir 2 en el sout, usando i
        // Primero suma 1 y luego usar el valor de i en
        // la instrucción
        System.out.println("i vale: " + (++i));
        
    }
    
}
