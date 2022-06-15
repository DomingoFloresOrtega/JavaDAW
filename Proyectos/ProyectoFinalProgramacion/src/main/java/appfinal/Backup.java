package appfinal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import controladores.ControladorAlumnado;
import controladores.ControladorTutores;
import controladores.ControladorUnidades;
import entidades.Alumnado;
import entidades.Tutore;
import entidades.Unidade;

public class Backup {
	public static boolean menuBackup() {
		ImageIcon iconGenerar = new ImageIcon("Imagenes/informe.png");
    	boolean salir = true;
        
        // Seleccion de categoria
        String[] opciones = {"Exportar","Importar"};
        // Se pide con que categoria trabajar
        String opcion = String.valueOf(JOptionPane.showInputDialog(null,"Centro: IES Sin Fin \n Seleccione una categoria", ":: GESTION DE CENTROS ::",JOptionPane.QUESTION_MESSAGE,iconGenerar,opciones, opciones[0]));
        
        switch (opcion) {
	        case "Exportar":
	    		salir = generarBackup();
	    		break;
        	case "Importar":
                salir = restaurarBackup();
                break;
        };
        
        return salir;
	}
	
	public static boolean generarBackup() {
		boolean salir = true;
        String idFicheroA = "RelAlum.csv";
        String idFicheroT = "RelTut.csv";
        String idFicheroU = "RelUni.csv";
        String tmp;
        ControladorAlumnado ac = new ControladorAlumnado();
        ControladorTutores tc = new ControladorTutores();
        ControladorUnidades uc = new ControladorUnidades();
        List<Alumnado> listadoA = ac.findAll();
        List<Tutore> listadoT = tc.findAll();
        List<Unidade> listadoU = uc.findAll();
        
        // Backup de alumnos/as
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroA))) {
        	for (Alumnado a : listadoA) {
				flujo.write(a.getCodAlumnado() + ";"
						+ a.getNombreAlumnado() + ";"
						+ a.getApe1Alumnado() + ";"
						+ a.getApe2Alumnado() + ";"
						+ a.getDireccion() + ";"
						+ a.getCodpostal() + ";"
						+ a.getProvincia() + ";"
						+ a.isAlergias() + ";"
						+ a.getDesAlergias() + ";"
						+ a.getTutore().getCodTutor());
				flujo.newLine();
			}
        	
            flujo.flush();
            JOptionPane.showMessageDialog(null, "Fichero " + idFicheroA + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
        
        // Backup de tutores/as
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroT))) {
        	for (Tutore t : listadoT) {
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
            JOptionPane.showMessageDialog(null, "Fichero " + idFicheroT + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
            	
        // Backup de unidades
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroU))) {
        	for (Unidade u : listadoU) {
				flujo.write(u.getCodUnidad() + ";"
						+ u.getTutoria() + ";"
						+ u.getNumMaxAlum() + ";");
				flujo.newLine();
			}
        	
        	
            flujo.flush();
            JOptionPane.showMessageDialog(null, "Fichero " + idFicheroU + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        };
        
        salir = false;
        
        return salir;
	}
	
	public static boolean restaurarBackup() {
		boolean salir = true;
		Alumnado a = new Alumnado();
		ControladorAlumnado ac = new ControladorAlumnado();
        String idFicheroA = "RelAlum.csv";
        Tutore t = new Tutore();
        ControladorTutores tc = new ControladorTutores();
        String idFicheroT = "RelTut.csv";
        Unidade u = new Unidade();
        ControladorUnidades uc = new ControladorUnidades();
        String idFicheroU = "RelUni.csv";
        String[] tokens;
        String linea;
        
     // Restaurar tutores/as
        System.out.println("Leyendo el fichero: " + idFicheroT);

        try (Scanner datosFichero = new Scanner(new File(idFicheroT), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                
                t.setCodTutor(Integer.parseInt(tokens[0]));
                t.setNomTutor(tokens[1]);
                t.setApe1Tutor(tokens[2]);
                t.setApe2Tutor(tokens[3]);
                t.setDireccion(tokens[4]);
                t.setEmail(tokens[5]);
                t.setTel(tokens[6]);
                
                tc.crearTutor(t);
    				
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Restaurar alumnos/as
        System.out.println("Leyendo el fichero: " + idFicheroA);

        try (Scanner datosFichero = new Scanner(new File(idFicheroA), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                
                a.setCodAlumnado(Integer.parseInt(tokens[0]));
				a.setNombreAlumnado(tokens[1]);
				a.setApe1Alumnado(tokens[2]);
				a.setApe2Alumnado(tokens[3]);
				a.setDireccion(tokens[4]);
				a.setCodpostal(tokens[5]);
				a.setProvincia(tokens[6]);
				a.setAlergias(Boolean.parseBoolean(tokens[7]));
				a.setTutore(tc.findByPK(Integer.parseInt(tokens[9])));
				
				ac.crearAlumno(a);
    				
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
     // Restaurar unidades
        System.out.println("Leyendo el fichero: " + idFicheroU);

        try (Scanner datosFichero = new Scanner(new File(idFicheroU), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                
                u.setCodUnidad(Integer.parseInt(tokens[0]));
                u.setNumMaxAlum(tokens[1]);
                u.setTutoria(tokens[2]);
                u.setTutore(tc.findByPK(Integer.parseInt(tokens[3])));
				
				uc.crearUnidad(u);
    				
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        salir = false;
        JOptionPane.showMessageDialog(null, "Copia de seguridad restaurada con exito");
        
        return salir;
	}
}