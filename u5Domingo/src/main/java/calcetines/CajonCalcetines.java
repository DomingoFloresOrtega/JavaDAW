/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcetines;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author domingo
 */
public class CajonCalcetines {

    private ArrayList<Calcetin> calcetin;
    private ArrayList<Calcetin> auxNegro1 = null;
    private ArrayList<Calcetin> auxNegro2 = null;
    private ArrayList<Calcetin> auxNegro3 = null;
    private ArrayList<Calcetin> auxNegro4 = null;
    private ArrayList<Calcetin> auxGrisClaro1= null;
    private ArrayList<Calcetin> auxGrisClaro2 = null;
    private ArrayList<Calcetin> auxGrisClaro3= null;
    private ArrayList<Calcetin> auxGrisClaro4 = null;
    private ArrayList<Calcetin> auxGrisOscuro1 = null;
    private ArrayList<Calcetin> auxGrisOscuro2 = null;
    private ArrayList<Calcetin> auxGrisOscuro3 = null;
    private ArrayList<Calcetin> auxGrisOscuro4= null;

    public CajonCalcetines() {
        this.calcetin = new ArrayList<>(20);
    }

    public void generarCalcetines() {
        // Genero numero aleatorio
        Random numeroAleatorio = new Random();
        int tamanioCajon = numeroAleatorio.nextInt(20 - 10 + 1) + 10;

        // Agrego calcetines al cajon
        for (int i = 0; i < tamanioCajon; i++) {
            calcetin.add(new Calcetin(generarColores(), generarTallas()));
        }
    }

    public Colores generarColores() {
        // Array con colores
        Colores[] colores = Colores.values();

        // Extraigo el color de una posición aleatoria
        int longitud = colores.length;
        int indiceRandom = new Random().nextInt(longitud);

        return colores[indiceRandom];
    }

    private int generarTallas() {
        // Array con tallas
        int[] tallas = {40, 41, 42, 43};

        int longitud = tallas.length;
        int indiceRandom = new Random().nextInt(longitud);

        return tallas[indiceRandom];
    }

    public void calcetinesSolos() {

    }

    public void calcetinesParejas() {
        this.auxGrisClaro1 = new ArrayList<>();
        this.auxGrisClaro2 = new ArrayList<>();
        this.auxGrisClaro3 = new ArrayList<>();
        this.auxGrisClaro4 = new ArrayList<>();
        this.auxNegro1 = new ArrayList<>();
        this.auxNegro2 = new ArrayList<>();
        this.auxNegro3 = new ArrayList<>();
        this.auxNegro4 = new ArrayList<>();
        this.auxGrisOscuro1 = new ArrayList<>();
        this.auxGrisOscuro2 = new ArrayList<>();
        this.auxGrisOscuro3 = new ArrayList<>();
        this.auxGrisOscuro4 = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (calcetin.get(i).equals(new Calcetin(Colores.NEGRO, 40))) {
                    auxNegro1.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.NEGRO, 41))) {
                    auxNegro2.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.NEGRO, 42))) {
                    auxNegro3.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.NEGRO, 43))) {
                    auxNegro4.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.GRIS_CLARO, 40))) {
                    auxGrisClaro1.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.GRIS_CLARO, 41))) {
                    auxGrisClaro2.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.GRIS_CLARO, 42))) {
                    auxGrisClaro3.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.GRIS_CLARO, 43))) {
                    auxGrisClaro4.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.GRIS_OSCURO, 40))) {
                    auxGrisOscuro1.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.GRIS_OSCURO, 41))) {
                    auxGrisOscuro2.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.GRIS_OSCURO, 42))) {
                    auxGrisOscuro3.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                } else if (calcetin.get(i).equals(new Calcetin(Colores.GRIS_OSCURO, 43))) {
                    auxGrisOscuro4.add(new Calcetin(calcetin.get(i).getColor(), calcetin.get(i).getTalla()));
                }
            }
            
            // Una vez separados, comprobamos parejas
            
        }
    }

    public void imprimirCajon() {
        System.out.println("======= ELEMENTOS DEL CAJON =======");
        for (int i = 0; i < calcetin.size(); i++) {
            System.out.println("Elemento nº" + (i + 1));
            System.out.println(calcetin.get(i));
        }
        System.out.println("======= ELEMENTOS DEL CAJON =======");
    }
}
