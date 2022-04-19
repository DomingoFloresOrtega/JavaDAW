/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
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
        String idFichero = "ficherito.txt";
        Random numero = new Random();
        String abecedario = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for(int i = 0; i <= 75;i++){
                int numeroAleatorio = numero.nextInt(abecedario.length());
                Character letra = abecedario.charAt(numeroAleatorio);
                if (letra.equals('G') || letra.equals('g')){
                    flujo.write(letra);
                    flujo.newLine();
                } else {
                    flujo.write(letra + ";");
                } 
            }
            
            flujo.flush();
            System.out.println("Fichero " + idFichero + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
