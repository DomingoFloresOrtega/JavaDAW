/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author domingo
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    /* Clases asociadas: ListaReproduccion.java | Cancion.java */
    public static void main(String[] args) {
        
        ListaReproduccion lista1 = new ListaReproduccion();
        // Agregamos canciones
        lista1.grabarCancion(new Cancion("A Camara Lenta", "Abraham Mateo", "2019", "A Camara Lenta"));
        lista1.grabarCancion(new Cancion("Repetiamos", "Abraham Mateo", "2021", "Repetiamos"));
        lista1.grabarCancion(new Cancion("Slow Down", "Selena Gomez", "2013", "Stars Dance"));
        lista1.grabarCancion(new Cancion("Tengo La Camisa Negra", "Juanes", "2004", "Tengo La Camisa Negra"));
        lista1.grabarCancion(new Cancion("Te Necesito", "Maria Becerra", "2021", "Te Necesito"));
        lista1.grabarCancion(new Cancion("Te Necesito", "Cali y el Dandee", "2014", "Te Necesito"));
        
        // Imprimir lista
        lista1.imprimirLista(lista1);
        
        System.out.println("-----------------------");
        
        // Eliminar cancion
        lista1.eliminarCancion(new Cancion("Tengo La Camisa Negra", "Juanes", "2004", "Tengo La Camisa Negra"));
        
        // Imprimir lista nueva
        lista1.imprimirLista(lista1);
        
        System.out.println("-----------------------");
        
        // Escuchar cancion
        lista1.escucharCancion(2);
        
        System.out.println("-----------------------");
        
        // Buscar cancion
        int cancionLocalizada = lista1.buscarCancion(new Cancion("Repetiamos", "Abraham Mateo", "2021", "Repetiamos"));
        System.out.println("La posición de la cancion es: " + cancionLocalizada);
        
        System.out.println("-----------------------");
        
        // Numero de canciones
        System.out.println("En la lista hay " + lista1.numeroCanciones() + " canciones");
        
        System.out.println("-----------------------");
        
        // Cambiar cancion
        lista1.cambiarCancion(3, new Cancion("Killa", "Lola Indigo", "2021", "La Niña"));
        
        System.out.println("-----------------------");
        
        // Muestro canciones
        lista1.imprimirLista(lista1);
        
        System.out.println("-----------------------");
        
        // Paso parametros con Comparator e imprimo
        lista1.ordenarNombreArtistas();
        lista1.imprimirLista(lista1);
        
        System.out.println("-----------------------");

        // Busqueda binaria por nombre
        int posicion2 = lista1.buscarCancionTitulo(new Cancion("Killa", "Lola Indigo", "2021", "La Niña"));
        System.out.println("Esta en la posición: " + posicion2);
    }
    
}
