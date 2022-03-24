/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;

import herencia.Centro;
import herencia.Docente;
import herencia.Privado;
import herencia.Publico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author domingo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Centros públicos
        Centro p1 = new Publico("200000", "IES San Martin", "S34231234", "Calle Fernando");
        Centro p2 = new Publico("100000", "IES Mares Calidos", "F23413256", "Calle Martinez Muñoz");

        // Centros privados
        Centro pr1 = new Privado(1000, "IES Privado N1", "S23907846", "Calle Nosedonde");
        Centro pr2 = new Privado(2000, "IES Pequeño", "S21009789", "Calle Antonio Martin");

        // Docentes
        Centro d1 = new Docente("Antonio", "Martinez", "27456908L", "Matematicas", "190000", "IES Perezoso", "S23145420", "Calle Mafalda");
        Centro d2 = new Docente("Francisco", "Ramos", "39092314R", "Lengua", "400000", "IES Rosaleda", "S31003230", "Calle Malaga");

        // Creo ArrayList de objetos de tipo Centro
        ArrayList<Centro> listaMalaga = new ArrayList<>();

            // Agrego centros publicos
            listaMalaga.add(p1); // Conversión implicita (publico -> centro)
            listaMalaga.add(p2); // Conversión implicita (publico -> centro)

            // Agrego centros privados
            listaMalaga.add(pr1); // Conversión implicita (privado -> centro)
            listaMalaga.add(pr2); // Conversión implicita (privado -> centro)

            // Agrego docentes
            listaMalaga.add(d1); // Conversión implicita (docente -> centro)
            listaMalaga.add(d2); // Conversión implicita (docente -> centro)

        // Ordenar lista con comparator
        Collections.sort(listaMalaga, (Centro c1, Centro c2) -> c1.getNombre().compareTo(c2.getNombre()));
        
        // Recorro la lista
        for (Centro centro : listaMalaga) {
            // Llamo a metodos comunes entre clases
            System.out.println("=== Llamada a metodo comun ===");
            System.out.println(centro.getNombre() + ", " + centro.director());
            System.out.println("=== Fin de llamada a metodo comun ===");
            System.out.println(" ");
            
            // Llamo a metodos especificos de las clases
            if (centro instanceof Docente){
                Docente auxDocente = (Docente) centro; // Conversión explicita
                System.out.println("El numero de asignaturas impartidas es: " + auxDocente.numeroMaterias());
            } else if (centro instanceof Publico){
                Publico auxPublico = (Publico) centro; // Conversión explicita
                System.out.println("El numero de materias ofertado es: " + auxPublico.numeroMaterias());
            } else if (centro instanceof Privado){
                Privado auxPrivado = (Privado) centro; // Conversión explicita
                auxPrivado.ofertaEducativa();
            }
        }
    }
}
