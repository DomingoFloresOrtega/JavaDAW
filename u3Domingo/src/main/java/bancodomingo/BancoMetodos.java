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
public class BancoMetodos {

    private static boolean comprobadorEdad(int edadA){
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
    
    private static boolean comprobadorDinero(double sueldoA, double dineroPrestamoB){
        boolean resultado;
        double sueldo = sueldoA;
        double dineroPrestamo = dineroPrestamoB;
        final double FACTORMULTI = 5.85;
        
        return dineroPrestamo > (sueldo*FACTORMULTI);
}
    
    public static void main(String[] args) {
        int edad;
        double sueldoBrutoMensual;
        double dineroPrestamo;
        boolean edadB, comprobarDinero;
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
                    do {
                        System.out.println("Introduzca su edad:");
                        edad = teclado.nextInt();

                        edadB = comprobadorEdad(edad);
                    } while (edadB);
                    
                    do{
                        System.out.println("Introduzca su sueldo:");
                        sueldoBrutoMensual = teclado.nextDouble();
                    }while (sueldoBrutoMensual < 0);
                    
                    do{
                        System.out.println("Introduzca la cantidad a pedir:");
                        dineroPrestamo = teclado.nextDouble();
                    }while (dineroPrestamo < 0);
                        
                    comprobarDinero = comprobadorDinero(sueldoBrutoMensual, dineroPrestamo); 
                    
                    if (comprobarDinero == true){
                        System.out.println("Su hipoteca ha sido rechazada.");
                    }else if (comprobarDinero == false){
                        System.out.println("Su hipoteca se ha concedido");
                        System.out.println("Introduzca los años en los que quiere devolver la cantidad");
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
                            }
                    }
                    
                    teclado.nextLine();
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
