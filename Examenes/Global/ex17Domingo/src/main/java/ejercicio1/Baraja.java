/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author domingo
 */
public class Baraja {

    // Atributos
    private Set<Carta> baraja;
    private final int TAMANIO_BARAJA = 52;

    // Constructor por defecto
    public Baraja() {
        this.baraja = new TreeSet<>();
    }

    // Metodo para rellenar la baraja
    public void rellenarBaraja() {

        Carta carta = new Carta();

        for (int i = 0; i < TAMANIO_BARAJA; i++) {

            Carta aleatoria = carta.generarCartaAleatoria();

            if (!baraja.contains(aleatoria)) {
                baraja.add(aleatoria);
            } else {
                i--;
            }
        }
    }
}
