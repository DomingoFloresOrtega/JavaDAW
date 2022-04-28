/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaVendiing;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author hinda
 */

public class Maquina {

//Attributos
    private String codigoAdmin;
    private String direccionMaquina;
    private int tamanioBandeja; //normalmente 6
    private String tipoProductoBandeja1;
    private String tipoProductoBandeja2;
    private String tipoProductoBandeja3;
    private String tipoProductoBandeja4;
    private String tipoProductoBandeja5;
    private String tipoProductoBandeja6;
    private int codigoBandeja1;
    private int codigoBandeja2;
    private int codigoBandeja3;
    private int codigoBandeja4;
    private int codigoBandeja5;
    private int codigoBandeja6;
    private int cantidadBandeja1;//15 limite
    private int cantidadBandeja2;
    private int cantidadBandeja3;
    private int cantidadBandeja4;
    private int cantidadBandeja5;
    private int cantidadBandeja6;
    private double precioBandeja1;
    private double precioBandeja2;
    private double precioBandeja3;
    private double precioBandeja4;
    private double precioBandeja5;
    private double precioBandeja6;
    private Moneda1[] moneda;
    private Tarjeta[] tarjeta;

    //Constatntes
    private final String NUMEROSERIEMAQUINA = RandomStringUtils.randomNumeric(9);

    //constrector 
    public Maquina() {

    }

    //constrector parametrizado
    public Maquina(String direccionMaquina, int tamanioBandeja, String tipoProductoBandeja1, String tipoProductoBandeja2, String tipoProductoBandeja3, String tipoProductoBandeja4, String tipoProductoBandeja5, String tipoProductoBandeja6, int codigoBandeja1, int codigoBandeja2, int codigoBandeja3, int codigoBandeja4, int codigoBandeja5, int codigoBandeja6, int cantidadBandeja1, int cantidadBandeja2, int cantidadBandeja3, int cantidadBandeja4, int cantidadBandeja5, int cantidadBandeja6, double precioBandeja1, double precioBandeja2, double precioBandeja3, double precioBandeja4, double precioBandeja5, double precioBandeja6, Moneda1[] moneda, Tarjeta[] tarjeta) {
        this.codigoAdmin = idMaquinaGenerator();
        this.direccionMaquina = direccionMaquina;
        this.tamanioBandeja = tamanioBandeja;
        this.tipoProductoBandeja1 = tipoProductoBandeja1;
        this.tipoProductoBandeja2 = tipoProductoBandeja2;
        this.tipoProductoBandeja3 = tipoProductoBandeja3;
        this.tipoProductoBandeja4 = tipoProductoBandeja4;
        this.tipoProductoBandeja5 = tipoProductoBandeja5;
        this.tipoProductoBandeja6 = tipoProductoBandeja6;
        this.codigoBandeja1 = codigoBandeja1;
        this.codigoBandeja2 = codigoBandeja2;
        this.codigoBandeja3 = codigoBandeja3;
        this.codigoBandeja4 = codigoBandeja4;
        this.codigoBandeja5 = codigoBandeja5;
        this.codigoBandeja6 = codigoBandeja6;
        this.cantidadBandeja1 = cantidadBandeja1;
        this.cantidadBandeja2 = cantidadBandeja2;
        this.cantidadBandeja3 = cantidadBandeja3;
        this.cantidadBandeja4 = cantidadBandeja4;
        this.cantidadBandeja5 = cantidadBandeja5;
        this.cantidadBandeja6 = cantidadBandeja6;
        this.precioBandeja1 = precioBandeja1;
        this.precioBandeja2 = precioBandeja2;
        this.precioBandeja3 = precioBandeja3;
        this.precioBandeja4 = precioBandeja4;
        this.precioBandeja5 = precioBandeja5;
        this.precioBandeja6 = precioBandeja6;
        this.moneda = moneda;
        this.tarjeta = tarjeta;
    }

    //getters y setters
    public String getCodigoAdmin() {
        return codigoAdmin;
    }

    public String getDireccionMaquina() {
        return direccionMaquina;
    }

    public void setDireccionMaquina(String direccionMaquina) {
        this.direccionMaquina = direccionMaquina;
    }

    public int getTamanioBandeja() {
        return tamanioBandeja;
    }

    public void setTamanioBandeja(int tamanioBandeja) {
        this.tamanioBandeja = tamanioBandeja;
    }

    public String getTipoProductoBandeja1() {
        return tipoProductoBandeja1;
    }

    public void setTipoProductoBandeja1(String tipoProductoBandeja1) {
        this.tipoProductoBandeja1 = tipoProductoBandeja1;
    }

    public String getTipoProductoBandeja2() {
        return tipoProductoBandeja2;
    }

    public void setTipoProductoBandeja2(String tipoProductoBandeja2) {
        this.tipoProductoBandeja2 = tipoProductoBandeja2;
    }

    public String getTipoProductoBandeja3() {
        return tipoProductoBandeja3;
    }

    public void setTipoProductoBandeja3(String tipoProductoBandeja3) {
        this.tipoProductoBandeja3 = tipoProductoBandeja3;
    }

