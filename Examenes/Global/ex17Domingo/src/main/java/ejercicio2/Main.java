/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
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
        // Ubicación del fichero
        String idFichero = "escaleraColor.txt";

        String[] tokens;
        String linea;
        Map<String, String> rondas = new HashMap<>();
        

        // Empiezo a leer el fichero
        System.out.println("Leyendo el fichero: " + idFichero);

        try (Scanner datosFichero = new Scanner(new File(idFichero), "us-ascii")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(" ");
                for (String string : tokens) {
                    // Inserto rondas en Map
                    rondas.put(tokens[0], tokens[1]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    } 
}
