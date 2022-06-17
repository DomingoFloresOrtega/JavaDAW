/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

import java.util.Random;

/**
 *
 * @author domingo
 */
public class Vaca {
    private double peso;
    private Raza raza;
    private Sexo sexo;
    Random numero = new Random();

    public Vaca() {
        this.peso = numero.nextInt(300-1);
        this.raza = Raza.randomRaza();
        this.sexo = Sexo.randomSexo();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Vaca{" + "peso=" + peso + ", raza=" + raza + ", sexo=" + sexo + '}';
    }
}
