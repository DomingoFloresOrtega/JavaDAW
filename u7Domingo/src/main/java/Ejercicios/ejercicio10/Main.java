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
        String rutaOrigen = ".";
        String rutaDestino = ".";
        String ficheroT = "./copias/turismos.txt";
        String ficheroD = "./copias/deportivos.txt";
        String ficheroF = "./copias/furgonetas.txt";
        String[] tokens;
        String linea;
        ArrayList<Vehiculo> array = new ArrayList<>();


        // Crear directorio
        Path directory = Paths.get(ruta);

        try {
            Files.createDirectory(directory);

        } catch (IOException ioe) {
            System.out.println("Problema creando el directorio " + ruta);
            System.out.println("Seguramente la ruta está mal escrita o no existe");

        } catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear " + ruta + " porque ya existe");

        } catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear " + ruta);
        }

        // Copiar archivos
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);
        try {
            Files.copy(origen, destino);
        } catch (IOException e) {
            System.out.println("Existe un problema al copiar el archivo");
            System.out.println(e.toString());
        }


        // Listar directorio
        File file = new File(ruta);

        if (file.exists()) {
            File[] ficheros = file.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }

        // Leer ficheros
        try (Scanner datosFichero = new Scanner(new File(ficheroT), "UTF-8")) {
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

        // Ordenar la lista
        array.sort((a1,a2)->a1.getBastidor().compareTo(a2.getBastidor()));

        // Imprimir lista
        for (Vehiculo v : array) {
            System.out.println(v.toString());
        }

        // Borrar ficheros
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

        // Listar directorio original
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
