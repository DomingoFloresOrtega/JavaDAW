/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import ejercicio2.Empresa;
import java.time.LocalDate;

/**
 *
 * @author domingo
 */
public class Prueba {

    public static void main(String[] arguments) {
        Empresa empresaA = new Empresa("Luz Systems", "B9435209");
        Empresa empresaB = new Empresa("Voice Mantenimientos", "M3420198");

        Trabajador t1 = new Trabajador("Antonio", "Martinez", LocalDate.of(1994, 10, 10), CategoriaEmpleado.AVANZADA);
        Trabajador t2 = new Trabajador("Amador", "Flores", LocalDate.of(1992, 10, 30), CategoriaEmpleado.INICIAL);
        Trabajador t3 = new Trabajador("Obi-wan", "Palomares", LocalDate.of(2018, 10, 30), CategoriaEmpleado.INICIAL);
        Trabajador t4 = new Trabajador("David", "Martinez", LocalDate.of(1995, 10, 25), CategoriaEmpleado.MEDIA);
        Trabajador t5 = new Trabajador("Cristina", "Fernandez", LocalDate.of(1999, 11, 24), CategoriaEmpleado.MEDIA);

        Trabajador t6 = new Trabajador(t3);
        
        // Contratar trabajadores
        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);
        
        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);
        
        // Imprimo empresas
        empresaA.imprimir();
        empresaB.imprimir();
        
        // Despedir y contratar
        empresaB.despedir(t5);
        empresaA.contratar(t5);
        
        // Ordenar
        empresaB.ordenarNombre();
        empresaA.ordenarNombre();
        empresaA.imprimir();
        empresaB.imprimir();
        
        // Buscar
        System.out.println(empresaA.buscarNombre(t6));
        System.out.println(empresaB.buscarNombre(t6));
    }
}
