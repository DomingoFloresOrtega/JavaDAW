
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author domingo
 */
public class Copiar {
    Path origen = Paths.get(rutaOrigen); // Pasar por parametro o indicar
    Path destino = Paths.get(rutaDestino); // Pasar por parametro o indicar
        
    try {
        Files.copy(origen, destino);
    } catch (IOException e) {
        System.out.println("Existe un problema al copiar el archivo");
        System.out.println(e.toString());
    }
}
