
package xml;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author JCarlos
 */
public class EscribirCatalagoMueblesXML {
    
    public static void main(String[] args) throws JAXBException {
        
        // Se preparan los objetos a utilizar, en esta caso un catálogo
        ArrayList<Mueble> listaM = generarListaMuebles(10);
        CatalogoMuebles catalogo = new CatalogoMuebles();
        catalogo.setLista(listaM);
        catalogo.setDescripcion("Mi catalogo");
       
        // Crea el contexto JAXB. Se encarga de definir los objetos 
        // que vamos a guardar. En nuestro caso sólo el tipo CatalogoMuebles
        JAXBContext contexto = JAXBContext.newInstance(CatalogoMuebles.class);
        
        // El contexto JAXB permite crear un objeto Marshaller, que sirve para
        // generar la estructura del fichero XML 
        // El proceso de pasar objetos Java (CatalogoMuebles) a ficheros XML 
        // se conoce como "marshalling" o "serialización"
        Marshaller serializador = contexto.createMarshaller();
        
        // Especificamos que la propiedad del formato de salida
        // del serializador sea true, lo que implica que el formato se 
        // realiza con indentación y saltos de línea
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Llamando al método de serialización marshal (sobrecargado) se pueden
        // serializar objetos java en formato XML y volcarlos donde necesitemos:
        // consola, ficheros. El proceso consiste en que el contexto es el 
        // encargo de leer los objetos java, pasarlos al serializador y éste 
        // crear la salida de serialización
        
        // Serialización y salida por consola
        serializador.marshal(catalogo, System.out);

        // Volcado al fichero xml
        serializador.marshal(catalogo, new File("catalogo.xml"));
    }
    
    // Genera una lista de numMuebles muebles
    public static ArrayList<Mueble> generarListaMuebles(int numMuebles) {

        ArrayList<Mueble> catalogo = new ArrayList<>();

        for (int i = 10; i <= numMuebles + 10; i++) {
            catalogo.add(new Mueble(i));
        }

        return catalogo;
    }
    
}
