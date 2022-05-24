package appfinal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
            
            int opcionCat;
            ImageIcon iconHome = new ImageIcon("Imagenes/home.png");
            
            
            // Seleccion de categoria
            String[] opciones = {"Alumnado","Tutores","Unidades","Opciones"};
            // Se pide con que categoria trabajar
            String opcion = String.valueOf(JOptionPane.showInputDialog(null,"Centro: IES Sin Fin \n ¿Con que categoria quiere trabajar?", ":: GESTION DE CENTROS ::",JOptionPane.QUESTION_MESSAGE,iconHome,opciones, opciones[0]));
            // Guardo en la variable la categoria seleccionada
            opcionCat = seleccionCategoria(opcion);
            
            // Indico la categoria para mostrar las opciones disponibles
            seleccionModo(opcionCat);
            
            
        }
        
        public static int seleccionCategoria(String opcion){
            int select = 0;
            
            switch (opcion) {
                case "Alumnado":
                    select = 1;
                    break;
                case "Tutores":
                    select = 2;
                    break;
                case "Unidades":
                    select = 3;
                    break;
                case "Opciones":
                    select = 4;
                    break;
            };
            
            return select;
        }
        
        public static void seleccionModo(int opcion){
            int select = 0;
            
            switch (opcion) {
                case 1:
                    Metodos.opcionAlumnado();
                    break;
                case 2:
                    Metodos.opcionTutores();
                    break;
                case 3:
                    Metodos.opcionUnidades();
                    break;
                case 4:
                    Metodos.opcionAjustes();
                    break;
            };
        }
}
