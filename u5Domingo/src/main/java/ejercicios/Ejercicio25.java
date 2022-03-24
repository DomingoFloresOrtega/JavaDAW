/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author domingo
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaPila pila = new ListaPila();
        
        pila.pushPila(2);
        
        pila.mostrarElementos();
        
        pila.estaLlena();
        
        pila.estaVacia();
        
        System.out.println(pila.elementosActual());
        
        char[] array = pila.sacarElementos();
        
        for (int i = 0; i < array.length; i++){
            System.out.println("El valor de " + i + " es: " + array[i]);
        }
    }
    
}
