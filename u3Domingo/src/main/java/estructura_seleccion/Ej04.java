/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_seleccion;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad:");

        int edad = scanner.nextInt();
        
        String txt = (edad>=18) ? "Mayor de edad" : "Menor de edad";

        System.out.println(txt);
        System.out.println(edad);

    }

}
