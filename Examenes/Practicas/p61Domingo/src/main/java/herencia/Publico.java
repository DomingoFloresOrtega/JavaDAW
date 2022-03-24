/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Publico extends Centro {
    protected String partidaPresupuestaria;

    public Publico() {
    }

    public Publico(String partidaPresupuestaria, String nombre, String cif, String direccion) {
        super(nombre, cif, direccion);
        this.partidaPresupuestaria = partidaPresupuestaria;
    }

    public String getPartidaPresupuestaria() {
        return partidaPresupuestaria;
    }

    public void setPartidaPresupuestaria(String partidaPresupuestaria) {
        this.partidaPresupuestaria = partidaPresupuestaria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.partidaPresupuestaria);
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
        final Publico other = (Publico) obj;
        return Objects.equals(this.partidaPresupuestaria, other.partidaPresupuestaria);
    }

    @Override // Metodo polimorfico
    public String toString() {
        return super.toString() + "Publico{" + "partidaPresupuestaria=" + partidaPresupuestaria + '}';
    }
    
    @Override // Metodo polimorfico
    public String director(){
        return "Antonio Martinez";
    }
    
    // Metodo propio de la clase
    public boolean subvencionado(){
        return true;
    }
    
    public int numeroMaterias(){
        return 15;
    }
}
