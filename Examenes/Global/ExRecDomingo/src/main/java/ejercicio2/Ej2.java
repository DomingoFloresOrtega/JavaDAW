/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = true;
        int dia = 0, mes = 0, anio = 0;
        do {
            dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un número"));
            if (dia < 1 || dia > 31) {
                salir = true;
            } else {
                mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca otro número"));
                if (mes < 1 || mes > 12) {
                    salir = true;
                } else {
                    anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un número más"));
                }
                salir = false;
            }
        } while (salir);

        // Generar fecha
        LocalDate fecha1 = generarFecha(dia, mes, anio);

        // Imprimir en formato Martes 11 de Junio de 2019
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("E d 'de' L 'de' y");
        System.out.println(fecha1.format(formato1));

        // Generar fecha aleatoria
        LocalDate fecha2 = generarFechaAleatoria();

        // Imprimir en formato Martes 11 de Junio de 2019
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("E d 'de' L 'de' y");
        System.out.println(fecha2.format(formato1));

        // Diferencia de fechas
        System.out.println("La diferencia entre fechas es de: " + fecha2.until(fecha1).getDays() + " días " + fecha2.until(fecha1).getMonths()
                + " meses " + fecha2.until(fecha1).getYears() + " años ");
    }

    public static LocalDate generarFecha(int dia, int mes, int anio) {
        LocalDate fecha = LocalDate.of(anio, mes, dia);

        return fecha;
    }

    public static LocalDate generarFechaAleatoria() {

        Random numA = new Random();

        int anio = numA.nextInt(2050 - 1900 + 1) - 1900;
        int mes = numA.nextInt(12 - 1);
        int dia = numA.nextInt(31 - 1);

        if (mes % 2 == 0) {
            if (mes == 2) {
                dia = numA.nextInt(29 - 1);
            } else {
                dia = numA.nextInt(30 - 1);
            }
        }

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        return fecha;
    }

}
