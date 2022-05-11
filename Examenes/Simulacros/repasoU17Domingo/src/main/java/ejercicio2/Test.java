/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<RegistroJSON> registros = LecturaJSON.leerFicheroJSON("calificacionesGrupo.json");
        
        for (RegistroJSON r : registros) {
            System.out.println(r);
        }
    }
    
}
