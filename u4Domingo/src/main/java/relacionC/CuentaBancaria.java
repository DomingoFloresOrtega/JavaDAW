package relacionC;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author domingo
 */
public class CuentaBancaria {
    private String numCuenta;
    private String NIF;
    private String name;
    private double saldoActual;
    private double interesAnual;

    public CuentaBancaria() {
        this.numCuenta = RandomStringUtils.randomNumeric(20);
        this.NIF = "78456790R";
        this.name = "Samuel";
        this.saldoActual = 1500;
        this.interesAnual = 2;
    }

    public CuentaBancaria(String NIF, String name, double saldoActual, double interesAnual) {
        this.numCuenta = RandomStringUtils.randomNumeric(20);
        this.NIF = NIF;
        this.name = name;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNIF() {
        return NIF;
    }

    public String getName() {
        return name;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
        return this.saldoActual;
    }

    public double setInteresAnual(double interesAnual) {
        if (this.interesAnual >= 0.1 || this.interesAnual <=3){
            this.interesAnual = interesAnual;
        }
        this.interesAnual = interesAnual;
        return this.interesAnual;
    }
    
    public void ingresarIntereses(){
        this.saldoActual = this.saldoActual + (this.interesAnual * this.saldoActual);
    }
    
    public double ingresarDinero(double cantidad){
        this.saldoActual = this.saldoActual + cantidad;
        return this.saldoActual;
    }
    
    public double retirarEfectivo(double cantidad){
        if ((saldoActual - cantidad) > 0){
            this.saldoActual = this.saldoActual - cantidad;
        }
        return this.saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", NIF=" + NIF + ", name=" + name + ", saldoActual=" + saldoActual + ", interesAnual=" + interesAnual + '}';
    }
    
    
    
    
}
