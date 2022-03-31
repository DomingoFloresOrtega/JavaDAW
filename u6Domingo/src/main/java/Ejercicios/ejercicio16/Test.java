/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio16;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author domingo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Robot> lista = new ArrayList<>();

        for (int i = 0; i < 19; i++) {
            lista.add(new Robot());
        }
        
        // Lista ordenada
        Collections.sort(lista);
        System.out.println("-- Despues de ordenar --");
        for (Robot robot : lista) {
            System.out.println(robot);
        }

        // Robots con mas de 50 de vida
        System.out.println("--- Lista de robots con mas de un 50% de vida ---");
        for (Robot robot : lista) {
            if (robot.getVida() >= 50) {
                System.out.println(robot);
            }
        }

        // Imprimir el numero de serie de los tres robots
        for (Robot robot : lista) {
            System.out.println(robot);
        }
    }

}
