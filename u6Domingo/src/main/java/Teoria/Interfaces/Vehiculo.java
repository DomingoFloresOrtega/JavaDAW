/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.Interfaces;

/**
 *
 * @author domingo
 */
public abstract class Vehiculo implements SeArranca, SePara, Comparable<Vehiculo> {
    private String matricula;
    
    public abstract void repostar(String tipoCombustible);

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + '}';
    }
    
    // Al implementar la interface esta clase debería
    // dar código a arrancar(), pero al ser abstracta puede
    // dejarlo que lo hagan las clases hijas
    
    public boolean arrancar(){
        System.out.println("El vehiculo ha arrancado...");
        return true;
    }
    
    public boolean parar(){
        System.out.println("El vehiculo se ha parado...");
        return false;
    }
    
    // Implemento compareTo (Comparable)
    public int compareTo(Vehiculo v){
        return this.matricula.compareTo(v.matricula);
    }
}
