/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.tarea6C;

import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class Hospital {
    private String nombre;
    private String direccion;
    private int numeroCamas;
    
    private ArrayList<Paciente> pacientes;
    private ArrayList<Empleado> empleados;

    public Hospital() {
    }

    public Hospital(String nombre, String direccion, int numeroCamas, ArrayList<Paciente> pacientes, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.pacientes = pacientes;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", direccion=" + direccion + ", numeroCamas=" + numeroCamas + ", pacientes=" + pacientes + ", empleados=" + empleados + '}';
    }
    
    public void contratarEmpleado(Empleado emp){
        empleados.add(emp);
    }
    
    public void ingresarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
}
