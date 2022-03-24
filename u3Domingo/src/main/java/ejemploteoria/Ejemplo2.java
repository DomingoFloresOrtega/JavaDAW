/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploteoria;

/**
 *
 * @author domingo
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion = 7;

        if (calificacion == 10) {
            System.out.println("Matrícula de Honor");
        } else if (calificacion == 9) {
            System.out.println("Sobresaliente");
        } else if (calificacion >= 7) {
            System.out.println("Notable");
        } else if (calificacion == 6) {
            System.out.println("Bien");
        } else if (calificacion == 5) {

            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

    }

}
