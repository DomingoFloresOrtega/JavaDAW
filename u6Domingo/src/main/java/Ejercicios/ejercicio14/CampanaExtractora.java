/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio14;

/**
 *
 * @author domingo
 */
public class CampanaExtractora extends Electrodomestico {
    private double decibelios;

    public CampanaExtractora(double consumo, String modelo) {
        super(consumo, modelo);
    }

    public CampanaExtractora(double consumo, String modelo, double decibelios) {
        super(consumo, modelo);
        if (decibelios <= 50) {
            this.decibelios = decibelios;
        }
    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return super.toString() + "CampanaExtractora{" +
                "decibelios=" + decibelios +
                '}';
    }
}
