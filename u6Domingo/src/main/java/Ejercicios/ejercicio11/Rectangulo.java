/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio11;

/**
 *
 * @author domingo
 */
public class Rectangulo extends Figura {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public Rectangulo() {
    }
    
    @Override
    public double calcularArea(){
        double resultado;
        
        resultado = base * altura;
        
        return resultado;
    }
}
