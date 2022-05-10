
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author domingo
 */
public class CrearTXT {
    String idFicheroTXT = "appsTXT.txt"; // Indicar nombre del archivo
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroTXT))) {
            // Escribir codigo correspondiente
            
            flujo.flush();
            System.out.println("Fichero " + idFicheroTXT + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}
