/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tarea2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author domingo
 */
public class Test {

    public static void main(String[] args) {
        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Domingo Flores Ortega - 1ºDAW");

        // La ventana no se puede redimensionar
        ventanaPrincipal.setResizable(false);

        // Establecemos posición y tamaño
        ventanaPrincipal.setBounds(250, 250, 800, 600);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecemos posición y tamaño
        // ventanaPrincipal.setBounds(250, 250, 800, 600);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        ventanaPrincipal.add(new MiPanel(Color.green), BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(new MiPanel(Color.yellow), BorderLayout.SOUTH);
        
        // Añadir panel gris en la posición central (CENTER)
        ventanaPrincipal.add(new MiPanel(Color.blue), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(new MiPanel(Color.green), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(new MiPanel(Color.cyan), BorderLayout.EAST);

    }
}
