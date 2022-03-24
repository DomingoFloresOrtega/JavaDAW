/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class CocheRueda {
    private boolean estado;
    private int diametro;

    public CocheRueda() {
    }

    public CocheRueda(boolean estado, int diametro) {
        this.estado = estado;
        this.diametro = diametro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void inflar() {
        this.estado = true;
    }
    
    public void desinflar() {
        this.estado = false;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "CocheRueda{" + "estado=" + estado + ", diametro=" + diametro + '}';
    }
}
