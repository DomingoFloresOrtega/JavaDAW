package ficherosobjetos;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author JCarlos
 */
public class LeerObjetos {

    // Método que se encarga de abrir el fichero de ruta "idFichero"
    // y carga los objetos Persona en una lista, que devuelve
    public static ArrayList<Persona> leerPersonas(String idFichero) {

        ArrayList<Persona> personas = new ArrayList<>();
        FileInputStream fis;
        Persona tmp;

        try {
            fis = new FileInputStream(idFichero);

            // A partir del fichero anterior se crea el flujo para leer objetos
            // Estructura try-with-resources
            try (ObjectInputStream flujo = new ObjectInputStream(fis)) {
                // Devuelve el número estimado de bytes que hay por leer
                // o cero si se ha alcanzado el final del fichero
                while (fis.available() > 0) {
                    // Se hace un casting explícito del objeto devuelto
                    // por readObject()
                    tmp = (Persona) flujo.readObject();
                    // Añade el objeto a la lista
                    personas.add(tmp);
                }

            } catch (ClassNotFoundException | IOException e) { // Multicatch
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("EL fichero a leer no existe.");
        }

        return personas;

    }

    public static void main(String[] args) {

        ArrayList<Persona> personas = leerPersonas("persona.dat");
        personas.forEach(System.out::println);

    }

}
