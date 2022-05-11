/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import static java.util.logging.Logger.global;

/**
 *
 * @author domingo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tokens;
        String linea;
        TreeMap mapeo = new TreeMap();

        System.out.println("Leyendo el fichero: " + "nombresModulos.csv");

        try (Scanner datosFichero = new Scanner(new File("nombresModulos.csv"), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                
                for (String string : tokens) {
                    mapeo.put(tokens[0], tokens[1]);
                    System.out.println(tokens);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
