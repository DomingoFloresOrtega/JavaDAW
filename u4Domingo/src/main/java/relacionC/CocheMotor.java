/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class CocheMotor {
    private boolean encendido;
    private double cilindrada;

    public CocheMotor() {
    }

    public CocheMotor(boolean encendido, double cilindrada) {
        this.encendido = encendido;
        this.cilindrada = cilindrada;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void arrancar() {
        this.encendido = true;
    }
    
    public void parar() {
        this.encendido = false;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "CocheMotor{" + "encendido=" + encendido + ", cilindrada=" + cilindrada + '}';
    }
}
