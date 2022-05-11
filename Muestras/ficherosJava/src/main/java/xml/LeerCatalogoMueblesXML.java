
package xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author JCarlos
 */
public class LeerCatalogoMueblesXML {
    
    public static void main(String[] args) throws JAXBException, 
            FileNotFoundException {

        // Crea el contexto JAXB 
        JAXBContext contexto = JAXBContext.newInstance(CatalogoMuebles.class);
        // Crea el objeto Unmarshaller
        Unmarshaller um = contexto.createUnmarshaller();

        // Llama al método de unmarshalling
        CatalogoMuebles catalogo = (CatalogoMuebles) um.unmarshal(new File("catalogo.xml"));

        ArrayList<Mueble> listaMuebles = catalogo.getListaMuebles();

        listaMuebles.forEach(System.out::println);
    }
}
