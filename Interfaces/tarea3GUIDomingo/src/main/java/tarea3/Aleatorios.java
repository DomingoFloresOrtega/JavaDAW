/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author domingo
 */
public class Aleatorios extends JPanel {

    private JButton botonNombre, botonApellidos, botonAleatorio;
    private JTextArea texto;
    private JLabel numero;

    private static Random random = new Random();

    //Constructor
    public Aleatorios() {
        initComponents();
    }

    private void initComponents() {

        // Crear botones
        botonNombre = new JButton("Nombre");
        botonApellidos = new JButton("Apellidos");
        
        // Modificar texto
        texto = new JTextArea(1,25);
        texto.setBackground(Color.BLUE);

        this.setLayout(new FlowLayout());

        // Añadimos los botones
        this.add(botonNombre);
        this.add(botonApellidos);
        this.add(texto);

        // Le damos funcionalidad
        
        botonNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setBackground(Color.ORANGE);
                texto.setText("Domingo");
            }
        });
        
        botonApellidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setBackground(Color.ORANGE);
                texto.setText("Flores Ortega");
            }
        });

        botonAleatorio = new JButton("Generar numero aleatorio");
        numero = new JLabel("Numero");

        this.add(botonAleatorio);
        this.add(numero);

        botonAleatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero.setText(String.valueOf(random.nextInt(11)));
            }
        });

        botonAleatorio.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                botonAleatorio.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                botonAleatorio.setBackground(null);
            }
        });
    }
}
