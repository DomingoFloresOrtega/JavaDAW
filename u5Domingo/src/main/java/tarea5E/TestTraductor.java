/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5E;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author domingo
 */
public class TestTraductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo el Map
        Traductor traductor = new Traductor();
        
        // Insertamos palabras
        traductor.introducirRegistros("Hello", "Hola");
        traductor.introducirRegistros("Goodbye", "Hasta luego");
        traductor.introducirRegistros("Happy", "Feliz");
        traductor.introducirRegistros("Good", "Mal");
        traductor.introducirRegistros("Bored", "Cansado");
        
        // Traductor en uso
        System.out.println(traductor.traducir("Good"));
        
        // Modificamos palabras
        traductor.modificarRegistros("Good", "Mal", "Bien");
        System.out.println(traductor.traducir("Good"));
        
        // Borramos palabras
        traductor.borrarRegistros("Good");
        
        // Mostramos traductor
        System.out.println("=============================");
        System.out.println(traductor.listaPalabrasIngles());
        System.out.println(traductor.listaPalabrasEspaniol());      
        
        // Imprimo traductor (con estilo mas legible)
        System.out.println("=============================");
        traductor.imprimir();
    }  
}
