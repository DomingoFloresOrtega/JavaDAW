/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarlos.backendjavajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Programa {

    public static void main(String[] args) throws JsonProcessingException {
        
        String url1 = "http://www.etnassoft.com/api/v1/get/?any_tags=[html,css,javascript]&order=newest";
        String url2 = "http://www.etnassoft.com/api/v1/get/?id=589";
        mostrarLibros(url1);
        System.out.println("-------------------");
        mostrarLibros(url2);
    }
    

    public static void mostrarLibros(String url) {       
        String respuesta = "";
        ConexionHTTP conexion = new ConexionHTTP();
        Json mapeador = new Json();

        try {
            respuesta = conexion.peticionHttpGet(url);
            ArrayList<Libro> lista = mapeador.stringToList(respuesta);
            lista.forEach(l -> System.out.println(l.getiD() + " " + l.getTitle()));
        } catch (Exception e) {
            // Manejar excepción
            System.out.println("Error durante la conexión HTTP");
            e.printStackTrace();
        }
    }

}
