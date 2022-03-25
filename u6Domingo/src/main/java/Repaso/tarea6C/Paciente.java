/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.tarea6C;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author domingo
 */
public class Paciente extends Persona {
    private String numeroHistoria;

    public Paciente() {
    }

    public Paciente(String numeroHistoria, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.numeroHistoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        super.equals(obj);
        
        final Paciente other = (Paciente) obj;
        return Objects.equals(this.numeroHistoria, other.numeroHistoria);
    }

    @Override
    public String toString() {
        return super.toString() + "Paciente{" + "numeroHistoria=" + numeroHistoria + '}';
    }
    
    public void tomarMedicina(String medicina){
        Random random = new Random();
        boolean curado = random.nextBoolean();
        
        if (curado = true){
            System.out.println("El paciente se ha curado");
        } else {
            System.out.println("El paciente no se ha curado");
        }
    }
}
