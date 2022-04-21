/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas.tarea7a;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        String idFichero = "RelPerCen.csv";
        String[] tokens;
        String linea;
        ArrayList<Pojo> lista = new ArrayList<>();

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                Pojo p1 = new Pojo();
                tokens = linea.split(",");
               
                p1.setEmpleado((tokens[0] + tokens[1]).substring(1, tokens[4].length() - 1));
                p1.setDni(tokens[2].substring(1, tokens[4].length() - 1));
                p1.setPuesto(tokens[3].substring(1, tokens[4].length() - 1));
                p1.setFechaToma(LocalDate.parse(tokens[4].substring(1, tokens[4].length() - 1), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                
                if (tokens[5].length() <= 0) {
                    p1.setFechaCese(LocalDate.now());
                } else {
                    p1.setFechaCese(LocalDate.parse(tokens[5].substring(1, tokens[5].length() - 1), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                }
               
                p1.setTelefono(tokens[6].substring(1, tokens[4].length() - 1));
                
                if (tokens[7].substring(1, tokens[4].length() - 1).equals("Sí")) {
                    p1.setEvaluador(true);
                } else {
                    p1.setEvaluador(false);
                }
                
                if (tokens[8].substring(1, tokens[4].length() - 1).equals("Sí")) {
                    p1.setCoordinador(true);
                } else {
                    p1.setCoordinador(false);
                }
                System.out.println(p1.getEmpleado());
                System.out.println(p1.getDni());
                System.out.println(p1.isEvaluador());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
