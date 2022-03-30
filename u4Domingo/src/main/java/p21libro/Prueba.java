/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p21libro;

import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constructor por defecto
        LibroElectronico libro1 = new LibroElectronico();
        LibroElectronico libro2 = new LibroElectronico();
        
        // Mostramos con metodo toString()
        System.out.println("==============");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println("==============");
        
        // Constructor parametrizado
        LibroElectronico libroP1 = new LibroElectronico("333","Muerte",3000, 30);
        LibroElectronico libroP2 = new LibroElectronico("349","Vida",3000, 9);
        
        // Mostramos libros
        
            // Metodo toString()
            System.out.println(libroP1);
            System.out.println(libroP2);
            System.out.println("==============");
            
            // Metodo JOptionPane
            JOptionPane.showMessageDialog(null, libroP1);
            JOptionPane.showMessageDialog(null, libroP2);
            
        // Creación de libro (resultado error)
        LibroElectronico libroE1 = new LibroElectronico("800","Errores y mas errores",12000, 12);
        
        // Mostramos resultados
            // Metodo toString()
            System.out.println(libroE1);
            
            // Por consola
            System.out.println("El nuevo libro se denomina " + libroE1.getTitulo() + ", dispone de " + libroE1.getNumPaginas() + " páginas, pesa " + libroE1.getTamanio() + "MB. Numero de identificador: " + libroE1.getId());
            System.out.println("==============");
            
        // Modificamos el primer libro
        libro1.setNumPaginas(13000);
        
        // Mostramos resultados
            // Por toString()
            System.out.println(libro1);
            
            // Por consola
            System.out.println("El nuevo libro se denomina " + libro1.getTitulo() + ", dispone de " + libro1.getNumPaginas() + " páginas, pesa " + libro1.getTamanio() + "MB. Numero de identificador: " + libro1.getId());
            System.out.println("==============");
            
        // Modificamos el segundo libro
        libro2.setTamanio(15);
        
        // Mostramos resultados
            // Por toString()
            System.out.println(libro2);
            
            // Por consola
            System.out.println("El nuevo libro se denomina " + libro2.getTitulo() + ", dispone de " + libro2.getNumPaginas() + " páginas, pesa " + libro2.getTamanio() + "MB. Numero de identificador: " + libro2.getId());
            System.out.println("==============");
        
        // Prueba de metodos
            // pasarPagina()
            libroP1.pasarPagina();
            System.out.println(libroP1);
            
            // retrocederPagina()
            libroP1.retrocederPagina();
            System.out.println(libroP1);
            
            // saltar()
            libroP1.saltar(-3);
            System.out.println(libroP1);
    }
    
}
