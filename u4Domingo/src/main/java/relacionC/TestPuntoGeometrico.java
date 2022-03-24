/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class TestPuntoGeometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico();
        PuntoGeometrico p2 = new PuntoGeometrico(2,3);
        
        p1.getCoordenadax();
        p2.getCoordenaday();
        
        System.out.println(p1);
        System.out.println(p2);
        
        p1.setCoordenadax(6);
        p2.setCoordenaday(8);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
