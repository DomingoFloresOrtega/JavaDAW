/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domingo.p81domingo;

/**
 *
 * @author domingo
 */
public class CentrosVO {
    private int numce;
    private String nomce;
    private String dirce;
    private String codPostal;

    public CentrosVO(int numce, String nomce, String dirce, String codPostal) {
        this.numce = numce;
        this.nomce = nomce;
        this.dirce = dirce;
        this.codPostal = codPostal;
    }

    public CentrosVO() {
    }

    public int getNumce() {
        return numce;
    }

    public void setNumce(int numce) {
        this.numce = numce;
    }

    public String getNomce() {
        return nomce;
    }

    public void setNomce(String nomce) {
        this.nomce = nomce;
    }

    public String getDirce() {
        return dirce;
    }

    public void setDirce(String dirce) {
        this.dirce = dirce;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return "CentrosVO{" + "numce=" + numce + ", nomce=" + nomce + ", dirce=" + dirce + ", codPostal=" + codPostal + '}';
    }
}
