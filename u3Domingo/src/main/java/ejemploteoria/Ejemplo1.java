/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploteoria;

/**
 *
 * @author domingo
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion = 7;

        if (calificacion == 10) {
            System.out.println("Matrícula de Honor");
        } else { // else1

            if (calificacion == 9) {
                System.out.println("Sobresaliente");
            } else { // else2

                if (calificacion >= 7) {
                    System.out.println("Notable");
                } else { // else3

                    if (calificacion == 6) {
                        System.out.println("Bien");
                    } else { // else4

                        if (calificacion == 5) {
                            System.out.println("Aprobado");
                        } else { // else5

                            System.out.println("Suspenso");

                        } // else5

                    } // else4

                } // else3

            } // else 2

        } // else1

    }
    
}
