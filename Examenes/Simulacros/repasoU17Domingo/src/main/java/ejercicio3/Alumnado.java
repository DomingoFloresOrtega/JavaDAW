/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.TreeMap;

/**
 *
 * @author domingo
 */
public class Alumnado { // implements Comparable<Alumnado>{
    private String nombre;
    private TreeMap<String, String> lista;

    public Alumnado() {
    }

    public Alumnado(String nombre, TreeMap<String, String> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeMap<String, String> getLista() {
        return lista;
    }

    public void setLista(TreeMap<String, String> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Alumnado{" + "nombre=" + nombre + ", lista=" + lista + '}';
    }

//    @Override
//    public int compareTo(Alumnado o) {
//        
//    }
    
    
}
