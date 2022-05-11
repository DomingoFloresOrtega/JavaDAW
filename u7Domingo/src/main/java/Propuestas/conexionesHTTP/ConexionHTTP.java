/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Propuestas.conexionesHTTP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionHTTP {

    public String peticionHttpGet(String urlParaVisitar) throws Exception {
        // Aquí se guardará la respuesta (texto del json)
        String textoResultado = "";
      
        URL url = new URL(urlParaVisitar);

        // Abrir la conexión e indicar que será de tipo GET
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        
        // Flujo de lectura
        try (BufferedReader flujoEntrada = new BufferedReader(new InputStreamReader(conexion.getInputStream()))) {
            String linea;
            // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
            while ((linea = flujoEntrada.readLine()) != null) {
                textoResultado+=linea;
            }
        }
        return textoResultado;
    }
}
