package Repaso.vuelos;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Pasajero> listaPasajeros = new ArrayList<>();

        listaPasajeros.add(new Pasajero(1,"Maria","Martin","38492019P"));
        listaPasajeros.add(new Pasajero(2,"Victoria","Sampalo","12453908I"));
        listaPasajeros.add(new Pasajero(3,"Nacho","Salcedo","45698213L"));
        listaPasajeros.add(new Pasajero(4,"Alvaro","Flores","10459786H"));
        listaPasajeros.add(new Pasajero(5,"Francisco","Martinez","42103968F"));

    }
}
