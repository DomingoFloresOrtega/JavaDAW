package Ejercicios.ejercicio8;

import java.util.Random;

public class Dado extends Azar{
    
    private Random random;
    
    public Dado() {
        random = new Random();
    }

    @Override
    public int lanzar() {
        return random.nextInt(2) + 1;
    }
}
