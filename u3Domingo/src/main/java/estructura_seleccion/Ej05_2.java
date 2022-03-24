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
public class Ej05_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Calcular el área de un Cuadrado");
            System.out.println("2. Calcular el área de un Triángulo");
            System.out.println("3. Calcular el área de un Círculo");
            System.out.println("Salir. Finalizar");

            System.out.print("Elija una opción: ");
            opcion = entrada.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                    System.out.println("Indique la medida del lado 1:");
                    double ladoCuadradoA = entrada.nextDouble();
                    System.out.println("Indique la medida del lado 2:");
                    double ladoCuadradoB = entrada.nextDouble();
                    entrada.nextLine();
                    // Realizamos calculos
                    double areaCuadradoTotal = ladoCuadradoA * ladoCuadradoB;
                    // Imprimimos resultado
                    System.out.printf("El area del cuadrado es de %.2f cm al cuadrado \n", areaCuadradoTotal);
                    break;
                
                case "2":
                    System.out.println("Ha seleccionado calcular el área de un triángulo...");
                    System.out.println("Introduzca la medida de la base: ");
                    double ladoTrianguloBase = entrada.nextDouble();
                    System.out.println("Indique la medida de la altura:");
                    double ladoTrianguloAltura = entrada.nextDouble();
                    entrada.nextLine();
                    // Realizamos calculos
                    double areaTrianguloTotal = (ladoTrianguloBase * ladoTrianguloAltura) / 2;
                    // Imprimimos resultado
                    System.out.printf("El area del triangulo es de %.2f cm al cuadrado \n", areaTrianguloTotal);
                    break;
                
                case "3":
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    System.out.println("Introduzca el radio del circulo: ");
                    double radioCirculo = entrada.nextDouble();
                    entrada.nextLine();
                    // Realizamos calculos
                    double areaCirculoTotal = Math.PI * (radioCirculo * radioCirculo);
                    // Imprimimos resultado
                    System.out.printf("El area del circulo es de %.2f cm al cuadrado \n", areaCirculoTotal);
                    break;
                
                case "Salir":
                    System.out.println("Ha decidido terminar");
                    break;
                
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (!opcion.equals("Salir") && !opcion.equals("salir"));
    }
    
}
