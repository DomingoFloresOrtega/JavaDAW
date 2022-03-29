package Ejercicios.ejercicio14;

public class Microondas extends Electrodomestico implements Silencioso, Comparable<Microondas> {
    private double vatios;

    public Microondas(double consumo, String modelo) {
        super(consumo, modelo);
    }

    public Microondas(double consumo, String modelo, double vatios) {
        super(consumo, modelo);
        this.vatios = vatios;
    }

    public double getVatios() {
        return vatios;
    }

    public void setVatios(double vatios) {
        this.vatios = vatios;
    }

    @Override
    public String toString() {
        return super.toString() + "Microondas{" +
                "vatios=" + vatios +
                '}';
    }

    @Override
    public void silencio() {
        System.out.println("El microondas emite 40dB");
    }

    @Override
    public int compareTo(Microondas o) {
        return 0;
    }
}
