/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numeros.aleatorios;

/**
 *
 * @author domingo
 */
public class Comparable {
    
// Hay que implementarlo con implements Comparable<Clase>
    // Habra que incluir el metodo compareTo()
    
    @Override
    public int compareTo(Robot t) {
        return (int) (this.numSerie - t.getNumSerie()); // <-- Indicar por lo que queremos ordenar
    }
    
    // Una vez implementado podremos ordenar por orden natural
    Collections.sort();
}
