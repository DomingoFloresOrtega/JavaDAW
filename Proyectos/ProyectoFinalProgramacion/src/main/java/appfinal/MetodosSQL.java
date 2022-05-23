/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfinal;

import entidades.Alumnado;
import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class MetodosSQL {
    /***************** ALUMNADO **************/
    public static void matricularAlumno(){
        Alumnado a1 = new Alumnado();
        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
        a1.setAlergias(Integer.parseInt(JOptionPane.showInputDialog("Inserte 0 si el alumno tiene alergias. En caso contrario inserte 1")));
        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
    }
}
