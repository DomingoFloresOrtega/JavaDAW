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
public class Banco2 {

    private static boolean edad(int edadA){
        int edad;
        boolean resultadoEdad;
        
        edad = edadA;
        
        if (edad>18 && edad<65){
            resultadoEdad = false;
        }else{
            resultadoEdad = true;
        }
        
        return resultadoEdad;
    }
    
    private static boolean dinero(int sueldoA, int dineroPrestamoB, double factorMultiC){
        int sueldo = sueldoA;
        int dineroPrestamo = dineroPrestamoB;
        double factorMulti = factorMultiC;
        
        
}
    
    public static void main(String[] args) {
        int edad;
        double sueldoBrutoMensual;
        double dineroPrestamo;
        boolean edadB;
        String opcion;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("===========================");
            System.out.println("Bienvenido a Banco Tetimo");
            System.out.println("===========================");
            System.out.println("1. Solicitar prestamo");
            System.out.println("2. Salir");
            System.out.print("Introduzca una opción: \n");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("===========================================");
                    System.out.println("Antes de comenzar, necesitamos saber su edad y su sueldo:");
                    System.out.println("===========================");
                    do{
                        System.out.println("a) Introduzca su edad");
                        edad = teclado.nextInt();
                        edadB = edad(edad);
                        
                    }while (edadB);
                    
                    // Limpiamos el buffer
                    teclado.nextLine();
                    System.out.println("===========================================");
                    do{
                        System.out.println("b) Introduzca su sueldo bruto mensual");
                        sueldoBrutoMensual = teclado.nextDouble();
                    }while (sueldoBrutoMensual <= 0);
                    // Limpiamos el buffer
                    teclado.nextLine();
                    if (edad >= 18 && edad <= 65) {
                        System.out.println("===========================================");
                        System.out.println("¡Genial!, cumple nuestros requisitos de edad");
                        System.out.println("===========================================");
                        System.out.println("c) Introduzca el dinero que necesita para el prestamo:");
                        dineroPrestamo = teclado.nextDouble();
                        // Limpiamos el buffer
                        teclado.nextLine();
                        double sueldoBrutoAnual = sueldoBrutoMensual * 12;
                        double factorMultiplicativo = sueldoBrutoAnual * 5.85;
                        if (dineroPrestamo > factorMultiplicativo) {
                            System.out.println("ERROR 301: Su prestamo ha sido cancelado. Motivo: No cumple los requisitos de prestamo");
                        } else {
                            System.out.println("===========================================");
                            System.out.println("Queremos saber cuanto vas a tardar en entregar el prestamo.");
                            System.out.println("===========================================");
                            System.out.println("d) Introduzca el número de años en los que desea devolver el prestamo:");
                            int aniosDevolucion = teclado.nextInt();
                            // Limpiamos el buffer
                            teclado.nextLine();
                            if (aniosDevolucion >= 5 && aniosDevolucion <= 30) {
                                int aniosDevolucionSupera = edad + aniosDevolucion;
                                if (aniosDevolucionSupera > 75) {
                                    System.out.println("ERROR 302: No es posible conceder el prestamo. Motivo: Supera los requisitos de edad");
                                } else {
                                    System.out.println("===========================================");
                                    System.out.println("¡Enhorabuena! Su prestamo se ha concedido");
                                    System.out.println("Deberá devolver el prestamo en " + aniosDevolucion + " años");
                                    System.out.println("Antes de firmar su prestamo, debera de leer la normativa de prestamos de Tetimo");
                                }
                            } else {
                                System.out.println("ERROR 303: Su prestamo ha sido cancelado. Motivo: No cumple los requisitos de devolución");
                            }
                        }
                    } else {
                        System.out.println("ERROR 304: Su prestamo ha sido cancelado. Motivo: No cumple los requisitos de edad");
                    }
                    break;
                case "2":
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("¡Tetimo no acepta esta opción!");
                    break;
            } 
        } while (!opcion.equals("2"));
    }
    
}
