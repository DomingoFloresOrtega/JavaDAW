/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarlos.backendjavajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;

public class Json {

    public ArrayList<Libro> stringToList(String json) throws JsonProcessingException {
        ObjectMapper mapeador = new ObjectMapper();

        ArrayList<Libro> catalogo = mapeador.readValue(json,
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Libro.class));
        
        return catalogo;
    }
    
    public Libro stringToPojo(String json) throws JsonProcessingException {
        ObjectMapper mapeador = new ObjectMapper();

        Libro libro = mapeador.readValue(json,Libro.class);
        
        return libro;
    }
}
