/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62Domingo;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public final class Musica extends Producto {
    private String grupo;

    public Musica() {
    }

    public Musica(String grupo, int codigo, int precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.grupo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        
        final Musica other = (Musica) obj;
        return Objects.equals(this.grupo, other.grupo);
    }

    @Override // Metodo polimorfico
    public String toString() {
        return super.toString() + "Musica{" + "grupo=" + grupo + '}';
    }
}
