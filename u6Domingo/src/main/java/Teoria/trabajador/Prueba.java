/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teoria.trabajador;

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
        System.out.println(c1);
        Camarero c2 = new Camarero("Sumiller");
        System.out.println(c2);
        
        Cocinero co1 = new Cocinero("Postres", "Luisa", "Pérez", "ddd");
        Trabajador t1 = new Trabajador("Paco", "El chocolatero", "fgdfgd5");
        
//        System.out.println(c1);
//        System.out.println(co1);
//        System.out.println(t1);
//        
//        c1.cotizar();
//        co1.cotizar();
//        t1.cotizar();
        System.out.println("==============");
        
        ArrayList<Trabajador> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(c1); // Conversion implicita (camarero -> trabajador)
        lista.add(co1); // Conversion implicita (cocinero -> trabajador)
        
        for (Trabajador t : lista) {
            System.out.println(t);
            t.cotizar();
            
            // Si t es una instacia de Camarero
            if (t instanceof Camarero){
                // Paso a paso
                Camarero aux = (Camarero) t; // Conversión explicita
                aux.servirMesa("4");
            }
            
            // Si t es una instancia de Cocinero
            if (t instanceof Cocinero){
                // Por rapidez (t.)
                ((Cocinero) t).prepararPlato("Puchero"); // Conversión explicita automatica
            }
        }
    }
    
}
