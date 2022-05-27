/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Objects;

/**
 *
 * @author domingo
 */
public class Informe {
    private String codMunicipio;
    private String municipio;
    private double anio2016;
    private double anio2015;
    private double anio2014;
    private double anio2013;
    private double anio2011;
    private double anio2010;
    private double anio2006;
    private double anio2001;
    private double anio1996;

    public Informe() {
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getAnio2016() {
        return anio2016;
    }

    public void setAnio2016(double anio2016) {
        this.anio2016 = anio2016;
    }

    public double getAnio2015() {
        return anio2015;
    }

    public void setAnio2015(double anio2015) {
        this.anio2015 = anio2015;
    }

    public double getAnio2014() {
        return anio2014;
    }

    public void setAnio2014(double anio2014) {
        this.anio2014 = anio2014;
    }

    public double getAnio2013() {
        return anio2013;
    }

    public void setAnio2013(double anio2013) {
        this.anio2013 = anio2013;
    }

    public double getAnio2011() {
        return anio2011;
    }

    public void setAnio2011(double anio2011) {
        this.anio2011 = anio2011;
    }

    public double getAnio2010() {
        return anio2010;
    }

    public void setAnio2010(double anio2010) {
        this.anio2010 = anio2010;
    }

    public double getAnio2006() {
        return anio2006;
    }

    public void setAnio2006(double anio2006) {
        this.anio2006 = anio2006;
    }

    public double getAnio2001() {
        return anio2001;
    }

    public void setAnio2001(double anio2001) {
        this.anio2001 = anio2001;
    }

    public double getAnio1996() {
        return anio1996;
    }

    public void setAnio1996(double anio1996) {
        this.anio1996 = anio1996;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.codMunicipio);
        hash = 61 * hash + Objects.hashCode(this.municipio);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio2016) ^ (Double.doubleToLongBits(this.anio2016) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio2015) ^ (Double.doubleToLongBits(this.anio2015) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio2014) ^ (Double.doubleToLongBits(this.anio2014) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio2013) ^ (Double.doubleToLongBits(this.anio2013) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio2011) ^ (Double.doubleToLongBits(this.anio2011) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio2010) ^ (Double.doubleToLongBits(this.anio2010) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio2006) ^ (Double.doubleToLongBits(this.anio2006) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio2001) ^ (Double.doubleToLongBits(this.anio2001) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.anio1996) ^ (Double.doubleToLongBits(this.anio1996) >>> 32));
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
        final Informe other = (Informe) obj;
        if (Double.doubleToLongBits(this.anio2016) != Double.doubleToLongBits(other.anio2016)) {
            return false;
        }
        if (Double.doubleToLongBits(this.anio2015) != Double.doubleToLongBits(other.anio2015)) {
            return false;
        }
        if (Double.doubleToLongBits(this.anio2014) != Double.doubleToLongBits(other.anio2014)) {
            return false;
        }
        if (Double.doubleToLongBits(this.anio2013) != Double.doubleToLongBits(other.anio2013)) {
            return false;
        }
        if (Double.doubleToLongBits(this.anio2011) != Double.doubleToLongBits(other.anio2011)) {
            return false;
        }
        if (Double.doubleToLongBits(this.anio2010) != Double.doubleToLongBits(other.anio2010)) {
            return false;
        }
        if (Double.doubleToLongBits(this.anio2006) != Double.doubleToLongBits(other.anio2006)) {
            return false;
        }
        if (Double.doubleToLongBits(this.anio2001) != Double.doubleToLongBits(other.anio2001)) {
            return false;
        }
        if (Double.doubleToLongBits(this.anio1996) != Double.doubleToLongBits(other.anio1996)) {
            return false;
        }
        if (!Objects.equals(this.codMunicipio, other.codMunicipio)) {
            return false;
        }
        return Objects.equals(this.municipio, other.municipio);
    }

    @Override
    public String toString() {
        return "Informe{" + "codMunicipio=" + codMunicipio + ", municipio=" + municipio + ", anio2016=" + anio2016 + ", anio2015=" + anio2015 + ", anio2014=" + anio2014 + ", anio2013=" + anio2013 + ", anio2011=" + anio2011 + ", anio2010=" + anio2010 + ", anio2006=" + anio2006 + ", anio2001=" + anio2001 + ", anio1996=" + anio1996 + '}';
    }
}
