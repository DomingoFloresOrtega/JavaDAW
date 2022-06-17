/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = true;
        int vacasFila = 0;
        
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("=== PROGRAMA DE FRED ===");
            System.out.println("Hola Fred, ¿cuantas vacas tienes en la fila de entrada?");
            System.out.println("Por cierto Fred, si quieres salir pon 0.");
            System.out.println("=== PROGRAMA DE FRED ===");
            try {
                vacasFila = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("¡Muy mal Fred!. No introduzcas letras");
            }

            if (vacasFila != 0) {
                // Creo fila
                FilaVacas fila = new FilaVacas(vacasFila);

                // Vacas Angus
                System.out.println("=== VACAS | RAZA: ANGUS ===");
                System.out.println("Total vacas --> " + fila.contarAngus());
                System.out.println("Total vacas macho --> " + fila.contarAngusMacho());
                System.out.println("Total vacas hembra --> " + fila.contarAngusHembra());
                System.out.println("¿Tiene pareja? --> " + fila.emparejarAngus());

                // Vacas Beresford
                System.out.println("=== VACAS | RAZA: BERESFORD ===");
                System.out.println("Total vacas --> " + fila.contarBeresford());
                System.out.println("Total vacas macho --> " + fila.contarBeresfordMacho());
                System.out.println("Total vacas hembra --> " + fila.contarBeresfordHembra());
                System.out.println("¿Tiene pareja? --> " + fila.emparejarBeresford());

                // Mostrar vacas
                System.out.println("=== VACAS | RAZA: TODAS ===");
                mostrarVacas(fila);

                // Pánico
                if (panico(fila) == true) {
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!! FRED HA ENTRADO EN PÁNICO !!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                } else {
                    System.out.println("Fred está bien");
                }
            } else {
                System.out.println("¡Hasta luego Fred!");
                salir = false;
            }
        } while (salir);
    }

    public static boolean panico(FilaVacas fila) {
        boolean panico = false;

        for (Vaca v : fila.getListaVacas()) {
            if (fila.emparejarAngus() == false && fila.emparejarBeresford() == false) {
                panico = true;
            }
        }

        return panico;
    }

    public static void mostrarVacas(FilaVacas fila) {

        System.out.println("Mostrando vacas...");
        for (Vaca v : fila.getListaVacas()) {
            System.out.println(v.toString());
        }

    }
}
