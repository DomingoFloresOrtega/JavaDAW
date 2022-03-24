/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.ejercicio2;

/**
 *
 * @author domingo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo(343245L, "4050 ABJ", "VW", "GTI", "Blanco", 100.0);
        Turismo miTurismo = new Turismo(345674L, "4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, 2, false);
        Deportivo miDeportivo = new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000);
        Furgoneta miFurgoneta = new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8);

        
        System.out.print("Vehículo: " + miVehiculo.getAtributos());
        System.out.println("\n");
        System.out.print("Turismo: " + miTurismo.getAtributos());
        System.out.println("\n");
        System.out.print("Deportivo: " + miDeportivo.getAtributos());
        System.out.println("\n");
        System.out.print("Furgoneta " + miFurgoneta.getAtributos());
        System.out.println("\n");
        System.out.print("Turismo: " + miTurismo.getMatricula() + " " + miTurismo.getMarca() + " " + miTurismo.getModelo());
    }

}
