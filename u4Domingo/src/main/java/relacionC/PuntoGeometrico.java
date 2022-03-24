/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class PuntoGeometrico {
    private int coordenadax;
    private int coordenaday;

    public PuntoGeometrico() {
    }

    public PuntoGeometrico(int coordenadax, int coordenaday) {
        this.coordenadax = coordenadax;
        this.coordenaday = coordenaday;
    }

    public int getCoordenadax() {
        return coordenadax;
    }

    public int getCoordenaday() {
        return coordenaday;
    }

    public void setCoordenadax(int coordenadax) {
        this.coordenadax = coordenadax;
    }

    public void setCoordenaday(int coordenaday) {
        this.coordenaday = coordenaday;
    }

    @Override
    public String toString() {
        return "PuntoGeometrico{" + "coordenadax=" + coordenadax + ", coordenaday=" + coordenaday + '}';
    }
    
    
}
