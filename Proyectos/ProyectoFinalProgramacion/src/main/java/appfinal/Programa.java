package appfinal;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
            // Seleccion de categoria
            String[] opciones = {"Alumnado","Tutores","Unidades"};
            // Se pide con que categoria trabajar
            String opcion = String.valueOf(JOptionPane.showInputDialog(null,"Centro: IES Sin Fin \n ¿Con que categoria quiere trabajar?", "Gestion de centros",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]));
            
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
            };
            
            return select;
        }

}
