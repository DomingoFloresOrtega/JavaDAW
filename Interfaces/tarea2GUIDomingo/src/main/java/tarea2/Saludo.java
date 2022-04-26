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
public class Saludo extends JPanel implements ActionListener {

    private JButton botonSaludar, botonDespedir;
    private JTextArea texto;

    public Saludo(){
        initComponents();
    }

    private void initComponents(){

        botonSaludar = new JButton("Saludar");
        texto = new JTextArea(1,25);
        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(botonSaludar);
        this.add(texto);

        botonSaludar.addActionListener(this);

        // Añadimos el botón al panel
        this.add(botonDespedir);
        // Controlador del evento
        botonDespedir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        // Si el botón pulsado es botonSaludar
        if(ae.getSource() == botonSaludar){
            texto.setText("Hola amigos!!");
        } else {
            texto.setText("Adios amigos!!");
        }
    }




}


}
