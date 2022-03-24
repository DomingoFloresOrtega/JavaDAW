/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio3;

/**
 *
 * @author domingo
 */
public class Empleado extends Persona {
    private double salario;

    public Empleado() {
        // Internamente llama al constructor padre
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String getAtributos(){
        return super.getAtributos() + "Salario:" + this.salario;
    }
    
    public void aumentarSalario(double cantidad){
        this.salario = salario + cantidad;
    }
}
