/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author domingo
 */
public class PanelPrincipal extends JPanel implements ActionListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    private JTextArea texto;
    private int tipoOperacion;

    // Constructor
    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }

    // Se inicializan los componentes gráficos y se colocan en el panel
    private void initComponents() {
        // Creamos el panel de botones
        botonera = new PanelBotones();
        // Creamos el área de texto
        texto = new JTextArea(10, 50);
        texto.setEditable(false);
        texto.setBackground(Color.white);

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(texto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton : this.botonera.getgrupoBotones()) {
            boton.addActionListener(this);
        }
    }
    
    public boolean controlExcepcion(String boton, JTextArea areaTexto) {
        try {
            Integer.parseInt(areaTexto.getText());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Se obtiene el objeto que desencadena el evento
        Object o = ae.getSource();
        String numeroA = "";
        int numeroAInt;
        String numeroB = "";
        int numeroBInt = 0;
        Boolean encontrado = true;
        String operador = "";
        int resultado = 0;
        int indiceOperador = 0;
        String resultadoString = null;
        StringBuilder sb = new StringBuilder();
        String igual;
        String operacion = "";
        
        // Si es un botón
        if (o instanceof JButton) {
            
            JButton campo = (JButton) o;
            System.out.println(campo.getText());
            
            // Comprobamos si existen excepciones
            if (!controlExcepcion(campo.getText(), texto)) {
                texto.setText(texto.getText() + campo.getText());
            } else {
                texto.setText(texto.getText() + campo.getText());
            }

            if (campo.getText().equals("+") || campo.getText().equals("-") || campo.getText().equals("*") || campo.getText().equals("/")) {
                for (int i = 10; i < this.botonera.getgrupoBotones().length - 1; i++) {
                    // Deshabilitar botones al pulsar al pulsar los operadores
                    this.botonera.getgrupoBotones()[i].setEnabled(false);
                }
            }
            
            for (int i = 0; i < texto.getText().length() - 1; i++) {
                switch (texto.getText().charAt(i)) {
                    case '+':
                        operador = "+";
                        encontrado = false;
                        break;
                    case '-':
                        operador = "-";
                        encontrado = false;
                        break;
                    case '*':
                        operador = "*";
                        encontrado = false;
                        break;
                    case '/':
                        operador = "/";
                        encontrado = false;
                        break;
                }
                
                if (encontrado) {
                    indiceOperador++;
                }
            }
            
            for (int i = 0; i < texto.getText().length() - 1; i++) {
                sb.append(texto.getText().charAt(i));
            }
            operacion = sb.toString();
            
            // Activar botones
            for (int i = 0; i < 10; i++) {
                if (campo.getText().equals(Integer.toString(i)) || campo.getText().equals("C")) {
                    for (int j = 10; j < this.botonera.getgrupoBotones().length - 1; j++) {
                        this.botonera.getgrupoBotones()[j].setEnabled(true);
                    }
                }
            }
            // Cuando se pulse clear se borrará lo que haya escrito
            if (campo.getText() == "C") {
                texto.setText("");
            }
            // Cuando se da al igual se harán los calculos
            if (((JButton) o).getText() == "=") {
                numeroA = texto.getText().substring(0, indiceOperador);
                numeroAInt = Integer.parseInt(numeroA);
                numeroBInt = Integer.parseInt(texto.getText().substring(indiceOperador + 1, texto.getText().length() - 1));

                igual = texto.getText().substring(numeroB.length(), texto.getText().length());
                System.out.println(texto.getText());

                // Seleccionar operador segun se pulse
                switch (operador) {
                    case "+":
                        resultado = numeroAInt + numeroBInt;
                        resultadoString = String.valueOf(resultado);
                        texto.setText(resultadoString);
                        break;
                    case "-":
                        resultado = numeroAInt - numeroBInt;
                        resultadoString = String.valueOf(resultado);
                        texto.setText(resultadoString);
                        break;
                    case "*":
                        resultado = numeroAInt * numeroBInt;
                        resultadoString = String.valueOf(resultado);
                        texto.setText(resultadoString);
                        break;
                    case "/":
                        resultado = numeroAInt / numeroBInt;
                        resultadoString = String.valueOf(resultado);
                        texto.setText(resultadoString);
                        break;
                }
            }

            // Seleccionar texto segun se seleccione
            switch (campo.getText()) {
                case "0":
                    texto.setText(texto.getText());
                    break;
                case "1":
                    texto.setText(texto.getText());
                    break;
                case "2":
                    texto.setText(texto.getText());
                    break;
                case "3":
                    texto.setText(texto.getText());
                    break;
                case "4":
                    texto.setText(texto.getText());
                    break;
                case "5":
                    texto.setText(texto.getText());
                    break;
                case "6":
                    texto.setText(texto.getText());
                    break;
                case "7":
                    texto.setText(texto.getText());
                    break;
                case "8":
                    texto.setText(texto.getText());
                    break;
                case "9":
                    texto.setText(texto.getText());
                    break;
            }
        }
    }
}
