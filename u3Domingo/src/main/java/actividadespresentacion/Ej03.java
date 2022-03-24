/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadespresentacion;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int numero = teclado.nextInt();

        // IF
        if (numero == 1) {
            System.out.println("Numero " + numero + " en romano es I");
        } else {
            if (numero == 2) {
                System.out.println("Numero " + numero + " en romano es II");
            } else {
                if (numero == 3) {
                    System.out.println("Numero " + numero + " en romano es III");
                } else {
                    if (numero == 4) {
                        System.out.println("Numero " + numero + " en romano es IV");
                    } else {
                        if (numero == 5) {
                            System.out.println("Numero " + numero + " en romano es V");
                        } else {
                            if (numero == 6) {
                                System.out.println("Numero " + numero + " en romano es VI");
                            } else {
                                if (numero == 7) {
                                    System.out.println("Numero " + numero + " en romano es VII");
                                } else {
                                    if (numero == 8) {
                                        System.out.println("Numero " + numero + " en romano es VIII");
                                    } else {
                                        if (numero == 9) {
                                            System.out.println("Numero " + numero + " en romano es IX");
                                        } else {
                                            if (numero == 10) {
                                                System.out.println("Numero " + numero + " en romano es X");
                                            } else {
                                                System.out.println("Ha introducido un numero erroneo");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // IF ELSE IF
        if (numero == 1) {
            System.out.println("Numero " + numero + " en romano es I");
        } else if (numero == 2) {
            System.out.println("Numero " + numero + " en romano es II");
        } else if (numero == 3) {
            System.out.println("Numero " + numero + " en romano es III");
        } else if (numero == 4) {
            System.out.println("Numero " + numero + " en romano es IV");
        } else if (numero == 5) {
            System.out.println("Numero " + numero + " en romano es V");
        }
        
        // SWITCH
        switch (numero) {
            case 1:
                System.out.println("Numero " + numero + " en romano es I");
                break;
            case 2:
                System.out.println("Numero " + numero + " en romano es II");
                break;
            case 3:
                System.out.println("Numero " + numero + " en romano es III");
                break;
            case 4:
                System.out.println("Numero " + numero + " en romano es IV");
                break;
            case 5:
                System.out.println("Numero " + numero + " en romano es V");
                break;
            default:
                break;
        }
    }
}
