/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Repaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declarar variables primitivas
        int variable1, variable2;
        // Cabel Case
        double estaturaPersona;
        String nombrePersona;

        // Inicializamos variables
        variable1 = 12;
        variable2 = 14;

        // Declaramos e inicializamos variables
        float pesoPersona = 67.6f; // <-- ¡! La f al ser float ¡!
        long millonesQueMeVaisAPagar = 23_000_000_000l;

        // Constantes
        final boolean SIEMPRESI = true;
        final double SUPLEMENTO = 123.45;
        // Al ser constante no puede cambiar su valor
        //SIEMPRESI = false;

        // Los valores concretos de un tipo de datos son literales
        long numero1 = 23; // int--> long (conversión implícita)
        long numero2 = 23l; // long --> long
        long numero2a = (long) 23; // conversión explícita

        // long expresion = 12/5; // Se come los decimales y se queda con la parte entera
        double expresion = variable1 / (double) variable2; //<--- Forzamos a variable 2 a double
        System.out.println(expresion);

        // Math.ceil (redondea hacia arriba)
        double redondeo = Math.ceil(3.4); // <--- redondea a 4
        System.out.println("Redondeo 1: " + redondeo);
        // Math.floor (redondea hacia abajo)
        double redondeo2 = Math.floor(4.9); // <--- redondea a 4
        System.out.println("Redondeo 2: " + redondeo2);
        //Math.round (redondea al mas cercano)
        double redondeo3 = Math.round(4.5); // <--- redondea a 5
        System.out.println("Redondeo3: " + redondeo3);
        
        // Math.round en pesoPersona
        double peso = Math.round(pesoPersona);
        
        // Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduzca el peso de la persona: ");
        pesoPersona = entradaTeclado.nextFloat();
        System.out.println("Introduzca la estatura de la persona: ");
        estaturaPersona = entradaTeclado.nextFloat();
        // Con Scanner, después de leer numeros 
        entradaTeclado.nextLine();
        System.out.println("Introduce tu nombre: ");
        nombrePersona = entradaTeclado.nextLine();
        
        double imc = pesoPersona / Math.pow(estaturaPersona, 2);
        System.out.println(nombrePersona + ", su IMC es de: " + imc);
        //System.out.printf("%s tu IMC es de %.2f", imc);
        
        // Resultados segun tabla
        if (imc <18.5) {
            System.out.println("Su peso es inferior al normal"); 
        }
        else {
            if (imc>18.5 && imc<24.9) {
                System.out.println("Esta en el peso ideal");
            }
            else {
                if (imc>25 && imc<29.9) {
                    System.out.println("Su peso es superior al normal");
                }
                else {
                    if (imc>30){
                        System.out.println("Tiene obesidad");
                    }
                }
            }
        }
        
        // Para calcular IMC: IMC = peso [kg] / estatura [m2]
        
        // JOption
        String apellido = JOptionPane.showInputDialog("Introduce tu apellido:");
        System.out.println("Bienvenido, " + apellido);
        String dinerosTexto = JOptionPane.showInputDialog("Introduce el dinero para sobornar");
        double dineros = Double.parseDouble(dinerosTexto);
        // Mostramos con System.Out
        System.out.println("El profe va a recibir " + (SUPLEMENTO+dineros) + " al mes");
        // Mostramos con JOption
        JOptionPane.showMessageDialog(null, "El profe va a recibir " + (SUPLEMENTO+dineros) + " al mes");

    }

}
