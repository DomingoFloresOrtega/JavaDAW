/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.io.FileNotFoundException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

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

            JSONObject jsonObject =  (JSONObject) obj;

            String fecha = (String) jsonObject.get("fecha");
            System.out.println(fecha);

            String estacionMeteorologica = (String) jsonObject.get("estacionMeteorologica");
            System.out.println(estacionMeteorologica);

            String provincia = (String) jsonObject.get("provincia");
            System.out.println(provincia);
            
            String precipitacion = (String) jsonObject.get("precipitacion");
            System.out.println(precipitacion);

            JSONArray cars = (JSONArray) jsonObject.get("cars");
            for (Object c : cars)
    {
      System.out.println(c+"");
    }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */
    }
    
}
