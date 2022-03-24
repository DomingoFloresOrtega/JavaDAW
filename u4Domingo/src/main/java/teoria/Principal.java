/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria;

/**
 *
 * @author domingo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion d1 = new Direccion("calle A", 3);
        Direccion d2 = new Direccion("calle B", 7);
        Persona p = new Persona("pepe", 20, d2);
        p.setDireccion(d1);
        Empresa e = new Empresa();
        e.setCif("1A");
        e.setDireccion(d2);

        System.out.println(p.getDireccion().getCalle());
        System.out.println(e.getDireccion().getCalle());
        
        System.out.println(p);
        p.setDireccion(d2);
        System.out.println(p.getDireccion().getNumero());
        p.getDireccion().setCalle("Tortola");
        System.out.println(p);
    }
}
