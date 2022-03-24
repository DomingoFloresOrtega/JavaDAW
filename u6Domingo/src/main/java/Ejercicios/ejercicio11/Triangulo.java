/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio11;

/**
 *
 * @author domingo
 */
public class Triangulo extends Figura {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public Triangulo() {
    }
    
    @Override
    public double calcularArea(){
        double resultado;
        
        resultado = (base * altura)/2;
        
        return resultado;
    }
}
