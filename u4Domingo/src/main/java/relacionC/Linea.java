/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class Linea {
    
    private PuntoGeometrico puntoa;
    private PuntoGeometrico puntob;
    private double distancia;

    public Linea() {
        
    }

    public Linea(PuntoGeometrico puntoa, PuntoGeometrico puntob) {
        this.puntoa = puntoa;
        this.puntob = puntob;
    }
    
    public void mueveDerecha(double distancia){
        this.distancia = distancia;
        
    }
    
    public void mueveIzquierda(double distancia){
        this.distancia = distancia;
    }
    
    public void mueveArriba(double distancia){
        this.distancia = distancia;
    }
    
    public void mueveAbajo(double distancia){
        this.distancia = distancia;
    }
}
