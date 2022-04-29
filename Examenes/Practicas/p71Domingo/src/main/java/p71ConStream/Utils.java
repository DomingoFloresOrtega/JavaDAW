/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p71ConStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author domingo
 */
public class Utils {
    // Metodo que comprueba si existe el empleado
    public static boolean estaEmpleadoPorNombre(ArrayList<Pojo> lista, String nombre){
        boolean esta;
        
        esta = lista.stream().anyMatch(p->p.getEmpleado().equalsIgnoreCase(nombre));
        
        return esta;
    }
    
    // Metodo que indica el numero de coordinador por el departamento seleccionado
    public static int coordinadoresPorDepartamentos(ArrayList<Pojo> lista, String departamento){
        int contador = (int) lista.stream().filter(e->e.getPuesto().equalsIgnoreCase(departamento))
                .filter(e->e.isCoordinador())
                .count();
        
        return contador;
    }
    
    public static List<String> empleadosPorNif(ArrayList<Pojo> lista, char letranif){
        List<String> listaNif = lista.stream().filter(c->c.getDni().contains(String.valueOf(letranif)))
            .map(Pojo::getEmpleado)
            .sorted((p1,p2)->p1.compareToIgnoreCase(p2))
            .collect(Collectors.toList());
        
        return listaNif;
    }
    
    public static List<String> empleadosPorFecha(ArrayList<Pojo> lista, LocalDate fecha){
        List<String> listaFecha = lista.stream()
                .filter(e -> e.getFechaToma().equals(LocalDate.of(10,2,2001)))
                .map(Pojo::getDni)
                .sorted((e1,e2) -> e2.compareToIgnoreCase(e1))
                .collect(Collectors.toList());

        return listaFecha;
    }
}