package appfinal;

import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) throws SQLException {
            
            ImageIcon iconHome = new ImageIcon("Imagenes/home.png");
            boolean salir = true;
            
            // Seleccion de categoria
            String[] opciones = {"Alumnado","Tutores","Unidades","Opciones"};
            // Se pide con que categoria trabajar
            String opcion = String.valueOf(JOptionPane.showInputDialog(null,"Centro: IES Sin Fin \n ¿Con que categoria quiere trabajar?", ":: GESTION DE CENTROS ::",JOptionPane.QUESTION_MESSAGE,iconHome,opciones, opciones[0]));
            // Guardo en la variable la categoria seleccionada
            
            do {
            	if (opcion.equalsIgnoreCase("null")) {
                	JOptionPane.showMessageDialog(null, "Hasta pronto");
                	salir = false;
                } else {
                	salir = seleccionCategoria(opcion);
                }	
            } while (salir);
            
     }
        
		// Segun la opción seleccionada se dirigirá a un menu u otro
        public static boolean seleccionCategoria(String opcion) throws SQLException {
            boolean salir = true;
        	
            switch (opcion) {
                case "Alumnado":
                	salir = Metodos.opcionAlumnado();
                    break;
                case "Tutores":
                	salir = Metodos.opcionTutores();
                    break;
                case "Unidades":
                	salir = Metodos.opcionUnidades();
                    break;
                case "Opciones":
                	salir = Metodos.opcionAjustes();
                    break;
            };
            
            return salir;
        }
}
