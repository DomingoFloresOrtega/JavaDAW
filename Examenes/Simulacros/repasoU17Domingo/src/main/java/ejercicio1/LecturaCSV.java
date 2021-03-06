/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author domingo
 */
public class LecturaCSV {
    public static TreeMap leerCSV(String nombreFichero, String rutaFichero){
        
        String[] tokens;
        String linea;
        TreeMap mapeo = new TreeMap();

        System.out.println("Leyendo el fichero: " + rutaFichero);

        try (Scanner datosFichero = new Scanner(new File(rutaFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                
                for (String string : tokens) {
                    mapeo.put(tokens[0], tokens[1]);
                    System.out.println(tokens[0]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return mapeo;
    }
}
