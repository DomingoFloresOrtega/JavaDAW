/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.tarea6C;

import java.time.LocalDate;

/**
 *
 * @author domingo
 */
public class NIF {

    private char letra;
    private String numero;
    private LocalDate fechaCaducidad;

    public NIF() {
    }

    public NIF(char letra, String numero, LocalDate fechaCaducidad) {
        this.letra = letra;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "NIF{" + "letra=" + letra + ", numero=" + numero + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

    public void nif(String numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }

    private char calcularLetra() {
        char letra = ' ';

        // Revisa la longitud
        int dniLongitud = numero.length();

        // Si la longitud es correcta, continua
        if (dniLongitud == 8) {
            int numeroConvertidoDNI = Integer.parseInt(numero);
            int divisionDNI = numeroConvertidoDNI % 23;

            // Seleccionamos letra
            switch (divisionDNI) {
                case 0:
                    letra = 'T';
                    break;
                case 1:
                    letra = 'R';
                    break;
                case 2:
                    letra = 'W';
                    break;
                case 3:
                    letra = 'A';
                    break;
                case 4:
                    letra = 'G';
                    break;
                case 5:
                    letra = 'M';
                    break;
                case 6:
                    letra = 'Y';
                    break;
                case 7:
                    letra = 'F';
                    break;
                case 8:
                    letra = 'P';
                    break;
                case 9:
                    letra = 'D';
                    break;
                case 10:
                    letra = 'X';
                    break;
                case 11:
                    letra = 'B';
                    break;
                case 12:
                    letra = 'N';
                    break;
                case 13:
                    letra = 'J';
                    break;
                case 14:
                    letra = 'Z';
                    break;
                case 15:
                    letra = 'S';
                    break;
                case 16:
                    letra = 'Q';
                    break;
                case 17:
                    letra = 'V';
                    break;
                case 18:
                    letra = 'H';
                    break;
                case 19:
                    letra = 'L';
                    break;
                case 20:
                    letra = 'C';
                    break;
                case 21:
                    letra = 'K';
                    break;
                case 22:
                    letra = 'E';
                    break;
                default:
                    break;
            }
        } else {
            this.numero = "0";
        }
        // Devuelve letra
        return letra;
    }
    
    public void renovar(LocalDate fechaSolicitudRenovacion){
        this.fechaCaducidad = fechaSolicitudRenovacion.plusYears(10);
    }
}
