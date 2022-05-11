/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class LecturaJSON {
    public static ArrayList<RegistroJSON> leerFicheroJSON(String idFichero) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        ArrayList<RegistroJSON> listaJson = mapeador.readValue(new File(idFichero),
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));
        System.out.println("\n************** NOTAS *****************");
        for (RegistroJSON p : listaJson) {
            System.out.println(p);
        }
        
        return listaJson;
    }
}
