/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Random;

/**
 *
 * @author domingo
 */
public class SopaLetras {

    private char[][] sopaLetras;

    private char generarLetra() {
        Random random = new Random();

        char letra = (char) (random.nextInt(26) + 'A');

        return letra;
    }

    public SopaLetras(int num) {
        sopaLetras = new char[num][num];

        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                sopaLetras[i][j] = generarLetra();
            }
        }
    }

    public void imprimir() {
        String impresion = "";

        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                impresion += sopaLetras[i][j] + " ";
            }

            impresion += "\n";
        }
        impresion += "\n";

        System.out.println(impresion);
    }

    public boolean colocarHorizontal(String palabra, Coordenada coord) {
        boolean colocado;
        if (palabra.length() + coord.getColumna() >= sopaLetras.length) {
            colocado = false;
        } else {
            for (int i = 0; i < palabra.length(); i++) {
                if (sopaLetras[coord.getFila()][coord.getColumna() + i] != '*') {
                    colocado = false;
                }
            }

            for (int i = 0; i < palabra.length(); i++) {
                char[] letras = palabra.toCharArray();
                sopaLetras[coord.getFila()][coord.getColumna() + 1] = letras[i];
            }
        }

        colocado = true;

        return colocado;
    }

    public boolean colocarVertical(String palabra, Coordenada coor) {
        boolean colocado;
        if (palabra.length() + coor.getFila() >= sopaLetras.length) {
            colocado = false;

        } else {
            for (int i = 0; i < palabra.length(); i++) {
                if (sopaLetras[coor.getFila() + i][coor.getColumna()] != '*') {
                    colocado = false;

                }
            }
            
            for (int i = 0; i < palabra.length(); i++) {
                char[] letras = palabra.toCharArray();
                sopaLetras[coor.getFila() + 1][coor.getColumna()] = letras[i];
            }

        }
        
        colocado = true;
        
        return colocado;
    }
}
