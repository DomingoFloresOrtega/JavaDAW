/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo;

/**
 *
 * @author domingo
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos e inicializamos variables int
        int a = 10;
        int b = 5;
        int i = 0;
        
        // Declaramos e inicializamos variables double
        double c = 71.3;
        double d = 4.8;
        
        // Realizamos operaciones con a y b
            // Suma
            int suma = a + b;
            // Resta
            int resta = a - b;
            // Multiplicación
            int multi = a * b;
            // División
            int divi = a / b;
        // Realizamos operaciones con c y d
            // Suma
            double suma2 = c + d;
            // Resta
            double resta2 = c - d;
            // Multiplicación
            double multi2 = c * d;
            // División
            double divi2 = c / d;
        // Mostramos resultados
        System.out.println("----- RESULTADOS A Y B -----");
        System.out.println("El resultado de la suma de los numeros " + a + " y " + b + " es " + suma);
        System.out.println("El resultado de la resta de los numeros " + a + " y " + b + " es " + resta);
        System.out.println("El resultado de la multiplicación de los numeros " + a + " y " + b + " es " + multi);
        System.out.println("El resultado de la división de los numeros " + a + " y " + b + " es " + divi);
        
        System.out.println(" ");
        System.out.println("----- RESULTADOS C Y D -----");
        System.out.println("El resultado de la suma de los números " + c + " y " + d + " es " + suma2);
        System.out.println("El resultado de la resta de los números " + c + " y " + d + " es " + resta2);
        System.out.println("El resultado de la multiplicación de los números " + c + " y " + d + " es " + multi2);
        System.out.println("El resultado de la división de los números " + c + " y " + d + " es " + divi2);
        
        // Realizamos operaciones especiales
            System.out.println(" ");
            System.out.println("========== RESULTADOS ESPECIALES ============");
            // a*=3
            a = a * 3;
            System.out.println("El resultado de a*=3 es " + a);
            // b-=1
            b = b - 1;
            System.out.println("El resultado de b-=1 es " + b);
            // a/=b
            a = a / b;
            System.out.println("El resultado de a/=b es " + a);
            // c+=d
            c = c + d;
            System.out.println("El resultado de c+=d es " + c);
        
        // Instrucciones con i
            // i
            System.out.println("El valor de i es " + i);
            // i++
            i++;
            System.out.println("El valor de i++ es " + i);
            // i
            System.out.println("El valor de i es " + i);
            // ++i
            ++i;
            System.out.println("El valor de ++i es " + i);
        
    }
    
}
