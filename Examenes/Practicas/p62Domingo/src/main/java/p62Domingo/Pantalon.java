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
public final class Pantalon extends Ropa{
    private String talla;

    public Pantalon() {
    }

    public Pantalon(String talla, String marca, int codigo, int precio, int iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override // Metodo polimorfico
    public String toString() {
        return super.toString() + "Pantalon{" + "talla=" + talla + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.talla);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        
        final Pantalon other = (Pantalon) obj;
        return Objects.equals(this.talla, other.talla);
    }
}
