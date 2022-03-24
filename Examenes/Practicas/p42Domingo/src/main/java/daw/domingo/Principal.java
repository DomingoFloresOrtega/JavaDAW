/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.domingo;

/**
 *
 * @author domingo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Punto 1
        Tarjeta tarjeta1 = new Tarjeta();
        Tarjeta tarjeta2 = new Tarjeta("Otra persona curiosa", "2341589709764357", 5, 2021, 2344, 500);
        
      // Punto 2
        Tarjeta tarjeta3 = Tarjeta.copia(tarjeta2);
        
      // Punto 3
        // Por consola
        System.out.println("TARJETA 1");
        System.out.println("Titular de la tarjeta: " + tarjeta1.getTitularTarjeta());
        System.out.println("BancoEmisor: " + tarjeta1.getBancoEmisor());
        System.out.println("Fecha de caducidad: " + tarjeta1.getFechaCaduc());
        System.out.println("Credito: " + tarjeta1.getLimiteCredito());
        System.out.println("Numero de tarjeta: " + tarjeta1.getNumTarjeta());
        
        System.out.println("TARJETA 2");
        System.out.println("Titular de la tarjeta: " + tarjeta2.getTitularTarjeta());
        System.out.println("BancoEmisor: " + tarjeta2.getBancoEmisor());
        System.out.println("Fecha de caducidad: " + tarjeta2.getFechaCaduc());
        System.out.println("Credito: " + tarjeta2.getLimiteCredito());
        System.out.println("Numero de tarjeta: " + tarjeta2.getNumTarjeta());
        
        System.out.println("TARJETA 3");
        System.out.println("Titular de la tarjeta: " + tarjeta3.getTitularTarjeta());
        System.out.println("BancoEmisor: " + tarjeta3.getBancoEmisor());
        System.out.println("Fecha de caducidad: " + tarjeta3.getFechaCaduc());
        System.out.println("Credito: " + tarjeta3.getLimiteCredito());
        System.out.println("Numero de tarjeta: " + tarjeta3.getNumTarjeta());
        
        // ToString
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);
        System.out.println(tarjeta3);
        
      // Punto 4
        tarjeta2.setEstadoTarjeta(false);
        
      // Punto 5
        tarjeta2.setEstadoTarjeta(true);
        
        
    }
    
}
