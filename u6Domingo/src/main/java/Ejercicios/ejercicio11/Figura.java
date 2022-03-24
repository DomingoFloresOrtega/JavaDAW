/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio11;

/**
 *
 * @author domingo
 */
public class Figura {
    protected double base;
    protected double altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    public double calcularArea(){
        double resultado;
        
        resultado = base * altura;
        
        return resultado;
    }
}
