package ejercicio3;

import java.util.Objects;

public class Matriz {
    private int fila;
    private int columna;

    public Matriz() {
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matriz matriz = (Matriz) o;
        return fila == matriz.fila && columna == matriz.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    @Override
    public String toString() {
        return "Matriz{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
