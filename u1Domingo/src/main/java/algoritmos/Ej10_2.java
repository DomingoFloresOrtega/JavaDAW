/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Ej10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int PASOKILOMETROS = 1000;
        
        // Solicitamos al usuario los kilometros
        String kilometrosTexto = JOptionPane.showInputDialog(null,"Introduce los kilometros por hora");
        System.out.println(kilometrosTexto);
        
        // Transformamos string a double
        double kilometros = Double.parseDouble(kilometrosTexto);
        System.out.println(kilometros);
        
        // Solicitamos al usuario el tiempo
        String tiempoTexto = JOptionPane.showInputDialog(null,"Introduce el tiempo (en minutos)");
        System.out.println(kilometrosTexto);
        
        // Transformamos string a double
        double tiempo = Double.parseDouble(tiempoTexto);
        System.out.println(tiempo);
        
        // Realizamos calculos
        double conversionHoras = tiempo / 60;
        double distanciaRecorrida = kilometros * conversionHoras;
        double distanciaRecorridaMetros = distanciaRecorrida * PASOKILOMETROS;
        
        // Mostramos el resultado
        JOptionPane.showMessageDialog(null, "La distancia recorrida es de " + distanciaRecorridaMetros);
    }
    
}
