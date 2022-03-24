/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class ListaPila {
    private ArrayList<Pila> pilas;
    private int tamanio = 5;
    
    public ListaPila(){
        this.pilas = new ArrayList<>(tamanio);
    }
    
    public void pushPila(int posicion){
        if (pilas.size() < tamanio){
           pilas.add(new Pila()); 
        }
    }
    
    public void popPila(){
        pilas.remove(pilas.size()-1);
    }
    
    public void estaVacia(){
        if (pilas.isEmpty()){
            System.out.println("La pila está vacia");
        }
    }
    
    public void estaLlena(){
        if (!pilas.isEmpty()){
            System.out.println("La pila esta llena");
        }
    }
    
    public int elementosActual(){
        return pilas.size();
    }
    
    public void mostrarElementos(){
        for (int i=0; i < pilas.size()-1; i++){
            System.out.println("El elemento nº" + (i+1) + " es: " + pilas.get(i));
        }
    }
    
    public void rellenar(char[] array){
        tamanio = array.length;
        
        for (int i = 0; i < tamanio; i++){
            pushPila(array[i]);
        }
    }
    
    public char[] sacarElementos(){
        char[] arrayChar = new char[pilas.size()];
        for (int i = 0; i < pilas.size(); i++){
            arrayChar[i] = pilas.get(i).getCaracter();
            pilas.remove(i);
        }
        
        return arrayChar;
    }
}
