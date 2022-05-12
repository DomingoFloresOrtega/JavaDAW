/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.io.FileNotFoundException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author domingo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        /*
         NO FUNCIONA

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("precipitacionesBadajoz.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String fecha = (String) jsonObject.get("fecha");
            System.out.println(fecha);

            String estacionMeteorologica = (String) jsonObject.get("estacionMeteorologica");
            System.out.println(estacionMeteorologica);

            String provincia = (String) jsonObject.get("provincia");
            System.out.println(provincia);

            String precipitacion = (String) jsonObject.get("precipitacion");
            System.out.println(precipitacion);

            JSONArray tiempo = (JSONArray) jsonObject.get("tiempo");
            for (Object c : tiempo) {
                System.out.println(c + "");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
         */
        
        // Mostrar map
        Map<String, String> mapeo = consultarPrecipitacion("2", "3");
        for (String string : mapeo.keySet()) {
            System.out.println("Estación: " + string);
            System.out.println("Precipitaciones: " + mapeo.get(string));
        }

    }

    public static Map<String, String> consultarPrecipitacion(String estacion, String precipitacion) {
        Map<String, String> mapeo = new HashMap<>();

        mapeo.put(estacion, precipitacion);

        return mapeo;
    }
}
