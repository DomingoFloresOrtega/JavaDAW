/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5E;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author domingo
 */
public class TestLoteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo el Map
        Loteria loteria = new Loteria();
        
        // Insertamos premios
        loteria.introducirRegistros("02365", "3000€");
        loteria.introducirRegistros("12658", "50€");
        loteria.introducirRegistros("05555", "60€");
        loteria.introducirRegistros("12345", "1.000.000€");
        loteria.introducirRegistros("00000", "0€");
        
        // Modificamos premios
        loteria.modificarRegistros("12658", "50€", "100€");
        System.out.println("Tu premio es de: " + loteria.consulta("12658"));
        
        // Borramos premios
        loteria.borrarRegistros("12658");       
    }  
}
