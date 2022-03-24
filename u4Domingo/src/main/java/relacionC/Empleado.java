/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class Empleado {

    private String NIF, name, apellidos, casado;
    private double sueldoBase, pagoHoraExtra, horaExtraMes, porcentajeIRPF, retencionIRPF, sueldoneto, sueldobruto;
    private int numHijos;

    public Empleado(String name, String apellidos, String NIF, double sueldoBase, double pagoHoraExtra, double horaExtraMes, double porcentajeIRPF, int numHijos, String casado) {
        this.name = name;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        if (pagoHoraExtra < 10 || pagoHoraExtra > 25) {
            throw new IllegalArgumentException("Pago por horas extras fuera de rango");
        }
        this.horaExtraMes = horaExtraMes;
        this.porcentajeIRPF = porcentajeIRPF;
        this.numHijos = numHijos;
        this.casado = casado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double horaExtra) {
        if (pagoHoraExtra < 10 || pagoHoraExtra > 25) {
            throw new IllegalArgumentException("Pago por horas extras fuera de rango");
        }
        this.pagoHoraExtra = horaExtra;
    }

    public double getHoraExtraMes() {
        return horaExtraMes;
    }

    public void setHoraExtraMes(double horaExtraMes) {
        this.horaExtraMes = horaExtraMes;
    }

    public double getPorcentajeIRPF() {
        return porcentajeIRPF;
    }

    public void setPorcentajeIRPF(double porcentajeIRPF) {
        this.porcentajeIRPF = porcentajeIRPF;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Informacion del empleado{" + "NIF=" + NIF + ", name=" + name + ", apellidos=" + apellidos + ", casado=" + casado + ", sueldoBase=" + sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horaExtraMes=" + horaExtraMes + ", porcentajeIRPF=" + porcentajeIRPF + ", retencionIRPF=" + retencionIRPF + ", sueldoneto=" + sueldoneto + ", sueldobruto=" + sueldobruto + ", numHijos=" + numHijos + '}';
    }

    public double retencion(double retencionIRPF) {
        this.retencionIRPF = this.retencionIRPF;
        return retencionIRPF;
    }

    public double sueldoNeto(double sueldoneto) {
        this.sueldoneto = this.sueldoneto;
        return sueldoneto;
    }

    public double getRetencionIRPF() {
        return retencionIRPF;
    }

    public void setRetencionIRPF(double retencionIRPF) {
        this.retencionIRPF = retencionIRPF;
    }

    public double getSueldoneto() {
        return sueldoneto;
    }

    public void setSueldoneto(double sueldoneto) {
        this.sueldoneto = sueldoneto;
    }

    public void setSueldoBruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    // Imprimir info
    
    public String escribirBasicInfo() {
        return "El NIF del empleado " + name + " " + apellidos + " es: " + NIF + ", el cual tiene " + numHijos + " hijos y se encuentra " + casado;
    }

    public String escribirAllInfo() {
        return "El NIF del empleado " + name + " " + apellidos + " es: " + NIF + ", el cual tiene " + numHijos + " hijos y se encuentra " + casado + "\n Este empleado gana " + sueldoBase + "€, su complemento de horas extras es de " + pagoHoraExtra + "€, un sueldo bruto de " + sueldobruto + "€, una retención de IRPF de " + retencionIRPF + "€ y un sueldo neto de " + sueldoneto + "€";
    }
}
