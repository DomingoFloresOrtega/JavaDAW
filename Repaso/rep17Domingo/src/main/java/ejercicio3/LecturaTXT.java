package ejercicio3;


import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturaTXT {
    public static void lecturaTXT(String nombre) {
        List<Matriz> lista = new ArrayList<>();
        String[] tokens;
        String linea;
        String[][] array = {};

        try (Scanner datosFichero = new Scanner(new File(nombre))) {
            while (datosFichero.hasNextLine()) {
                System.out.println("hola");
                linea = datosFichero.nextLine();
                tokens = linea.split("\n");

                for (int i = 0; i < tokens.length; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.println(tokens[i]);
                        array[i][j] = tokens[i];
                    }
                }

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.println(array[i][j]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
