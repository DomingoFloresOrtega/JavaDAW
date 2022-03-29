/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teoria.Interfaces;

import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // No se pueden instaciar objetos de interface ni clases abstractas
        Vehiculo v1 = new Turismo(); // Conversion implicita
        Ordenador o1 = new Ordenador();
        SeArranca i1 = new Ordenador();
        SeArranca i2 = v1;
        
        System.out.println(i1.arrancar());
        ArrayList<SeArranca> listaArrancables = new ArrayList<>();
        
        listaArrancables.add(v1);
        listaArrancables.add(o1);
        o1.setPrecio(100);
        listaArrancables.add(new Turismo());
        listaArrancables.add(new Ordenador());
        
        for (SeArranca obj : listaArrancables) {
            obj.arrancar();
            // Si es Ordenador, muestro el precio
            if (obj instanceof Ordenador){
                System.out.println(((Ordenador) obj).getPrecio());
                // Paro el ordenador
                ((Ordenador) obj).parar();
            }
        }
    }
    
}
