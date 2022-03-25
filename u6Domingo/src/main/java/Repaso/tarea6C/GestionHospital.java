/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.tarea6C;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author domingo
 */
public class GestionHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo hospital junto con lista de pacientes y empleados
        Hospital hospital = new Hospital("Hospital Martin", "Calle San Francisco", 1000, crearPaciente(), crearEmpleado());

        // Trato a un paciente
        for (Empleado lista : hospital.getEmpleados()) {
            if (lista instanceof Medico) {
                Random ran = new Random();
                ((Medico) hospital.getEmpleados().get(1)).tratar(hospital.getPacientes().get(ran.nextInt(hospital.getPacientes().size())), "Pancetamol");
                break;
            }
        }

        // Muestro IRPF
        System.out.println("==== IRPF ====");
        for (int i = 0; i < hospital.getEmpleados().size(); i++) {
            System.out.println("El IRPF del empleado " + hospital.getEmpleados().get(i).getNombre() + " es de " + hospital.getEmpleados().get(i).calcularIRPF());
        }

        // Renuevo NIF
        for (Paciente lista : hospital.getPacientes()) {
            Random ran = new Random();
            int numero = ran.nextInt(hospital.getPacientes().size());
            hospital.getEmpleados().get(numero).renovarNIF(LocalDate.of(2031, Month.MARCH, 30));
            System.out.println(hospital.getEmpleados().get(numero).getNif().getFechaCaducidad());
            break;
        }
    }

    public static ArrayList<Paciente> crearPaciente() {

        ArrayList<Paciente> listaPacientes = new ArrayList<>();

        listaPacientes.add(new Paciente("1", "Antonio", "Martinez", new NIF('V', "23467819", LocalDate.of(2027, Month.JANUARY, 14))));
        listaPacientes.add(new Paciente("2", "Manuel", "Fernandez", new NIF('C', "87546932", LocalDate.of(2027, Month.JUNE, 23))));
        listaPacientes.add(new Paciente("3", "Alvaro", "Martinez", new NIF('E', "58961320", LocalDate.of(2027, Month.MAY, 24))));
        listaPacientes.add(new Paciente("4", "Francisco", "Perez", new NIF('H', "75103269", LocalDate.of(2027, Month.JANUARY, 14))));
        listaPacientes.add(new Paciente("5", "Antonio", "Poleo", new NIF('R', "89102030", LocalDate.of(2027, Month.FEBRUARY, 11))));

        return listaPacientes;
    }

    public static ArrayList<Empleado> crearEmpleado() {

        ArrayList<Empleado> listaEmpleado = new ArrayList<>();

        listaEmpleado.add(new Medico("Cirugia", "1", 2000, "Pedro", "Antonio", new NIF('H', "25478109", LocalDate.of(2028, Month.MARCH, 3))));
        listaEmpleado.add(new Medico("Nutricion", "2", 1000, "Miguel", "Martinez", new NIF('F', "79631254", LocalDate.of(2028, Month.JULY, 3))));
        listaEmpleado.add(new Administrativo(Grupo.C, "3", 1000, "Hugo", "Martinez", new NIF('T', "85631020", LocalDate.of(2029, Month.MARCH, 2))));
        listaEmpleado.add(new Administrativo(Grupo.D, "4", 1500, "Victor", "Fernandez", new NIF('Y', "72396410", LocalDate.of(2029, Month.MAY, 5))));
        listaEmpleado.add(new Administrativo(Grupo.E, "5", 1700, "Francisco", "Perez", new NIF('Q', "01020304", LocalDate.of(2029, Month.APRIL, 1))));

        return listaEmpleado;
    }

}
