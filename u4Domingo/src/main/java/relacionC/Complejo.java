/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */

public class Complejo {
    private double x;
    private double y;
    private static int contador = 0;

    public Complejo() {
    }

    public Complejo(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Complejo(Complejo h){
        
        this.x = h.x;
        
        this.y = h.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Complejo{" + "x=" + x + ", y=" + y + '}';
    }  
    
    
    public static Complejo suma(Complejo a, Complejo b){
        
        Complejo complejoResultado = new Complejo();
        
        double resultadoReal = a.getX() + b.getX();
        double resultadoImaginario = a.getY() + b.getY();
        
        complejoResultado.setX(resultadoReal);
        complejoResultado.setY(resultadoImaginario);
        
        return complejoResultado;
    }
    
    public static Complejo resta(Complejo a, Complejo b){
        
        Complejo complejoResultado = new Complejo();
        
        double resultadoReal = a.getX() - b.getX();
        double resultadoImaginario = a.getY() - b.getY();
        
        complejoResultado.setX(resultadoReal);
        complejoResultado.setY(resultadoImaginario);
        
        return complejoResultado;
    }
    
    public static Complejo division(Complejo a, Complejo b){
        
        Complejo complejoResultado = new Complejo();
        
        double resultadoReal = a.getX() / b.getX();
        double resultadoImaginario = a.getY() / b.getY();
        
        complejoResultado.setX(resultadoReal);
        complejoResultado.setY(resultadoImaginario);
        
        return complejoResultado;
    }
    
    public static Complejo multiplicacion(Complejo a, Complejo b){
        
        Complejo complejoResultado = new Complejo();
        
        double resultadoReal = a.getX() * b.getX();
        double resultadoImaginario = a.getY() * b.getY();
        
        complejoResultado.setX(resultadoReal);
        complejoResultado.setY(resultadoImaginario);
        
        return complejoResultado;
    }
    
    public static boolean igualdad(Complejo a, Complejo b){
        
        double resultadoReal = a.getX() - b.getX();
        double resultadoImaginario = a.getY() - b.getY();
        
        return resultadoReal == 0 && resultadoImaginario == 0;
    }
}
