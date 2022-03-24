/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria;

import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class TeoriaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        
        alumnos.add("Victor");
        alumnos.add("Luis");
        alumnos.add("Elena");
        
        // Opcion 1
        for(int i=0; i<alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
        
        // Opcion 2
        for(String tmp: alumnos) {
            System.out.println(tmp);
        }
        
        // Opcion 3
        alumnos.forEach(System.out::println);
    }
}
