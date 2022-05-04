/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas.tarea7b;

import static Ejercicios.ejercicio10.Main.copiarFichero;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

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
        
        // Escritura
            // Escribir fichero txt
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
        
        // Escribir fichero XML (no se hacerlo)
        Apps apps = new Apps();
        apps.setAppList(lista);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Apps.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //Marshal the employees list in console
            jaxbMarshaller.marshal(apps, new File("appXML"));


        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
        // Escribir fichero JSON
        ObjectMapper mappeador = new ObjectMapper();

        mappeador.configure(SerializationFeature.INDENT_OUTPUT,true);

        try {
            mappeador.writeValue(new File("appJSON"),lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Copiar ficheros
        // Crear directorio
        String ruta = "./copias";
        Path directory = Paths.get(ruta);

        try {
            Files.createDirectory(directory);
        } catch (IOException ioe) {
            System.out.println("Problema creando el directorio " + ruta);
        }

        // Copiar archivos
        copiarFichero("./appsTXT.txt","./copias");
        copiarFichero("./appsXML.xml","./copias");
        copiarFichero("./appsJSON.json","./copias");
        
        // Leer JSON
        ArrayList<App> apps1 = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            apps1.addAll(mapeador.readValue(new File("appJSON"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, App.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void copiarFichero(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);
        try {
            Files.copy(origen, destino);
        } catch (IOException e) {
            System.out.println("Existe un problema al copiar el archivo");
            System.out.println(e.toString());
        }
    }
    
}
