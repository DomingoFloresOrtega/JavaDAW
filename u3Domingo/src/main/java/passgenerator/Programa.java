/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passgenerator;

import java.util.Random;

/**
 *
 * @author domingo
 */
public class Programa {

    private static int generadorNumero() {
        Random numAlea = new Random();

        int numeroGenerado = numAlea.nextInt(10);

        return numeroGenerado;
    }

    private static int generadorLetra() {
        Random letraAlea = new Random();

        int letraGenerada = letraAlea.nextInt(19) + 'F';

        return letraGenerada;
    }

    public static void main(String[] args) {
        // Variables almacen
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        char car1;
        // Variables de control
        boolean suma = false, multi = false;

        // Genero numero 1
        num1 = generadorNumero();

        // Genero numero 2 y compruebo
        do {
            num2 = generadorNumero();
        } while (num2 == num1);

        // Genero numero 3 y compruebo
        do {
            num3 = generadorNumero();
        } while (num3 == num1 || num3 == num2);

        // Genero numero 4 y compruebo
        do {
            num4 = generadorNumero();
        } while (num4 == num1 || num4 == num2 || num4 == num3);

        // Genero letra
        car1 = (char) generadorLetra();

        // Realizo calculos y compruebo segun requisitos
        int sumaNum = num1 + num4;
        suma = (sumaNum % 2 == 1);
        int multiNum = num2 * num3;
        multi = (multiNum % 2 == 0);

        // Obtengo resultados
        if (suma && multi) {
            System.out.println("Contraseña valida: " + num1 + num2 + num3 + num4 + car1);
        } else {
            System.out.println("No se ha encontrado una contraseña valida");
        }
    }

}
