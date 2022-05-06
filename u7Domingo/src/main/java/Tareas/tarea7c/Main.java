/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.tarea7c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author domingo
 */
public class Main {
    public static void ordenarTituloCantante(ArrayList<Horarios> lista) {

        Comparator<Horarios> criterioDia = (Horarios c1, Horarios c2) -> c1.getDiaSemana().compareTo(c2.getDiaSemana());
        Comparator<Horarios> criterioHora = (Horarios c1, Horarios c2) -> c1.getHora().compareTo(c2.getHora());
        Comparator<Horarios> criterioDiaHora = criterioDia.thenComparing(criterioHora);

        Collections.sort(lista, criterioDiaHora);
    }

    public static void menu(Set<String> listaGrupos, Set<String> listaProfes) {

        Scanner teclado = new Scanner(System.in);
        try {

            System.out.println("Seleccione la opción que desee:"
                    + "\n1. Iniciales del profesorado"
                    + "\n2. Grupos"
                    + "\n3. Salir");

            int opciones = teclado.nextInt();

            switch (opciones) {
                case 1:
                    
                    System.out.println("");
                    for (String listaGrupo : listaGrupos) {
                        System.out.println(listaGrupo);
                    }
                    
                    System.out.println("\n\nInserte un grupo");
                    String grupo = teclado.next();
                    
                    if(){
                    
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Hasta la próxima.");
                    break;
                default:
                    System.out.println("Introduzca 1 o 2 por favor");

            }

        } catch (Exception e) {

            System.out.println("Ha introducido una letra en lugar de un número");

        }
    }

    public static void main(String[] args) {

        Set<String> listaGrupos = new TreeSet<>();
        Set<String> listaProfes = new TreeSet<>();

        //Lista de objetos 
        ArrayList<Horarios> listaHoras = Lectura.leerFicheros("horario.csv");
        ordenarTituloCantante(listaHoras);

        for (Horarios listaHora : listaHoras) {
            listaGrupos.add(listaHora.getCurso());
            listaProfes.add(listaHora.getProfesor());
        }

        //PARTE A
        menu(listaGrupos, listaProfes);
    }

}
