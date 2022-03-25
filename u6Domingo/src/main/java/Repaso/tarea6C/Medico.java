/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.tarea6C;

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
    public String toString() {
        return super.toString() + "Medico{" + "especialidad=" + especialidad + '}';
    }
    
    public void tratar(Paciente paciente, String medicina){
        
    }
    
    @Override
    public double calcularIRPF(){
        return 2;
    }
}
