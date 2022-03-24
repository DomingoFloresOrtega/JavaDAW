/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_seleccion;

/**
 *
 * @author domingo
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int variable=3, variable2;
        
        switch(variable){

	case 1:
            variable2=5;
            break;
	case 2:
            variable2=20;
            break;
	case 3:
            variable2=30;// Habra que agregar break
            break;
	case 4:
            variable2=10;
	default:
            variable2=100; 
            break; 
        }
    }
}
