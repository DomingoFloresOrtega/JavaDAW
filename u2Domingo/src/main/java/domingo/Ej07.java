/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo;

/**
 *
 * @author domingo
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Declaramos e inicializamos a
        int a = 1;
       // Declaramos e inicializamos b
        int b = 2;
       // Declaramos e inicializamos c
        int c = 3;
       // Declaramos e inicializamos d
        double d = 4.5;
       // Declaramos e inicializamos e
        double e = 5.7;
       // Declaramos e inicializamos f
        double f = 6.9;
       
       // Mostramos variables int
        System.out.println("Las variables int son: " + a + "," + b + "," + c);
       // Mostramos variables double
        System.out.println("Las variables double son: " + d + "," + e + "," + f);
        
        System.out.println("----- X -----");
       // Intercambiamos valores
       // Intercambiamos b por c
       b = c;
       // Intercambiamos c por a
       c = a;
       // Intercambiamos a por b
       a = b;
       // Mostramos valores
        System.out.println("El valor b ahora muestra: " + b);
        System.out.println("El valor c ahora muestra: " + c);
        System.out.println("El valor a ahora muestra: " + a);
        
        System.out.println("----- X -----");
        // Intercambiamos valores
       // Intercambiamos e por f
       e = f;
       // Intercambiamos f por d
       f = d;
       // Intercambiamos d por e
       d = e;
       // Mostramos valores
        System.out.println("El valor e ahora muestra: " + e);
        System.out.println("El valor f ahora muestra: " + f);
        System.out.println("El valor d ahora muestra: " + d);
        
    }
    
}
