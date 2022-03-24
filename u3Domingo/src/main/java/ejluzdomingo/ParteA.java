/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejluzdomingo;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class ParteA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro Scanner
        Scanner teclado = new Scanner(System.in);

        // Declaro variables
        int consumoVatios;
        double consumoHoras;
        double precioKilo;
        
        // Creo bucle para que se tenga que introducir un valor
        do {
            // Pedimos consumo
            System.out.println("Introduzca el consumo en vatios");
            consumoVatios = teclado.nextInt();
        } while (consumoVatios <= 0 || consumoVatios > 4500);

        // if (consumoVatios >= 1 && consumoVatios <= 4500) {
            // Creo bucle para que se tenga que introducir un valor
            do {
                // Pedimos horas
                System.out.println("Introduzca las horas en funcionamiento");
                consumoHoras = teclado.nextDouble();
            } while (consumoHoras <= 0);

            // Creo bucle para que se tenga que introducir un valor
            do {
                // Pedimos precio kWh
                System.out.println("Introduzca el precio de los kWh");
                precioKilo = teclado.nextDouble();
            } while (precioKilo <= 0 || precioKilo >= 0.46);

            // Comprobamos intervalo de valores 
            // if (precioKilo >= 0.1 && precioKilo <= 0.45) {
                // Realizamos calculos
                double pasoKilovatios = consumoVatios * 0.001;
                double consumoTotal = pasoKilovatios * consumoHoras;
                double precioTotal = precioKilo * consumoTotal;
                System.out.println("===============================");
                System.out.printf("El consumo total es de %.2f € \n", precioTotal);
                System.out.println("===============================");
            } else {
                System.out.println("Ha introducido un rango incorrecto");
            }
        } else {
            System.out.println("Ha introducido un rango incorrecto. Rango: 1 - 4500");
        }
    }
}
