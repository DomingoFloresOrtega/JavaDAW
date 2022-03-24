/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_seleccion;

/**
 *
 * @author domingo
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // El programa sirve para extraer el numero del departamento
        char departamento = 'B';

      
        switch(departamento){
         case 'A' :
            System.out.println("Desarrollo");
            break;
         case 'B' :
            System.out.println("Recursos Humanos"); // Deberemos corregir el error "
            break;
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
         default :
            System.out.println("Departamento no válido"); // Deberemos corregir el error "
      }
      
        System.out.println("Código para el departamento es " + departamento); // Deberemos corregir el error \"

    }
    
}
