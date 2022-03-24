/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio3;

/**
 *
 * @author domingo
 */
public class Programador extends Empleado {
    private Categorias categoria;

    public Programador() {
    }

    public Programador(Categorias categoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String getAtributos(){
        return super.getAtributos() + "Categoria:" + this.categoria;
    }
    
}
