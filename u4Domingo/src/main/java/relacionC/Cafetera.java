/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */

// Definición
public class Cafetera {
    // Atributos, campos o propiedades
    private double capacidadMaxima;
    private double cantidadActual;
    
    // Metodos
    
    //Constructores
    
    // Getter y Setter
    
    // Implicacion que tiene public y private en los miembros de una clase (atributos y metodos)
    
    // Encapsulamiento
    
    public Cafetera(){
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        
        if (capacidadMaxima < 10){
            this.capacidadMaxima = 10;
        }
        this.cantidadActual = this.capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        
        if (capacidadMaxima < 10){
            this.capacidadMaxima = 10;
        }
        this.cantidadActual = cantidadActual;
        if (this.cantidadActual > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(double cantidadAServir){
        double cantidadPositiva = Math.abs(cantidadAServir);
        if (cantidadPositiva > this.cantidadActual){
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= cantidadPositiva;
        }
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(double cantidadAgregar){
        this.cantidadActual = cantidadAgregar;
        if (this.cantidadActual > capacidadMaxima){
            this.cantidadActual = capacidadMaxima;
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
