/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class TestCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CocheMotor motor1 = new CocheMotor(false, 2.0);
        CocheVentana ventana1 = new CocheVentana(true, true);
        CocheVentana ventana2 = new CocheVentana(true, true);
        CochePuerta puerta1 = new CochePuerta(false, ventana1);
        CochePuerta puerta2 = new CochePuerta(false, ventana2);
        CocheRueda rueda1 = new CocheRueda(true, 50);
        CocheRueda rueda2 = new CocheRueda(true, 50);
        CocheRueda rueda3 = new CocheRueda(true, 50);
        CocheRueda rueda4 = new CocheRueda(true, 50);
        
        // Coche 1
        Coche coche1 = new Coche(motor1,puerta1,puerta2,rueda1,rueda2,rueda3, rueda4);
        System.out.println(coche1);
        
        rueda1.desinflar();
        System.out.println(coche1);
        
        // Coche 2
        Coche coche2 = new Coche(new CocheMotor(false, 2.0),new CochePuerta(false, new CocheVentana(true, true)),new CochePuerta(false, new CocheVentana(true, true)),new CocheRueda(true, 50),new CocheRueda(true, 50),new CocheRueda(true, 50), new CocheRueda(true, 50));
        System.out.println(coche2);
        System.out.println("Poner la ventana puerta piloto coche2 sin tintar");
        coche2.getPuertaDelDer().getVentana().setTintado(false);
        System.out.println(coche2);
        System.out.println("Diametro de la rueda delantera izquierda");
        System.out.println(coche2.getRuedaDelIzq().getDiametro());
        System.out.println("Arrancar el motor de coche2");
        coche2.getMotor().arrancar();
    }
    
}
