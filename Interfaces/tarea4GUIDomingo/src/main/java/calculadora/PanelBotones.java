/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author domingo
 */
public class PanelBotones extends JPanel {

    // Números del 0 al 9 y seis botones más para
    // suma, resta, multiplicacion, división, resultado y limpiar
    JButton[] grupoBotones = new JButton[16];

    public PanelBotones() {
        initComponents();
    }

    private void initComponents() {

        // Creación de los botones
        for (int i = 0; i < 10; i++) {
            grupoBotones[i] = new JButton(Integer.toString(i));
        }
        grupoBotones[10] = new JButton("+");
        grupoBotones[11] = new JButton("-");
        grupoBotones[12] = new JButton("*");
        grupoBotones[13] = new JButton("/");
        grupoBotones[14] = new JButton("=");
        grupoBotones[15] = new JButton("C");

// Establecemos el layout
        this.setLayout(new GridLayout(4, 4));

        for (JButton boton : grupoBotones) {
            this.add(boton);
        }
    }

    public JButton[] getgrupoBotones() {
        return grupoBotones;
    }
}
