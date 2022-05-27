/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
/**
 *
 * @author domingo
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Cruceros> listaCruceros = LecturaJSON.leerArchivoJSON("./cruceros.json");
        
        // Apartado C
        listaCruceros.stream();
        
        // Apartado E
        Map<String,String[]> crucerosMapO = mapCruceros(listaCruceros);
        crucerosMapO.forEach((k, v) -> System.out.println(k + "-> " + v));
    }
    
    private static Map<String, String[]> mapCruceros(List<Cruceros> listaCruceros) {
        Map<String, String[]> mapCruceros = new HashMap<>();
        SortedMap<String,String[]> mapCrucerosSort;
        listaCruceros.forEach(cruceros -> {
            mapCruceros.put(cruceros.getNombre(), cruceros.getDestinos());
        });

        return mapCruceros;
    }
    
}
