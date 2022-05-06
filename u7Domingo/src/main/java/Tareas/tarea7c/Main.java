/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.tarea7c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        //Scanner para usarlo en las opciones
        Scanner teclado = new Scanner(System.in);
        try {

            System.out.println("Inserte 1, 2 o 3 dependiendo de la opción:"
                    + "\n1.Iniciales del profesorado"
                    + "\n2.Grupos"
                    + "\n3.Salir");

            int opciones = teclado.nextInt();

            switch (opciones) {
                case 1:
                    
                    System.out.println("");
                    for (String listaGrupo : listaGrupos) {
                        System.out.println(listaGrupo);
                    }
                    
                    System.out.println("\n\nInserte un grupo del que quiera un fichero CSV");
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

        //Estructuras set necesarios para el ejercicio
        Set<String> listaGrupos = new TreeSet<>();
        Set<String> listaProfes = new TreeSet<>();

        //Lista de objetos 
        ArrayList<Horario> listaHoras = leerFicheros("Horario.csv");
        ordenarTituloCantante(listaHoras);

        for (Horario listaHora : listaHoras) {
            listaGrupos.add(listaHora.getCurso());
            listaProfes.add(listaHora.getInicialesProfesor());
        }

        //PARTE A
        /*
        
        Si el usuario selecciona b), el programa mostrará los grupos que hay en el instituto, 
        para que el usuario elija uno. Una vez proporcionado el grupo, 
        el programa guardará en un fichero csv, en la raíz del proyecto, 
        el horario seleccionado, si existe. El nombre del fichero estará compuesto 
        por las iniciales del grupo en cuestión y la extensión del archivo. 
        Por ejemplo, para el grupo 1DAW, el archivo se llamará 1DAW.csv.
         */
        menu(listaGrupos, listaProfes);
    }

}
