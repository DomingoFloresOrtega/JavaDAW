/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author domingo
 */
public class ListaReproduccion {
    
    private ArrayList<Cancion> canciones;
    
    public ListaReproduccion() {
        this.canciones = new ArrayList<>();
    }

    public int numeroCanciones(){
        return canciones.size();
    }
    
    public boolean estaVacia(){
        return canciones.isEmpty();
    }
    
    public void escucharCancion(int numero){
        System.out.println("Estas escuchando: " + canciones.get(numero));
    }
    
    public void cambiarCancion(int numero, Cancion cancion){
        if (numero < canciones.size()){
            canciones.get(numero).setNombre(cancion.getNombre());
            canciones.get(numero).setArtista(cancion.getArtista());
            canciones.get(numero).setAlbum(cancion.getAlbum());
            canciones.get(numero).setAnio(cancion.getAnio());  
        }
    }
    
    public void grabarCancion(Cancion cancion){
        canciones.add(cancion);
    }
    
    public void eliminarCancion(int posicion){
        canciones.remove(posicion);
    }
    
    public void eliminarCancion(Cancion cancion){
        canciones.remove(cancion);
    }
    
    public void imprimirLista(ListaReproduccion tmp){
        for (int i = 0; i < tmp.canciones.size(); i++){
            System.out.println("Canción nº" + (i+1) + ": " + tmp.canciones.get(i));
        }
    }
    
    public int buscarCancion(Cancion cancion){
        return canciones.indexOf(cancion);
    }
    
    public void ordenarCancionTitulo(){
        Collections.sort(this.canciones);
    }
    
    public void ordenarComparatorCantante(){
        Collections.sort(canciones, (Cancion c1, Cancion c2)->c1.getArtista().compareTo(c2.getArtista()));
    }
    
    /* Busqueda de canciones por nombre usando binarySearch y */
    
    public int buscarCancionTitulo(Cancion nombre){
        return Collections.binarySearch(canciones, nombre, (Cancion c1, Cancion c2)->c1.getNombre().compareTo(c2.getNombre()));
    }
    
    /* Uso de la implementacion Comparator */
    
    public void ordenarComparatorAlbum(){
        Collections.sort(canciones, (Cancion c1, Cancion c2)->c1.getAlbum().compareTo(c2.getAlbum()));
    }
    
    public void ordenarComparatorArtista(){
        Collections.sort(canciones,(Cancion c1, Cancion c2)->c1.getArtista().compareTo(c2.getArtista())); // En caso de ser numero, c1.getArtista() - c2.getArtista()
    }
    
    public void ordenarNombreArtistas(){
        Comparator<Cancion> criterioNombre = (Cancion c1, Cancion c2)->c1.getNombre().compareTo(c2.getNombre());
        Comparator<Cancion> criterioArtista = (Cancion c1, Cancion c2)->c1.getArtista().compareTo(c2.getArtista());
        Comparator<Cancion> criterioUnificado = criterioNombre.thenComparing(criterioArtista);
        Collections.sort(canciones, criterioUnificado);
    }
}