/*
 * Clase para mapear los datos de la tabla Persona
 */

package Tareas.tarea8b;

import java.time.LocalDate;

/**
 *
 * @author J. Carlos F. Vico <jcarlosvico@maralboran.es>
 */

public class PersonaVO {
    private int pk;
    private String nombre;
    private LocalDate fechaNacimiento; 

    public PersonaVO(int pk, String nombre, LocalDate fechaNacimiento) {
        this.pk = pk;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaVO(){
        
    }
    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        // Recordar LocalDate: yyyy-(año)-MM(mes)-dd(día)
        return "PersonaVO{" + "pk=" + pk + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
