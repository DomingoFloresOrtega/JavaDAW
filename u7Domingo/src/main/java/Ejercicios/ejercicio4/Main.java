/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author domingo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> lista = new ArrayList<>();

        // Creo turismos
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));
        lista.add(new Turismo(312333L, "9837UIK", "Ford", "Fiesta", "Rojo", 2, 3, true));

        // Creo deportivos
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));
        lista.add(new Deportivo(2314L, "3214OWQS", "Seat", "Ibiza", "Blanco", 20, 200));

        // Creo Furgonetas
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));
        lista.add(new Furgoneta(1890L, "2140LER", "Citroen", "C4", "Negro", 10, 30, 10));

        // Introducir datos en fichero
        String idFichero = "vehiculos.txt";

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for (Vehiculo v : lista) {
                if (v instanceof Turismo){
                    flujo.write("0;" + v.toString() + ";");
                    flujo.newLine();
                } else if(v instanceof Deportivo){
                    flujo.write("1;" + v.toString() + ";");
                    flujo.newLine();
                } else {
                    flujo.write("2;" + v.toString() + ";");
                    flujo.newLine();
                } 
            }

            flujo.flush();
            System.out.println("Fichero " + idFichero + " generado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}