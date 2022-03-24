/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.trabajador;

/**
 *
 * @author domingo
 */
public class Cocinero extends Trabajador{
    
    private String partida;

    public Cocinero(String partida, String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
        this.partida = partida;
    }

    public Cocinero() {
    }

    public Cocinero(String partida) {
        this.partida = partida;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Cocinero{" + "partida=" + partida + '}';
    }
    
    @Override
    public void cotizar(){
        System.out.println("Cotizando como Cocinero");
    }
    
    public void prepararPlato(String plato){
        System.out.println("Cocinero preparando " + plato);
    }
}
