/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p71Domingo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author domingo
 */
public class Utils {
    // Metodo que comprueba si existe el empleado
    public static boolean estaEmpleadoPorNombre(ArrayList<Pojo> lista, String nombre){
        boolean esta = false;
        
        for (Pojo pp : lista) {
            if (pp.getEmpleado().contains(nombre)){
                esta = true;
            }
        }
        
        return esta;
    }
    
    // Metodo que indica el numero de coordinador por el departamento seleccionado
    public static int coordinadoresPorDepartamentos(ArrayList<Pojo> lista, String departamento){
        int contador = 0;
        
        for (Pojo pp : lista) {
            if (pp.isCoordinador() == true && pp.getPuesto().equalsIgnoreCase(departamento)){
                contador++;
            }
        }
        
        return contador;
    }
    
    public static ArrayList<Pojo> empleadosPorNif(ArrayList<Pojo> lista, String letranif){
        ArrayList<Pojo> listaNif = new ArrayList<>();

        for (Pojo pp : lista) {
            if (pp.getDni().contains(String.valueOf(letranif))) {
                listaNif.add(pp.getEmpleado());
            }
        }

        Collections.sort(lista, (Pojo p1, Pojo p2) -> p1.getEmpleado().compareTo(p2.getEmpleado()));

        return listaNif;
    }
}
