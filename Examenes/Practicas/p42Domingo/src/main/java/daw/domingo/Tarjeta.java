/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.domingo;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.Temporal;

/**
 *
 * @author domingo
 */

public class Tarjeta {
    private String titularTarjeta;
    private String numTarjeta;
    private YearMonth fechaCaduc;
    private int mesCaduc;
    private int anioCaduc;
    private int pinTarjeta;
    private int limiteCredito;
    private boolean estadoTarjeta;
    private String bancoEmisor;
    private LocalDate fecha;

    public Tarjeta() {
        titularTarjeta = "Una persona curiosa";
        numTarjeta = "3444590022904810";
        fechaCaduc = YearMonth.of(2025, Month.MAY);
        pinTarjeta = 2890;
        limiteCredito = 1000;
        estadoTarjeta = false;
        bancoEmisor = "D-Bank";
    }

    public Tarjeta(String titularTarjeta, String numTarjeta, int mesCaduc, int anioCaduc, int pinTarjeta, int limiteCredito) {
  
        this.titularTarjeta = titularTarjeta;
        
        // Comprobacion de longitud numero tarjeta
        if (comprobarNumTarjeta(numTarjeta)){
            this.numTarjeta = numTarjeta;
        } else {
            this.numTarjeta = "1234567898765432";
        }
        
        // Comprobacion de fecha de caducidad
        fechaCaduc = YearMonth.of(anioCaduc, mesCaduc);
        if (comprobarFechaCaduc(fechaCaduc) == true){
            this.fechaCaduc = fechaCaduc;
        } else {
            this.fechaCaduc = YearMonth.of(2025, Month.MAY);
        }
        
        // Comprobación de longitud pin
        if (comprobarPin(pinTarjeta) == true){
            this.pinTarjeta = pinTarjeta;
        } else {
            this.pinTarjeta = 0;
        }
        
        // Comprobacion de limite credito correcto
        if (comprobarLimiteCredito(limiteCredito) == true){
            this.limiteCredito = limiteCredito;
        } else {
            this.limiteCredito = 0;
        }
        
        this.estadoTarjeta = false;
        this.bancoEmisor = "D-Bank";
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setPinTarjeta(int pinTarjeta) {
        this.pinTarjeta = pinTarjeta;
    }

    public void setLimiteCredito(int limiteCredito) {
        
        if (comprobarLimiteCredito(limiteCredito) == true){
            this.limiteCredito = limiteCredito;
        } else {
            this.limiteCredito = 0;
        }
    }

    public void setEstadoTarjeta(boolean estadoTarjeta) {
        this.estadoTarjeta = estadoTarjeta;
    }

    public YearMonth getFechaCaduc() {
        return fechaCaduc;
    }

    public int getPinTarjeta() {
        return pinTarjeta;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public boolean isEstadoTarjeta() {
        return estadoTarjeta;
    }

    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public String getTitularTarjeta() {
        return titularTarjeta;
    }
    
    /* ---- COPIA DE TARJETAS ---- */
    
    public static Tarjeta copia(Tarjeta aux){
        
        Tarjeta tarjetaNueva = new Tarjeta(aux.titularTarjeta, aux.numTarjeta, aux.mesCaduc, aux.anioCaduc, aux.pinTarjeta, aux.limiteCredito);
        
        return tarjetaNueva;
    }
    
    /* ---- COMPROBADORES ---- */
    
    public boolean comprobarFechaCaduc(YearMonth fecha){
        boolean fechaCorrecta = false;
        YearMonth fechaActual = YearMonth.from(LocalDate.now());
        
        if (fecha.isAfter(fechaActual)){
            fechaCorrecta = true;
        }
        
        return fechaCorrecta;
    }
    
    public boolean comprobarLimiteCredito(int limite){
        boolean limit = false;
        if (limite >= 500 && limite <= 3000){
            limit = true;
        }
        
        return limit;
    }
        
    public boolean comprobarPin(int pin){
        boolean pinCorrecto = false;
        String pinTarjetaLongitud = String.valueOf(pin);
        
        if (pinTarjetaLongitud.length() == 4){
            pinCorrecto = true;
        }
        
        return pinCorrecto;
    }
    
    public boolean comprobarNumTarjeta(String numero){
        boolean numCorrecto = false;
        
        if (numero.length() == 16){
            numCorrecto = true;
        }
        
        return numCorrecto;
    }
    
    /* ---- IMPRESORA ---- */

    @Override
    public String toString() {
        return "\n Nombre del titular: " + titularTarjeta + "\n Banco emisor de la tarjeta: " + bancoEmisor + "\n Fecha de caducidad: " + fechaCaduc + "\n Credito de la tarjeta: " + limiteCredito + "€ \n Número de tarjeta: " + numTarjeta + '}';
    }
    
}
