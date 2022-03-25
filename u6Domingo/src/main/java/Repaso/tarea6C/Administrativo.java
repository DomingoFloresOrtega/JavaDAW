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
public class Administrativo extends Empleado {
    private Grupo grupo;

    public Administrativo() {
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.grupo);
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
        final Administrativo other = (Administrativo) obj;
        return this.grupo == other.grupo;
    }

    @Override
    public String toString() {
        return super.toString() + "Administrativo{" + "grupo=" + grupo + '}';
    }
    
    public void registrarDocumento(String nombreDoc){
        System.out.println("=== Registro de documento ===");
        System.out.println("Persona que registra el documento: " + this.getNombre() + " " + this.getApellidos());
        System.out.println("=== DATOS DEL DOCUMENTO ===");
        System.out.println("Nombre del documento: " + nombreDoc);
        System.out.println("Hashcode del documento: " + nombreDoc.hashCode());
    }
    
    @Override
    public double calcularIRPF(){
        if (this.grupo.equals(Grupo.C)){
            return (this.getSalario()*this.grupo.getIrpf());
        } else if (this.grupo.equals(Grupo.D)){
            return this.getSalario()*this.grupo.getIrpf();
        } else if (this.grupo.equals(Grupo.E)){
            return this.getSalario()*this.grupo.getIrpf();
        } else {
            return this.getSalario();
        }
    }
}
