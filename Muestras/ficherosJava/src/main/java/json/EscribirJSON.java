
package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author JCarlos
 */
public class EscribirJSON {

    public static void main(String[] args) throws IOException {
        
        ObjectMapper mapeador = new ObjectMapper();
        
        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());
        
        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON el catálogo de muebles
        mapeador.writeValue(new File("catalogoMuebles.json"), generarCatalogo());
                
        // Escribe en un fichero JSON el catálogo de envíos
        mapeador.writeValue(new File("catalogoEnvios.json"), generarEnvios());
    }
    
    // Genera una lista con muebles
    public static ArrayList<MuebleVO> generarCatalogo(){
        ArrayList<MuebleVO> lista = new ArrayList<>();

        lista.add(new MuebleVO("C4", "Mesa comedor", 1, 2, 3, LocalDate.now()));
        lista.add(new MuebleVO("C5", "Mesa cocina", 3, 1, 2.2, LocalDate.now()));
        lista.add(new MuebleVO("C6", "Mesa terraza", 3, 3, 3, LocalDate.now()));
        lista.add(new MuebleVO("S1", "Silla madera", 0.5, 2, 3.3, LocalDate.now()));
        lista.add(new MuebleVO("S2", "Silla plástico", 0.5, 1.2, 3.3, LocalDate.now()));
        lista.add(new MuebleVO("S3", "Silla oficina", 2.5, 2, 1, LocalDate.now()));
        
        return lista;
    }
    
    // Genera una lista de envíos
    public static ArrayList<EnvioMuebles> generarEnvios(){
        ArrayList<EnvioMuebles> tmp = new ArrayList<>();
        
        tmp.add(new EnvioMuebles(1,"C/Lucena", "Pepe Flores", generarCatalogo()));
        tmp.add(new EnvioMuebles(2,"C/Estepona", "Luisa Márquez", generarCatalogo()));
        tmp.add(new EnvioMuebles(3,"C/Granada", "María López", generarCatalogo()));
        tmp.add(new EnvioMuebles(4,"C/Jaén", "Lucas Fernández", generarCatalogo()));
        tmp.add(new EnvioMuebles(5,"C/Sevilla", "Antonio Paz", generarCatalogo()));
        
        return tmp;
    }
}
