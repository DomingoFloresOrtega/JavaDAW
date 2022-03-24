/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datosA = "0", datosB = "0", datosC = "0";
        int a = 0, b = 0, c = 0, x;
        double x1, x2;
        boolean textoCorrecto = true;

        do {
            try {
                datosA = JOptionPane.showInputDialog("Introduzca numero a", null);
                datosB = JOptionPane.showInputDialog("Introduzca numero b", null);
                datosC = JOptionPane.showInputDialog("Introduzca numero c", null);

                a = Integer.parseInt(datosA);
                b = Integer.parseInt(datosB);
                c = Integer.parseInt(datosC);
                textoCorrecto = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido caracteres no validos");
            }
        } while (textoCorrecto);

        if (a == 0 && b == 0) {
            System.out.println("La ecuación no tiene solución");
        } else if (a == 0 && b != 0) {
            x = -c / b;
            System.out.println("La solución es: " + x);
        } else {
            x1 = (-b + (Math.sqrt(b * b - 4 * a * c)) / 2 * a);
            x2 = (-b - (Math.sqrt(b * b - 4 * a * c)) / 2 * a);

            if ((b * b - 4 * a * c) < 0) {
                do {
                    try {
                        datosA = JOptionPane.showInputDialog("Introduzca numero a", null);
                        datosB = JOptionPane.showInputDialog("Introduzca numero b", null);
                        datosC = JOptionPane.showInputDialog("Introduzca numero c", null);

                        a = Integer.parseInt(datosA);
                        b = Integer.parseInt(datosB);
                        c = Integer.parseInt(datosC);
                        textoCorrecto = false;
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Ha introducido caracteres no validos");
                    }
                } while (textoCorrecto);
            }

            x1 = (-b + (Math.sqrt(b * b - 4 * a * c)) / 2 * a);
            x2 = (-b - (Math.sqrt(b * b - 4 * a * c)) / 2 * a);

            System.out.println("La solución 1 es:" + x1);
            System.out.println("La solución 2 es:" + x2);
        }
    }
}
