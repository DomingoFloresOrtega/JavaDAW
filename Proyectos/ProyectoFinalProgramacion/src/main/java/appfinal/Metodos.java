/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfinal;

import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import controladores.ControladorAlumnado;
import controladores.ControladorTutores;
import controladores.ControladorUnidades;
import entidades.Alumnado;
import entidades.Tutore;
import entidades.Unidade;

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
        		MetodosSQL.obtenerTutor();
        		break;
        	case 2:
                MetodosSQL.matricularTutor();
                break;
            case 1:
                MetodosSQL.actualizarTutor();
                break;
            case 0:
                MetodosSQL.eliminarTutor();
                break;
        };
    }
    
    public static void opcionUnidades(){
        ImageIcon iconUnidad = new ImageIcon("Imagenes/unidad.png");
        String [] botones = { "Eliminar", "Modificar", "Agregar", "Listado" };
        
        int variable = JOptionPane.showOptionDialog (null, "Bienvenido al area de unidades \n ¿Qué desea hacer hoy?", 
                ":: GESTION DE CENTROS :: - IES Sin Fin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, iconUnidad, botones, botones[0]);
        
        switch (variable) {
	        case 3:
	    		MetodosSQL.obtenerUnidad();
	    		break;
        	case 2:
                MetodosSQL.crearUnidad();
                break;
            case 1:
                MetodosSQL.modificarUnidad();
                break;
            case 0:
                MetodosSQL.eliminarUnidad();
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
    
    /************************************
     *********** LISTADOS  **************
     ************************************/
    
    public static void opcionAlumnadoListado(){
        ImageIcon iconInforme = new ImageIcon("Imagenes/informe.png");
        String [] botones = { "Por ID", "Todo el listado" };
        ControladorAlumnado ac = new ControladorAlumnado();
        
        int variable = JOptionPane.showOptionDialog (null, "Seleccione como desea obtener el listado", 
                ":: GESTION DE CENTROS :: - IES Sin Fin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, iconInforme, botones, botones[0]);
        
        
        switch (variable) {
         
        	case 1:
        		
            	List<Alumnado> listaAlumnos = ac.findAll();
            	
            	for (Alumnado a : listaAlumnos) {
            		JOptionPane.showMessageDialog(null, "El alumno " + a.getNombreAlumnado() + " " + a.getApe1Alumnado() + " " + a.getApe2Alumnado() + 
            				" con ID " + a.getCodAlumnado() + " vive en " + a.getDireccion() + "(" + a.getCodpostal() + "," + a.getProvincia() + ")."
            						+ " El alumno pertenece al tutor con ID " + a.getTutore().getCodTutor());
        		}
            	
            	break;
            case 0:
            	int id = 0;
            	
            	id = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del usuario"));
            	JOptionPane.showMessageDialog(null, "El alumno " + ac.findById(id).getNombreAlumnado() + " " + ac.findById(id).getApe1Alumnado() + " " + ac.findById(id).getApe2Alumnado() + 
        				" con ID " + ac.findById(id).getCodAlumnado() + " vive en " + ac.findById(id).getDireccion() + "(" + ac.findById(id).getCodpostal() + "," + ac.findById(id).getProvincia() + ")."
        						+ " El alumno pertenece al tutor con ID " + ac.findById(id).getTutore().getCodTutor());
         
         };
    }
    
    public static void opcionTutoresListado(){
    	ImageIcon iconInforme = new ImageIcon("Imagenes/informe.png");
        String [] botones = { "Por ID", "Todo el listado" };
        ControladorTutores tc = new ControladorTutores();
        
        int variable = JOptionPane.showOptionDialog (null, "Seleccione como desea obtener el listado", 
                ":: GESTION DE CENTROS :: - IES Sin Fin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, iconInforme, botones, botones[0]);
        
        switch (variable) {
            case 1:
            	List<Tutore> listaTutores = tc.findAll();
            	
            	for (Tutore t : listaTutores) {
            		JOptionPane.showMessageDialog(null, "El tutor " + t.getNomTutor() + " " + t.getApe1Tutor() + " " + t.getApe2Tutor()
            		+ " vive en " + t.getDireccion() + ". Sus datos de contacto son: \n - Email: " + t.getEmail() + "\n - Telefono: " + t.getTel());
        		
        		}
            	
            	break;
            case 0:
            	int id = 0;
            	
            	id = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del usuario"));
            	JOptionPane.showMessageDialog(null, "El tutor " + tc.findByPK(id).getNomTutor() + " " + tc.findByPK(id).getApe1Tutor() + " " + tc.findByPK(id).getApe2Tutor()
        		+ " vive en " + tc.findByPK(id).getDireccion() + ". Sus datos de contacto son: \n - Email: " + tc.findByPK(id).getEmail() + "\n - Telefono: " + tc.findByPK(id).getTel());
        };
    }
    
    public static void opcionUnidadesListado(){
    	ImageIcon iconInforme = new ImageIcon("Imagenes/informe.png");
        String [] botones = { "Por ID", "Todo el listado" };
        ControladorUnidades uc = new ControladorUnidades();
        
        int variable = JOptionPane.showOptionDialog (null, "Seleccione como desea obtener el listado", 
                ":: GESTION DE CENTROS :: - IES Sin Fin", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, iconInforme, botones, botones[0]);
        
        switch (variable) {
            case 1:
            	List<Unidade> listaUnidades = uc.findAll();
            	
            	for (Unidade u : listaUnidades) {
            		JOptionPane.showMessageDialog(null, "La unidad " + u.getTutoria() + " con ID " + u.getCodUnidad() + " permite un máximo de " + u.getNumMaxAlum() + " alumnos"
            				+ ". El tutor de la unidad es " + u.getTutore().getNomTutor() + " " + u.getTutore().getApe1Tutor() + " " + u.getTutore().getApe2Tutor());
        		}
            	
            	break;
            case 0:
            	int id = 0;
            	
            	id = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del usuario"));
            	JOptionPane.showMessageDialog(null, "La unidad " + uc.findByPK(id).getTutoria() + " con ID " + uc.findByPK(id).getCodUnidad() + " permite un máximo de " + uc.findByPK(id).getNumMaxAlum() + " alumnos"
        				+ ". El tutor de la unidad es " + uc.findByPK(id).getTutore().getNomTutor() + " " + uc.findByPK(id).getTutore().getApe1Tutor() + " " + uc.findByPK(id).getTutore().getApe2Tutor());
        };
    }
}
