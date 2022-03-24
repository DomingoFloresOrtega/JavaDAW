/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaramos e inicializamos constantes
        final int HORASTOTALESDOCENTES = 150;
        final int HORASMASTER = 975;

        // Creamos Scanner
        Scanner entradaTeclado = new Scanner(System.in);

        // Preguntamos al usuario el número de grupos y lo almacenamos en una variable
        System.out.println("Introduzca el número de grupos de los másteres a impartir: ");
        int numGrupos = entradaTeclado.nextInt();

        // Creamos variable y almacenamos resultado de la operación
        int horasTotalesMaster = HORASMASTER * numGrupos;

        // Calculamos los profesores necesarios y lo guardamos en una variable
        double profesoresSolicitud = (double) horasTotalesMaster / (double) HORASTOTALESDOCENTES;

        // Redondeamos el número de profesores
        double profesoresTotalesConvertir = Math.ceil(profesoresSolicitud);
        int profesoresTotales = (int) profesoresTotalesConvertir;
        
        // Sacamos mensaje por pantalla
        System.out.println("Según los datos, el número de profesores necesario será de " + profesoresTotales + " profesores");

    }

}
