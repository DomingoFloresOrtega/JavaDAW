/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaVendiing;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Tarjeta {
    private String numTarjeta;
    private String cvvTarjeta;
    private YearMonth fechaCaducidadTarjeta;
    private String pinTarjeta;
    private boolean activacion;


    public Tarjeta() {
    }

    // Tarjeta creada por la entidad bancaria
    public Tarjeta(String numTarjeta, String cvvTarjeta, String pinTarjeta, int anioCaduc, int mesCaduc, boolean activacion) {

        // Numero de tarjeta
        if (comprobarNumTarjeta(numTarjeta)) {
            this.numTarjeta = numTarjeta;
        } else {
            this.numTarjeta = "1234567898765432";
        }

        // Código de seguridad CVV
        if (comprobarCod(cvvTarjeta)) {
            this.cvvTarjeta = cvvTarjeta;
        } else {
            this.cvvTarjeta = "000";
        }

        // PIN de seguridad
        if (comprobarPin(pinTarjeta)) {
            // Si el pin es correcto lo asigna
            this.pinTarjeta = pinTarjeta;
        } else {
            // Si el pin es incorrecto asigna por defecto 1234
            this.pinTarjeta = "1234";
        }

        // Fecha de caducidad
        fechaCaducidadTarjeta = YearMonth.of(anioCaduc, mesCaduc);
        if (comprobarFechaCaduc(fechaCaducidadTarjeta)) {
            this.fechaCaducidadTarjeta = fechaCaducidadTarjeta;
        } else {
            this.fechaCaducidadTarjeta = YearMonth.of(2025, Month.MAY);
        }
        this.fechaCaducidadTarjeta = fechaCaducidadTarjeta;
    }

    // Getters / Setters
    public String getNumTarjeta() {
        return numTarjeta;
    }

    public String getCvvTarjeta() {
        return cvvTarjeta;
    }

    public YearMonth getFechaCaducidadTarjeta() {
        return fechaCaducidadTarjeta;
    }

    public String getPinTarjeta() {
        return pinTarjeta;
    }


    public void setPinTarjeta(String pinTarjeta) {
        // Si el pin es correcto lo asigna
        if (comprobarPin(pinTarjeta) == true) {
            this.pinTarjeta = pinTarjeta;
        } else {
            // Si el pin no es correcto asigna por defecto 1234
            this.pinTarjeta = "1234";
        }
    }

    public boolean isActivacion() {
        return activacion;
    }

    public void setActivacion(boolean activacion) {
        this.activacion = activacion;
    }

    // Impresora

    @Override
    public String toString() {
        return "Tarjeta{" + "numTarjeta=" + numTarjeta + ", cvvTarjeta=" + cvvTarjeta + ", fechaCaducidadTarjeta=" + fechaCaducidadTarjeta + ", pinTarjeta=" + pinTarjeta + ", activacion=" + activacion + '}';
    }


    // Comprobadores
    public boolean comprobarFechaCaduc(YearMonth fecha) {
        boolean fechaCorrecta = false;
        YearMonth fechaActual = YearMonth.from(LocalDate.now());

        if (fecha.isAfter(fechaActual)) {
            fechaCorrecta = true;
        }

        return fechaCorrecta;
    }

    public boolean comprobarCod(String cvv) {
        boolean cvvCorrecto = false;

        String cvvTarjetaLongitud = String.valueOf(cvv);

        if (cvvTarjetaLongitud.length() == 3) {
            cvvCorrecto = true;
        }

        return cvvCorrecto;
    }

    public boolean comprobarNumTarjeta(String numero) {
        boolean numCorrecto = false;

        if (numero.length() == 16) {
            numCorrecto = true;
        }

        return numCorrecto;
    }

    public boolean comprobarPin(String pin) {
        boolean pinCorrecto = false;
        String pinTarjetaLongitud = String.valueOf(pin);

        if (pinTarjetaLongitud.length() == 4) {
            pinCorrecto = true;
        }

        return pinCorrecto;
    }

    // Clase para poder realizar el pago con tarjeta
    public boolean realizarPago(String numTarjeta) {
        boolean tramitePago = false;

        if (comprobarNumTarjeta(numTarjeta)) {
            if (numTarjeta.equals(this.numTarjeta)) {
                // Pido el numero PIN
                String pin = JOptionPane.showInputDialog(null, "Introduzca el número PIN:");
                // Compruebo numero PIN
                if (comprobarPin(pin)) {
                    if (pin.equals(this.pinTarjeta)) {
                        tramitePago = true;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El pin introducido no es correcto");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El número de tarjeta no es valido o la tarjeta no está activada");
        }

        return tramitePago;
    }
}