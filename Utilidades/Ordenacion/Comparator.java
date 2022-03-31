/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numeros.aleatorios;

/**
 *
 * @author domingo
 */
public class Comparator {
    
    // Este no se implementa pero al llamar a Collections.sort deberemos poner el criterio
    Collections.sort(lista, (Cancion c1, Cancion c2) -> c1.getArtista().compareTo(c2.getArtista()));
    
    // Para poder hacer una busqueda binaria deberemos usar
    Collections.binarySearch(listaCanciones, c, (Cancion c1, Cancion c2) -> c1.getTitulo().compareTo(c2.getTitulo()));
}
