/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas.tarea7a;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
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
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
Pojo p1 = new Pojo();
                tokens = linea.split(",");
                for (String string : tokens){  
                    p1.setEmpleado(tokens[0]+tokens[1]);
                    p1.setDni(tokens[2]);
                    p1.setPuesto(tokens[3]);
                    
                }
                System.out.println(p1.getEmpleado());
                System.out.println(p1.getDni());
                System.out.println(p1.getPuesto());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
