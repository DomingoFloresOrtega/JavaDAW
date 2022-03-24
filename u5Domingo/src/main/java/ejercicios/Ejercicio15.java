/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author domingo
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] array = rellenarArray();
        System.out.println("Han salido " + numeroCaras(array) + " caras");
        System.out.println("Han salido " + numeroCruces(array) + " cruces");
        impresora();
    }
    
    public static boolean[] rellenarArray(){
        boolean[] array = new boolean[1000];
        Random aleatorio = new Random();
        
        for (int i=0; i < array.length; i++){
            boolean booleano = aleatorio.nextBoolean();
            array[i] = booleano;
        }
        
        return array;
    }
    
    public static int numeroCaras(boolean[] array){
        
        int contadorCara = 0;
        for (int i=0; i < array.length; i++){
            if (array[i]){
                contadorCara++;
            }
        }
        
        return contadorCara;
    }
    
    public static int numeroCruces(boolean[] array){
        
        int contadorCruz = 0;
        for (int i=0; i < array.length; i++){
            if (!array[i]){
                contadorCruz++;
            }
        }
        
        return contadorCruz;
    }
    
    public static void impresora(){
        boolean[] array = rellenarArray();
        
        for (int i=0; i < array.length; i++){
            System.out.println("Jugada "+ (i+1) + ": " + array[i]);
        }
    }
    
}
