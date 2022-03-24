/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_seleccion;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Indique la medida del lado 1:");
            double ladoCuadradoA = entrada.nextDouble();
            System.out.println("Indique la medida del lado 2:");
            double ladoCuadradoB = entrada.nextDouble();
            // Realizamos calculos
            double areaCuadradoTotal = ladoCuadradoA * ladoCuadradoB;
            // Imprimimos resultado
            System.out.printf("El area del cuadrado es de %.2f cm al cuadrado",areaCuadradoTotal);
        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Introduzca la medida de la base: ");
                double ladoTrianguloBase = entrada.nextDouble();
                System.out.println("Indique la medida de la altura:");
                double ladoTrianguloAltura = entrada.nextDouble();
                // Realizamos calculos
                double areaTrianguloTotal = (ladoTrianguloBase * ladoTrianguloAltura) / 2;
                // Imprimimos resultado
                System.out.printf("El area del triangulo es de %.2f cm al cuadrado",areaTrianguloTotal);
            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    System.out.println("Introduzca el radio del circulo: ");
                    double radioCirculo = entrada.nextDouble();
                    // Realizamos calculos
                    double areaCirculoTotal = Math.PI * (radioCirculo * radioCirculo);
                    // Imprimimos resultado
                    System.out.printf("El area del circulo es de %.2f cm al cuadrado",areaCirculoTotal);
                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }

    }

}
