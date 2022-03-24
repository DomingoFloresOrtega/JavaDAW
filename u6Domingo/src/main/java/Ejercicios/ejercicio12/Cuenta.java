/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio12;

import Ejercicios.ejercicio3.Persona;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author domingo
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        this.numeroCuenta = RandomStringUtils.randomNumeric(20).toUpperCase(); // Creo numero de cuenta aleatorio
    }
    
    public Cuenta(){
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double saldoRetirada);
}
