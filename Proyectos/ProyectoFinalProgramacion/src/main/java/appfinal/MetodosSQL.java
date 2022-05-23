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
    }
}
