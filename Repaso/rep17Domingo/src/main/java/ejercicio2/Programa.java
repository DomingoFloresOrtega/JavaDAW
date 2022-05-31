package ejercicio2;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        // Apartado C
        System.out.println("========= APARTADO C ==========");
        List<Porcentajes> lista = LecturaCSV.leerPorcentajes("indicator.csv");
        for (Porcentajes p : lista) {
            System.out.println(p.toString());
        }

        // Apartado D (pendiente)
        System.out.println("========= APARTADO D =========");
        escribirCsv("porcentajes.csv", lista);

        // Apartado F
        System.out.println("======== APARTADO F =========");
        Path directorio = Paths.get("./municipios");

        try {
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
                System.out.println("Se ha creado el directorio");
            }

        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Apartado G
        System.out.println("======== APARTADO G =========");
        generarSubcarpetas(lista);
    }

    public static void escribirCsv(String nombre, List<Porcentajes> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            for (Porcentajes p : lista) {
                double promedio = (p.getAnio1996() + p.getAnio2001() + p.getAnio2006() + p.getAnio2010() + p.getAnio2016() + p.getAnio2015()
                        + p.getAnio2014() + p.getAnio2013() + p.getAnio2011()) / 9;
                if (promedio >= 50) {
                    bw.write(p.getMunicipio() + ";" + promedio);
                    bw.newLine();
                }
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void municipioMayor(List<Porcentajes> lista){
        for (Porcentajes p :
                lista) {
            System.out.println(p.getMunicipio());
        }
    }

    public static void generarSubcarpetas(List<Porcentajes> lista){

        try {
            for (Porcentajes p : lista) {
                if (p.getMunicipio().substring(0,1).equalsIgnoreCase("B")) {
                    Path directorio = Paths.get("municipios/" + p.getMunicipio());
                    if (!Files.exists(directorio)) {
                        Files.createDirectories(directorio);
                        System.out.println("Se ha creado el directorio de " + p.getMunicipio());
                    }
                }
            }
        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
