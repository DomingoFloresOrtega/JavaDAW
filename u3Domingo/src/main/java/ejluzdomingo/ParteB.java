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
public class ParteB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro Scanner
        Scanner teclado = new Scanner(System.in);

        // Declaro variables
        int consumoVatios;
        double horaPunta;
        double horaLlana;
        double horaValle;
        // Declaro e inicializo variables constantes
        final double PRECIOHORAPUNTA = 0.31;
        final double PRECIOHORALLANA = 0.27;
        final double PRECIOHORAVALLE = 0.18;

        do {
            // Pedimos consumo
            System.out.println("Introduzca el consumo en kW");
            consumoVatios = teclado.nextInt();
        } while (consumoVatios <= 0);

        if (consumoVatios >= 1 && consumoVatios <= 4500) {

            // Creo bucle para que se tenga que introducir un valor
            do {
                // Solicitamos hora punta
                System.out.println("Introduzca horas (en hora punta)");
                horaPunta = teclado.nextDouble();
            } while (horaPunta < 0);

            // Creo bucle para que se tenga que introducir un valor
            do {
                // Solicitamos hora llana
                System.out.println("Introduzca horas (en hora llana)");
                horaLlana = teclado.nextDouble();
            } while (horaLlana < 0);

            // Creo bucle para que se tenga que introducir un valor
            do {
                // Solicitamos hora valle
                System.out.println("Introduzca horas (en hora valle)");
                horaValle = teclado.nextDouble();
            } while (horaValle < 0);

            // Realizamos calculos
            double pasoKilovatios = consumoVatios * 0.001;
            double precioTotalHoraPunta = pasoKilovatios * horaPunta * PRECIOHORAPUNTA;
            double precioTotalHoraLlana = pasoKilovatios * horaLlana * PRECIOHORALLANA;
            double precioTotalHoraValle = pasoKilovatios * horaValle * PRECIOHORAVALLE;
            double precioTotal = precioTotalHoraPunta + precioTotalHoraLlana + precioTotalHoraValle;
            
            // Sacamos por consola resultados
            System.out.println("=====================================");
            System.out.printf("El precio en hora punta es de %.2f € \n", precioTotalHoraPunta);
            System.out.printf("El precio en hora llana es de %.2f € \n", precioTotalHoraLlana);
            System.out.printf("El precio en hora valle es de %.2f € \n", precioTotalHoraValle);
            System.out.printf("El precio total es de %.2f € \n", precioTotal);
            System.out.println("=====================================");

        } else{
            System.out.println("Ha introducido un rango incorrecto. Rango: 1 - 4500");
        }
    }
}
