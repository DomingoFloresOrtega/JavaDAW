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
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca caracter:");
        // Leemos un caracter o palabra
        String caracterTexto = teclado.next();
        char caracter = caracterTexto.charAt(0);
        
        if (caracter>=48 && caracter<=57){
            System.out.println("Es un digito");
        }
        else{
          if (caracter>=65 && caracter<=90){
             System.out.println("Es mayuscula");
          }
          else{
            if (caracter>=97 && caracter<=122){
                System.out.println("Es minuscula");
            }
            else{
                System.out.println("No se pudo determinar el tipo de caracter");
            }
          }
        }
    }
    
}
