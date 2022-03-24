/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio15;

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
        ArrayList<Legislador> lista = new ArrayList<>();
        
        lista.add(new Diputado(2,"Malaga","PP","Antonio","Martinez"));
        lista.add(new Senador(3.5, "Huelva", "PSOE", "Maria", "Matin"));
        
        for (Legislador legislador : lista) {
            System.out.println(legislador.getCamara());
            
            if (legislador instanceof Diputado){
                System.out.println(((Diputado) legislador).getNumeroAsiento());
            }
        }
        
        for (Legislador legislador : lista) {
            System.out.println(legislador.toString());
        }
    }
    
}
