/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcetines;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Calcetin {
    private Colores color;
    private int talla;

    public Calcetin() {
    }

    public Calcetin(Colores color, int talla) {
        this.color = color;
        this.talla = talla;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Calcetin{" + "color=" + color + ", talla=" + talla + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.color);
        hash = 67 * hash + this.talla;
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
        final Calcetin other = (Calcetin) obj;
        
        return this.color == other.color && this.talla == other.talla;
    }
}
