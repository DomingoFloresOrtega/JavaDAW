/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author domingo
 */
public class Saludo extends JPanel {

    private JButton botonNombre, botonApellidos;
    private JTextArea texto;

    public Saludo(){
        initComponents();
    }

    private void initComponents(){

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
    }
}
