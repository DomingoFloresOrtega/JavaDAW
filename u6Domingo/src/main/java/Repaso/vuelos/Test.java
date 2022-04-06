package Repaso.vuelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<Persona> listaPasajeros = new ArrayList<>();

        listaPasajeros.add(new Persona("Antonio", "Martin", "34101918L"));
        listaPasajeros.add(new Persona("Victoria","Sampalo","12453908I"));
        listaPasajeros.add(new Persona("Nacho","Salcedo","45698213L"));
        listaPasajeros.add(new Persona("Alvaro","Flores","10459786H"));
        listaPasajeros.add(new Persona("Francisco","Martinez","42103968F"));

        ArrayList<Vuelo> listaVuelos = new ArrayList<>();
        
        listaVuelos.add(new Vuelo("1", "Madrid", "Malaga", 2, listaPasajeros));
        listaVuelos.add(new Vuelo("2","Malaga","Tailandia",10,listaPasajeros));
        listaVuelos.add(new Vuelo("3","Tailandia","Estados Unidos",25,listaPasajeros));
        listaVuelos.add(new Vuelo("4","Estados Unidos","Malaga",20,listaPasajeros));
        listaVuelos.add(new Vuelo("5","Estados Unidos","Argentina",3,listaPasajeros));
        
        // Destinos
        System.out.println("=== DESTINOS ===");
        System.out.println(pasajerosDestino(listaVuelos));
        // Destinos ordenados
        System.out.println("=== DESTINOS EN ORDEN ===");
        System.out.println(pasajerosDestinoOrdenados(listaVuelos));
        // Pasajeros en el vuelo
        System.out.println("=== PASAJEROS EN VUELO ===");
        System.out.println(pasajerosVuelo(listaVuelos, "1"));
    }
    
     public static Map<String, Integer> pasajerosDestino(ArrayList<Vuelo> listaVuelos) {

        Map<String, Integer> vuelosDestino = new HashMap<>(); // Conversión implicita

        for (Vuelo v : listaVuelos) {
            int n = v.getPasajeros().size();
            for (Vuelo p : listaVuelos) {
                if (v != p && v.getCiudadDestino().equals(p.getCiudadDestino())) { 
                    n += p.getPasajeros().size(); 
                }
            }
            
            vuelosDestino.put(v.getCiudadDestino(), n);
        }

        return vuelosDestino;
    }
     
    public static Map<String, Integer> pasajerosDestinoOrdenados(ArrayList<Vuelo> listaVuelos) {

        Map<String, Integer> vuelosDestino = new TreeMap<>();

        for (Vuelo v : listaVuelos) {
            int n = v.getPasajeros().size();
            for (Vuelo b : listaVuelos) {
                if (v != b && v.getCiudadDestino().equals(b.getCiudadDestino())) {
                    n += b.getPasajeros().size();
                }
            }
            
            vuelosDestino.put(v.getCiudadDestino(), n);
        }

        return vuelosDestino;
    }
    
    public static ArrayList<Persona> pasajerosVuelo(ArrayList<Vuelo> lista, String codigoVuelo) {

        ArrayList<Persona> pasajeros = new ArrayList<>();

        for (Vuelo v : lista) {
            if (v.getCodigoVuelo().equals(codigoVuelo)) { 
                  return v.getPasajeros();
            }
        }

        return pasajeros; 
    }
}
