/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfinal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
public class GenerarLista {
    public static void seleccionGenerar(){
    	ImageIcon iconGenerar = new ImageIcon("Imagenes/informe.png");
        
        // Seleccion de categoria
        String[] opciones = {"Alumnado","Tutores","Unidades"};
        // Se pide con que categoria trabajar
        String opcion = String.valueOf(JOptionPane.showInputDialog(null,"Centro: IES Sin Fin \n Seleccione una categoria", ":: GESTION DE CENTROS ::",JOptionPane.QUESTION_MESSAGE,iconGenerar,opciones, opciones[0]));
        
        switch (opcion) {
	        case "Alumnado":
	    		generarAlumnado();
	    		break;
        	case "Tutores":
                generarTutores();
                break;
            case "Unidades":
                generarUnidades();
                break;
        };
    }
    
    public static void generarAlumnado(){
        String idFichero = "RelAlum.csv";
        String tmp;
        ControladorAlumnado ac = new ControladorAlumnado();
        List<Alumnado> listado = ac.findAll();
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
        	flujo.write("ID;" + "Nombre;" + "Apellido1;" + "Apellido2;" + "Direccion;" + "CodPostal;" + "Provincia;" + "Alergias;" + "DesAlergias");
        	flujo.newLine();
        	for (Alumnado a : listado) {
				flujo.write(a.getCodAlumnado() + ";"
						+ a.getNombreAlumnado() + ";"
						+ a.getApe1Alumnado() + ";"
						+ a.getApe2Alumnado() + ";"
						+ a.getDireccion() + ";"
						+ a.getCodpostal() + ";"
						+ a.getProvincia() + ";"
						+ a.isAlergias() + ";"
						+ a.getDesAlergias() + ";");
				flujo.newLine();
			}
        	
        	
            flujo.flush();
            JOptionPane.showMessageDialog(null, "Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
    }
    
    public static void generarTutores(){
        String idFichero = "RelTut.csv";
        String tmp;
        ControladorTutores tc = new ControladorTutores();
        List<Tutore> listado = tc.findAll();
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
        	flujo.write("ID;" + "Nombre;" + "Apellido1;" + "Apellido2;" + "Direccion;" + "Email;" + "Telefono");
        	flujo.newLine();
        	for (Tutore t : listado) {
				flujo.write(t.getCodTutor() + ";"
						+ t.getNomTutor() + ";"
						+ t.getApe1Tutor() + ";"
						+ t.getApe2Tutor() + ";"
						+ t.getDireccion() + ";"
						+ t.getEmail() + ";"
						+ t.getTel() + ";");
				flujo.newLine();
			}
        	
        	
            flujo.flush();
            JOptionPane.showMessageDialog(null, "Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
    }
    
    public static void generarUnidades(){
        String idFichero = "RelUni.csv";
        String tmp;
        ControladorUnidades uc = new ControladorUnidades();
        List<Unidade> listado = uc.findAll();
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
        	flujo.write("ID;" + "Unidad;" + "NumeroMax;");
        	flujo.newLine();
        	for (Unidade u : listado) {
				flujo.write(u.getCodUnidad() + ";"
						+ u.getTutoria() + ";"
						+ u.getNumMaxAlum() + ";");
				flujo.newLine();
			}
        	
        	
            flujo.flush();
            JOptionPane.showMessageDialog(null, "Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
    }
}
