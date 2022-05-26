package appfinal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
            
            ImageIcon iconHome = new ImageIcon("Imagenes/home.png");
            
            // Seleccion de categoria
            String[] opciones = {"Alumnado","Tutores","Unidades","Opciones"};
            // Se pide con que categoria trabajar
            String opcion = String.valueOf(JOptionPane.showInputDialog(null,"Centro: IES Sin Fin \n ¿Con que categoria quiere trabajar?", ":: GESTION DE CENTROS ::",JOptionPane.QUESTION_MESSAGE,iconHome,opciones, opciones[0]));
            // Guardo en la variable la categoria seleccionada
            seleccionCategoria(opcion);
     }
        
		// Segun la opción seleccionada se dirigirá a un menu u otro
        public static void seleccionCategoria(String opcion){
            
            switch (opcion) {
                case "Alumnado":
                	Metodos.opcionAlumnado();
                    break;
                case "Tutores":
                	Metodos.opcionTutores();
                    break;
                case "Unidades":
                	Metodos.opcionUnidades();
                    break;
                case "Opciones":
                	Metodos.opcionAjustes();
                    break;
            };
        }
}
