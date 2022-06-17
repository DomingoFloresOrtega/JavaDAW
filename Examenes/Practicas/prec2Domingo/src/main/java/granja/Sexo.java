/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package granja;

import java.util.Random;

/**
 *
 * @author domingo
 */
public enum Sexo {
    MACHO, HEMBRA;
    
    public static Sexo randomSexo(){
        int pick = new Random().nextInt(Sexo.values().length);
        return Sexo.values()[pick];
    }
}
