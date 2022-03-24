/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domingo;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Preguntamos al usuario el tiempo
        System.out.println("Introduzca tiempo en segundos");
        int tiempo = teclado.nextInt();
        
        // Convertimos segundos a minutos
        final double SEGUNDOS_MINUTOS = 60;
        
        // Convertimos minutos a horas
        final double MINUTOS_HORAS = (SEGUNDOS_MINUTOS * 1) / 60;
        
        // Calculamos
        double horas = ((tiempo/SEGUNDOS_MINUTOS)/MINUTOS_HORAS);
        double minutos = (horas - (int)horas)*60;
        double segundos = (minutos - (int)minutos)*60;
        
        System.out.println("Ha elegido " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
