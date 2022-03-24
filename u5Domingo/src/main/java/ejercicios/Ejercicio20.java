/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author domingo
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    // Clases asociadas: Libro.java | ListaLibros.java
    public static void main(String[] args) {
        ListaLibros catalogo = new ListaLibros();
        ListaLibros catalogo2 = new ListaLibros();
        
        catalogo.insertarLibro(new Libro("123", "La muerte en programación", "Planeta", 10, 0.9));
        catalogo.insertarLibro(new Libro("1234", "La muerte en programación", "Planeta", 10, 0.19));
        catalogo.insertarLibro(new Libro("1235", "La muerte en programación", "Planeta", 10, 0.29));
        catalogo.insertarLibro(new Libro("1236", "La muerte en programación", "Planeta", 10, 0.39));

                
        
        catalogo.imprimirConsola();
        
        System.out.println("Tamaño de catalago: " + catalogo.getTotalLibros());
        
        Libro libro = catalogo.buscarISBN2("1234");
        
        System.out.println("Libro localizado: " + libro);
        
        catalogo.borrarLibro(new Libro("1235", "" ,"" ,0,0));
        
        catalogo.imprimirConsola();
        
        catalogo.buscarPorPrecio(0.19).forEach(System.out::println);
        
    }
    
}
