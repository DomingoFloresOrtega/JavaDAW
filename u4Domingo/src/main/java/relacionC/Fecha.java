/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author domingo
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    LocalDate fecha;

    // Constructor predeterminado
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
    }

    // Constructor parametrizado
    public Fecha(int dia, int mes, int anio) {
        if(comprobarFecha(dia,mes,anio)){
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else{
            System.out.println("Los parametros introducidos no son validos");
            throw new IllegalArgumentException();
        };
    }
    
    // Metodo comprobarFecha()
    public boolean comprobarFecha(int dia, int mes, int anio) {
        boolean resultado = true;
        
        try {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
        } catch (DateTimeException dte){
            System.out.println("La fecha no es valida");
            resultado = false;
        }
        
        return resultado;
    }
    
    public int getDia() {
        LocalDate fecha = LocalDate.of(dia, mes, anio);
        int dia = fecha.getDayOfMonth();
        
        return dia;
    }

    public void setDia(int dia) {
        if(comprobarFecha(dia, mes, anio)){
           this.dia = dia; 
        }
    }

    public int getMes() {
        LocalDate fecha = LocalDate.of(dia, mes, anio);
        int mes = fecha.getMonthValue();
        
        return mes;
    }

    public void setMes(int mes) {
        if(comprobarFecha(dia, mes, anio)){
           this.mes = mes; 
        }
    }

    public double getAnio() {
        LocalDate fecha = LocalDate.of(dia, mes, anio);
        int anio = fecha.getYear();
        
        return anio;
    }

    public void setAnio(int anio) {
        if(comprobarFecha(dia, mes, anio)){
           this.anio = anio; 
        }
    }
    
    public void bisiesto(){
        if (fecha.isLeapYear()){
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public void diasMes(){
        LocalDate fecha = LocalDate.of(this.anio,this.mes,this.dia);
        
        System.out.println("El mes seleccionado tiene: " + fecha.lengthOfMonth());
    }
    
    public String mostrarFechaCorta(){
        
        LocalDate date = LocalDate.of(this.anio,this.mes,this.dia);
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        return date.format(formato);
    }
    
    public void mostrarFechaLarga(){
        LocalDate date = LocalDate.of(this.anio,this.mes,this.dia);
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        return date.format(formato);
    }
    
    public String diaSemana(){
        
        LocalDate date = LocalDate.of(this.anio,this.mes,this.dia);
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-LL-yyyy");
        
        return date.format(formato);
    }
    
    public void diasEntreFechas(Fecha fechaInicial, Fecha fechaFinal){
        LocalDate inicio = LocalDate.of();
        
    }
    
    public static Fecha copia(Fecha aux){
        Fecha resultado = new Fecha(aux.dia, aux.mes, aux.anio);
        return resultado;
    }
    
    public boolean igual(Fecha fecha){
        LocalDate fechaCompuesta = LocalDate.of(anio,mes,dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        
        return fechaParametrizado.equals(fechaCompuesta);
    }
    
    public boolean menorFecha(){
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado =
    }
}


