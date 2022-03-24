/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class TestCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        System.out.println(cuenta1.getNumCuenta());
        
        System.out.println(cuenta1.getNIF());
        
        System.out.println(cuenta1.getSaldoActual());
        
        System.out.println(cuenta1.retirarEfectivo(40));
        
        System.out.println(cuenta1.toString());
    }
    
}
