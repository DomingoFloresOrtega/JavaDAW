/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domingo;

/**
 *
 * @author domingo
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 10, n2 = 30, suma = 0, n3=40; // n3 no esta inicializado
        suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma); 
	suma = suma + n3;
        System.out.println(suma);
    }

}
