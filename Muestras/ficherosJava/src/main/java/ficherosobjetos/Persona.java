package ficherosobjetos;

import java.io.Serializable;

/**
 *
 * @author JCarlos
 */

// Es necesario que la clase implemente la interfaz Serializable
// para que se puedan guardar y leer objetos Java en archivos
public class Persona implements Serializable {

    // Este atributo indica si hay cambios de versión en la clase
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String dni;
    private int edad;
    
    
    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
