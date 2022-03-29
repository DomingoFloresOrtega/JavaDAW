/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ejercicio13;

/**
 *
 * @author domingo
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private String codPostal;
    private String pais;

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String codPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", ciudad=" + ciudad + ", codPostal=" + codPostal + ", pais=" + pais + '}';
    }
    
    
}
