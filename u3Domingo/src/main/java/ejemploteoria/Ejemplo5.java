/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploteoria;

/**
 *
 * @author domingo
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cotizacion = 150; // Un valor cualquiera
    char categoriaProfesional;


    if (cotizacion < 80)
        categoriaProfesional = 'C';
    else{
            if (cotizacion < 120)
        categoriaProfesional = 'B';
            else
        categoriaProfesional = 'A';
    }


    System.out.print("Cotización " + cotizacion + " euros, "); 
    System.out.print("Categoría " + categoriaProfesional + " de ");

    switch (categoriaProfesional) {
            case 'A':
                    System.out.print("Socio "); 
            case 'B': 
                    System.out.print("Senior "); 
            case 'C': 	
                    System.out.print("Junior ");
            default:  
                    System.out.print("¡Indefinida! ");
    }
    }
    }
