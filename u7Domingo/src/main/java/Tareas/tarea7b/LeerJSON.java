/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas.tarea7b;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class LeerJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<App> apps = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            apps.addAll(mapeador.readValue(new File("appJSON"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, App.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        apps.forEach(System.out::println);
    }
    
}
