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
public abstract class Libro extends Producto implements Comparable<Libro>{
    private String isbn;

    public Libro() {
    }

    public Libro(String isbn, int codigo, int precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override // Metodo polimorfico
    public String toString() {
        return super.toString() + "Libro{" + "isbn=" + isbn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    @Override
    public int compareTo(Libro t) {
        return this.isbn.compareTo(t.getIsbn());
    }
    
    public abstract void adicional();
}
