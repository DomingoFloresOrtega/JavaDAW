/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Cancion implements Comparable<Cancion> {
    private String nombre;
    private String artista;
    private String anio;
    private String album;

    public Cancion() {
    }

    public Cancion(String nombre, String artista, String anio, String album) {
        this.nombre = nombre;
        this.artista = artista;
        this.anio = anio;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", artista=" + artista + ", anio=" + anio + ", album=" + album + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.artista);
        hash = 89 * hash + Objects.hashCode(this.anio);
        hash = 89 * hash + Objects.hashCode(this.album);
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
        final Cancion other = (Cancion) obj;
        
        return Objects.equals(this.nombre, other.nombre) && Objects.equals(this.artista, other.artista);
    }

    @Override
    public int compareTo(Cancion c) {
        return this.album.compareTo(c.album);
    } 
}
