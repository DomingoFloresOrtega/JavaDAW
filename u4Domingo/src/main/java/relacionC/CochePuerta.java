/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class CochePuerta {
    private boolean abierto;
    private CocheVentana ventana;

    public CochePuerta() {
    }

    public CochePuerta(boolean abierto, CocheVentana ventana) {
        this.abierto = abierto;
        this.ventana = ventana;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void abierta() {
        this.abierto = true;
    }
    
    public void cerrada() {
        this.abierto = false;
    }

    public CocheVentana getVentana() {
        return ventana;
    }

    public void setVentana(CocheVentana ventana) {
        this.ventana = ventana;
    }

    // Recordatorio: Hay que implementar toString en CocheVentana
    @Override
    public String toString() {
        return "CochePuerta{" + "abierto=" + abierto + ", ventana=" + ventana + '}';
    }
}
