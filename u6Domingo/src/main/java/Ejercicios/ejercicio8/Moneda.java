package Ejercicios.ejercicio8;

import java.util.Random;

public class Moneda extends Azar {

    private Random random;

    public Moneda() {
        random = new Random();
    }

    @Override
    public int lanzar() {
        return random.nextInt(2) + 1;
    }
}
