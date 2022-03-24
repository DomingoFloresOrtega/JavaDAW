/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class Repaso1 {

    /**
     * @param args the command line arguments
     */
    
    // Metodo comprobarInt.
    // Metodo privado. Recibe un numero y lo imprime por pantalla
    private static int comprobarInt(){
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean continuar = true;
        
        do{
            try{
                continuar = true;
                System.out.println("Introduzca un número");
                numero = teclado.nextInt();
                continuar = false;
                
            } catch(InputMismatchException ime){
                System.out.println("Introduzca solo números");
                teclado.nextLine();
            } 
        } while(continuar);
        
        return numero;
    }
    
    // Metodo mostrarMenu. Solo se utiliza en la clase Calculadora
    // Metodo privado. No recibe parametros y no devuelve nada
    private static void mostrarMenu(){
        System.out.println("Opciones del programa");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Salir");
    }
            
    // Metodo suma. Solo se utiliza en la clase Calculadora
    // Metodo privado. Recibe dos parametros y devuelve un valor entero
    // con el resultado de la suma de los parametros
    private static int sumar(int a, int b){
        int suma = a+b;
        return suma;
    }
    
    // Metodo resta. Solo se utiliza en la clase Calculadora
    // Metodo privado. Recibe dos parametros y devuelve un valor entero
    // con el resultado de la resta de los parametros
    private static int restar(int a, int b){
        int resta = a-b;
        return resta;
    }
    
    // Metodo multiplicar. Solo se utiliza en la clase Calculadora
    // Metodo privado. Recibe dos parametros y devuelve un valor entero
    // con el resultado de la multiplicacion de los parametros
    private static int multiplicar(int a, int b){
        int multiplicar = a*b;
        return multiplicar;
    }
    
    // Metodo dividir. Solo se utiliza en la clase Calculadora
    // Metodo privado. Recibe dos parametros y devuelve un valor entero
    // con el resultado de la división de los parametros
    private static int dividir(int a, int b){
        int dividir = a/b;
        return dividir;
    }
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op1 = 0, op2 = 0, resultado = 0;
        String opcion;
        boolean correcto = true;

        int numero2 = comprobarInt();
        System.out.println(numero2);
        
        System.out.println("Bienvenido al calculator");

            System.out.println("Introduzca dos operandos");
            do {
                try {
                    correcto = true;
                    // Bloque de código candidato a lanzar la excepción
                    System.out.println("Operando 1:");
                    op1 = teclado.nextInt();
                    System.out.println("Operando 2:");
                    op2 = teclado.nextInt();
                    if (((op1 > -100 && op1 < 100) && (op2 > -100 && op2 < 100))){
                        correcto = false;
                    }else{
                        System.out.println("Error.");
                    }

                } catch (InputMismatchException ime) {
                    // Código para tratar el error
                    System.out.println("Debe introducir solo números");
                    teclado.nextLine();
                }
            } while (correcto);

// Mostrar el menú de opciones
        teclado.nextLine();
        do{
            mostrarMenu();
            opcion = teclado.nextLine();
            
            switch(opcion){
                case "1":
                    resultado = sumar(op1, op2);
                    break;
                case "2":
                    resultado = restar(op1, op2);
                    break;
                case "3":
                    resultado = multiplicar(op1, op2);
                    break;
                case "4":
                    resultado = dividir(op1, op2);
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            System.out.println("El resultado es:" + resultado);
        } while(!opcion.equals("3"));
        
    }
}
