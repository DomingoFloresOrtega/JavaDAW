/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Arrays;

/**
 *
 * @author domingo
 */
public class Teatro {

    private char[][] asientos;

    public Teatro() {
        this.asientos = new char[5][7];

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'L';
            }
        }
    }

    public char[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(char[][] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Teatro{" + "asientos=" + asientos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Arrays.deepHashCode(this.asientos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teatro other = (Teatro) obj;
        return Arrays.deepEquals(this.asientos, other.asientos);
    }

    public void mostrarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.println("El asiento de la fila [" + (i + 1) + "] en la posición [" + (j + 1) + "] esta: " + asientos[i][j]);
            }
        }
    }

    public void reservarAsientos(int fila, int columna) {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[fila][columna] == 'V' || asientos[fila][columna] == 'X') {
                    System.out.println("No es posible reservar estos asientos");
                } else if (fila > 0 && columna > 0) {
                    asientos[fila - 1][columna - 1] = 'V';
                }
            }
        }
    }

    public void anularReserva(int fila, int columna) {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (fila > 0 && columna > 0) {
                    asientos[fila - 1][columna - 1] = 'L';
                }
            }
        }
    }
}
