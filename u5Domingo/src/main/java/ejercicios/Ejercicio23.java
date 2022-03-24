package ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio23 {
    public static void rellenarNumerosAleatorios(int elementos, ArrayList<Integer> lista){
        Random aleatorio = new Random();
        
        for (int i = 0; i < elementos; i++){
            Integer aux = aleatorio.nextInt();
            lista.add(aux);
        }
    }
    
    public static ArrayList<Integer> rellenarNumerosAleatorios2(int elementos){
        Random aleatorio = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < elementos; i++){
            Integer aux = aleatorio.nextInt();
            lista.add(aux);
        }
        
        return lista;
    }
    
    
    public static void main(String[] args){
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        Random aleatorio = new Random();
        
        int lista1Long = aleatorio.nextInt(15)-5;
        int lista2Long = aleatorio.nextInt(20)-10;
        int numeros = aleatorio.nextInt(100)-50;

        // Equivalencia por metodo
        rellenarNumerosAleatorios(numeros, lista2);
        ArrayList<Integer> listaMetodo = rellenarNumerosAleatorios2(numeros);
        
        for (int i = 0; i < lista1Long; i++){
            lista1.add(numeros);
        }

        for (int i = 0; i < lista2Long; i++){
            lista2.add(numeros);
        }

        // Imprimir con foreach
        System.out.println("El numero de elementos es: " + lista1Long);
        for (Integer tmp : lista1) {
            System.out.println(tmp);
        }

        System.out.println("El numero de elementos es: " + lista2Long);
        for (Integer tmp : lista2) {
            System.out.println(tmp);
        }

        // Duplicar lista 1 en lista 3
        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++){
                Integer aux = lista1.get(i);
                lista2.contains(aux);
                
                // Si no se cumple, lo introduzco
                if (!lista2.contains(aux)){
                    lista3.add(aux);
                }
            }

        System.out.println("El numero de elementos es: " + lista3.size());
        for (Integer tmp : lista3) {
            System.out.println(tmp);
        }
    }
}
