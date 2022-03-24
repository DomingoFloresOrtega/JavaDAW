package tarea5E;

import java.util.HashMap;
import java.util.Map;

public class TestEjercito {
    public static void main(String[] args) {

        Map<String, Ejercito> mapping = new HashMap();
        Ejercito ejercito = new Ejercito();

        //Añadimos objets a la lista
        ejercito.alistarSoldado(new Soldado("15456987L", "Mario", "Martinez", "Perez", 23));
        ejercito.alistarSoldado(new Soldado("89654782K", "Maria", "Fernández", "Fernandez", 40));
        ejercito.alistarSoldado(new Soldado("96320124M", "Manuel", "Benitez", "Palacios", 20));
        mapping.put("00001", ejercito);
        Ejercito ejercito2 = new Ejercito();

        //Añadimos objeros a la lista
        ejercito2.alistarSoldado(new Soldado("15456987L", "Maria", "Martinez", "Perez", 23));
        ejercito2.alistarSoldado(new Soldado("89654782K", "Mario", "Fernández", "Fernandez", 40));
        ejercito2.alistarSoldado(new Soldado("96320124M", "Manuela", "Benitez", "Palacios", 20));
        mapping.put("00002", ejercito2);

        System.out.println("====== Lista 1 ======");
        ejercito.mostrarLista();
        System.out.println("====== Lista 2 ======");
        ejercito2.mostrarLista();
    }
}
