/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author domingo
 */
public class RegistroJSON {
    private String nombre;
    private String oacv, ea, tii, tc, ing, fol, ceac;

    public RegistroJSON() {
    }

    public RegistroJSON(String nombre, String oacv, String ea, String tii, String tc, String ing, String fol, String ceac) {
        this.nombre = nombre;
        this.oacv = oacv;
        this.ea = ea;
        this.tii = tii;
        this.tc = tc;
        this.ing = ing;
        this.fol = fol;
        this.ceac = ceac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOacv() {
        return oacv;
    }

    public void setOacv(String oacv) {
        this.oacv = oacv;
    }

    public String getEa() {
        return ea;
    }

    public void setEa(String ea) {
        this.ea = ea;
    }

    public String getTii() {
        return tii;
    }

    public void setTii(String tii) {
        this.tii = tii;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public String getFol() {
        return fol;
    }

    public void setFol(String fol) {
        this.fol = fol;
    }

    public String getCeac() {
        return ceac;
    }

    public void setCeac(String ceac) {
        this.ceac = ceac;
    }

    @Override
    public String toString() {
        return "RegistroJSON{" + "nombre=" + nombre + ", oacv=" + oacv + ", ea=" + ea + ", tii=" + tii + ", tc=" + tc + ", ing=" + ing + ", fol=" + fol + ", ceac=" + ceac + '}';
    }
}
