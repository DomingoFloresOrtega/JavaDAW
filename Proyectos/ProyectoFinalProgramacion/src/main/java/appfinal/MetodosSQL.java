/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfinal;

import entidades.Alumnado;
import entidades.Tutore;
import entidades.Unidade;

import java.util.List;

import javax.swing.JOptionPane;

import controladores.ControladorAlumnado;
import controladores.ControladorTutores;
import controladores.ControladorUnidades;

/**
 *
 * @author domingo
 */
public class MetodosSQL {
	
    /***************** ALUMNADO **************/
	
	public static void obtenerAlumnos(){
    	ControladorAlumnado ac = new ControladorAlumnado();
    	List<Alumnado> listaAlumnos = ac.findAll();
    	
    	for (Alumnado a : listaAlumnos) {
			System.out.println(a);
		}
	}
	
	public static void matricularAlumno(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        Alumnado a1 = new Alumnado();
        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
        a1.setAlergias(Byte.parseByte(JOptionPane.showInputDialog("Inserte 0 si el alumno no tiene alergias. En caso contrario inserte 1")));
        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
        System.out.println(a1);
        ac.crearAlumno(a1);
    }
	
	public static void actualizarAlumno(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        Alumnado a1 = new Alumnado();
        a1.setCodAlumnado(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del usuario a modificar")));
        JOptionPane.showMessageDialog(null, "A continuación se procedera a actualizar al usuario seleccionado. \n Indique bien los valores del usuario");
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
    	ac.borrarAlumno(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del alumno o alumna")));
    }
	
/***************** TUTORES **************/
	
	public static void obtenerTutor(){
		ControladorTutores tc = new ControladorTutores();
    	List<Tutore> listaTutores = tc.findAll();
    	
    	for (Tutore t : listaTutores) {
			System.out.println(t);
		}
    }
	
	public static void matricularTutor(){
		ControladorTutores tc = new ControladorTutores();
        Tutore t1 = new Tutore();
        t1.setNomTutor(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del tutor")));
        t1.setApe1Tutor(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del tutor")));
        t1.setApe2Tutor(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del tutor (si tiene)")));
        t1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la dirección del tutor")));
        t1.setEmail(String.valueOf(JOptionPane.showInputDialog("Indique el email del tutor")));
        t1.setTel(String.valueOf(JOptionPane.showInputDialog("Indique el telefono de contacto")));
        tc.crearTutor(t1);
       
    }
	
	public static void actualizarTutor(){
    	ControladorTutores tc = new ControladorTutores();
        Tutore t1 = new Tutore();
        t1.setCodTutor(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del tutor a modificar")));
        JOptionPane.showMessageDialog(null, "A continuación se procedera a actualizar al usuario seleccionado. \n Indique bien los valores del usuario");
        t1.setNomTutor(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del tutor")));
        t1.setApe1Tutor(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del tutor")));
        t1.setApe2Tutor(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del tutor (si tiene)")));
        t1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la dirección del tutor")));
        t1.setEmail(String.valueOf(JOptionPane.showInputDialog("Indique el email del tutor")));
        t1.setTel(String.valueOf(JOptionPane.showInputDialog("Indique el telefono de contacto")));
        tc.modificarTutor(t1);
    }
	
	public static void eliminarTutor(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        ac.borrarAlumno(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del alumno o alumna")));
    }
	
/***************** UNIDADES **************/
	
	public static void obtenerUnidad(){
		ControladorUnidades uc = new ControladorUnidades();
    	List<Unidade> listaUnidades = uc.findAll();
    	
    	for (Unidade u : listaUnidades) {
			System.out.println(u);
		}
    }
	
	public static void crearUnidad(){
		ControladorUnidades uc = new ControladorUnidades();
        Unidade u1 = new Unidade();
        u1.setTutoria(String.valueOf(JOptionPane.showInputDialog("Inserte la unidad")));
        u1.setNumMaxAlum(String.valueOf(JOptionPane.showInputDialog("Inserte el número máximo de alumnos")));
        uc.crearUnidad(u1);
       
    }
	
	public static void modificarUnidad(){
		ControladorUnidades uc = new ControladorUnidades();
        Unidade u1 = new Unidade();
        u1.setCodUnidad(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID de la unidad a modificar")));
        JOptionPane.showMessageDialog(null, "A continuación se procedera a actualizar la unidad seleccionada. \n Indique bien los valores de la unidad");
        u1.setTutoria(String.valueOf(JOptionPane.showInputDialog("Inserte la unidad")));
        u1.setNumMaxAlum(String.valueOf(JOptionPane.showInputDialog("Inserte el número máximo de alumnos")));
        uc.modificarUnidad(u1);
    }
	
	public static void eliminarUnidad(){
    	ControladorAlumnado ac = new ControladorAlumnado();
        ac.borrarAlumno(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del alumno o alumna")));
    }
}
