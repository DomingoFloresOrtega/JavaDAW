/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcetines;

/**
 *
 * @author domingo
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CajonCalcetines cajon1 = new CajonCalcetines();

        cajon1.generarCalcetines();

        cajon1.calcetinesParejas();

        cajon1.imprimirCajon();
    }

}
