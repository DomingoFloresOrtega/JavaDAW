package tarea5E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejercito {

        private Set<Soldado> ejercito;

        public Ejercito(){
            this.ejercito = new HashSet<>();
        }

        public int saberNumeroSoldados(){
            return ejercito.size();
        }

        public void alistarSoldado(Soldado soldado){
            ejercito.add(soldado);
        }

        public boolean estaVacio(){
            return ejercito.isEmpty();
        }

        public boolean estaEjercito(Soldado soldado){
            return ejercito.contains(soldado);
        }

        public ArrayList<Soldado> mostrarEjercitoArray(){
            return new ArrayList<>(ejercito);
        }

        public void desmatricularSoldado(Soldado soldado){
            ejercito.remove(soldado);
        }

        public void mostrarLista() {
            for (Soldado soldado : ejercito) {
                System.out.println(soldado);
            }
        }
}
