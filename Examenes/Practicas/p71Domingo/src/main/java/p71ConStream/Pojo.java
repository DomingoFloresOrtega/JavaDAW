/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p71Domingo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Pojo {
    private String empleado;
    private String dni;
    private String puesto;
    private LocalDate fechaToma;
    private LocalDate fechaCese;
    private String telefono;
    private boolean evaluador;
    private boolean coordinador;

    public Pojo() {
    }

    public Pojo(String empleado, String dni, String puesto, LocalDate fechaToma, LocalDate fechaCese, String telefono, boolean evaluador, boolean coordinador) {
        this.empleado = empleado;
        this.dni = dni;
        this.puesto = puesto;
        this.fechaToma = fechaToma;
        this.fechaCese = fechaCese;
        this.telefono = telefono;
        this.evaluador = evaluador;
        this.coordinador = coordinador;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaToma() {
        return fechaToma;
    }

    public void setFechaToma(LocalDate fechaToma) {
        this.fechaToma = fechaToma;
    }

    public LocalDate getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(LocalDate fechaCese) {
        this.fechaCese = fechaCese;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEvaluador() {
        return evaluador;
    }

    public void setEvaluador(boolean evaluador) {
        this.evaluador = evaluador;
    }

    public boolean isCoordinador() {
        return coordinador;
    }

    public void setCoordinador(boolean coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.empleado);
        hash = 37 * hash + Objects.hashCode(this.dni);
        hash = 37 * hash + Objects.hashCode(this.puesto);
        hash = 37 * hash + Objects.hashCode(this.fechaToma);
        hash = 37 * hash + Objects.hashCode(this.fechaCese);
        hash = 37 * hash + Objects.hashCode(this.telefono);
        hash = 37 * hash + (this.evaluador ? 1 : 0);
        hash = 37 * hash + (this.coordinador ? 1 : 0);
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
        final Pojo other = (Pojo) obj;
        if (this.evaluador != other.evaluador) {
            return false;
        }
        if (this.coordinador != other.coordinador) {
            return false;
        }
        if (!Objects.equals(this.empleado, other.empleado)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.puesto, other.puesto)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.fechaToma, other.fechaToma)) {
            return false;
        }
        return Objects.equals(this.fechaCese, other.fechaCese);
    }

    @Override
    public String toString() {
        return "Pojo{" + "empleado=" + empleado + ", dni=" + dni + ", puesto=" + puesto + ", fechaToma=" + fechaToma + ", fechaCese=" + fechaCese + ", telefono=" + telefono + ", evaluador=" + evaluador + ", coordinador=" + coordinador + '}';
    }
}
