/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio13;

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
        ArrayList<Persona> listaPersona = new ArrayList<>();
        
        Persona e1 = new Estudiante("01", "Antonio", "Martinez", "45671098I", new Direccion("San Marcos", "Madrid", "34967", "España"));
        Persona e2 = new Estudiante("02", "Marcos", "Gomez", "78956412F", new Direccion("San Leopoldo", "Madrid", "34985", "España"));
        
        Persona p1 = new Profesor("Matematicas", "Maria", "Gutierrez", "12345678T", new Direccion("San Agustin", "Madrid", "34967", "España"));
        Persona p2 = new Profesor("Lengua", "Ermenegildo", "Iglesias", "75469823A", new Direccion("San Fernando", "Cadiz", "29400", "España"));
        
        // Agregar personas a lista
        listaPersona.add(e1);
        listaPersona.add(e2);
        listaPersona.add(p1);
        listaPersona.add(p2);
        
        // Llamar a metodos
        for (Persona obj : listaPersona) {
            System.out.println(obj.toString());
            obj.identificate();
            
            // Llamo a metodos personales
            if (obj instanceof Estudiante){
                System.out.println("ID: " + ((Estudiante) obj).getId());
            } else if (obj instanceof Profesor){
                System.out.println("Especialidad: " + ((Profesor) obj).getEspecialidad());
            }
        }
        
        System.out.println("===== LISTA <IDENTIFICABLE> =====");
        ArrayList<Identificable> listaIdentificable = new ArrayList<>();
        
        listaIdentificable.add(e1);
        listaIdentificable.add(e2);
        listaIdentificable.add(p1);
        listaIdentificable.add(p2);
        
        for (Identificable obj2 : listaIdentificable) {
            obj2.identificate();
            
            // Llamo a metodos personales
            if (obj2 instanceof Estudiante){
                System.out.println(obj2.getClass()); // Da el paquete y la clase donde esta contenido
                System.out.println("ID: " + ((Estudiante) obj2).getId());
            } else if (obj2 instanceof Profesor){
                System.out.println("Especialidad: " + ((Profesor) obj2).getEspecialidad());
            }
        }
    }  
}
