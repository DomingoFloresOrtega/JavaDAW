/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p62Domingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author domingo
 */
public class MiTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una lista de productos 
        // y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.
        
        ArrayList<Producto> listaProducto = new ArrayList<>();
        
        listaProducto.add(new LibroPapel(100, "203213124234", 10, 20, 17, "Bajas Tinieblas")); // Conversion implicita
        listaProducto.add(new LibroPapel(150, "342342121534325", 11, 40, 18, "La vida")); // Conversion implicita
        listaProducto.add(new LibroDigital(400, "23421341435236", 20, 40, 21, "Antonio y Pepa")); // Conversion implicita
        listaProducto.add(new LibroDigital(50, "123241243431243", 30, 50, 19, "Ay pequeño saltamontes")); // Conversion implicita
        listaProducto.add(new Pantalon("M", "Primark", 29, 30, 19, "Pantalon Estrasdfe")); // Conversion implicita
        listaProducto.add(new Pantalon("S", "Zara", 300, 50, 19, "Pantalon Deluxe-Crash")); // Conversion implicita
        listaProducto.add(new Musica("Rihanna", 200, 30, 18, "Only Girl")); // Conversion implicita
        listaProducto.add(new Musica("El Arrebato", 20, 40, 10, "New Album")); // Conversion implicita
        
        // Muestra los datos de los productos usando un foreach y el método toString(). 
        // Contesta usando un comentario en el código: ¿es toString() un método polimórfico? 
        // Justifica la respuesta.
        for (Producto producto : listaProducto) {
            System.out.println(producto);
        }
        
            // toString() es un metodo polimorfico ya que dependiendo del producto que creemos
            // modificará el mensaje de salida indicando los datos de dicho producto
        
        // Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> 
        // y una expresión lambda.
        Comparator <Producto> precios = new Comparator<Producto>() {
            @Override
            public int compare(Producto t, Producto t1) {
                return (int) (t.getPrecio() - t1.getPrecio());
            }
        };
        
        listaProducto.sort(precios);
        
        listaProducto.sort((Producto p1, Producto p2) -> (int) (p1.getPrecio() - p2.getPrecio()));
        
        // Muestra la lista de productos ordenados por precio.
        System.out.println("=== LISTA DE PRODUCTOS ORDENADOS POR PRECIO ===");
        for (Producto producto : listaProducto) {
            System.out.println(producto);
        }
        
        // Ordena la lista de productos según el código, haciendo uso de <<Comparator>> 
        // y una expresión lambda.
        
        Comparator <Producto> codigos = new Comparator<Producto>() {
            @Override
            public int compare(Producto t, Producto t1) {
                return (int) (t.getCodigo()- t1.getCodigo());
            }
        };
        
        listaProducto.sort(codigos);
        
        listaProducto.sort((Producto p1, Producto p2) -> p1.getCodigo() - p2.getCodigo());
        
        // Muestra la lista de productos ordenados por código.
        System.out.println("=== LISTA DE PRODUCTOS ORDENADOS POR CODIGO ===");
        for (Producto producto : listaProducto) {
            System.out.println(producto);
        }
        
        // Realiza la búsqueda binaria según su código de algún producto que 
        // exista dentro de la lista y otro que no exista, mostrando la posición que ocupa en la lista.
        
        // Collections.binarySearch(listaProducto, 20, codigos);
        
        
        // Recorre la lista de productos y guarda todos los libros en una lista de libros.
        ArrayList<Libro> listaLibros = new ArrayList<>();
        for (Producto producto : listaProducto) {
            if (producto instanceof Libro){
                listaLibros.add((Libro) producto); // Conversion explicita
            }
        }
        
        // Muestra los datos de la lista de libros usando un foreach y el método toString(). 
        System.out.println("=== LISTA DE LIBROS ===");
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro);
        }
        
        // Ordena los libros según ISBN, haciendo uso de <<Comparable>>.
        
        
        // Muestra la lista de libros ordenada. 
        System.out.println("=== LISTA DE LIBROS ===");
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro);
        };
        
        // Recorre de nuevo la lista de libros y en cada iteración, 
        // ejecuta enviar() o descargar() en función del tipo de libro.
        for (Libro listaLibro : listaLibros) {
            if (listaLibro instanceof LibroDigital){ // Conversion explicita
                ((LibroDigital) listaLibro).descargar();
            } else if (listaLibro instanceof LibroPapel){ // Conversion explicita
                ((LibroPapel) listaLibro).enviar("Calle San Martin");
            }
        };
        
        // Utiliza el método contains(Object) sobre la lista de libros para 
        // comprobar si existe un libro o no existe.
        
        listaLibros.contains(new LibroPapel(150, "342342121534325", 11, 40, 18, "La vida"));
        
        // Usando la lista de productos inicial, crea una nueva lista con todos 
        // los objetos del tipo <<SeEnvía>>.
        
        ArrayList<SeEnvia> lista2 = new ArrayList<>();
        
        for (Producto producto : listaProducto) {
            if (producto instanceof SeEnvia){ // Conversion explicita
                lista2.add((SeEnvia) producto);
            }
        }
        
        // Recorre la lista de objetos <<SeEnvía>> y llama al método de la interfaz.
        System.out.println("=== PEDIDOS ===");
        for (SeEnvia enviados : lista2) {
            enviados.enviar("Calle Martinez 8");
        }
    }
}
