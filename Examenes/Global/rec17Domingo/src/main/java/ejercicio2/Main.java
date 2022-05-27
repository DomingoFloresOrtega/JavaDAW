/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
        List<Informe> listaInforme = LecturaCSV.leerInforme("indicator.csv");
        
        // Apartado C
        for (Informe i : listaInforme) {
            System.out.println(i);
        }
        
        // Apartado D
        
        // Apartado F
        Path directorio = Paths.get("./municipios");

        try {
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
                System.out.println("Se ha creado el directorio");
            }

        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void escribirCsv(String nombre) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            
            
        
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
