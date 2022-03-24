/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancodomingo;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a Banco Tetimo");
        System.out.println("Antes de comenzar, necesitamos saber su edad y su sueldo:");
        System.out.println("===========================");
        System.out.println("Introduzca su edad");
        int edad = teclado.nextInt();
        System.out.println("Introduzca su sueldo bruto mensual");
        double sueldoBrutoMensual = teclado.nextDouble();
        
        if (edad >= 18 && edad <=65){
            System.out.println("¡Genial!");
            System.out.println("Introduzca el dinero que necesita para el prestamo:");
            double dineroPrestamo = teclado.nextDouble();
            double sueldoBrutoAnual = sueldoBrutoMensual * 12;
            double factorMultiplicativo = sueldoBrutoAnual * 5.85;
            if (dineroPrestamo > factorMultiplicativo){
                System.out.println("¡ERROR! No cumple los requisitos");
            } else{
                System.out.println("Queremos saber cuanto vas a tardar en entregar el prestamo.");
                System.out.println("Introduzca el número de años en los que desea devolver el prestamo:");
                int aniosDevolucion = teclado.nextInt();
                if (aniosDevolucion >=5 && aniosDevolucion <=30){
                    int aniosDevolucionSupera = edad + aniosDevolucion;
                    if (aniosDevolucionSupera > 75){
                        System.out.println("No es posible conceder el prestamo. Motivo: Supera los requisitos de edad");
                    }else{
                        System.out.println("¡Enhorabuena! Su prestamo se ha concedido");
                        System.out.println("Deberá devolver el prestamo en " + aniosDevolucion + " años");
                    }
                }else{
                    System.out.println("Su prestamo ha sido cancelado. Motivo: No cumple los requisitos de devolución");
                }
            }
        }else{
            System.out.println("¡Usted no puede solicitar un prestamo!");
        }
    }
    
}
