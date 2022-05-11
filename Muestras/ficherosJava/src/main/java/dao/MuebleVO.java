
package dao;

/**
 *
 * @author JCarlos
 * 
 */

public class MuebleVO {
    
    private String id;
    private String descripcion;
    private Double ancho ;
    private Double alto;
    private Double profundo;

    public MuebleVO(String id, String descripcion, double ancho, double alto, double profundo) {
        this.id = id;
        this.descripcion = descripcion;
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public MuebleVO (){
        id = "xx0";
        descripcion = "";
        ancho = alto = profundo = 1.0;
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

    @Override
    public String toString() {
        return id + ";" + descripcion + ";" + ancho + ";" + alto + ";" + profundo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
