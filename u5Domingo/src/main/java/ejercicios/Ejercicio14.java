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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = generarMatriz();
        
        // Rellenamos la matriz con numeros aleatorios
        matriz = rellenarMatrizAleatorio(matriz);
        
        // Imprimimos la matriz
        imprimirMatriz(matriz);
        
        // Calcular el valor maximo y minimo de la matriz
        calcularValorMinimoMaximo(matriz);
        
        // Calcular la media de la matriz
        calcularMedia(matriz);
    }
    
    public static int[][] generarMatriz(){
       int[][] matriz = new int[3][3]; 
       
       return matriz;
    }
    
    public static int[][] rellenarMatrizAleatorio(int[][] matriz){
        Random numAleatorio = new Random();
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = numAleatorio.nextInt(100 - 1 + 1) + 1;
            }
        }
        
        return matriz;
    }
    
    public static void calcularMedia(int[][] matriz){
        double media = 0.0;
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                media = media + matriz[i][j];
            }
        }
        
        media = media / matriz.length;
        
        System.out.println("La media de la matriz es: " + media);
    }
    
    public static void calcularValorMinimoMaximo(int[][] matriz){
        int minimo = matriz[0][0];
        int maximo = matriz[0][0];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (minimo > matriz[i][j]){
                    minimo = matriz[i][j];
                }
                if (maximo < matriz[i][j]){
                    maximo = matriz[i][j];
                }
            }
        }
        
        System.out.println("El valor maximo es " + maximo);
        System.out.println("El valor minimo es " + minimo);
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("El valor de [" + i + "][" + j + "] es: " + matriz[i][j]);
            }
        }
    }
}
