/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author domingo
 */
public class Privado extends Centro {
    private int plazas;

    public Privado() {
    }

    public Privado(int plazas, String nombre, String cif, String direccion) {
        super(nombre, cif, direccion);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.plazas;
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
        if (!super.equals(obj)){
            return false;
        }
        final Privado other = (Privado) obj;
        return this.plazas == other.plazas;
    }

    @Override // Metodo polimorfico
    public String toString() {
        return "Privado{" + "plazas=" + plazas + '}';
    }
    
    @Override // Metodo polimorfico
    public String director(){
        return "Chema Perez";
    }
    
    // Metodo propio de la clase
    public void ofertaEducativa(){
        System.out.println("Se oferta ESO, Bachillerato y FP");
    }
}
