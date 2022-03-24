/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo;

/**
 *
 * @author domingo
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean resultado1 = 67>20 && 13>12;
        System.out.println("Resultado 1: " + resultado1);
        boolean resultado2 = 10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1;
        System.out.println("Resultado 2: " + resultado2);
        
        int a = 5,b = 3;
        
        boolean resultado3 = !(a>b&&2*a<=b);
        System.out.println("Resultado 3: " + resultado3);
        boolean resultado4 = a++/2<b&&(a++/2>b || (a*2<b*4));
        System.out.println("Resultado 4: " + resultado4);
        boolean resultado5 = b++>3||a+b<=8&&!(a>b);
        System.out.println("Resultado 5: " + resultado5);


                
    }
    
}
