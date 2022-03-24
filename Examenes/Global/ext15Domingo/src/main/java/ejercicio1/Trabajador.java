/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Trabajador {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoriaEmpleado;

    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoriaEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.categoriaEmpleado = categoriaEmpleado;
    }
    
    public Trabajador(Trabajador t){
        this.nombre = t.nombre;
        this.apellidos = t.apellidos;
        this.fechaNacimiento = t.fechaNacimiento;
        this.categoriaEmpleado = t.categoriaEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.apellidos);
        hash = 41 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 41 * hash + Objects.hashCode(this.categoriaEmpleado);
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
        final Trabajador other = (Trabajador) obj;
        return Objects.equals(this.fechaNacimiento, other.fechaNacimiento);
    }
    
    
    
    public double calcularSueldo(){
        double sueldo;
        
        sueldo = 1707 + categoriaEmpleado.getComplemento();
        
        return sueldo;
    }
    
    public LocalDate fechaJubilacion(Trabajador trabajador){
        LocalDate fecha;
        
        fecha = LocalDate.now();
        
        return fecha;
    }
    
    public String toString(){
        return "\t" + apellidos + ", " + nombre + "\t" + "F.Nac: " + fechaNacimiento + "\n" + "Categoria: " + categoriaEmpleado.getCategoria() + "\n" + "Fecha Jubilación: " + "Sueldo actual: " + calcularSueldo();
    }
}
