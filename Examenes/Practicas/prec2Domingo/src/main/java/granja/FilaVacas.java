/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

import java.util.ArrayList;

/**
 *
 * @author domingo
 */
public class FilaVacas {
    ArrayList<Vaca> listaVacas = new ArrayList<>();
    private int numeroVacas;
    
    public FilaVacas(int numeroVacas) {
        for (int i = 0; i < numeroVacas; i++){
            listaVacas.add(new Vaca());
        }
    }

    public ArrayList<Vaca> getListaVacas() {
        return listaVacas;
    }

    public void setListaVacas(ArrayList<Vaca> listaVacas) {
        this.listaVacas = listaVacas;
    }

    public int getNumeroVacas() {
        return numeroVacas;
    }

    public void setNumeroVacas(int numeroVacas) {
        this.numeroVacas = numeroVacas;
    }

    @Override
    public String toString() {
        return "FilaVacas{" + "listaVacas=" + listaVacas + ", numeroVacas=" + numeroVacas + '}';
    }
    
    public int contarAngus(){
        int aux = 0;
        
        for (Vaca v : listaVacas) {
            if (v.getRaza() == Raza.ANGUS){
                aux++;
            }
        }
        
        return aux;
    }
    public int contarBeresford(){
        int aux = 0;
        
        for (Vaca v : listaVacas) {
            if (v.getRaza() == Raza.BERESFORD){
                aux++;
            }
        }
        
        return aux;
    }
    
    public int contarAngusMacho(){
        int aux = 0;
        
        for (Vaca v : listaVacas) {
            if (v.getRaza() == Raza.ANGUS && v.getSexo() == Sexo.MACHO){
                aux++;
            }
        }
        
        return aux;
    }
    
    public int contarAngusHembra(){
        int aux = 0;
        
        for (Vaca v : listaVacas) {
            if (v.getRaza() == Raza.ANGUS && v.getSexo() == Sexo.HEMBRA){
                aux++;
            }
        }
        
        return aux;
    }
    
    public int contarBeresfordMacho(){
        int aux = 0;
        
        for (Vaca v : listaVacas) {
            if (v.getRaza() == Raza.BERESFORD && v.getSexo() == Sexo.MACHO){
                aux++;
            }
        }
        
        return aux;
    }
    
    public int contarBeresfordHembra(){
        int aux = 0;
        
        for (Vaca v : listaVacas) {
            if (v.getRaza() == Raza.BERESFORD && v.getSexo() == Sexo.HEMBRA){
                aux++;
            }
        }
        
        return aux;
    }
    
    public boolean emparejarAngus(){
        boolean pareja = false;
        int hembra = 0;
        int macho = 0;
        
        for (Vaca v : listaVacas) {
            if (v.getRaza() == Raza.ANGUS && v.getSexo() == Sexo.HEMBRA){
                hembra++;
            }
            
            if (v.getRaza() == Raza.ANGUS && v.getSexo() == Sexo.MACHO){
                macho++;
            }
        }
        
        if (hembra == macho){
            pareja = true;
        }
        
        return pareja;
    }
    
    public boolean emparejarBeresford(){
        boolean pareja = false;
        int hembra = 0;
        int macho = 0;
        
        for (Vaca v : listaVacas) {
            if (v.getRaza() == Raza.BERESFORD && v.getSexo() == Sexo.HEMBRA){
                hembra++;
            }
            
            if (v.getRaza() == Raza.BERESFORD && v.getSexo() == Sexo.MACHO){
                macho++;
            }
        }
        
        if (hembra == macho){
            pareja = true;
        }
        
        return pareja;
    }
    
    
}
