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
import java.util.Objects;

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
		
		return true;
	}
	
	public static boolean matricularAlumno(){
		boolean salir = true;
		
		try {
			ControladorAlumnado ac = new ControladorAlumnado();
	    	ControladorTutores tc = new ControladorTutores();
	        Alumnado a1 = new Alumnado();
	        int alergia = 0;
	        boolean alergias = true;
	        
	        JOptionPane.showMessageDialog(null, "Antes de matricular a un alumno, debe crear un tutor");
        	int tutor = JOptionPane.showConfirmDialog(null, "¿Desea crear un tutor nuevo?");
        	if (tutor == 0) {
	        	MetodosSQL.matricularTutor();
	        }
        	// Comienza a matricular
	        String nombre = String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno"));
	        String ape1 = String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno"));
	        String ape2 = String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)"));
	        String direccion = String.valueOf(JOptionPane.showInputDialog("Inserte la dirección del alumno"));
	        String provincia = String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno"));
	        String codigo = String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno"));
	        // Comprobación y conversion de alergias
	        alergia = Integer.parseInt(JOptionPane.showInputDialog("Inserte 0 si el alumno no tiene alergias. En caso contrario inserte 1"));
	        if (alergia == 0) {
	        	alergias = false;
	        } else {
	        	alergias = true;
	        }
	        String desAlergias = String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo"));
	        JOptionPane.showMessageDialog(null, "A continuación seleccione el tutor a asignar de las siguientes");
	        List<Tutore> listaTutores = tc.findAll();
	        for (Tutore t : listaTutores) {
	        	if (Objects.isNull(t.getUnidade())) {
		    		JOptionPane.showMessageDialog(null, t.getCodTutor() + " - " + t.getNomTutor() + " " + t.getApe1Tutor() + " (Sin unidad asignada)");
		    	} else {
		    		JOptionPane.showMessageDialog(null, t.getCodTutor() + " - " + t.getNomTutor() + " " + t.getApe1Tutor() + " (" + t.getUnidade().getCodUnidad() + " - " + t.getUnidade().getTutoria() + ")");
		    	}
    		}
	        a1.setTutore(tc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Inserte el ID del tutor"))));
	        // Si no existen campos obligatorios en blanco, inserta los datos
	        if (nombre.length() != 0 && ape1.length() != 0 && direccion.length() != 0 && provincia.length() != 0 && codigo.length() != 0) {
	        	ac.crearAlumno(a1);
		        JOptionPane.showMessageDialog(null, "El alumno se ha creado correctamente");
	        } else {
	        	JOptionPane.showMessageDialog(null, "Se han introducido campos obligatorios en blanco");
	        }
	        
	        
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
	        boolean alergias = true;
	        int comprobarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del usuario a modificar"));
		        // Comprueba que existe el alumno y en caso que exista procede a actualizarlo
		        if (ac.findById(comprobarCodigo).getNombreAlumnado() != null){
		        	a1.setCodAlumnado(comprobarCodigo);
		        	// Si el alumno es correcto, ejecuta
		        	JOptionPane.showMessageDialog(null, "A continuación se procedera a actualizar al usuario seleccionado. \n Indique bien los valores del usuario");
		        	String nombre = String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del alumno"));
			        String ape1 = String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del alumno"));
			        String ape2 = String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del alumno (si tiene)"));
			        String direccion = String.valueOf(JOptionPane.showInputDialog("Inserte la dirección del alumno"));
			        String provincia = String.valueOf(JOptionPane.showInputDialog("Inserte la provincia del alumno"));
			        String codigo = String.valueOf(JOptionPane.showInputDialog("Inserte el codigo postal del alumno"));
			        // Comprobación y conversión de alergias
			        alergia = Integer.parseInt(JOptionPane.showInputDialog("Inserte 0 si el alumno no tiene alergias. En caso contrario inserte 1"));
			        if (alergia == 0) {
			        	alergias = false;
			        } else {
			        	alergias = true;
			        }
			        String desAlergias = String.valueOf(JOptionPane.showInputDialog("En caso de presentar alergias, especifiquelo"));
			        JOptionPane.showMessageDialog(null, "A continuación seleccione el tutor a asignar de las siguientes");
			        List<Tutore> listaTutores = tc.findAll();
			        for (Tutore t : listaTutores) {
			        	// Indica la unidad de los tutores
			        	if (Objects.isNull(t.getUnidade())) {
				    		JOptionPane.showMessageDialog(null, t.getCodTutor() + " - " + t.getNomTutor() + " " + t.getApe1Tutor() + " (Sin unidad asignada)");
				    	} else {
				    		JOptionPane.showMessageDialog(null, t.getCodTutor() + " - " + t.getNomTutor() + " " + t.getApe1Tutor() + " (" + t.getUnidade().getCodUnidad() + " - " + t.getUnidade().getTutoria() + ")");
				    	}
		    		}
			        a1.setTutore(tc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Inserte el ID del tutor"))));
			        // Si no existen campos obligatorios en blanco, inserta los datos
			        if (nombre.length() != 0 && ape1.length() != 0 && direccion.length() != 0 && provincia.length() != 0 && codigo.length() != 0) {
			        	ac.modificarAlumno(a1);
				        JOptionPane.showMessageDialog(null, "El alumno se ha modificado correctamente");
			        } else {
			        	JOptionPane.showMessageDialog(null, "Se han introducido campos obligatorios en blanco");
			        }
			        
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
		
		return true;
    }
	
	public static boolean matricularTutor(){
		boolean salir = true;
		
		try {
			ControladorTutores tc = new ControladorTutores();
	        Tutore t1 = new Tutore();
	        ControladorUnidades uc = new ControladorUnidades();
	        Unidade u1 = new Unidade();
	        
	        String nombre = String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del tutor"));
	        String ape1 = String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del tutor"));
	        String ape2 = String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del tutor (si tiene)"));
	        String direccion = String.valueOf(JOptionPane.showInputDialog("Inserte la dirección del tutor"));
	        String email = String.valueOf(JOptionPane.showInputDialog("Indique el email del tutor"));
	        String tel = String.valueOf(JOptionPane.showInputDialog("Indique el telefono de contacto"));
		    
	        if (nombre.length() != 0 && ape1.length() != 0 && direccion.length() != 0 && email.length() != 0 && tel.length() != 0) {
	        	t1.setNomTutor(nombre);
	        	t1.setApe1Tutor(ape1);
	        	t1.setApe2Tutor(ape2);
	        	t1.setDireccion(direccion);
	        	t1.setEmail(email);
	        	t1.setTel(tel);
	        	tc.crearTutor(t1);
			    JOptionPane.showMessageDialog(null, "El tutor se ha creado correctamente");
			    salir = false;
	        } else {
	        	JOptionPane.showMessageDialog(null, "Se han introducido campos obligatorios en blanco");
	        } 
	        
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
	        	String nombre = String.valueOf(JOptionPane.showInputDialog("Inserte el nombre del tutor"));
		        String ape1 = String.valueOf(JOptionPane.showInputDialog("Inserte el primer apellido del tutor"));
		        String ape2 = String.valueOf(JOptionPane.showInputDialog("Inserte el segundo apellido del tutor (si tiene)"));
		        String direccion = String.valueOf(JOptionPane.showInputDialog("Inserte la dirección del tutor"));
		        String email = String.valueOf(JOptionPane.showInputDialog("Indique el email del tutor"));
		        String tel = String.valueOf(JOptionPane.showInputDialog("Indique el telefono de contacto"));
			    
		        if (nombre.length() != 0 && ape1.length() != 0 && direccion.length() != 0 && email.length() != 0 && tel.length() != 0) {
		        	t1.setNomTutor(nombre);
		        	t1.setApe1Tutor(ape1);
		        	t1.setApe2Tutor(ape2);
		        	t1.setDireccion(direccion);
		        	t1.setEmail(email);
		        	t1.setTel(tel);
		        	tc.modificarTutor(t1);
				    JOptionPane.showMessageDialog(null, "El tutor se ha modificado correctamente");
				    salir = false;
		        } else {
		        	JOptionPane.showMessageDialog(null, "Se han introducido campos obligatorios en blanco");
		        }
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
		
		return true;
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
        		if (Objects.isNull(uc.findByPK(1))) {
        			u1.setCodUnidad(1);
        			u1.setNumMaxAlum("20");
        			u1.setTutoria("Unidad 0");
        		}
        	}
        	
        	JOptionPane.showMessageDialog(null, "Antes de crear una unidad, debe crear un profesor");
        	int tutor = JOptionPane.showConfirmDialog(null, "¿Desea crear un tutor nuevo?");
        	if (tutor == 0) {
	        	MetodosSQL.matricularTutor();
	        }
	        u1.setTutoria(String.valueOf(JOptionPane.showInputDialog("Inserte la unidad")));
	        u1.setNumMaxAlum(String.valueOf(JOptionPane.showInputDialog("Inserte el número máximo de alumnos")));
	        JOptionPane.showMessageDialog(null, "A continuación seleccione el tutor/a a asignar de los siguientes");
		    List<Tutore> listaTutores = tc.findAll();
		    for (Tutore t : listaTutores) {
		    	if (Objects.isNull(t.getUnidade())) {
		    		JOptionPane.showMessageDialog(null, t.getCodTutor() + " - " + t.getNomTutor() + " " + t.getApe1Tutor() + " (Sin unidad asignada)");
		    	} else {
		    		JOptionPane.showMessageDialog(null, t.getCodTutor() + " - " + t.getNomTutor() + " " + t.getApe1Tutor() + " (" + t.getUnidade().getCodUnidad() + " - " + t.getUnidade().getTutoria() + ")");
		    	}
		    }
		    u1.setTutore(tc.findByPK(Integer.parseInt(JOptionPane.showInputDialog("Indique el ID del tutor"))));
	        uc.crearUnidad(u1);
	        salir = false;
		} catch (NumberFormatException nfe) {
	   	 JOptionPane.showMessageDialog(null, "Se han introducido parametros erroneos o vacios");
	    } catch (NoResultException nre) {
	    	JOptionPane.showMessageDialog(null, "No existe el tutor asignado");
	    } catch (StackOverflowError soe) {
			JOptionPane.showMessageDialog(null, "La unidad seleccionada tiene asignado un tutor");
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
		} catch (StackOverflowError soe) {
			JOptionPane.showMessageDialog(null, "La unidad seleccionada tiene asignado un tutor");
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