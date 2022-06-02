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

import javax.persistence.NoResultException;
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
	
	public static boolean obtenerAlumnos(){
		boolean salir = true;
		
		try {
			salir = Metodos.opcionAlumnadoListado();
		} catch (NoResultException nre) {
			JOptionPane.showMessageDialog(null, "El alumno/a no existe");
		};
		
		return salir;
	}
	
	public static boolean matricularAlumno(){
		boolean salir = true;
		
		try {
			ControladorAlumnado ac = new ControladorAlumnado();
	    	ControladorTutores tc = new ControladorTutores();
	        Alumnado a1 = new Alumnado();
	        int alergia = 0;
	        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
	        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
	        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
	        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
	        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
	        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
	        // Comprobación y conversion de alergias
	        alergia = Integer.parseInt(JOptionPane.showInputDialog("Inserte 0 si el alumno no tiene alergias. En caso contrario inserte 1"));
	        if (alergia == 0) {
	        	a1.setAlergias(false);
	        } else {
	        	a1.setAlergias(true);
	        }
	        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
	        a1.setTutore(tc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Inserte el ID del tutor"))));
	        ac.crearAlumno(a1);
	        salir = false;
		} catch (NumberFormatException nfe) {
	    	 JOptionPane.showMessageDialog(null, "Se han introducido parametros erroneos o vacios");
	    }
		
		return salir;
    }
	
	public static boolean actualizarAlumno(){
		boolean salir = true;
		
		try {
	    	ControladorAlumnado ac = new ControladorAlumnado();
	    	ControladorTutores tc = new ControladorTutores();
	        Alumnado a1 = new Alumnado();
	        int alergia = 0;
	        int comprobarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del usuario a modificar"));
		        // Comprueba que existe el alumno y en caso que exista procede a actualizarlo
		        if (ac.findById(comprobarCodigo).getNombreAlumnado() != null){
		        	a1.setCodAlumnado(comprobarCodigo);
		        	JOptionPane.showMessageDialog(null, "A continuación se procedera a actualizar al usuario seleccionado. \n Indique bien los valores del usuario");
			        a1.setNombreAlumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno")));
			        a1.setApe1Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno")));
			        a1.setApe2Alumnado(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)")));
			        a1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la direcció del alumno")));
			        a1.setProvincia(String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno")));
			        a1.setCodpostal(String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno")));
			        // Comprobación y conversión de alergias
			        alergia = Integer.parseInt(JOptionPane.showInputDialog("Inserte 0 si el alumno no tiene alergias. En caso contrario inserte 1"));
			        if (alergia == 0) {
			        	a1.setAlergias(false);
			        } else {
			        	a1.setAlergias(true);
			        }
			        a1.setDesAlergias(String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo")));
			        a1.setTutore(tc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Inserte el ID del tutor"))));
			        ac.modificarAlumno(a1);
			        salir = false;
		        }
		} catch (NumberFormatException nfe) {
	   	 JOptionPane.showMessageDialog(null, "Se han introducido parametros erroneos o vacios");
		} catch (NoResultException nre) {
		   	 JOptionPane.showMessageDialog(null, "El alumno/a seleccionado no existe");
		}
		
		return salir;
    }
	
	public static boolean eliminarAlumno(){
		boolean salir = true;
		
		try {
			ControladorAlumnado ac = new ControladorAlumnado();
			int comprobarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID de la unidad a modificar"));
			// Comprueba que existe el alumno y en caso que exista procede a eliminarlo
			if (ac.findById(comprobarCodigo).getNombreAlumnado() != null) {
		        ac.borrarAlumno(comprobarCodigo);
		        salir = false;
			}
		} catch (NoResultException nre) {
		   	 JOptionPane.showMessageDialog(null, "El alumno/a seleccionado no existe");
		}
		
		return salir;
    }
	
/***************** TUTORES **************/
	
	public static boolean obtenerTutor(){
		boolean salir = true;
		
		try {
			Metodos.opcionTutoresListado();
			salir = false;
		} catch (NullPointerException npe) {
			System.out.println("Existen valores nulos");
		} catch (NoResultException nre) {
			JOptionPane.showMessageDialog(null, "El tutor no existe");
		};
		
		return salir;
    }
	
	public static boolean matricularTutor(){
		boolean salir = true;
		
		try {
			ControladorTutores tc = new ControladorTutores();
	        Tutore t1 = new Tutore();
	        ControladorUnidades uc = new ControladorUnidades();
	        Unidade u1 = new Unidade();
	        
	        t1.setNomTutor(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del tutor")));
	        t1.setApe1Tutor(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del tutor")));
	        t1.setApe2Tutor(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del tutor (si tiene)")));
	        t1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la dirección del tutor")));
	        t1.setEmail(String.valueOf(JOptionPane.showInputDialog("Indique el email del tutor")));
	        t1.setTel(String.valueOf(JOptionPane.showInputDialog("Indique el telefono de contacto")));
	        JOptionPane.showConfirmDialog(null, "¿Desea crear una unidad nueva?");
	        JOptionPane.showMessageDialog(null, "A continuación seleccione la unidad a asignar de las siguientes");
	        List<Unidade> listaUnidades = uc.findAll();
	        for (Unidade u : listaUnidades) {
        		JOptionPane.showMessageDialog(null, u.getCodUnidad() + " - " + u.getTutoria() + " (" + u.getTutore().getNomTutor() + " " + u.getTutore().getApe1Tutor() + ")");
    		}
	        t1.setUnidade(uc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID de la unidad"))));
	        tc.crearTutor(t1);
	        salir = false;
		} catch (NumberFormatException nfe) {
	   	 JOptionPane.showMessageDialog(null, "Se han introducido parametros erroneos o vacios");
	    } catch (NoResultException nre) {
		   	 JOptionPane.showMessageDialog(null, "La unidad seleccionada no existe");
		} catch (StackOverflowError soe) {
			JOptionPane.showMessageDialog(null, "La unidad seleccionada tiene asignado un tutor");
		}
		
		return salir;
    }
	
	public static boolean actualizarTutor(){
		boolean salir = true;
		
		try {
	    	ControladorTutores tc = new ControladorTutores();
	    	ControladorUnidades uc = new ControladorUnidades();
	        Tutore t1 = new Tutore();
	        int comprobarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del usuario a modificar"));
	        // Comprueba que existe el tutor y en caso que exista procede a actualizarlo
	        if (tc.findByPK(comprobarCodigo).getNomTutor() != null) {
		        t1.setNomTutor(String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del tutor")));
		        t1.setApe1Tutor(String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del tutor")));
		        t1.setApe2Tutor(String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del tutor (si tiene)")));
		        t1.setDireccion(String.valueOf(JOptionPane.showInputDialog("Inserte la dirección del tutor")));
		        t1.setEmail(String.valueOf(JOptionPane.showInputDialog("Indique el email del tutor")));
		        t1.setTel(String.valueOf(JOptionPane.showInputDialog("Indique el telefono de contacto")));
		        JOptionPane.showMessageDialog(null, "A continuación seleccione la unidad a asignar de las siguientes");
		        List<Unidade> listaUnidades = uc.findAll();
		        for (Unidade u : listaUnidades) {
	        		JOptionPane.showMessageDialog(null, u.getCodUnidad() + " - " + u.getTutoria() + " (" + u.getTutore().getNomTutor() + " " + u.getTutore().getApe1Tutor() + ")");
	    		}
		        t1.setUnidade(uc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID de la unidad"))));
		        tc.modificarTutor(t1);
		        salir = false;
	        }
		} catch (NumberFormatException nfe) {
	   	 JOptionPane.showMessageDialog(null, "Se han introducido parametros erroneos o vacios");
		} catch (NoResultException nre) {
		   	 JOptionPane.showMessageDialog(null, "El tutor seleccionado no existe");
		} catch (StackOverflowError soe) {
			JOptionPane.showMessageDialog(null, "La unidad seleccionada tiene asignado un tutor");
		}
		
		return salir;
    }
	
	public static boolean eliminarTutor(){
		boolean salir = true;
		
		try {
			ControladorTutores tc = new ControladorTutores();
			int comprobarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del tutor"));
			// Comprueba que existe el tutor y en caso que exista procede a eliminarlo
			if (tc.findByPK(comprobarCodigo).getNomTutor() != null) {
		        tc.borrarTutor(tc.findByPK(comprobarCodigo));
		        salir = false;
			}
		} catch (NoResultException nre) {
		   	 JOptionPane.showMessageDialog(null, "El tutor seleccionado no existe");
		} catch (StackOverflowError soe) {
			JOptionPane.showMessageDialog(null, "El tutor tiene asignada una unidad");
		}
		
		return salir;
    }
	
/***************** UNIDADES **************/
	
	public static boolean obtenerUnidad(){
		boolean salir = true;
		
		try {
			Metodos.opcionUnidadesListado();
			salir = false;
		} catch (NoResultException nre) {
			JOptionPane.showMessageDialog(null, "La unidad no existe");
		};
		
		return salir;
    }
	
	public static boolean crearUnidad(){
		boolean salir = true;
		
		try {
			ControladorUnidades uc = new ControladorUnidades();
			ControladorTutores tc = new ControladorTutores();
	        Unidade u1 = new Unidade();
	        Tutore t1 = new Tutore();
	        List<Unidade> listaUnidades = uc.findAll();
        	
        	for (Unidade u : listaUnidades) {
        		if (uc.findByPK(1) == null) {
        			u1.setCodUnidad(1);
        			u1.setNumMaxAlum("20");
        			u1.setTutoria("Unidad 0");
        		}
        	}
	        u1.setTutoria(String.valueOf(JOptionPane.showInputDialog("Inserte la unidad")));
	        u1.setNumMaxAlum(String.valueOf(JOptionPane.showInputDialog("Inserte el número máximo de alumnos")));
	        u1.setTutore(tc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del tutor"))));
	        uc.crearUnidad(u1);
	        salir = false;
		} catch (NumberFormatException nfe) {
	   	 JOptionPane.showMessageDialog(null, "Se han introducido parametros erroneos o vacios");
	    } catch (NoResultException nre) {
	    	JOptionPane.showMessageDialog(null, "No existe el tutor asignado");
	    }
		
		return salir;
    }
	
	public static boolean modificarUnidad(){
		boolean salir = true;
		
		try {
			ControladorUnidades uc = new ControladorUnidades();
			ControladorTutores tc = new ControladorTutores();
	        Unidade u1 = new Unidade();
	        int comprobarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID de la unidad a modificar"));
	        // Comprueba que existe la unidad y en caso que exista procede a actualizarla
	        if (uc.findByPK(comprobarCodigo).getTutoria() != null) {
		        JOptionPane.showMessageDialog(null, "A continuación se procedera a actualizar la unidad seleccionada. \n Indique bien los valores de la unidad");
		        u1.setTutoria(String.valueOf(JOptionPane.showInputDialog("Inserte la unidad")));
		        u1.setNumMaxAlum(String.valueOf(JOptionPane.showInputDialog("Inserte el número máximo de alumnos")));
		        u1.setTutore(tc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del tutor"))));
		        uc.modificarUnidad(u1);
		        salir = false;
	        }
		} catch (NumberFormatException nfe) {
	    	 JOptionPane.showMessageDialog(null, "Se han introducido parametros erroneos o vacios");
	    } catch (NoResultException nre) {
		   	 JOptionPane.showMessageDialog(null, "La unidad seleccionada no existe");
		}
		
		return salir;
    }
	
	public static boolean eliminarUnidad(){
		boolean salir = true;
		
		try {
			ControladorUnidades uc = new ControladorUnidades();
			int comprobarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID de la unidad a modificar"));
			// Comprueba que existe la unidad y en caso que exista procede a eliminarla
			if (uc.findByPK(comprobarCodigo).getTutoria() != null) {
		        uc.borrarUnidad(uc.findByPK(comprobarCodigo));
		        salir = false;
			}
		} catch (NoResultException nre) {
		   	 JOptionPane.showMessageDialog(null, "La unidad seleccionada no existe");
		} catch (ClassCastException cce) {
			JOptionPane.showMessageDialog(null, "No es posible eliminar la unidad. Existen alumnos registrados");
		}
		
		return salir;
    }
}