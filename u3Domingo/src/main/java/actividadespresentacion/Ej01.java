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
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un número:");
        double numero = teclado.nextInt();
        
        if (numero>0){
            System.out.println("El número es positivo");
        }
        else{
          if (numero<0){
             System.out.println("El número es negativo");
          }
          else{
               System.out.println("El número es cero");
            }
          }
        }
    } 
