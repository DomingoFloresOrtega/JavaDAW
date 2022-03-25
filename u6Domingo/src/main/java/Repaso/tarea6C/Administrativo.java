/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.tarea6C;

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
    public String toString() {
        return super.toString() + "Administrativo{" + "grupo=" + grupo + '}';
    }
    
    public void registrarDocumento(String nombreDoc){
        
    }
    
    public double calcularIRPF(){
        return 3;
    }
}
