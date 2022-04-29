/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio10;

import Ejercicios.ejercicio4.Deportivo;
import Ejercicios.ejercicio4.Furgoneta;
import Ejercicios.ejercicio4.Turismo;
import Ejercicios.ejercicio4.Vehiculo;

import java.io.*;
import java.nio.file.*;
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
        String ruta = "./copias";
        String rutaOriginal = "/";

        // Crear directorio
        Path directory = Paths.get(ruta);

        try {
            Files.createDirectory(directory);
        } catch (IOException ioe) {
            System.out.println("Problema creando el directorio " + ruta);
        //} catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear " + ruta + " porque ya existe");
        //} catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear " + ruta);
        }

        // Copiar archivos
        copiarFichero("./turismos.txt","./copias");
        copiarFichero("./deportivos.txt","./copias");
        copiarFichero("./furgonetas.txt","./copias");

        // Listar directorio
        File fileD = new File(ruta);

        if (fileD.exists()) {
            File[] ficheros = fileD.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }

        // Leer ficheros
        ArrayList<Vehiculo> array = leerFichero(ruta);

        // Ordenar la lista
        array.sort((a1, a2) -> a1.getBastidor().compareTo(a2.getBastidor()));

        // Imprimir lista
        for (Vehiculo v : array) {
            System.out.println(v.toString());
        }

        // Borrar ficheros
        borrarFichero(ruta);
        
        // Listar directorio original
        listarDirectorioOriginal(rutaOriginal);
        
        /********************
        ****** STREAMS ******
        ********************/
        
        // Imprime por pantalla todos los coches blancos, distintos, ordenador por matrícula.
        array.stream().filter(coche -> coche.getColor().equalsIgnoreCase("Blanco"))
                .distinct()
                .sorted((c1,c2)->c1.getMatricula().compareTo(c2.getMatricula()));
        array.forEach(System.out::println);
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

    public static void borrarFichero(String ruta) {
        Path element = Paths.get(ruta);

        try {
            Files.delete(element);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + ruta + " porque no existe");
        } catch (DirectoryNotEmptyException dnee) {
            System.out.println("No se puede borrar el directorio porque no está vacio");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + ruta);
        }
    }
    
    public static ArrayList<Vehiculo> leerFichero(String fichero){
        String[] tokens;
        String linea;
        ArrayList<Vehiculo> array = new ArrayList<>();
        
        try ( Scanner datosFichero = new Scanner(new File(fichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");

                for (String v : tokens) {
                    array.add(v);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return array;
    }
    
    public static void listarDirectorioOriginal(String rutaOriginal){
        File file = new File(rutaOriginal);

        if (file.exists()) {
            File[] ficheros = file.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }
}
