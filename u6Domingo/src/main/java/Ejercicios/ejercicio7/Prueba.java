/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camarero c1 = new Camarero("Jefe de sección","Manuel","Fdez","123ddf");
        Camarero c2 = new Camarero("Sumiller");
        
        Cocinero co1 = new Cocinero("Postres", "Luisa", "Pérez", "ddd");
        Cocinero co2 = new Cocinero("Entrantes","Mario","Fernandez","eee");
        
        ArrayList<Trabajador> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(co1);
        lista.add(co2);
        
        for (Trabajador t : lista) {
            System.out.println(t);
            t.cotizar();
        }
    }
    
}
