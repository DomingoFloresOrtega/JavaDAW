package Ejercicios.ejercicio14;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Silencioso> lista = new ArrayList<>();

        CampanaExtractora c1 = new Electrodomestico();
        Frigorifico f1 = new Electrodomestico();
        Microondas m1 = new Electrodomestico();

        lista.add(c1); // No se puede agregar a la lista ya que el objeto CampanaExtractora no es un objeto de tipo Silencioso
        lista.add(f1);
        lista.add(m1);
    }
}
