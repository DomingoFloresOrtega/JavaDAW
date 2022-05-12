/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author domingo
 */
public class Carta {
    // Atributos
    private Palos palo;
    private int numero;
    private Random random;

    // Metodo para generar cartas aleatorias
    public Carta generarCartaAleatoria() {
        int numPalo = random.nextInt(4) + 1;
        Carta carta = new Carta();
        switch (numPalo) {
            case 1:
                carta.setPalo(Palos.PICAS);
                carta.setNumero(random.nextInt(12) + 1);
                break;
            case 2:
                carta.setPalo(Palos.ROMBOS);
                carta.setNumero(random.nextInt(12) + 1);
                break;
            case 3:
                carta.setPalo(Palos.TREBOLES);
                carta.setNumero(random.nextInt(12) + 1);
                break;
            case 4:
                carta.setPalo(Palos.CORAZONES);
                carta.setNumero(random.nextInt(12) + 1);
                break;

        }

        return carta;
    }

    // Constructores, getter y setter
    public Carta() {
    }

    public Carta(Palos palo, int numero, Random random) {
        this.palo = palo;
        this.numero = numero;
        this.random = random;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.palo);
        hash = 59 * hash + this.numero;
        hash = 59 * hash + Objects.hashCode(this.random);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.palo != other.palo) {
            return false;
        }
        return Objects.equals(this.random, other.random);
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + ", random=" + random + '}';
    }
}
