/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Ejercicio19Avion {

    private char[][] asientos;

    public Ejercicio19Avion() {
        this.asientos = new char[25][4];
        rellenarAvion();
    }

    public char[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(char[][] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Ejercicio19Avion{" + "asientos=" + asientos + '}';
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
        final Ejercicio19Avion other = (Ejercicio19Avion) obj;
        return Arrays.deepEquals(this.asientos, other.asientos);
    }

    /**
     * ***********************
     */
    /**
     * ****** METODOS ********
     */
    /**
     * **********************
     */
    public void mostrarAvion(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("El asiento de la fila [" + (i + 1) + "] en la posición [" + (j + 1) + "] esta: " + matriz[i][j]);
            }
        }

        JOptionPane.showMessageDialog(null, "Mostrando la ocupación de los asientos...\n"
                + "\n"
                + "O - Ocupado \n"
                + "L - Libre");
    }

    public void rellenarAvion() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'L';
            }
        }
    }

    public boolean mostrarMenuSeleccion() {
        boolean paso1 = false;
        String asiento = JOptionPane.showInputDialog(null, "Bienvenido al sistema de reservas AllFast \n"
                + "Antes de nada, tendrá que seleccionar la opcion que desea:\n"
                + "1. Mostrar asientos libres / ocupados \n"
                + "2. Reservar asientos \n"
                + "3. Anular reserva \n"
                + "4. Salir");

        switch (asiento) {
            case "1":
                paso1 = true;
                mostrarAvion(asientos);
                break;
            case "2":
                paso1 = true;
                reservarAsiento();
                break;
            case "3":
                paso1 = true;
                anularReserva();
                break;
            case "4":
                paso1 = false;
                break;
            default:
                paso1 = true;
                JOptionPane.showMessageDialog(null,"Opción no valida");
        }

        // Si no se pulsa 4, se repite el bucle
        return paso1;
    }

    public void reservarAsiento() {
        boolean paso = true;
        boolean pasoAsiento = true;
        Random numero = new Random();

        do {
            String fila = JOptionPane.showInputDialog(null, "Introduzca la fila que desea reservar:");
            // Compruebo que existe la fila
            if (Integer.parseInt(fila) <= 25) {
                do {
                    String asiento = JOptionPane.showInputDialog(null, "Introduzca el asiento a reservar:");
                    // Compruebo que existe la fila
                    if (Integer.parseInt(asiento) <= 4) {
                        asientos[Integer.parseInt(fila) - 1][Integer.parseInt(asiento) - 1] = 'O';
                        JOptionPane.showMessageDialog(null, "Su reserva se ha realizado correctamente");
                        pasoAsiento = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tan solo existen 4 asientos");
                    }
                    paso = false;
                } while (pasoAsiento);

            } else {
                JOptionPane.showMessageDialog(null, "Tan solo existen 25 filas");
            }
        } while (paso);
    }

    public void anularReserva() {
        boolean paso = true;
        boolean pasoAsiento = true;

        do {
            String fila = JOptionPane.showInputDialog(null, "Introduzca la fila de su reserva:");
            // Compruebo que existe la fila
            if (Integer.parseInt(fila) <= 25) {
                do {
                    String asiento = JOptionPane.showInputDialog(null, "Introduzca el asiento de su reserva:");
                    // Compruebo que existe la fila
                    if (Integer.parseInt(asiento) <= 4) {
                        // Si no hay reserva, lo indico
                        if (asientos[Integer.parseInt(fila)-1][Integer.parseInt(asiento)-1] == 'L') {
                            JOptionPane.showMessageDialog(null, "No hay ninguna reserva");
                            pasoAsiento = false;
                        } else {
                            // Si hay reserva, la cancelo
                            asientos[Integer.parseInt(fila) - 1][Integer.parseInt(asiento) - 1] = 'L';
                            JOptionPane.showMessageDialog(null, "Su reserva se ha anulado correctamente");
                            pasoAsiento = false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tan solo existen 4 asientos");
                    }
                    paso = false;
                } while (pasoAsiento);

            } else {
                JOptionPane.showMessageDialog(null, "Tan solo existen 25 filas");
            }
        } while (paso);
    }
}
