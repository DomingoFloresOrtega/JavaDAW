/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaVendiing;


/**
 *
 * @author hinda
 */
public class Moneda1 {

    //Atributos
    private double moneda;
    private int stock;

    //constantes
    private final double MAXMONEDA = 20;
    private final double MINMONEDA = 0.10;

    //constrector por defecto
    public Moneda1() {
    }

    //constrector parametrizado
    public Moneda1(double moneda, int stock) {
        this.moneda = moneda;
        if (this.moneda < MINMONEDA || this.moneda > MAXMONEDA) {
            this.moneda = MAXMONEDA;
        }
        this.stock = stock;
        if (this.stock < 0) {
            this.stock = 0;
        }
    }

    //getters y setters 
    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
        if (this.moneda < MINMONEDA || this.moneda > MAXMONEDA) {
            this.moneda = MAXMONEDA;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        if (this.stock < 0) {
            this.stock = 0;
        }
    }

    @Override
    public String toString() {
        return "Moneda1{" + "moneda=" + moneda + ", stock=" + stock +'}';
    }

    //Recargar efectivo metodo que recibe moneda y stock para cambiar el valor de stock actual añadilo el stock que passamos como parametro
    public void recargarEffectivo(double moneda,int stock){
        if(this.moneda==moneda){
            this.stock+=stock;
        }
    }
   


}
