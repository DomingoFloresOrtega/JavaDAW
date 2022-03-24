/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author domingo
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    
    /* Ejercicio asociado: ListaInteger.java */
    
    public static void main(String[] args) {
        // Sin clase externa
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        
        // Las dos primeras posiciones con estos numeros
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Continua agragando desde la 2 posicion
        for (int i = 0; i < 2; i++){
            Integer aux = r.nextInt(91)+10;
            list.add(aux); // Sin manejar indices
        }
        
        // Creo foreach
        // Integer {nombreVariable} : {listaAMostrar}
        for (Integer tmp : list){
            System.out.print(tmp + " - ");
        }
        
        int sumaPares = 0;
        // Bucle para recorrer la lista completa
        for (int i = 0; i < list.size(); i++){
            // Metodo get (posicion) para obtener cada elemento de la lista
            int numero = list.get(i); // Unboxing
            if (numero%2 == 0){
                sumaPares += numero;
            }
        }
        
        int contador = 0;
        
        for (int i = 0; i < list.size(); i++){
            // Metodo get (posicion) para obtener cada elemento de la lista
            int numero = list.get(i);
            if (numero%2 != 0){
                contador++;
            }
        }
        
        // Buscar el mayor
        int mayor = Integer.MIN_VALUE;
        for (Integer num : list) {
            if (num>mayor){
                mayor = num;
            }
        }
        
        System.out.println("\nSuma de pares: " + sumaPares);
        System.out.println("Total de impares: " + contador);
        System.out.println("El mayor es: " + mayor);
        
        System.out.println("Borrado del elemento de la posición 3");
        // Borra el numero indicado
        Integer valor = 5;
        list.remove(valor);
        // Borra el indice
        list.remove(3);
        list.forEach(e->System.out.print(e + " - "));
        
        // Cambia el elemento de la posicion cero con el nuevo valor
        list.set(0, 200);
        
        System.out.println("");
        list.forEach(e->System.out.print(e + " - "));
        
        // Agregar el valor 500 a la posicion 2
        list.add(2, 500);
        System.out.println("");
        list.forEach(e->System.out.print(e + " - "));
        
        // Buscador de posiciones
        int indice = list.indexOf(500);
        System.out.println("\nEl 500 está en la posición: " + indice);
    }
}
