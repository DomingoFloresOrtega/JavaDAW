/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Docente extends Publico {
    private String nombreDocente;
    private String apellidos;
    private String nif;
    private String materia;

    public Docente() {
    }

    public Docente(String nombreDocente, String apellidos, String nif, String materia, String partidaPresupuestaria, String nombre, String cif, String direccion) {
        super(partidaPresupuestaria, nombre, cif, direccion);
        this.nombreDocente = nombreDocente;
        this.apellidos = apellidos;
        this.nif = nif;
        this.materia = materia;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombreDocente);
        hash = 29 * hash + Objects.hashCode(this.apellidos);
        hash = 29 * hash + Objects.hashCode(this.nif);
        hash = 29 * hash + Objects.hashCode(this.materia);
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
        final Docente other = (Docente) obj;
        if (!Objects.equals(this.nombreDocente, other.nombreDocente)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return Objects.equals(this.materia, other.materia);
    }

    @Override // Metodo polimorfico
    public String toString() {
        return "Docente{" + "nombreDocente=" + nombreDocente + ", apellidos=" + apellidos + ", nif=" + nif + ", materia=" + materia + '}';
    }

    // Cada docente podrá dar dos materias
    @Override // Metodo polimorfico
    public int numeroMaterias(){
        return 2;
    }
}
