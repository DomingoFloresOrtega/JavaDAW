/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author domingo
 */
public class CuentaAtras {
    public static void main(String[] arguments){
        cuentaAtras(3);
    }
    
    public static void cuentaAtras(int n){
        System.out.println(n);
        if (n>0){
            cuentaAtras(n-1);  // Al llegar a 0 parara y ejecuta la siguiente linea
        }
        System.out.println("Hola" + n);  // Devuelve el control a los demas
    }
}
