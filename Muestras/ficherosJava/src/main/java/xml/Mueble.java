package xml;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


// Anotación @XmlRootElement, nombre de la etiqueta XML raíz.
@XmlRootElement(name = "mueble")
// Anotación @XmlAccesorType define el elemento que usará JAXB durante el 
// procesamiento de datos (en este caso por atributo)
@XmlAccessorType(XmlAccessType.FIELD)
public class Mueble {

    private String id;
    private Double ancho;
    private Double alto;
    private Double profundo;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate fechaFabricacion;

    public Mueble(int id) {
        this.id = "ES-M" + id;
        ancho = alto = profundo = Double.valueOf(id);
        fechaFabricacion = LocalDate.now();
    }

    public Mueble() {
        id = "ES-M";
        ancho = alto = profundo = 1.0;
        fechaFabricacion = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public Double getProfundo() {
        return profundo;
    }

    public void setProfundo(double profundo) {
        this.profundo = profundo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return "Mueble{" + "id=" + id + ", ancho=" + ancho + ", alto=" + alto + ", profundo=" + profundo + ", fechaFabricacion=" + fechaFabricacion + '}';
    }
    
    
}
