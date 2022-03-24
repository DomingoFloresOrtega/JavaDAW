/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coche;

import java.util.Random;

/**
 *
 * @author domingo
 */
public class Vehiculo {

    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    boolean disponible;

    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula,
            String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }
    
    // los métodos ‘get’ y ‘set’ de la clase Vehiculo 

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void generarCoche(){
        String[] marca = {"Opel","Ford","Seat","Nissan","Golf","Hyundai","Ferrari"};
        String[] modelo = {"Astra","Mustang","Ibiza","Cascai","Polo","Leon","LaFerrari"};
        String[] color = {"Rojo","Azul","Verde","Rosa","Morado","Amarillo","Naranja"};
        String[] matricula = {"2349 OPL","1234 AAA","1974 JPG","9049 LPP","3410 ILE","0000 AAA"};
        
        Random numAleatorio = new Random();
        for (int i = 0; i < 100; i++){
            System.out.println("========= COCHE Nº" + (i+1) +"==========");
            System.out.println("Marca: " + marca[numAleatorio.nextInt(marca.length)]);
            System.out.println("Modelo: " + modelo[numAleatorio.nextInt(modelo.length)]);
            System.out.println("Color: " + color[numAleatorio.nextInt(color.length)]);
            System.out.println("Matricula: " + matricula[numAleatorio.nextInt(matricula.length)]);
        }
        
    }
}
