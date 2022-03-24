/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author domingo
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio19Avion avion = new Ejercicio19Avion();
        boolean paso;
        
        do {
            paso = avion.mostrarMenuSeleccion();
        } while (paso);
        
    }

}
