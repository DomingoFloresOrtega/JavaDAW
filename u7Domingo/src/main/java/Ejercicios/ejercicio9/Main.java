/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio9;

import Ejercicios.ejercicio4.Deportivo;
import Ejercicios.ejercicio4.Furgoneta;
import Ejercicios.ejercicio4.Turismo;
import Ejercicios.ejercicio4.Vehiculo;

import java.io.*;
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
        String idFichero = "vehiculos.txt";
        String ficheroT = "turismos.txt";
        String ficheroD = "deportivos.txt";
        String ficheroF = "furgonetas.txt";
        String[] tokens;
        String linea;
        ArrayList<Turismo> arrayT = new ArrayList<>();
        ArrayList<Deportivo> arrayD = new ArrayList<>();
        ArrayList<Furgoneta> arrayF = new ArrayList<>();

        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();

                tokens = linea.split(";");

                switch (Integer.parseInt(tokens[0])) {
                    case 0:
                        Turismo t1 = new Turismo();
                        t1.setBastidor(Long.parseLong(tokens[1]));
                        t1.setMatricula(tokens[2]);
                        t1.setMarca(tokens[3]);
                        t1.setModelo(tokens[4]);
                        t1.setColor(tokens[5]);
                        t1.setTarifa(Double.parseDouble(tokens[6]));
                        t1.setDisponible(Boolean.parseBoolean(tokens[7]));
                        t1.setPuertas(Integer.parseInt(tokens[8]));
                        t1.setMarchaAutomatica(Boolean.parseBoolean(tokens[9]));
                        arrayT.add(t1);
                        break;
                    case 1:
                        Deportivo d1 = new Deportivo();
                        d1.setBastidor(Long.parseLong(tokens[1]));
                        d1.setMatricula(tokens[2]);
                        d1.setMarca(tokens[3]);
                        d1.setModelo(tokens[4]);
                        d1.setColor(tokens[5]);
                        d1.setTarifa(Double.parseDouble(tokens[6]));
                        d1.setDisponible(Boolean.valueOf(tokens[7]));
                        d1.setCilindrada(Integer.parseInt(tokens[8].substring(0, tokens[8].length() - 1)));

                        arrayD.add(d1);
                        break;
                    case 2:
                        Furgoneta f1 = new Furgoneta();
                        f1.setBastidor(Long.parseLong(tokens[1]));
                        f1.setMatricula(tokens[2]);
                        f1.setMarca(tokens[3]);
                        f1.setModelo(tokens[4]);
                        f1.setColor(tokens[5]);
                        f1.setTarifa(Double.parseDouble(tokens[6]));
                        f1.setDisponible(Boolean.valueOf(tokens[7]));
                        f1.setCarga(Integer.parseInt(tokens[8]));
                        f1.setVolumen(Integer.parseInt(tokens[9].substring(0, tokens[9].length() - 1)));
                        arrayF.add(f1);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Creo ficheros
            // Turismos
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(ficheroT))) {
            for (Turismo t : arrayT) {
                flujo.write(t.toString() + ";");
                flujo.newLine();
            }

            flujo.flush();
            System.out.println("Fichero " + ficheroT + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
            // Deportivos
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(ficheroD))) {
            for (Deportivo d : arrayD) {
                flujo.write(d.toString() + ";");
                flujo.newLine();
            }

            flujo.flush();
            System.out.println("Fichero " + ficheroD + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
            // Furgonetas
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(ficheroF))) {
            for (Furgoneta f : arrayF) {
                flujo.write(f.toString() + ";");
                flujo.newLine();
            }

            flujo.flush();
            System.out.println("Fichero " + ficheroF + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
