package ejercicio1;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        List<Cruceros> lista = LecturaJSON.leerArchivoJSON("cruceros.json");

        // Apartado C
        System.out.println("========== APARTADO C ==========");
        Collections.sort(lista,Comparator.comparing(Cruceros::getPrecio).thenComparing(Cruceros::getNombre));
        for (Cruceros c : lista) {
            System.out.println(c.toString());
        }

        // Apartado E
        System.out.println("========== APARTADO E ==========");
        Map<String,ArrayList<Cruceros>> listaMap = new TreeMap<>();
        listaMap = mapCruceros(lista);
        listaMap.forEach((k, v) -> System.out.println(k + " -> " + Arrays.toString(v)));
    }

    private static Map<String, ArrayList<Cruceros>> mapCruceros(List<Cruceros> listaCruceros) {
        Map<String, ArrayList<Cruceros>> mapCruceros = new HashMap<>();
        SortedMap<String,String[]> mapCrucerosSort;
        listaCruceros.forEach(cruceros -> {
            mapCruceros.put(cruceros.getNombre(), cruceros.getDestinos());
        });

        return mapCruceros;
    }
}
