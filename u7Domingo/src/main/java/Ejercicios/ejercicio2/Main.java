/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio2;

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
        
        String idFichero = "teclado.txt";
        Scanner teclado = new Scanner(System.in);
        Boolean terminar = true;
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            while (terminar){
                System.out.println("Introduzca texto:");
                String texto = teclado.nextLine();
                
                if (texto.equals("EOF")){
                    terminar = false;
                } else {
                    flujo.write(texto);
                    flujo.newLine();
                }
            }
            
            flujo.flush();
            System.out.println("Fichero " + idFichero + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
