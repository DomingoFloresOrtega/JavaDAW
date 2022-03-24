/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package teoria;

/**
 *
 * @author domingo
 */
public enum Pizza {
    
    BARBACOA(22, "Barbacoa cream", new String[]{"Carne","Bacon","Queso","BBQ"}, 13.0);
    
        
    // No son constantes por lo que se queda asi
    private final int tamanio;
    private final String nombre;
    private final String[] ingredientes;
    private final double precio;

    private Pizza(int tamanio, String nombre, String[] ingredientes, double precio) {
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }


    
}
