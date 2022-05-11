
package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JCarlos
 */
public class LeerJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        
        ArrayList<MuebleVO> catalogo = mapeador.readValue(new File("catalogoMuebles.json"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, MuebleVO.class));
        System.out.println("---- Catálogo de Muebles ----");
        for (MuebleVO muebleVO : catalogo) {
            System.out.println(muebleVO);
        }
        System.out.println("---- Catálogo de Muebles ----");
        
        ArrayList<EnvioMuebles> envios = mapeador.readValue(new File("catalogoEnvios.json"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, EnvioMuebles.class));
        System.out.println("\n");
        System.out.println("---- Catálogo de Envíos ----");
        for (EnvioMuebles envio : envios) {
            System.out.println(envio);
        }
        System.out.println("---- Catálogo de Envíos ----");
    }
    
}
