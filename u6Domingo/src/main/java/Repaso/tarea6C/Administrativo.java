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
        System.out.println("=== Registro de documento ===");
        System.out.println("Persona que registra el documento: " + this.getNombre() + " " + this.getApellidos());
        System.out.println("=== DATOS DEL DOCUMENTO ===");
        System.out.println("Nombre del documento: " + nombreDoc);
        System.out.println("Hashcode del documento: " + nombreDoc.hashCode());
    }
    
    public double calcularIRPF(){
        if (this.grupo.equals("C")){
            return this.getSalario()*0.175;
        } else if (this.grupo.equals("D")){
            return this.getSalario()*0.18;
        } else if (this.grupo.equals("E")){
            return this.getSalario()*0.185;
        } else {
            return this.getSalario();
        }
    }
}
