/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.lambda;

import java.util.Comparator;

/**
 *
 * @author domingo
 */
public class ComparadorNombre implements Comparator<Libro> {

    @Override
    public int compare(Libro t, Libro t1) {
        return t.getNombre().compareTo(t1.getNombre());
    }
    
}
