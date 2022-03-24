/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionC;

/**
 *
 * @author domingo
 */
public class NIF {
    private char letraDNI;
    public String numeroDNI;

    public NIF(String numeroDNI) {
        this.numeroDNI = numeroDNI;
        this.letraDNI = letraDNI();
    } 
    
    private char letraDNI() {
        char letra = ' ';
        
        // Revisa la longitud
        int dniLongitud = numeroDNI.length();
        
        // Si la longitud es correcta, continua
        if (dniLongitud == 8) {
            int numeroConvertidoDNI = Integer.parseInt(numeroDNI);
            int divisionDNI = numeroConvertidoDNI % 23;
            
            // Seleccionamos letra
            switch (divisionDNI) {
                case 0:
                    letra = 'T';
                    break;
                case 1:
                    letra = 'R';
                    break;
                case 2:
                    letra = 'W';
                    break;
                case 3:
                    letra = 'A';
                    break;
                case 4:
                    letra = 'G';
                    break;
                case 5:
                    letra = 'M';
                    break;
                case 6:
                    letra = 'Y';
                    break;
                case 7:
                    letra = 'F';
                    break;
                case 8:
                    letra = 'P';
                    break;
                case 9:
                    letra = 'D';
                    break;
                case 10:
                    letra = 'X';
                    break;
                case 11:
                    letra = 'B';
                    break;
                case 12:
                    letra = 'N';
                    break;
                case 13:
                    letra = 'J';
                    break;
                case 14:
                    letra = 'Z';
                    break;
                case 15:
                    letra = 'S';
                    break;
                case 16:
                    letra = 'Q';
                    break;
                case 17:
                    letra = 'V';
                    break;
                case 18:
                    letra = 'H';
                    break;
                case 19:
                    letra = 'L';
                    break;
                case 20:
                    letra = 'C';
                    break;
                case 21:
                    letra = 'K';
                    break;
                case 22:
                    letra = 'E';
                    break;
                default:
                    break;
            }
        } else {
            this.numeroDNI = "0";
        } 
        // Devuelve letra
        return letra;
    }
    
    public char getLetraDNI() {
        return letraDNI;
    }

    public String getNumeroDNI() {
        return numeroDNI;
    }

    // Imprimir DNI
    @Override
    public String toString() {
        return "El DNI introducido es: " + numeroDNI + "-" + letraDNI;
    }
    
    // Main
    public static void main(String[] args) {
        NIF nif1 = new NIF("52146987");
        System.out.println(nif1.toString());
    }
}
