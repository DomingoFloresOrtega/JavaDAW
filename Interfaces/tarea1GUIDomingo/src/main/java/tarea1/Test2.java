/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tarea1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author domingo
 */

public class Test2 {

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
        // Añadir panel amarillo en la posición superior con etiqueta distinta (NORTH)
        MiPanel verde = new MiPanel(Color.green);
        verde.getEtiqueta().setText("Verde");
        ventanaPrincipal.add(verde, BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior con etiqueta distinta (SOUTH)
        MiPanel amarillo = new MiPanel(Color.yellow);
        amarillo.getEtiqueta().setText("Amarillo");
        ventanaPrincipal.add(amarillo, BorderLayout.SOUTH);
        
        // Añadir panel gris en la posición central con etiqueta distinta (CENTER)
        MiPanel azul = new MiPanel(Color.blue);
        azul.getEtiqueta().setText("Azul");
        ventanaPrincipal.add(azul, BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda con etiqueta distinta (WEST)
        MiPanel verde2 = new MiPanel(Color.green);
        verde2.getEtiqueta().setText("Verde 2");
        ventanaPrincipal.add(verde2, BorderLayout.WEST);

        // Añadir panel cián en la posición derecha con etiqueta distinta (EAST)
        MiPanel cyan = new MiPanel(Color.cyan);
        cyan.getEtiqueta().setText("Cyan");
        ventanaPrincipal.add(cyan, BorderLayout.EAST);
    }
}
