/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo;

/**
 *
 * @author domingo
 */
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        cajaCarton cajaGrande = new cajaCarton(250, 400, 500, 200);
        cajaCarton cajaChica = new cajaCarton(25, 30, 15, 17);
        
        System.out.println("Caja de carton grande:");
        System.out.println("Ancho: " + cajaGrande.getAncho() + " mm");
        System.out.println("Alto: " + cajaGrande.getAlto() + " mm");
        System.out.println("Largo: " + cajaGrande.getLargo() + " mm");
        System.out.println("Peso: " + cajaGrande.getPeso() + " gr");
        
        System.out.println("=========================");
        System.out.println("Caja de carton chica:");
        System.out.println("Ancho: " + cajaChica.getAncho() + " mm");
        System.out.println("Alto: " + cajaChica.getAlto() + " mm");
        System.out.println("Largo: " + cajaChica.getLargo() + " mm");
        cajaChica.setPeso(5);
        System.out.println("Peso: " + cajaChica.getPeso() + " gr");
    }
}
