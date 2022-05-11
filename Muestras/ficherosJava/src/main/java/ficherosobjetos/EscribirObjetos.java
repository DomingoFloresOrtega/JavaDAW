package ficherosobjetos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author JCarlos
 */

public class EscribirObjetos {

    public static void main(String[] args) {

        String idFichero = "persona.dat";
        
        // Estructura try-with-resources. Inicializa un objeto de tipo ObjectOutputStream
        // en función de un flujo FileOutputStream, identificado por "idFichero"
        try (ObjectOutputStream flujo = new ObjectOutputStream(new FileOutputStream(idFichero))) {
            flujo.writeObject(new Persona("Pepa", "1234", 12));
            flujo.writeObject(new Persona("Juan", "5678", 11));
            flujo.writeObject(new Persona("Luis", "1555554", 13));

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
