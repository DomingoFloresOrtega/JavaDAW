/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package granja;

import java.util.Random;

/**
 *
 * @author domingo
 */
public enum Raza {
    ANGUS("Angus", 3300),
    BERESFORD("Beresford", 2000);
    
    private String tipo;
    private double precio;

    private Raza(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Raza{" + "tipo=" + tipo + ", precio=" + precio + '}';
    }
    
    public static Raza randomRaza(){
        int pick = new Random().nextInt(Raza.values().length);
        return Raza.values()[pick];
    }
}
