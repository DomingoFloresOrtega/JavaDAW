/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.tarea7c;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Horarios {
    private int numFila;
    private String curso;
    private String profesor;
    private String asigantura;
    private String aula;
    private String diaSemana;
    private String hora;

    public Horarios() {
    }

    public Horarios(int numFila, String curso, String profesor, String asigantura, String aula, String diaSemana, String hora) {
        this.numFila = numFila;
        this.curso = curso;
        this.profesor = profesor;
        this.asigantura = asigantura;
        this.aula = aula;
        this.diaSemana = diaSemana;
        this.hora = hora;
    }

    public int getNumFila() {
        return numFila;
    }

    public void setNumFila(int numFila) {
        this.numFila = numFila;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getAsigantura() {
        return asigantura;
    }

    public void setAsigantura(String asigantura) {
        this.asigantura = asigantura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.numFila;
        hash = 71 * hash + Objects.hashCode(this.curso);
        hash = 71 * hash + Objects.hashCode(this.profesor);
        hash = 71 * hash + Objects.hashCode(this.asigantura);
        hash = 71 * hash + Objects.hashCode(this.aula);
        hash = 71 * hash + Objects.hashCode(this.diaSemana);
        hash = 71 * hash + Objects.hashCode(this.hora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Horarios other = (Horarios) obj;
        if (this.numFila != other.numFila) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.profesor, other.profesor)) {
            return false;
        }
        if (!Objects.equals(this.asigantura, other.asigantura)) {
            return false;
        }
        if (!Objects.equals(this.aula, other.aula)) {
            return false;
        }
        if (!Objects.equals(this.diaSemana, other.diaSemana)) {
            return false;
        }
        return Objects.equals(this.hora, other.hora);
    }

    @Override
    public String toString() {
        return "Horarios{" + "numFila=" + numFila + ", curso=" + curso + ", profesor=" + profesor + ", asigantura=" + asigantura + ", aula=" + aula + ", diaSemana=" + diaSemana + ", hora=" + hora + '}';
    }
}
