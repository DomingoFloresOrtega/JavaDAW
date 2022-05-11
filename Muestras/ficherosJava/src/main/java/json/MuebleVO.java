/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package json;

import java.time.LocalDate;

/**
 *
 * @author JCarlos
 */

public class MuebleVO {
    
    private String id;
    private String descripcion;
    private Double ancho ;
    private Double alto;
    private Double profundo;
    private LocalDate fechaFabricacion;

    public MuebleVO(String id, String descripcion, double ancho, double alto, double profundo, LocalDate fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        this.fechaFabricacion = fecha;
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
        return "MuebleVO{" + "id=" + id + ", descripcion=" + descripcion + ", ancho=" + ancho + ", alto=" + alto + ", profundo=" + profundo + ", fechaFabricacion=" + fechaFabricacion + '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
    
        
}
