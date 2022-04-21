/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio6;

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
        String idFichero = "vehiculos.txt";
        String[] tokens;
        String linea;
        int posicion = 0;

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();

                posicion = -1;
                tokens = linea.split(";");
                for (int i = 0; i < tokens.length-2; i++) {
                    if (tokens[i].equalsIgnoreCase("w")&&tokens[i+1].equalsIgnoreCase("e")
                            &&tokens[i+2].equalsIgnoreCase("b")){
                        posicion = 1;
                    }
                }
                
                System.out.println(posicion);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