    public String getTipoProductoBandeja4() {
        return tipoProductoBandeja4;
    }

    public void setTipoProductoBandeja4(String tipoProductoBandeja4) {
        this.tipoProductoBandeja4 = tipoProductoBandeja4;
    }

    public String getTipoProductoBandeja5() {
        return tipoProductoBandeja5;
    }

    public void setTipoProductoBandeja5(String tipoProductoBandeja5) {
        this.tipoProductoBandeja5 = tipoProductoBandeja5;
    }

    public String getTipoProductoBandeja6() {
        return tipoProductoBandeja6;
    }

    public void setTipoProductoBandeja6(String tipoProductoBandeja6) {
        this.tipoProductoBandeja6 = tipoProductoBandeja6;
    }

    public int getCodigoBandeja1() {
        return codigoBandeja1;
    }

    public void setCodigoBandeja1(int codigoBandeja1) {
        this.codigoBandeja1 = codigoBandeja1;
    }

    public int getCodigoBandeja2() {
        return codigoBandeja2;
    }

    public void setCodigoBandeja2(int codigoBandeja2) {
        this.codigoBandeja2 = codigoBandeja2;
    }

    public int getCodigoBandeja3() {
        return codigoBandeja3;
    }

    public void setCodigoBandeja3(int codigoBandeja3) {
        this.codigoBandeja3 = codigoBandeja3;
    }

    public int getCodigoBandeja4() {
        return codigoBandeja4;
    }

    public void setCodigoBandeja4(int codigoBandeja4) {
        this.codigoBandeja4 = codigoBandeja4;
    }

    public int getCodigoBandeja5() {
        return codigoBandeja5;
    }

    public void setCodigoBandeja5(int codigoBandeja5) {
        this.codigoBandeja5 = codigoBandeja5;
    }

    public int getCodigoBandeja6() {
        return codigoBandeja6;
    }

    public void setCodigoBandeja6(int codigoBandeja6) {
        this.codigoBandeja6 = codigoBandeja6;
    }

    public int getCantidadBandeja1() {
        return cantidadBandeja1;
    }

    public void setCantidadBandeja1(int cantidadBandeja1) {
        this.cantidadBandeja1 = cantidadBandeja1;
    }

    public int getCantidadBandeja2() {
        return cantidadBandeja2;
    }

    public void setCantidadBandeja2(int cantidadBandeja2) {
        this.cantidadBandeja2 = cantidadBandeja2;
    }

    public int getCantidadBandeja3() {
        return cantidadBandeja3;
    }

    public void setCantidadBandeja3(int cantidadBandeja3) {
        this.cantidadBandeja3 = cantidadBandeja3;
    }

    public int getCantidadBandeja4() {
        return cantidadBandeja4;
    }

    public void setCantidadBandeja4(int cantidadBandeja4) {
        this.cantidadBandeja4 = cantidadBandeja4;
    }

    public int getCantidadBandeja5() {
        return cantidadBandeja5;
    }

    public void setCantidadBandeja5(int cantidadBandeja5) {
        this.cantidadBandeja5 = cantidadBandeja5;
    }

    public int getCantidadBandeja6() {
        return cantidadBandeja6;
    }

    public void setCantidadBandeja6(int cantidadBandeja6) {
        this.cantidadBandeja6 = cantidadBandeja6;
    }

    public double getPrecioBandeja1() {
        return precioBandeja1;
    }

    public void setPrecioBandeja1(double precioBandeja1) {
        this.precioBandeja1 = precioBandeja1;
    }

    public double getPrecioBandeja2() {
        return precioBandeja2;
    }

    public void setPrecioBandeja2(double precioBandeja2) {
        this.precioBandeja2 = precioBandeja2;
    }

    public double getPrecioBandeja3() {
        return precioBandeja3;
    }

    public void setPrecioBandeja3(double precioBandeja3) {
        this.precioBandeja3 = precioBandeja3;
    }

    public double getPrecioBandeja4() {
        return precioBandeja4;
    }

    public void setPrecioBandeja4(double precioBandeja4) {
        this.precioBandeja4 = precioBandeja4;
    }

    public double getPrecioBandeja5() {
        return precioBandeja5;
    }

    public void setPrecioBandeja5(double precioBandeja5) {
        this.precioBandeja5 = precioBandeja5;
    }

    public double getPrecioBandeja6() {
        return precioBandeja6;
    }

    public void setPrecioBandeja6(double precioBandeja6) {
        this.precioBandeja6 = precioBandeja6;
    }

