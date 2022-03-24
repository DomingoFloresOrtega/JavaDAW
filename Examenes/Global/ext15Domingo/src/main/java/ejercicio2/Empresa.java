/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.Trabajador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Empresa {
    private ArrayList<Trabajador> lista = new ArrayList<>();
    private String nombre;
    private String cif;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }
    
    public void imprimir(){
        System.out.println("La empresa " + nombre + " con CIF " + cif + " tiene a los siguiente trabajadores:");
        for (Trabajador trabajador : lista) {
            System.out.println(trabajador);
        }
    }
    
    public void contratar(Trabajador t){
        lista.add(t);
    }
    
    public void despedir(Trabajador t){
        lista.remove(t);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.lista);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.lista, other.lista);
    }
    
    public void buscarTodosNombre(String nombre){
        
    }
    
    public void ordenarNombre(){
        Comparator<Trabajador> criterioNombre = (Trabajador t1, Trabajador t2) -> t1.getNombre().compareTo(t2.getNombre());

        Collections.sort(lista, criterioNombre);
    }
    
    public int buscarNombre(Trabajador t) {
        return Collections.binarySearch(lista, t, (Trabajador t1, Trabajador t2) -> t1.getNombre().compareTo(t2.getNombre()));
    }
}
