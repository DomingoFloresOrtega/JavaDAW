
package xml;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JCarlos
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CatalogoMuebles {

    // XmLElementWrapper define un contenedor para la lista 
    // de muebles
    @XmlElementWrapper(name = "catalogo")

    // XmlElement establece el nombre de los elementos
    // Cada elemento de la lista llevará esta etiqueta en el fichero xml
    @XmlElement(name = "mueble")
    private ArrayList<Mueble> listaMueble;

    private String descripcion;

    public ArrayList<Mueble> getListaMuebles() {
        return listaMueble;
    }

    public void setLista(ArrayList<Mueble> lista) {
        this.listaMueble = lista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
