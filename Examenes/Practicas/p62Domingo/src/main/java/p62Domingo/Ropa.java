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
public abstract class Ropa extends Producto implements SeEnvia {
    private String marca;

    public Ropa() {
    }

    public Ropa(String marca, int codigo, int precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override // Metodo polimorfico
    public String toString() {
        return super.toString() + "Ropa{" + "marca=" + marca + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }
    
    @Override
    public void enviar(String direccion) {
        System.out.println("La ropa se enviara a la dirección: " + direccion);
    }
}
