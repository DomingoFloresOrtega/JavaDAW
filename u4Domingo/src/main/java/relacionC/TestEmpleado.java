/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionC;

import java.util.Scanner;

/**
 *
 * @author domingo
 */
public class TestEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nif = "", casadoLetra = "", name = "", apellidos = "", casado = "";
        double sueldo = 0, horaExtra = 0, horaExtraMes = 0, irpf = 0;
        int hijos = 0, casadoPuntos = 0;
        
        Scanner teclado = new Scanner(System.in);
        Empleado usuario = new Empleado(name,apellidos,nif,sueldo,horaExtra,horaExtraMes,irpf,hijos,casado);
        
        System.out.println("Introduzca su nombre:");
        name = teclado.nextLine();
        usuario.setName(name);
        
        System.out.println("Introduzca sus apellidos:");
        apellidos = teclado.nextLine();
        usuario.setApellidos(apellidos);
        
        System.out.println("Introduzca su NIF");
        nif = teclado.nextLine();
        usuario.setNIF(nif);
        
        System.out.println("Introduzca su sueldo base");
        sueldo = teclado.nextDouble();
        usuario.setSueldoBase(sueldo);
        
        System.out.println("Introduzca el pago por horas extras:");
        horaExtra = teclado.nextDouble();
        usuario.setPagoHoraExtra(horaExtra);
        
        System.out.println("Introduzca el pago por horas extras (mensual):");
        horaExtraMes = teclado.nextDouble();
        usuario.setHoraExtraMes(horaExtraMes);
        
        System.out.println("Introduzca IRPF:");
        irpf = teclado.nextDouble();
        usuario.setPorcentajeIRPF(irpf);
        
        teclado.nextLine();
        
        System.out.println("¿Esta casado?");
        casadoLetra = teclado.nextLine();
        
        // Comprobamos estado civil y establecemos
        if (casadoLetra.equalsIgnoreCase("s")){
            casado = "Casado";
        } else if (casadoLetra.equalsIgnoreCase("n")){
            casado = "Soltero";
        } else{
            System.out.println("Debe seleccionar SI (s) o No (n)");
        }
        usuario.setCasado(casado);
        
        System.out.println("Indique número de hijos");
        hijos = teclado.nextInt();
        usuario.setNumHijos(hijos);
        
        System.out.println(usuario.toString());
        
        // Calcular horas extras realizadas
        double horasExtrasTotal = horaExtra * horaExtraMes;
        
        // Calcular sueldo bruto
        double sueldoBruto = sueldo + horasExtrasTotal;
        
        // Calcular IRPF
        if (casado == "Casado"){
            casadoPuntos = 2;
        }
        irpf = irpf - hijos - casadoPuntos; 
        double retencionIRPF = sueldo * irpf / 100;
        double sueldoFinal = sueldoBruto - retencionIRPF;
        
        
        // Imprimimos datos
        System.out.println("======= SUELDO =======");
        System.out.println("Su sueldo es de " + sueldoBruto + " € brutos");
        System.out.println("Con las retenciones IRPF se quedaría en " + sueldoFinal + " €");
        System.out.println("======= SUPLEMENTOS =======");
        System.out.println("01 - Suplemento por hora extra: " + horasExtrasTotal + "€");
        System.out.println("02 - Retención IRPF: " + retencionIRPF + "€"); 
        
        // Incluimos valores en variables
        usuario.setName(name);
        usuario.setApellidos(apellidos);
        usuario.setRetencionIRPF(retencionIRPF);
        usuario.setSueldoneto(sueldoFinal);
        usuario.setSueldoBruto(sueldoBruto);
        
        // Imprimimos datos básicos
        System.out.println("========== INFO ==========");
        System.out.println(usuario.escribirBasicInfo());
        
        // Imprimimos datos mas concretos
        System.out.println("========== + INFO ==========");
        System.out.println(usuario.escribirAllInfo());
    }
}
