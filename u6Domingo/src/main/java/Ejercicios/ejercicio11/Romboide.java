/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio11;

/**
 *
 * @author domingo
 */
public class Romboide extends Figura {

    public Romboide(double base, double altura) {
        super(base, altura);
    }

    public Romboide() {
    }
    
    @Override
    public double calcularArea(){
        double resultado;
        
        resultado = base * altura;
        
        return resultado;
    }
}
