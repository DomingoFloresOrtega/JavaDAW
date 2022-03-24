/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Repaso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduzca su nombre");
        String edadTexto = JOptionPane.showInputDialog("Introduzca su edad");
        double edadDouble = Double.parseDouble(edadTexto);
        System.out.printf("Usted tiene %.2f años", edadDouble);
        int edad = (int) edadDouble;
        if (edad<18){
            JOptionPane.showMessageDialog(null, "Lo sentimos, no puedes usar este programa");
        }
        else {
            if (edad>=18){
                System.out.println("Bienvenido, " + nombre);
            }
        }
            }   
}
