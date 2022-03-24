/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospropuestos;

import ejercicios.ListaLibros;

/**
 *
 * @author domingo
 */
public class MainProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaProductos catalogo = new ListaProductos();

        // Inserto productos
        catalogo.insertarProducto(new Productos("234907564908", "Monitor DELL", "Monitor 32'", 200.00));
        catalogo.insertarProducto(new Productos("987645367820", "Torre HP", "Torre destinada a juegos", 1000.00));
        catalogo.insertarProducto(new Productos("108746392090", "Raton Logitech", "Raton por cable", 20.00));
        catalogo.insertarProducto(new Productos("586940392819", "Mando Xbox", "Mando", 60.00));
        catalogo.insertarProducto(new Productos("239048572138", "Mando TV", "Mandos para televisión", 30.00));

        // Imprimo productos
        catalogo.imprimirConsola();

        System.out.println("-----------------");

        // Tamaño del catalogo actual
        System.out.println("El tamaño actual del catalogo es: " + catalogo.getTotalProductos());

        System.out.println("-----------------");

        // Busqueda de productos
        Productos productoLocalizado = catalogo.buscarProductoNumSerie("987645367820");
        System.out.println("El producto buscado es: " + productoLocalizado);

        System.out.println("-----------------");

        // Borrar producto
        System.out.println("Borrando producto seleccionado...");
        catalogo.borrarProducto(new Productos("234907564908", "Monitor DELL", "Monitor 32'", 200.00));

        System.out.println("-----------------");

        // Modificar producto
        System.out.println("Modificando producto seleccionado...");
        catalogo.modificarProducto(new Productos("239048572138", "Mando TV", "Mandos para televisión", 30.00), new Productos("345618743829", "Monitor HP", "Monitor 24'", 150.00));

        System.out.println("-----------------");

        // Imprimo productos nuevos
        catalogo.imprimirConsola();
    }

}
