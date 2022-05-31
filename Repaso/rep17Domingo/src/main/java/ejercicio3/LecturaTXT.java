package ejercicio3;


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
        int contadorX = 0;
        int contadorA = 0;

        try (Scanner datosFichero = new Scanner(new File(nombre))) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split("\n");

                for (int i = 0; i < tokens.length; i++) {
                    if (tokens[i] == "a") {
                        contadorA++;
                    } else {
                        contadorX++;
                    }
                } else{
                    System.out.println("sdasd");
                }
            }
        }
        System.out.println(contadorX);
    }
} catch(FileNotFoundException e){
        System.out.println(e.getMessage());
}
        }
