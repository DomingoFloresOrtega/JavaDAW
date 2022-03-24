/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospropuestos;

import ejercicios.Libro;
import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class ListaProductos {
    private ArrayList<Productos> lista;
    
    public ListaProductos(){
        this.lista = new ArrayList<>();
    }
    
    public void insertarProducto(Productos producto){
        if (producto != null){
            lista.add(producto);
        }
    }
    
    public void imprimirConsola(){
        System.out.println("Imprimiendo productos...");
        for (int i = 0; i < lista.size(); i++){
            System.out.println("Producto nº" + (i+1) + ": " + lista.get(i));
        }
    }
    
    public int getTotalProductos(){
        return lista.size();
    }
    
    public boolean borrarProducto(Productos producto){
        if (lista.contains(producto)){
            lista.remove(producto);
            return true;
        }
        return false; // Tambien sirviria, return lista.remove(libro);
    }
    
    public Productos buscarProductoNumSerie(String numeroserie){
        Productos aux = null;
        
        for (int i=0; i < lista.size(); i++){
            aux = lista.get(i);
            if (aux.getNumSerie().equals(numeroserie)){
                return aux;
            }
        }
        return aux;
    }
    
    public void modificarProducto(Productos producto, Productos nuevoproducto){
      String numSerie = nuevoproducto.getNumSerie();
      String nombreProducto = nuevoproducto.getProducto();
      String descripcion = nuevoproducto.getDescripcion();
      double precio = nuevoproducto.getPrecio();
      
      // Cambio valores
      producto.setNumSerie(numSerie);
      producto.setProducto(nombreProducto);
      producto.setDescripcion(descripcion);
      producto.setPrecio(precio);
    } 
}
