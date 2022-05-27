/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class LecturaCSV {

    public static List<Informe> leerInforme(String nombre) {
        List<Informe> lista = new ArrayList<>();
        String[] tokens;
        String linea;

        try ( Scanner datosFichero = new Scanner(new File(nombre), "ISO-8859-1")) {
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");

                Informe i1 = new Informe();

                i1.setCodMunicipio(tokens[0]);
                i1.setMunicipio(tokens[1]);
                i1.setAnio2016(Double.parseDouble(tokens[2].replace(",", ".")));
                i1.setAnio2015(Double.parseDouble(tokens[3].replace(",", ".")));
                i1.setAnio2014(Double.parseDouble(tokens[4].replace(",", ".")));
                i1.setAnio2013(Double.parseDouble(tokens[5].replace(",", ".")));
                i1.setAnio2011(Double.parseDouble(tokens[6].replace(",", ".")));
                i1.setAnio2010(Double.parseDouble(tokens[7].replace(",", ".")));
                i1.setAnio2006(Double.parseDouble(tokens[8].replace(",", ".")));
                i1.setAnio2001(Double.parseDouble(tokens[9].replace(",", ".")));
                i1.setAnio1996(Double.parseDouble(tokens[10].replace(",", ".")));
                lista.add(i1);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }
}
