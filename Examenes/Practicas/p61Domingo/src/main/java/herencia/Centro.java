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
public abstract class Centro implements Comparable<Centro> { // Implemento el metodo Comparable
    protected String nombre;
    protected String cif;
    protected String direccion;

    public Centro() {
    }

    public Centro(String nombre, String cif, String direccion) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.cif);
        hash = 67 * hash + Objects.hashCode(this.direccion);
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
        final Centro other = (Centro) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }

    @Override // Metodo polimorfico
    public String toString() {
        return "Centro{" + "nombre=" + nombre + ", cif=" + cif + ", direccion=" + direccion + '}';
    }
    
    // Metodo abstracto
    public abstract String director();
    
    // Creo metodo compareTo para comparar y poder ordenar la lista
    @Override
    public int compareTo(Centro c) {
        return this.nombre.compareTo(c.nombre);
    }
}
