/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tareas.tarea7b;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author domingo
 */
public class LeerXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<App> appList = new ArrayList<>();
        try {
            // Crea el contexto JAXB
            JAXBContext contexto = JAXBContext.newInstance(Apps.class);

            // Crea el objeto Unmarshaller
            Unmarshaller um = contexto.createUnmarshaller();

            // Llama al método de unmarshalling

           Apps apps = (Apps) um.unmarshal(new File("appXML"));
            appList.addAll(apps.getAppList());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
}
