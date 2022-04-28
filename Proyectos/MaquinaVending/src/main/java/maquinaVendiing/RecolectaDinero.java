/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaVendiing;

/**
 *
 * @author domingo
 */
public class RecolectaDinero {
    private int monedas5C;
    private int monedas10C;
    private int monedas20C;
    private int monedas50C;
    private int monedas1E;
    private int monedas2E;
    private int billetes5;
    private int billetes10;
    private int billetes20;
    private int billetes50;
    private double precioTarjetas;

    public RecolectaDinero() {
    }

    public RecolectaDinero(int monedas5C, int monedas10C, int monedas20C, int monedas50C, int monedas1E, int monedas2E, int billetes5, int billetes10, int billetes20, int billetes50) {
        this.monedas5C = monedas5C;
        this.monedas10C = monedas10C;
        this.monedas20C = monedas20C;
        this.monedas50C = monedas50C;
        this.monedas1E = monedas1E;
        this.monedas2E = monedas2E;
        this.billetes5 = billetes5;
        this.billetes10 = billetes10;
        this.billetes20 = billetes20;
        this.billetes50 = billetes50;
    }

    public int getMonedas5C() {
        return monedas5C;
    }

    public void setMonedas5C(int monedas5C) {
        this.monedas5C += monedas5C;
    }

    public int getMonedas10C() {
        return monedas10C;
    }

    public void setMonedas10C(int monedas10C) {
        this.monedas10C += monedas10C;
    }

    public int getMonedas20C() {
        return monedas20C;
    }

    public void setMonedas20C(int monedas20C) {
        this.monedas20C += monedas20C;
    }

    public int getMonedas50C() {
        return monedas50C;
    }

    public void setMonedas50C(int monedas50C) {
        this.monedas50C += monedas50C;
    }

    public int getMonedas1E() {
        return monedas1E;
    }

    public void setMonedas1E(int monedas1E) {
        this.monedas1E += monedas1E;
    }

    public int getMonedas2E() {
        return monedas2E;
    }

    public void setMonedas2E(int monedas2E) {
        this.monedas2E += monedas2E;
    }

    public int getBilletes5() {
        return billetes5;
    }

    public void setBilletes5(int billetes5) {
        this.billetes5 += billetes5;
    }

    public int getBilletes10() {
        return billetes10;
    }

    public void setBilletes10(int billetes10) {
        this.billetes10 += billetes10;
    }

    public int getBilletes20() {
        return billetes20;
    }

    public void setBilletes20(int billetes20) {
        this.billetes20 += billetes20;
    }

    public int getBilletes50() {
        return billetes50;
    }

    public void setBilletes50(int billetes50) {
        this.billetes50 += billetes50;
    }

    // Agregar recaudación de tarjetas
    public void setDineroTarjetas(double precio){
        this.precioTarjetas+=precio;
    }

    // Recolectar recaudación de tarjetas
    public double getDineroTarjetas(){
        return precioTarjetas;
    }
}
