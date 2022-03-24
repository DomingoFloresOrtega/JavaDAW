/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class CocheVentana {
    private boolean abierta;
    private boolean tintado;

    public CocheVentana() {
    }

    public CocheVentana(boolean abierta, boolean tintado) {
        this.abierta = abierta;
        this.tintado = tintado;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void abierta() {
        this.abierta = true;
    }
    
    public void cerrada() {
        this.abierta = false;
    }

    public boolean isTintado() {
        return tintado;
    }

    public void setTintado(boolean tintado) {
        this.tintado = tintado;
    }

    @Override
    public String toString() {
        return "CocheVentana{" + "abierta=" + abierta + ", tintado=" + tintado + '}';
    }
}
