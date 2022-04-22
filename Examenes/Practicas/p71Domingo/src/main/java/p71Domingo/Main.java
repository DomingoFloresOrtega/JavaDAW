/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p71Domingo;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
        ArrayList<Pojo> lista = new ArrayList<>();
        Map<String, Integer> listaProfesores = new HashMap();
        Map<String, Integer> listaMap = new TreeMap();

        // Lectura de fichero y guardado en lista
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                Pojo p1 = new Pojo();
                tokens = linea.split(",");
               
                p1.setEmpleado(noComillas((tokens[0] + tokens[1])));
                p1.setDni(noComillas(tokens[2]));
                p1.setPuesto(noComillas(tokens[3]));
                p1.setFechaToma(LocalDate.parse(noComillas(tokens[4]), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                
                if (noComillas(tokens[5]).length() <= 0) {
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
                
                lista.add(p1);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Muestro lista
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        // Convierto lista a map
        
        int contadorDepartamento = 1;
        for (Pojo profesor : lista) {
            if (listaProfesores.containsKey(profesor.getPuesto())) {
                contadorDepartamento++;
                listaProfesores.put(profesor.getPuesto(), contadorDepartamento);
            } else {
                contadorDepartamento = 1;
                listaProfesores.put(profesor.getPuesto(), contadorDepartamento);

            }
        }
        
        listaMap = listaProfesores;
        
        // Muestro lista por departamento y guardo en archivo
        String idFichero2 = "profesoresPorDepartamento.txt";

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero2))) {
            flujo.write("Departamentos\tNúmero\n");
            for (String key : listaMap.keySet()) {
                flujo.write(key + " \t " + listaMap.get(key));
                flujo.newLine();
            }

            flujo.flush();
            System.out.println("Fichero " + idFichero2 + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        // Guardo en un fichero aquellos empleados que hayan trabajado mas de 100 dias
        LocalDate fechaini = LocalDate.of(2020, 1, 1);
        LocalDate fechafin = LocalDate.of(2021, 12, 31);
        
        Scanner teclado = new Scanner(System.in);
        String idFichero3 = "profesoresMasAntiguos.csv";

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero3))) {
            flujo.write("Nombre\tDNI/Pasaporte\tPuesto\tFecha de Toma\tFecha de Cese\tTeléfono\tEvaluador\tCoodinador");
            flujo.newLine();
            for (Pojo pp : lista) {
                if (pp.getFechaToma().isAfter(fechaini) && pp.getFechaCese().isBefore(fechafin)) {
                    if (ChronoUnit.DAYS.between(fechaini, fechafin) >= 100) {
                        flujo.write(pp.toString());
                        flujo.newLine();
                    }
                }
            }
 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
