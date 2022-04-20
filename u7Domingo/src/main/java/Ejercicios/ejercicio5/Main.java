/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
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

        String idFichero = "fichero.txt";

        String[] tokens;
        String linea;

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();

                tokens = linea.split(";");
                for (String string : tokens) {
                    System.out.print(string + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
