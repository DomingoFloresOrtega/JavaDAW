/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fichero
        String idFichero = "jugadas.txt";

        // Escribo el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for (int i = 0; i < 14; i++) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduzca la jugada");
                String texto = teclado.nextLine();
                flujo.write(texto);
                flujo.newLine();
            }

            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
