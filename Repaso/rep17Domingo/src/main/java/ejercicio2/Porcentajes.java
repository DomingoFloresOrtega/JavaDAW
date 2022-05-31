package ejercicio2;

import java.util.Objects;

public class Porcentajes {
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

    public Porcentajes() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porcentajes that = (Porcentajes) o;
        return Double.compare(that.anio2016, anio2016) == 0 && Double.compare(that.anio2015, anio2015) == 0 && Double.compare(that.anio2014, anio2014) == 0 && Double.compare(that.anio2013, anio2013) == 0 && Double.compare(that.anio2011, anio2011) == 0 && Double.compare(that.anio2010, anio2010) == 0 && Double.compare(that.anio2006, anio2006) == 0 && Double.compare(that.anio2001, anio2001) == 0 && Double.compare(that.anio1996, anio1996) == 0 && Objects.equals(codMunicipio, that.codMunicipio) && Objects.equals(municipio, that.municipio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codMunicipio, municipio, anio2016, anio2015, anio2014, anio2013, anio2011, anio2010, anio2006, anio2001, anio1996);
    }

    @Override
    public String toString() {
        return "Porcentajes{" +
                "codMunicipio='" + codMunicipio + '\'' +
                ", municipio='" + municipio + '\'' +
                ", anio2016=" + anio2016 +
                ", anio2015=" + anio2015 +
                ", anio2014=" + anio2014 +
                ", anio2013=" + anio2013 +
                ", anio2011=" + anio2011 +
                ", anio2010=" + anio2010 +
                ", anio2006=" + anio2006 +
                ", anio2001=" + anio2001 +
                ", anio1996=" + anio1996 +
                '}';
    }
}
