package ficherosbinarios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author JCarlos
 */
public class LeerEscribirBinarios {

    public static void main(String[] args) {

        final String ficheroOrigen = "logodaw.png";
        final String ficheroDestino = "copia.png";
        int cantidadBytes;
        // la constante TAM servirá para hacer lecturas y escrituras de 
        // 16 KB
        final int TAM = 1024 * 16;

        // Estructura try-with-resources para abrir el fichero origen
        try (BufferedInputStream flujoIn = new BufferedInputStream(new FileInputStream(ficheroOrigen))) {
            // Estructura try-with-resources para abrir el fichero destino
            try (BufferedOutputStream flujoOut = new BufferedOutputStream(new FileOutputStream(ficheroDestino))) {

                // Buffer para guardar los bytes leídos. El buffer es de 16KB (16 * 1024)
                byte[] buffer = new byte[TAM];

                // El siguiente método read() lee un número máximo de TAM bytes y los guarda en buffer,
                // comenzando en el byte 0. Además devuelve el número de bytes leídos o -1 si llega al final
                int contador = 1;
                while ((cantidadBytes = flujoIn.read(buffer, 0, TAM)) != -1) {
                    // El método write escribe cantidadBytes en el flujo volcando lo que hay en buffer
                    flujoOut.write(buffer, 0, cantidadBytes);
                    contador++;
                }
                System.out.println("El fichero se ha copiado correctamente. Se han necesitado " + contador
                        + " lecturas de 16Kb cada una para completar la copia");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("El fichero" + ficheroOrigen + "no existe.");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