    public Moneda1[] getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda1[] moneda) {
        this.moneda = moneda;
    }

    public Tarjeta[] getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta[] tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Maquina{" + "CodigoAdmin=" + codigoAdmin + ", direccionMaquina=" + direccionMaquina + ", tamanioBandeja=" + tamanioBandeja + ", tipoProductoBandeja1=" + tipoProductoBandeja1 + ", tipoProductoBandeja2=" + tipoProductoBandeja2 + ", tipoProductoBandeja3=" + tipoProductoBandeja3 + ", tipoProductoBandeja4=" + tipoProductoBandeja4 + ", tipoProductoBandeja5=" + tipoProductoBandeja5 + ", tipoProductoBandeja6=" + tipoProductoBandeja6 + ", codigoBandeja1=" + codigoBandeja1 + ", codigoBandeja2=" + codigoBandeja2 + ", codigoBandeja3=" + codigoBandeja3 + ", codigoBandeja4=" + codigoBandeja4 + ", codigoBandeja5=" + codigoBandeja5 + ", codigoBandeja6=" + codigoBandeja6 + ", cantidadBandeja1=" + cantidadBandeja1 + ", cantidadBandeja2=" + cantidadBandeja2 + ", cantidadBandeja3=" + cantidadBandeja3 + ", cantidadBandeja4=" + cantidadBandeja4 + ", cantidadBandeja5=" + cantidadBandeja5 + ", cantidadBandeja6=" + cantidadBandeja6 + ", precioBandeja1=" + precioBandeja1 + ", precioBandeja2=" + precioBandeja2 + ", precioBandeja3=" + precioBandeja3 + ", precioBandeja4=" + precioBandeja4 + ", precioBandeja5=" + precioBandeja5 + ", precioBandeja6=" + precioBandeja6 + ", moneda=" + Arrays.toString(moneda) + ", tarjeta=" + Arrays.toString(tarjeta) + ", NUMEROSERIEMAQUINa=" + NUMEROSERIEMAQUINA + '}';
    }

   

    //metodo para verificar si el codigo de bandeja que has Introducido el usuario existe
    public boolean verificarCodigoExist(int codigo) {
        return (codigo == this.codigoBandeja1 || codigo == this.codigoBandeja2 || codigo == this.codigoBandeja3 || codigo == this.codigoBandeja4 || codigo == codigoBandeja5 || codigo == this.codigoBandeja6);
    }

    //metodo que recibe el codigo de bandeja ye devuelve el precio de este producto 
    public double precioOfProducto(int codigoBandeja) {
        double precio = 0.0;
        if (codigoBandeja == this.codigoBandeja1) {
            precio = this.precioBandeja1;
        } else if (codigoBandeja == this.codigoBandeja2) {
            precio = this.precioBandeja2;
        } else if (codigoBandeja == this.codigoBandeja3) {
            precio = this.precioBandeja3;
        } else if (codigoBandeja == this.codigoBandeja4) {
            precio = this.precioBandeja4;
        } else if (codigoBandeja == this.codigoBandeja5) {
            precio = this.precioBandeja5;
        } else if (codigoBandeja == this.codigoBandeja6) {
            precio = this.precioBandeja6;
        }
        return precio;
    }

    // metodo que recibe el codigoBandeja y devuelve la cantidad de productos de este Bandeja
    public int stockOfProducto(int codigoBandeja) {
        int stock = 0;
        if (codigoBandeja == this.codigoBandeja1) {
            stock = getCantidadBandeja1();
        } else if (codigoBandeja == this.codigoBandeja2) {
            stock = getCantidadBandeja2();
        } else if (codigoBandeja == this.codigoBandeja3) {
            stock = getCantidadBandeja3();
        } else if (codigoBandeja == this.codigoBandeja4) {
            stock = getCantidadBandeja4();
        } else if (codigoBandeja == this.codigoBandeja5) {
            stock = getCantidadBandeja5();
        } else if (codigoBandeja == this.codigoBandeja6) {
            stock = getCantidadBandeja6();
        }
        return stock;
    }

    // metodo que recibe el codigo de bandeja y el stock para modificar stock  de este bandeja
    public void setStockOfProducto(int codigoBandeja, int stock) {
        if (codigoBandeja == this.codigoBandeja1) {
            setCantidadBandeja1(stock);
        } else if (codigoBandeja == this.codigoBandeja2) {
            setCantidadBandeja2(stock);
        } else if (codigoBandeja == this.codigoBandeja3) {
            setCantidadBandeja3(stock);
        } else if (codigoBandeja == this.codigoBandeja4) {
            setCantidadBandeja4(stock);
        } else if (codigoBandeja == this.codigoBandeja5) {
            setCantidadBandeja5(stock);
        } else if (codigoBandeja == this.codigoBandeja6) {
            setCantidadBandeja6(stock);
        }
    }

    //metodo para generare idMaquina y verificar si compla los requisitos
    //Una minúscula (a - z), una mayúscula (A - Z),
    //un número (0 - 9), uno de los siguientes # $ % &  ( ) * + , - .  : ; < = > @

  public static String idMaquinaGenerator() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#$%&()*+,-.:;<=>@";
        //uso RandomStringUtils para password generator
        String password = RandomStringUtils.random(8, characters);//añadir dependency in pom

        //Verifico si la contraseña cumplió las condiciones (al menos un símbolo, una letra mayúscula, una letra minúscula y un número y 8 caracteres de largo) con regex y el pattern
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#$%&()*+,-.:;<=>@])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {//si la contraseña compla lascondiciones devuelvo el password 
            return password;
        } else {//si no llamo otravez el metodo
            return idMaquinaGenerator(); // recursion
        }

    }

}

                                      

