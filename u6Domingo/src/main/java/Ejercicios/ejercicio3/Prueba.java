/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio3;

/**
 *
 * @author domingo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Pepe","34214567U",20);
        Empleado empleado = new Empleado(2000,"Antonio","21347856Y",24);
        Programador programador = new Programador(Categorias.ANALISTA,2000,"Maria","56987123J",27);
        
        System.out.println(persona.getAtributos());
        System.out.println(empleado.getAtributos());
        System.out.println(programador.getAtributos());
    }
    
}
