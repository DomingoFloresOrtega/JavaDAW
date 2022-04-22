/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas.tarea7a;

import Ejercicios.ejercicio4.Deportivo;
import Ejercicios.ejercicio4.Turismo;
import Ejercicios.ejercicio4.Vehiculo;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static String noComillas(String p){
        String comillas = p.substring(1, p.length() - 1);
        return comillas;
    }

    public static void main(String[] args) {
        String idFichero = "RelPerCen.csv";
        String[] tokens;
        String linea;
        Map<String,Integer> lista = new HashMap();

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                Pojo p1 = new Pojo();
                tokens = linea.split(",");
               
                p1.setEmpleado(noComillas((tokens[0] + tokens[1])));
                p1.setDni(noComillas(tokens[2]));
                p1.setPuesto(noComillas(tokens[3]));
                p1.setFechaToma(LocalDate.parse(noComillas(tokens[4]), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                
                if (tokens[5].length() <= 0) {
                    p1.setFechaCese(LocalDate.now());
                } else {
                    p1.setFechaCese(LocalDate.parse(noComillas(tokens[5]), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                }
               
                p1.setTelefono(noComillas(tokens[6]));
                
                if (noComillas(tokens[7]).equals("Sí")) {
                    p1.setEvaluador(true);
                } else {
                    p1.setEvaluador(false);
                }
                
                if (noComillas(tokens[8]).equals("Sí")) {
                    p1.setCoordinador(true);
                } else {
                    p1.setCoordinador(false);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Muestro lista
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        // Muestro lista por departamento y guardo en archivo
        String idFichero2 = "profesoresPorDepartamento.txt";

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero2))) {
            flujo.write("Departamentos\tNúmero");
            //for (String key : lista) {
            //    flujo.write(key + " \t " + lista.get(key));
            //    flujo.newLine();
            //}

            flujo.flush();
            System.out.println("Fichero " + idFichero2 + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
