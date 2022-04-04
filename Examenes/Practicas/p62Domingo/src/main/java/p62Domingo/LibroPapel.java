/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62Domingo;

/**
 *
 * @author domingo
 */
public final class LibroPapel extends Libro implements SeEnvia {
    private int numPaginas;

    public LibroPapel() {
    }

    public LibroPapel(int numPaginas, String isbn, int codigo, int precio, int iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override // Metodo polimorfico
    public String toString() {
        return super.toString() + "LibroPapel{" + "numPaginas=" + numPaginas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numPaginas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        
        final LibroPapel other = (LibroPapel) obj;
        return this.numPaginas == other.numPaginas;
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El libro se enviara a la dirección: " + direccion);
    }
    
    public void adicional(){
        System.out.println("Incluye poster de regalo");
    }
}
