/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class ListaLibros {

    /**
     * @param args the command line arguments
     */
    
    // Clase asociada: Libro.java
    // Atributo encapsulado de tipo lista
    private ArrayList<Libro> lista;

    // Constructor por defecto, solo instancia la estructura list
    // sin incluir ningun objeto
    public ListaLibros() {
        this.lista = new ArrayList<>();
    }
    
    // Guarda un libro al final de la lista, si no es null
    public void insertarLibro(Libro libro){
        if (libro != null){
            lista.add(libro);
        }
    }
    
    public void imprimirConsola(){
        System.out.println("Imprimiendo...");
        for (int i = 0; i < lista.size(); i++){
            System.out.println("Libro nº" + (i+1) + ": " + lista.get(i));
        }
    }
    
    public int getTotalLibros(){
        return lista.size();
    }
    
    // Eliminar
    public boolean borrarLibro(Libro libro){
        if (lista.contains(libro)){
            lista.remove(libro);
            return true;
        }
        return false; // Tambien sirviria, return lista.remove(libro);
    }
    
    public Libro buscarISBN(String isbn){
        Libro aux = null;
        // Metodo 1
        for (int i=0; i < lista.size(); i++){
            aux = lista.get(i);
            if (aux.getIsbn().equals(isbn)){
                return aux;
            }
        }
        return aux;
    }
    
    public Libro buscarISBN2(String isbn){
        Libro aux = new Libro(isbn, "", "", 0, 0);
        
        int indice = lista.indexOf(aux);
        
        if (indice >= 0){
            return lista.get(indice);
        }
        
        return null;
    }
    
    public ArrayList<Libro> buscarPorPrecio(double precio){
        ArrayList<Libro> aux = new ArrayList<>();
        
        for (Libro libro : this.lista) {
            aux.add(libro);
        }
        
        return aux;
    }
    
}
