/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfinal;

import entidades.Alumnado;
import entidades.Tutore;

import javax.swing.JOptionPane;

import controladores.ControladorAlumnado;
import controladores.ControladorTutores;

/**
 *
 * @author domingo
 */
public class MetodosSQL {
	
    /***************** ALUMNADO **************/
	
	public static void obtenerAlumnos(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        Alumnado a1 = new Alumnado();
    }
	
	public static void matricularAlumno(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        Alumnado a1 = new Alumnado();
        a1.setCodAlumnado(1);
        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
        a1.setAlergias(Byte.parseByte(JOptionPane.showInputDialog("Inserte 0 si el alumno tiene alergias. En caso contrario inserte 1")));
        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
        System.out.println(a1);
        ac.crearAlumno(a1);
    }
	
	public static void actualizarAlumno(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        Alumnado a1 = new Alumnado();
        a1.setCodAlumnado(1);
        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
        a1.setAlergias(Byte.parseByte(JOptionPane.showInputDialog("Inserte 0 si el alumno tiene alergias. En caso contrario inserte 1")));
        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
        ac.modificarAlumno(a1);
    }
	
	public static void eliminarAlumno(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        Alumnado a1 = new Alumnado();
        a1.setCodAlumnado(1);
        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
        a1.setAlergias(Byte.parseByte(JOptionPane.showInputDialog("Inserte 0 si el alumno tiene alergias. En caso contrario inserte 1")));
        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
        ac.borrarAlumno(a1);
    }
	
/***************** ALUMNADO **************/
	
	public static void obtenerTutor(){
    	ControladorTutores tc = new ControladorTutores();
        Tutore t1 = new Tutore();
    }
	
	public static void matricularTutor(){
		ControladorTutores tc = new ControladorTutores();
        Tutore t1 = new Tutore();
       
    }
	
	public static void actualizarTutor(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        Alumnado a1 = new Alumnado();
        a1.setCodAlumnado(1);
        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
        a1.setAlergias(Byte.parseByte(JOptionPane.showInputDialog("Inserte 0 si el alumno tiene alergias. En caso contrario inserte 1")));
        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
        ac.modificarAlumno(a1);
    }
	
	public static void eliminarTutor(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        Alumnado a1 = new Alumnado();
        a1.setCodAlumnado(1);
        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
        a1.setAlergias(Byte.parseByte(JOptionPane.showInputDialog("Inserte 0 si el alumno tiene alergias. En caso contrario inserte 1")));
        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
        ac.borrarAlumno(a1);
    }
}
