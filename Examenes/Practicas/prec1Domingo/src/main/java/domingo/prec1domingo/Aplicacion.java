/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domingo.prec1domingo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Aplicacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = true;

        do {
            System.out.println("=== BIENVENIDO ===");
            System.out.println("Seleccione que desea hacer:");
            System.out.println("1. Mostrar matriz");
            System.out.println("2. Mostrar matriz espejo");
            System.out.println("3. Volcar matriz espejo en archivo");
            System.out.println("4. Ordenar matriz");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción:");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    leerMatrizTXT("matrizP.txt");
                    break;
                case 5:
                    System.out.println("Adios");
                    salir = false;
                    break;
            }
        } while (salir);
    }

    public static void leerMatrizTXT(String nombre) {
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + nombre);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombre), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(",");

                // Creo matriz
                int[][] matriz = new int[tokens.length][tokens.length];

                for (int i = 0; i < tokens.length; i++) {
                    for (int x = 0; x < 7; x++) {
                        matriz[i][x] = Integer.parseInt(tokens[x]);
                        System.out.println("Valor [" + i + "][" + x + "] = " + matriz[i][x]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
