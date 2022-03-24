/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionC;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class TestCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cancion = "";
        String autor = "";
        
        Cancion song = new Cancion(cancion, autor);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca una canción:");
        cancion = teclado.nextLine();
        
        song.setTitulo(cancion);
        
        System.out.println("Introduzca el autor:");
        autor = teclado.nextLine();
        
        song.setAutor(autor);
        
        System.out.println(song.toString());
    }  
}
