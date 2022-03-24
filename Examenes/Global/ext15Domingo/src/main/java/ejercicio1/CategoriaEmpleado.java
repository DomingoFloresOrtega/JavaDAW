/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author domingo
 */
public enum CategoriaEmpleado {
    INICIAL("Categoría Básica", 50),
    MEDIA("Categoría Media", 70),
    AVANZADA("Categoría Profesional", 100);

    private String categoria;
    private int complemento;

    private CategoriaEmpleado(String categoria, int complemento) {
        this.categoria = categoria;
        this.complemento = complemento;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getComplemento() {
        return complemento;
    }
}
