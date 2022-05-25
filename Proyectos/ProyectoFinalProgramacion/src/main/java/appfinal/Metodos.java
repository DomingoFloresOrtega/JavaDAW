/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfinal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author domingo
 */
public class Metodos {
    public static void opcionAlumnado(){
        ImageIcon iconAlumno = new ImageIcon("Imagenes/alumnado.png");
        String [] botones = { "Dar de baja", "Modificar", "Matricular", "Listado" };
        
        int variable = JOptionPane.showOptionDialog (null, "Bienvenido al area del alumnado \n ¿Qué desea hacer hoy?", 
                ":: GESTION DE CENTROS :: - IES Sin Fin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, iconAlumno, botones, botones[0]);
        
        switch (variable) {
	        case 3:
	    		MetodosSQL.obtenerAlumnos();
	    		break;
        	case 2:
                MetodosSQL.matricularAlumno();
                break;
            case 1:
                MetodosSQL.actualizarAlumno();
                break;
            case 0:
                MetodosSQL.eliminarAlumno();
                break;
        };
    }
    
    public static void opcionTutores(){
        ImageIcon iconTutor = new ImageIcon("Imagenes/tutor.png");
        String [] botones = { "Dar de baja", "Modificar", "Dar de alta", "Listado" };
        
        int variable = JOptionPane.showOptionDialog (null, "Bienvenido al area de tutoria \n ¿Qué desea hacer hoy?", 
                ":: GESTION DE CENTROS :: - IES Sin Fin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, iconTutor, botones, botones[0]);
        
        switch (variable) {
        	case 3:
        		MetodosSQL.obtenerAlumnos();
        		break;
        	case 2:
                MetodosSQL.matricularTutor();
                break;
            case 1:
                MetodosSQL.actualizarTutor();
                break;
            case 0:
                Metodos.opcionUnidades();
                break;
        };
    }
    
    public static void opcionUnidades(){
        ImageIcon iconUnidad = new ImageIcon("Imagenes/unidad.png");
        String [] botones = { "Eliminar", "Modificar", "Agregar", "Listado" };
        
        int variable = JOptionPane.showOptionDialog (null, "Bienvenido al area de unidades \n ¿Qué desea hacer hoy?", 
                ":: GESTION DE CENTROS :: - IES Sin Fin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, iconUnidad, botones, botones[0]);
        
        switch (variable) {
            case 2:
                MetodosSQL.crearUnidad();
                break;
            case 1:
                MetodosSQL.modificarUnidad();
                break;
            case 0:
                Metodos.opcionUnidades();
                break;
        };
    }
    
    public static void opcionAjustes(){
        ImageIcon iconAjuste = new ImageIcon("Imagenes/ajustes.png");
        String [] botones = { "Generar listado" };
        
        int variable = JOptionPane.showOptionDialog (null, "Bienvenido al área de configuración \n ¿Qué desea hacer hoy?", 
                "Area de configuración", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, iconAjuste, botones, botones[0]);
        
        switch (variable) {
            case 0:
                GenerarLista.seleccionGenerar();
                break;
        };
    }
}
