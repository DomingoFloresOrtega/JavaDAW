/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCarlos
 */
public class ProgramaPrincipal {

    public static final String FICHERO = "mueblesDAO.txt";

    public static void main(String[] args) {

        IMuebleDAO dao = new DaoMuebleFileTxt();
        // dao = DaoMuebleXML();
        // dao = DaoMuebleMySQL();

        List<MuebleVO> lista = new ArrayList<>();

        lista.add(new MuebleVO("C4", "Mesa comedor", 1, 2, 3));
        lista.add(new MuebleVO("C5", "Mesa cocina", 3, 1, 2.2));
        lista.add(new MuebleVO("C6", "Mesa terraza", 3, 3, 3));
        lista.add(new MuebleVO("S1", "Silla madera", 0.5, 2, 3.3));
        lista.add(new MuebleVO("S2", "Silla plástico", 0.5, 1.2, 3.3));
        lista.add(new MuebleVO("S3", "Silla oficina", 2.5, 2, 1));

        if (!Files.exists(Paths.get(FICHERO))) {
            crearFichero(FICHERO);
        }

        List<MuebleVO> listaN = dao.getAll();

        listaN.forEach(System.out::println);
        System.out.println("-------------------------------------");

        MuebleVO m = dao.findByPk("x3");
        System.out.println(m);
        System.out.println("-------------------------------------");

        dao.insertMueble(new MuebleVO("X1", "Cajonera básica", 0.5, 2, 3.3));
        listaN = dao.getAll();
        listaN.forEach(System.out::println);
        System.out.println("-------------------------------------");

        dao.insertMueble(lista);
        listaN = dao.getAll();
        listaN.forEach(System.out::println);
        System.out.println("-------------------------------------");

        dao.deleteMueble(new MuebleVO("X1", "Cajonera básica", 0.5, 2, 3.3));
        listaN = dao.getAll();
        listaN.forEach(System.out::println);
        System.out.println("-------------------------------------");

        dao.updateMueble("c4", new MuebleVO("C4", "Mueble auxiliar", 10, 10, 10));
        listaN = dao.getAll();
        listaN.sort((m1, m2) -> m1.getId().compareTo(m2.getId()));
        listaN.forEach(System.out::println);
        System.out.println("-------------------------------------");
    }

    // Este método genera un fichero vacío en la ruta especificada
    public static void crearFichero(String ruta) {
        Path file = Paths.get(ruta);
        try {
            Files.createFile(file);
        } catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear " + ruta + " porque ya existe");
        } catch (IOException e) {
            System.out.println("Problema creando el archivo " + ruta);
            System.out.println("Probablemente la ruta esté mal escrita.");
        }
    }

}
