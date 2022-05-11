/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import javax.swing.JFrame;

/**
 *
 * @author domingo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Construimos la ventana
        JFrame frame = new JFrame("Domingo Flores Ortega - 1º DAW");

        // La ventana no se puede redimensionar
        frame.setResizable(false);

        // Posición de la ventana
        frame.setLocationRelativeTo(null);

        // Incluimos el panel en la ventana
        frame.add(new Aleatorios());

        // Ajusta el frame al contenido
        frame.pack();

        // Hacemos visible la ventana
        frame.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
