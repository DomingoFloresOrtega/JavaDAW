/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5E;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 *
 * @author domingo
 */
public class Traductor {
    private SortedMap<String, String> traductor; // SortedMap o Map

    public Traductor() {
        // Inicializo
        this.traductor = new TreeMap<>();
    }

    public void introducirRegistros(String palabraIngles, String palabraEspaniol){
        traductor.put(palabraIngles, palabraEspaniol);
    }
    
    public void borrarRegistros(String palabraIngles){
        traductor.remove(palabraIngles);
    }
    
    public void modificarRegistros(String palabraIngles, String palabraEspaniolAntigua, String palabraEspaniolNueva){
        traductor.replace(palabraIngles, palabraEspaniolAntigua, palabraEspaniolNueva);
    }
    
    public String traducir(String palabraIngles){
        return traductor.get(palabraIngles);
    }
    
    // Imprimir listas de palabras
    
    public ArrayList<String> listaPalabrasIngles(){
        ArrayList<String> listaPalabrasIngles = new ArrayList<String>(traductor.keySet());
        
        return listaPalabrasIngles;
    }
    
    public ArrayList<String> listaPalabrasEspaniol(){
        ArrayList<String> listaPalabrasEspaniol = new ArrayList<String>(traductor.values());
        
        return listaPalabrasEspaniol;
    }
    
    public void imprimir(){
        for (Map.Entry<String, String> aux : traductor.entrySet()){
            System.out.println(aux.getKey() + " - " + aux.getValue());
        }
    }
}
