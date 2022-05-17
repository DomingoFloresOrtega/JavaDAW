/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo.p81domingo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author domingo
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CentrosDAO daoCentros = new CentrosDAO();
        List<CentrosVO> listaCentros = new ArrayList<>();
        listaCentros.add(new CentrosVO(200, "Gibraltar", "Calle Sin 8", "39004"));
        listaCentros.add(new CentrosVO(201, "Sin rumbo", "Calle Las Amapolas 3", "29340"));
        listaCentros.add(new CentrosVO(202, "Suspenso", "Avenida de Alboran 5", "50100"));

        try {
            // Insertar centros
            daoCentros.insertCentro(listaCentros);

            // Actualizar centros
            daoCentros.updateCentro(201, new CentrosVO(220, "Con rumbo", "Calle Naves Industriales 1", "29001"));

            // Eliminar centros
            daoCentros.deleteCentro(new CentrosVO(200, "Gibraltar", "Calle Sin 8", "39004"));

            // Mostrar centros
            List<CentrosVO> nuevaLista = daoCentros.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D -------------");
            nuevaLista.forEach(System.out::println);

        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }
    }
}
