/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explicacionesclase;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class DepuraciónPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("OPCION 1 - Calcular area de cuadrado");
        System.out.println("Introduzca una opcion");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Indique la medida del lado 1:");
            double ladoCuadradoA = entrada.nextDouble();
            
            System.out.println("El area A del cuadrado es " + ladoCuadradoA);
        }
    }
}
