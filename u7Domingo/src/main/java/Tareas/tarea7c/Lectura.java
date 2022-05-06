/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.tarea7c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Lectura {
    
    private static String comilla(String s) {
        String quitarComilla = s.substring(1, s.length() - 1);
        return quitarComilla;
    }

    //Método el cual lee los ficheros y guarda los vehiculos en una lista de objetos
    public static ArrayList<Horarios> leerFicheros(String idFichero) {

        System.out.println("Leyendo el fichero: " + idFichero);

        String[] tokens;
        String linea;
        ArrayList<Horarios> listaHorario = new ArrayList<>();

        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {

            datosFichero.nextLine();

            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                Horarios tmp = new Horarios();

                tmp.setNumFila(Integer.parseInt(tokens[0].substring(1)));
                tmp.setCurso(comilla(comilla(tokens[1])));
                tmp.setProfesor(comilla(tokens[2].substring(1, tokens[2].length() - 3)));
                tmp.setAsigantura(comilla(tokens[3].substring(1, tokens[3].length() - 1)));
                if (!comilla(comilla(tokens[4].substring(0, tokens[4].length() - 2))).contains("  ")) {
                    tmp.setAula(comilla(comilla(tokens[4].substring(0, tokens[4].length() - 1))));
                } else {
                    tmp.setAula("No tiene aula");
                }

                // Saber el dia de la semana
                switch (Integer.parseInt(tokens[5])) {
                    case 1:
                        tmp.setDiaSemana("Lunes");
                        break;
                    case 2:
                        tmp.setDiaSemana("Martes");
                        break;
                    case 3:
                        tmp.setDiaSemana("Miércoles");
                        break;
                    case 4:
                        tmp.setDiaSemana("Jueves");
                        break;
                    case 5:
                        tmp.setDiaSemana("Viernes");
                        break;
                }

                // Saber la hora
                switch (Integer.parseInt(tokens[6].substring(0, tokens[6].length() - 1))) {
                    case 1:
                        tmp.setHora("1ª hora");
                        break;
                    case 2:
                        tmp.setHora("2ª hora");
                        break;
                    case 3:
                        tmp.setHora("3ª hora");
                        break;
                    case 5:
                        tmp.setHora("4ª hora");
                        break;
                    case 6:
                        tmp.setHora("5ª hora");
                        break;
                    case 7:
                        tmp.setHora("6ª hora");
                        break;
                    default:
                        tmp.setHora("Turno de Tarde");
                }

                listaHorario.add(tmp);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaHorario;
    }

}
