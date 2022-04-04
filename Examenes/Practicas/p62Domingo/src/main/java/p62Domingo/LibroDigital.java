/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62Domingo;

/**
 *
 * @author domingo
 */
public final class LibroDigital extends Libro implements SeDescarga {
    private double numBytes;

    public LibroDigital() {
    }

    public LibroDigital(double numBytes, String isbn, int codigo, int precio, int iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numBytes = numBytes;
    }

    public double getNumBytes() {
        return numBytes;
    }

    public void setNumBytes(double numBytes) {
        this.numBytes = numBytes;
    }

    @Override // Metodo polimorfico
    public String toString() {
        return super.toString() + "LibroDigital{" + "numBytes=" + numBytes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.numBytes) ^ (Double.doubleToLongBits(this.numBytes) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        final LibroDigital other = (LibroDigital) obj;
        return Double.doubleToLongBits(this.numBytes) == Double.doubleToLongBits(other.numBytes);
    }
    
    

    @Override
    public void descargar() {
        System.out.println("http://domingo.daw/" + this.hashCode());
    }
    
    public void adicional(){
        System.out.println("Incluye audiolibro de regalo");
    }
}
