/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio12;

import Ejercicios.ejercicio3.Persona;

/**
 *
 * @author domingo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Cuenta 1
        Cuenta c1 = new CuentaCorriente(1.5, 2000, new Persona("Antonio","34568790P",21));
        
        c1.setSaldo(10000);
        System.out.println("Actualizar saldo:");
        c1.actualizarSaldo();
        System.out.println("Retirar saldo:");
        c1.retirar(200);
        System.out.println(c1.getSaldo());
        
        // Cuenta 2
        Cuenta c2 = new CuentaAhorro(10, 100, new Persona("Federico","2340980T",24));
        
        c2.setSaldo(3000);
        System.out.println("Retirar saldo:");
        c2.retirar(300);
        System.out.println(c2.getSaldo());
    }
}
