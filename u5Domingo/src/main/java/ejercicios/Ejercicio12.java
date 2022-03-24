/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author domingo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] caracteres = new char[2][3];  // [2] filas | [3] columnas
        
        caracteres[0][0] = 'A';
        caracteres[0][1] = 'B';
        caracteres[0][2] = 'C';
        caracteres[1][0] = 'F';
        caracteres[1][1] = 'D';
        caracteres[1][2] = 'E';
        
        
        for(int i = 0; i < caracteres.length; i++){  // matriz.length -> filas | matriz[i].length -> columnas
            for (int j = 0; j < caracteres[i].length; j++){
                System.out.println("El valor es " + caracteres[i][j]);
            }
        }
        
        generarMatrizValores(caracteres);
    }
    
    public static void generarMatrizValores(char[][] matriz){
        char[][] matriz2 = new char[2][3];
        
        // Relleno array matriz2 con valores de matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz2[i][j] = matriz[i][j];
            }
        }
        
        // Imprimo por pantalla
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                System.out.println("El valor de [" + i + "][" + j + "] es: " + matriz2[i][j]);
            }
        }
    } 
}
