/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.tarea6C;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Medico extends Empleado {
    private String especialidad;

    public Medico() {
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.especialidad);
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
        final Medico other = (Medico) obj;
        return Objects.equals(this.especialidad, other.especialidad);
    }

    @Override
    public String toString() {
        return super.toString() + "Medico{" + "especialidad=" + especialidad + '}';
    }
    
    public void tratar(Paciente paciente, String medicina){
        System.out.println("El medico " + this.getNombre() + " trata a " + paciente.getNombre() + 
                " con la medicina " + medicina);
    }
    
    @Override
    public double calcularIRPF(){
        if (this.especialidad.equalsIgnoreCase("Cirugia")){
            return this.getSalario()*0.25;
        } else {
            return this.getSalario()*0.235;
        }
    }
}
