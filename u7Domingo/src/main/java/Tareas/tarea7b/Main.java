/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas.tarea7b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author domingo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();
        
        // Creo apps y agrego a lista
        for (int i = 0; i < 50; i++){
            lista.add(new App());
        }
        
        // Lecturas
            // Leer fichero txt
        String idFicheroTXT = "appsTXT.txt";
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroTXT))) {
            for (Object l : lista) {
                flujo.write(l.toString());
                flujo.newLine();
            }
            
            flujo.flush();
            System.out.println("Fichero " + idFicheroTXT + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        // Leer fichero XML
        String idFicheroXML = "appsXML.xml";
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroXML))) {
            for (Object l : lista) {
                flujo.write(l.toString());
                flujo.newLine();
            }
            
            flujo.flush();
            System.out.println("Fichero " + idFicheroXML + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        // Leer fichero JSON
        String idFicheroJSON = "appsXML.json";
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroJSON))) {
            for (Object l : lista) {
                flujo.write(l.toString());
                flujo.newLine();
            }
            
            flujo.flush();
            System.out.println("Fichero " + idFicheroJSON + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
