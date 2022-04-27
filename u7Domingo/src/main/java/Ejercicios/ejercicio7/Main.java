/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio7;

import Ejercicios.ejercicio4.Vehiculo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        ArrayList<Vehiculo> array = new ArrayList<>();

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();

                tokens = linea.split("\t");
                for (String string : tokens) {
                    for (int i = 0; i < tokens.length; i++){
                        
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
