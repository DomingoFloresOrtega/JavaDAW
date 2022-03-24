/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo;

import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaramos e inicializamos constantes
        final int HORASTOTALESDOCENTES = 150;
        
        // Preguntamos al usuario el número de grupos
        String numGruposString = JOptionPane.showInputDialog(null, "Introduzca el número de grupos de los másteres a impartir:");
        // Convertimos String a double
        double numGruposDouble = Double.parseDouble(numGruposString);
        // Convertimos double a int
        int numGrupos = (int) numGruposDouble;
        
        // Preguntamos al usuario el número de horas anuales
        String numHorasString = JOptionPane.showInputDialog(null, "Introduzca el número de horas anuales de los másteres:");
        // Convertimos String a double
        double numHorasDouble = Double.parseDouble(numHorasString);
        // Convertimos double a int
        int numHoras = (int) numHorasDouble;
       
        // Creamos variable y almacenamos resultado
        int horasTotalesMaster = numHoras * numGrupos;
        
        // Calculamos los profesores necesarios
        double profesoresSolicitud = (double) horasTotalesMaster / (double) HORASTOTALESDOCENTES;
        
        // Redondeamos el número de profesores y convertimos a int
        double profesoresTotalesConvertir = Math.ceil(profesoresSolicitud);
        int profesoresTotales = (int) profesoresTotalesConvertir;
        
        // Sacamos mensaje por pantalla
        JOptionPane.showMessageDialog(null, "Según los datos, el número de profesores necesario será de " + profesoresTotales + " profesores");
    }
    
}
