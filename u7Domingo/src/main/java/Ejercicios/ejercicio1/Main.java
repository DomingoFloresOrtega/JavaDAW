/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author domingo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creo variables
        String idFichero = "matriz.txt";
        int numero;
        int matriz[][] = new int[4][4];

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for (int i = 0; i < matriz.length; i++) {
                numero = 100 * (i + 1);
                matriz[i][0] = numero;

                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = numero + j;
                    flujo.write(String.valueOf(matriz[i][j]) + "\t");
                }

                // Inserto nueva linea
                flujo.newLine();
            }

            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
