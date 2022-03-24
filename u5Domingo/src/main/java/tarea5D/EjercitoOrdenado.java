package tarea5D;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjercitoOrdenado {
    public static void main(String[] args) {
        Set<Soldado> ejercito = new TreeSet<>();

        ejercito.add(new Soldado("34904589J","Antonio","Martinez","Muñoz",20));
        ejercito.add(new Soldado("23096489O","Pedro","Benitez","Muñoz",25));
        ejercito.add(new Soldado("12987048I","Mario","Martinez","Estrada",32));
        ejercito.add(new Soldado("90483920L","Adolfo","Perez","García",30));

        saberNumeroSoldados(ejercito);
        alistarSoldado(ejercito);
        estaVacio(ejercito);
        estaEjercito(ejercito);
        mostrarEjercitoArray(ejercito);
        desmatricularSoldado(ejercito);
    }

    public static void saberNumeroSoldados(Set<Soldado> ejercito){
        for (Soldado p : ejercito) {
            System.out.println(p);
        }
    }

    public static void alistarSoldado(Set<Soldado> ejercito){
        ejercito.add(new Soldado("89340987U", "Pepe", "Martinez","García",34));
    }

    public static boolean estaVacio(Set<Soldado> ejercito){
        return ejercito.isEmpty();
    }
    
    public static boolean estaEjercito(Set<Soldado> ejercito){
        return ejercito.contains(new Soldado("89340987U","Pepe","Martinez","García",34));
    }
    
    public static ArrayList mostrarEjercitoArray(Set<Soldado> ejercito){
        ArrayList<Soldado> arraySoldados= new ArrayList<>();
        
        for (Soldado p : ejercito) {
            arraySoldados.add(p);
        }
        
        return arraySoldados;
    }

    public static void desmatricularSoldado(Set<Soldado> ejercito){
        ejercito.remove(new Soldado("90483920L","Adolfo","Perez","García",30));
    }
}
