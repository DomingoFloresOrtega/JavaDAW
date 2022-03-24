/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class Coche {
    private CocheMotor motor;
    private CochePuerta puertaDelDer;
    private CochePuerta puertaDelIzq;
    private CocheRueda ruedaDelDer;
    private CocheRueda ruedaDelIzq;
    private CocheRueda ruedaTraDer;
    private CocheRueda ruedaTraIzq;

    public Coche() {
    }

    public Coche(CocheMotor motor, CochePuerta puertaDelDer, CochePuerta puertaDelIzq, CocheRueda ruedaDelDer, CocheRueda ruedaDelIzq, CocheRueda ruedaTraDer, CocheRueda ruedaTraIzq) {
        this.motor = motor;
        this.puertaDelDer = puertaDelDer;
        this.puertaDelIzq = puertaDelIzq;
        this.ruedaDelDer = ruedaDelDer;
        this.ruedaDelIzq = ruedaDelIzq;
        this.ruedaTraDer = ruedaTraDer;
        this.ruedaTraIzq = ruedaTraIzq;
    }

    public CocheMotor getMotor() {
        return motor;
    }

    public void setMotor(CocheMotor motor) {
        this.motor = motor;
    }

    public CochePuerta getPuertaDelDer() {
        return puertaDelDer;
    }

    public void setPuertaDelDer(CochePuerta puertaDelDer) {
        this.puertaDelDer = puertaDelDer;
    }

    public CochePuerta getPuertaDelIzq() {
        return puertaDelIzq;
    }

    public void setPuertaDelIzq(CochePuerta puertaDelIzq) {
        this.puertaDelIzq = puertaDelIzq;
    }

    public CocheRueda getRuedaDelDer() {
        return ruedaDelDer;
    }

    public void setRuedaDelDer(CocheRueda ruedaDelDer) {
        this.ruedaDelDer = ruedaDelDer;
    }

    public CocheRueda getRuedaDelIzq() {
        return ruedaDelIzq;
    }

    public void setRuedaDelIzq(CocheRueda ruedaDelIzq) {
        this.ruedaDelIzq = ruedaDelIzq;
    }

    public CocheRueda getRuedaTraDer() {
        return ruedaTraDer;
    }

    public void setRuedaTraDer(CocheRueda ruedaTraDer) {
        this.ruedaTraDer = ruedaTraDer;
    }

    public CocheRueda getRuedaTraIzq() {
        return ruedaTraIzq;
    }

    public void setRuedaTraIzq(CocheRueda ruedaTraIzq) {
        this.ruedaTraIzq = ruedaTraIzq;
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puertaDelDer=" + puertaDelDer + ", puertaDelIzq=" + puertaDelIzq + ", ruedaDelDer=" + ruedaDelDer + ", ruedaDelIzq=" + ruedaDelIzq + ", ruedaTraDer=" + ruedaTraDer + ", ruedaTraIzq=" + ruedaTraIzq + '}';
    }
}
