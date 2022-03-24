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

/**
 *
 * @author domingo
 */
public class Loteria {
    private SortedMap<String, String> loteria; // SortedMap o Map

    public Loteria() {
        this.loteria = new TreeMap<>();
    }

    public void introducirRegistros(String numero, String premio){
        loteria.put(numero, premio);
    }
    
    public void borrarRegistros(String numero){
        loteria.remove(numero);
    }
    
    public void modificarRegistros(String numero, String premioAntiguo, String premioNuevo){
        loteria.replace(numero, premioAntiguo, premioNuevo);
    }
    
    public String consulta(String numero){
        return loteria.get(numero);
    }
}
