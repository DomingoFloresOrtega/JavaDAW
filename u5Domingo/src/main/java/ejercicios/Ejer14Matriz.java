/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author domingo
 */
public class Ejer14Matriz {
    
    public int[][] generarMatriz(){
       int[][] matriz = new int[3][3]; 
       
       return matriz;
    }
    
    public int[][] rellenarMatrizAleatorio(int[][] matriz){
        Random numAleatorio = new Random();
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = numAleatorio.nextInt(100 - 1 + 1) + 1;
            }
        }
        
        return matriz;
    }
    
    public void calcularMedia(){
        
    }
    
    public void calcularValorMinimo(int[][] matriz){
        
    }
    
    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("El valor es" + matriz[i][j]);
            }
        }
    }
    
}
