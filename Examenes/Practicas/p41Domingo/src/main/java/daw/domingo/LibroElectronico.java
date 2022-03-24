/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.domingo;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author domingo
 */
public class LibroElectronico {
    
    // Private: solo se puede acceder desde la misma clase.
    // Public: se puede acceder desde otras clases.
    
    // Atributos
    private String id;
    private String titulo;
    private int numPaginas;
    private double tamanio;
    private int numPaginaActual;

    // Constructor por defecto
    public LibroElectronico() {
        this.id = RandomStringUtils.randomNumeric(3);
        this.titulo = "Don Quijote de la Mancha";
        this.numPaginas = 1435;
        this.tamanio = 5;
        this.numPaginaActual = 1;
    }

    // Constructor parametrizado
    public LibroElectronico(String id, String titulo, int numPaginas, double tamanio) {
        if (numPaginas > 9999){
            numPaginas = 0;
        }
        
        if (tamanio > 10){
            tamanio = 0;
        }
        
        this.id = id;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.tamanio = tamanio;
        this.numPaginaActual = 1;
    }
    
    // Metodo pasarPagina()
    public void pasarPagina(){
        int paginaPasada = this.numPaginaActual + 1;
        if (paginaPasada <= 9999){
            this.numPaginaActual = paginaPasada;
        }
    }
    
    // Metodo retrocederPagina()
    public void retrocederPagina(){
        int paginaRetroceso = this.numPaginaActual - 1;
        if (paginaRetroceso >= 1){
            this.numPaginaActual = paginaRetroceso;
        } 
    }
    
    // Metodo saltar()
    public void saltar(int numero){
        if (numero > 0){
            int paginasSaltadas = this.numPaginaActual + numero;
            if (paginasSaltadas > 0 && paginasSaltadas < 9999){
                this.numPaginaActual = paginasSaltadas;
            }
        } else if (numero < 0){
            int paginasSaltadas = this.numPaginaActual + numero;
            if (paginasSaltadas > 0 && paginasSaltadas < 10000){
               this.numPaginaActual = paginasSaltadas;
            }
        }
    }

    // Metodos Getter
    
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public double getTamanio() {
        return tamanio;
    }

    public int getNumPaginaActual() {
        return numPaginaActual;
    }
    
    // Metodos Setter

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPaginas(int numPaginas) {
        if (numPaginas > 9999){
            numPaginas = 0;
        }
        
        this.numPaginas = numPaginas;
    }

    public void setTamanio(double tamanio) {
        if (tamanio > 10){
            tamanio = 0;
        }
        
        this.tamanio = tamanio;
    }

    public void setNumPaginaActual(int numPaginaActual) {
        this.numPaginaActual = numPaginaActual;
    }
    
    // Metodo toString()

    @Override
    public String toString() {
        return "Libro Nº" + id + ". Libro titulado " + titulo + ", con " + numPaginas + " páginas, un tamaño de " + tamanio + "MB. Página en la que se encuentra actualmente: " + numPaginaActual;
    }  
}