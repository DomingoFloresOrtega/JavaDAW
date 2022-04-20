/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio5;

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

        String idFichero = "matriz.txt";
        String[] tokens;
        String linea;
        int valor = 0;
        int suma = 0;

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();

                tokens = linea.split("\t");
                for (String string : tokens) {
                    valor += Integer.parseInt(string);
                }
                
                suma += valor;
                valor = 0;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("La suma del array es: " + suma);
    }
}