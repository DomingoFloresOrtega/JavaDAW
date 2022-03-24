/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_seleccion;

/**
 *
 * @author domingo
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Apartado a
        boolean unaCondicion = true;
        resultado = unaCondicion ? valor1 : valor2;
        // Devolvera error debido a que no se le ha asignado un valor a las dos condiciones
        
        // Apartado b
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        System.out.println("Apartado b: " + y);
        
        // Apartado c
        int publico = 19500;
    	int vendidas = 19000;
	int aforo = 2000;
  	String status = (publico < aforo) ? "Cabe mas gente": (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        System.out.println("Apartado c: " + status);
    }
    
}
