/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author domingo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SopaLetras sp = new SopaLetras(10);

        sp.imprimir();
        System.out.println(sp.colocarHorizontal("HOLA", new Coordenada(3,4)));
        System.out.println(sp.colocarVertical("HOLA", new Coordenada(3,4)));
    }

}
