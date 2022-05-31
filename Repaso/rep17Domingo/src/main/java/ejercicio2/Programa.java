package ejercicio2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class Programa {
    public static void main(String[] args) {
        // Apartado C
        List<Porcentajes> lista = LecturaCSV.leerPorcentajes("indicator.csv");
        for (Porcentajes p :
                lista) {
            System.out.println(p.toString());
        }
    }
}
