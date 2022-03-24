/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio12;

import Ejercicios.ejercicio3.Persona;

/**
 *
 * @author domingo
 */
public class CuentaCorriente extends Cuenta {
    private double interesFijo = 1.5;
    private double saldoMin;

    public CuentaCorriente() {
        super();
    }

    public CuentaCorriente(double interesFijo, double saldoMin, Persona cliente) {
        super(cliente);
        this.saldoMin = saldoMin;
        this.interesFijo = interesFijo;
    }
    
    public double getSaldoMinimo() {
        return saldoMin;
    }

    public void setSaldoMinimo(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente{" + "interesFijo=" + interesFijo + ", saldoMinimo=" + saldoMin + '}';
    }
    
    @Override
    public void retirar(double dineroRetirada){
        if (this.getSaldo()-dineroRetirada < saldoMin){
            System.out.println("No se puede retirar");
        } else {
            this.setSaldo(this.getSaldo()-dineroRetirada);
        }
    }
    
    @Override
    public void actualizarSaldo(){
        if (this.getSaldo() > 1000){
            this.setSaldo(this.getSaldo()+(saldoMin*interesFijo));
        } else {
            this.setSaldo(this.getSaldo()+interesFijo);
        }
    }
}
