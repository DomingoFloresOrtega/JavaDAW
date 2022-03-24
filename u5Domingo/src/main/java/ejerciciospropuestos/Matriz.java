/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospropuestos;

/**
 *
 * @author domingo
 */
public class Matriz {

    public static void main(String[] arguments) {
        char[][] matriz = new char[3][3];
        // Inicializo matriz
        matriz[0][0] = '3';
        matriz[0][1] = 'a';
        matriz[0][2] = 't';
        matriz[1][0] = '5';
        matriz[1][1] = 'n';
        matriz[1][2] = 'v';
        matriz[2][0] = 'y';
        matriz[2][1] = 'g';
        matriz[2][2] = 'q';

        // Recorro filas
        recorrerFila(1, matriz);
        
        // Recorro columnas
        recorrerColumna(0, matriz);
        
        // Recorro vecinas
        recorrerVecinas(0, 1, matriz);
    }

    public static void recorrerFila(int fila, char[][] matriz) {
        System.out.println("Fila seleccionada: " + fila);
        for (int i = 0; i < matriz[fila].length; i++) {
            System.out.println("El valor de la columna " + i + " es: " + matriz[fila][i]);
        }
    }

    public static void recorrerColumna(int columna, char[][] matriz) {
        System.out.println("Columna seleccionada: " + columna);
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("El valor de la columna " + i + " es: " + matriz[i][columna]);
        }
    }
    
    public static void recorrerVecinas(int columna, int fila, char[][] matriz) {
        try {
            System.out.println("El vecino de arriba es: " + matriz[fila-1][columna]);
            System.out.println("El vecino de abajo es: " + matriz[fila+1][columna]);
            System.out.println("El vecino de la derecha es: " + matriz[fila][columna+1]);
            System.out.println("El vecino de la izquierda es: " + matriz[fila][columna-1]);
        } catch (IndexOutOfBoundsException iobe){
            // Cargo excepcion en caso de salir del rango
            System.out.println("No se puedo obtener la posición. No existe vecino");
        }
        
    }
}
