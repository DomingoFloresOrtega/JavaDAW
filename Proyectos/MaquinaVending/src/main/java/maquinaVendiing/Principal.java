/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinaVendiing;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;
import java.io.FileInputStream;

/**
 *
 * @author domingo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //icons
        ImageIcon iconInfo = new ImageIcon("Imagenes/vending-machine.png");
        ImageIcon iconDinero = new ImageIcon("Imagenes/dinero.png");
        ImageIcon iconCogeProducto = new ImageIcon("Imagenes/CogeProducto.png");
        ImageIcon iconError = new ImageIcon("Imagenes/iconError.png");
        ImageIcon iconOutOfStock = new ImageIcon("Imagenes/out-of-stock.png");
        ImageIcon iconErrorCode = new ImageIcon("Imagenes/404-error.png");
        ImageIcon iconproducts = new ImageIcon("Imagenes/products.png");
        ImageIcon iconCantidad = new ImageIcon("Imagenes/cantidad.png");
        ImageIcon iconEfectivo = new ImageIcon("Imagenes/hand.png");
        ImageIcon iconMonedaStock = new ImageIcon("Imagenes/money.png");

        //LocalDate
        LocalTime timeNow = LocalTime.now();
        ArrayList<LocalTime> timeRecaudar = new ArrayList<>();//lista de LocalTime para cuardar el tiempo de recaudación
        ArrayList<LocalTime> timeRecargar = new ArrayList<>();//lista de LocalTime para cuardar el tiempo de recarga del dinero

        // crear objeto para recolectar dinero
        RecolectaDinero rd = new RecolectaDinero();

        //crear y inicializar objetos moneda
        Moneda1 m20 = new Moneda1(20, 10);
        Moneda1 m10 = new Moneda1(10, 10);
        Moneda1 m5 = new Moneda1(5, 10);
        Moneda1 m2 = new Moneda1(2, 10);
        Moneda1 m1e = new Moneda1(1, 10);
        Moneda1 m50c = new Moneda1(0.50, 10);
        Moneda1 m20c = new Moneda1(0.20, 10);
        Moneda1 m10c = new Moneda1(0.10, 10);
        
        //crear y inicializar el array de moneda 
        Moneda1 moneda[] = {m20, m10, m5, m2, m1e, m50c, m20c, m10c};

        //crear y inicializar un array provisional de Moneda  
        Moneda1 prov20 = new Moneda1(20, m20.getStock());
        Moneda1 prov10 = new Moneda1(10, m10.getStock());
        Moneda1 prov5 = new Moneda1(5, m5.getStock());
        Moneda1 prov2 = new Moneda1(2, m2.getStock());
        Moneda1 prov1e = new Moneda1(1, m1e.getStock());
        Moneda1 prov50c = new Moneda1(0.50, m50c.getStock());
        Moneda1 prov20c = new Moneda1(0.20, m20c.getStock());
        Moneda1 prov10c = new Moneda1(0.10, m10c.getStock());

        //crear y inicializar el array provisional
        Moneda1 prov[] = {prov20, prov10, prov5, prov2, prov1e, prov50c, prov20c, prov10c};

        //crear Tarjetas 
        Tarjeta tarjeta1 = new Tarjeta("2231458907564908", "333", "1234", 2022, 05, true);
        Tarjeta tarjeta2 = new Tarjeta("1234555569872136", "111", "1980", 2022, 05, true);
        Tarjeta tarjeta3 = new Tarjeta("7894564212369875", "523", "1569", 2022, 05, true);

        //crear lista de Tarjetas
        Tarjeta[] tarjetas = new Tarjeta[]{tarjeta1, tarjeta2, tarjeta3};

        //crear un objeto objeto maquina
        Maquina m1 = new Maquina("calle Real", 6, "Agua", "CocaCola", "Patatas Fritas", "Pistacho", "Chocolate", "KitKat", 101, 102, 103, 104, 105, 106, 10, 10, 10, 10, 10, 10, 1.50, 2.00, 1.20, 3.00, 1.50, 3.50, moneda, tarjetas);

        //crear Admin
        Administrador admin;
        admin = new Administrador("1", m1);

        boolean solicitarDatos;
        double dineroIntroducido = 0, dineroAvolver = 0, dineroIntr;
        int opcion = 0, opcion2 = 0, opcionUsuario = 0;
        int codigoProducto = 0, opcionPagar = 0;

        //Audio
        try {//crear fileInputStream and add Player desde javazoom para "Play" el audio que lo pasemos en FileStream
            FileInputStream fileInputStream = new FileInputStream("Bienvenido.mp3");
            Player player = new Player((fileInputStream));
            player.play();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        do {
            JOptionPane.showMessageDialog(null, "\n<html><div color=black; text-decoration: none;>  Vending Machine | Tetimo BANK</div></html>\n\n\n", "Info", 0, iconInfo);

            do {
                solicitarDatos = true;
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n<html><div color=red>Menu Principal</div></html>\n"
                            + "\n1.Modo Usuario\n"
                            + "\n2.Modo Admin\n"
                            + "\n3.Salir\n\n"));
                    solicitarDatos = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Se ha introducido texto en lugar de números. Vuelva a introducir los datos");
                }

            } while (solicitarDatos);

            switch (opcion) {
                case 1:

                    do {
                        solicitarDatos = true;
                        try {//controla si el usuario Introduce letra o algo mal
                            opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "\n<html><div color=red>Menu Usuario</div></html>\n"
                                    + "\nBandeja 1 : " + m1.getTipoProductoBandeja1() + " |\t " + m1.getCodigoBandeja1() + " |\t " + m1.getPrecioBandeja1() + " €\n"
                                    + "\nBandeja 2 : " + m1.getTipoProductoBandeja2() + " |\t " + m1.getCodigoBandeja2() + " |\t " + m1.getPrecioBandeja2() + " €\n"
                                    + "\nBandeja 3 : " + m1.getTipoProductoBandeja3() + " |\t " + m1.getCodigoBandeja3() + " |\t " + m1.getPrecioBandeja3() + " €\n"
                                    + "\nBandeja 4 : " + m1.getTipoProductoBandeja4() + " |\t " + m1.getCodigoBandeja4() + " |\t " + m1.getPrecioBandeja4() + " €\n"
                                    + "\nBandeja 5 : " + m1.getTipoProductoBandeja5() + " |\t " + m1.getCodigoBandeja5() + " |\t " + m1.getPrecioBandeja5() + " €\n"
                                    + "\nBandeja 6 : " + m1.getTipoProductoBandeja6() + " |\t " + m1.getCodigoBandeja6() + " |\t " + m1.getPrecioBandeja6() + " €\n\n"
                                    + "\n1. Comprar\n"
                                    + "\n2. Salir\n\n\n"));
                            solicitarDatos = false;
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "Se ha introducido texto en lugar de números o una opcion no valida. Vuelva a introducir los datos");
                        }
                    } while (solicitarDatos || (opcionUsuario != 1 && opcionUsuario != 2));

                    switch (opcionUsuario) {
                        case 1://Comprare
                            //verificar si el usuario Introduce algo malo
                            do {
                                solicitarDatos = true;
                                try {//controla si el usuario Introduce letra o algo mal
                                    codigoProducto = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del producto que quieres:"));
                                    solicitarDatos = false;
                                } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "Se ha introducido algo mal. Vuelva a introducir los datos");
                                }
                            } while (solicitarDatos || !(m1.verificarCodigoExist(codigoProducto)));
                            //continuar el codigo despues que el usuario introduce el codigo del producto
                            JOptionPane.showMessageDialog(null, "El precio de ese producto es: " + m1.precioOfProducto(codigoProducto));
                            do {
                                solicitarDatos = true;
                                try {//controla si el usuario Introduce letra o algo mal
                                    opcionPagar = Integer.parseInt(JOptionPane.showInputDialog(null, "\nQuieres comprar con:"
                                            + "\n1. Efectivo \n2. Tarjeta \n3. Salir"));
                                    solicitarDatos = false;
                                } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "Se ha introducido algo mal. Vuelva a introducir los datos");
                                }

                            } while (solicitarDatos);
                            //continuar el codigo cuando otro switch
                            switch (opcionPagar) {
                                case 1://Pagar Efectivo
                                    do {
                                        /*controle exceptions*/
                                        do {
                                            solicitarDatos = true;
                                            try {
                                                dineroIntroducido = Double.parseDouble(JOptionPane.showInputDialog(null, "Poner el dinero exacto o billetos menos de 20"));
                                                solicitarDatos = false;
                                            } catch (NumberFormatException nfe) {
                                                JOptionPane.showMessageDialog(null, "Se ha introducido algo mal. Vuelva a introducir los datos");
                                            }
                                        } while (solicitarDatos);
                                        /*controle exceptions*/
                                        if (m1.stockOfProducto(codigoProducto) <= 0) {
                                            JOptionPane.showMessageDialog(null, "No hay stock intent con otro producto", "info", 0, iconOutOfStock);
                                        } else {
                                            dineroAvolver = (dineroIntroducido - m1.precioOfProducto(codigoProducto));//saber cuando tengo que volver al cliente
                                            System.out.println(dineroAvolver);
                                            if (dineroAvolver == 0) {// si el cliente introduce el precio exacto
                                                JOptionPane.showMessageDialog(null, "Compra realizada con exito. Coge tu producto ", "info", 0, iconCogeProducto);
                                                dineroIntr = dineroIntroducido;//un variable para guardar el valor de dineroIntroducido si no el pregunta se repete en el bucle
                                                //recorrer el array y comparar el valor introducido con el valor del moneda[i] para augmentar el stock
                                                for (int i = 0; i < moneda.length; i++) {
                                                    if (dineroIntr >= moneda[i].getMoneda()) {
                                                        dineroIntr -= moneda[i].getMoneda();
                                                        moneda[i].setStock((moneda[i].getStock()) + 1);
                                                    }
                                                }
                                                // Ajusto stock de producto
                                                int aux = m1.stockOfProducto(codigoProducto) - 1;
                                                m1.setStockOfProducto(codigoProducto, aux);

                                                System.out.println(Arrays.toString(moneda));//solo para debugar el codigo
                                                System.out.println(m1.getCantidadBandeja1());

                                            } else if (dineroIntroducido < m1.precioOfProducto(codigoProducto)) {
                                                JOptionPane.showMessageDialog(null, "El dinero introducido no es suficiente para comprar este producto, vuelve a comprar el producto", "Error", 0, iconError);

                                            } else {//verificar si hay cambio y update stock utilizando 2 arrays
                                                boolean exit = true;
                                                double dinVolverOrg = dineroAvolver;
                                                do {
                                                    for (int i = 0; i < prov.length; i++) {//recorrer el array prov
                                                        do {
                                                            if (dineroAvolver >= prov[i].getMoneda() && prov[i].getStock() > 0) {
                                                                dineroAvolver -= prov[i].getMoneda();
                                                                prov[i].setStock(prov[i].getStock() - 1);//cambio el stock de array prov -1
                                                                System.out.println(prov[i].getMoneda() + " " + prov[i].getStock() + " " + dineroAvolver + " " + i);
                                                            }
                                                        } while (dineroAvolver > prov[i].getMoneda() && prov[i].getStock() > 0);

                                                        if (dineroAvolver > prov[i].getMoneda()) {
                                                            exit = false;//cambio booleano para salir
                                                        }
                                                    }

                                                } while (exit && dineroAvolver > 0);

                                                if (!exit) {
                                                    //si no hay cambio tengo que inicializar array prov copiando el valor de array moneda en prov
                                                    prov = Arrays.copyOf(moneda, moneda.length);
                                                    System.out.println(Arrays.toString(moneda));
                                                    System.out.println(Arrays.toString(prov));
                                                } else {//copio el prov en moneda para tener los cambios del stock
                                                    moneda = Arrays.copyOf(prov, prov.length);
                                                    JOptionPane.showMessageDialog(null, "La venta ha terminado. Por favor coge tu producto y tu cambio:" + dinVolverOrg + "€", "info", 0, iconCogeProducto);
                                                    //add dinero Introducido to stock
                                                    dineroIntr = dineroIntroducido;
                                                    //recorrer el array y comparar el valor introducido con el valor del moneda[i] para augmentar el stock
                                                    for (int i = 0; i < moneda.length; i++) {
                                                        if (dineroIntr >= moneda[i].getMoneda()) {
                                                            dineroIntr -= moneda[i].getMoneda();
                                                            moneda[i].setStock((moneda[i].getStock()) + 1);
                                                        }
                                                    }
                                                    //cambio la cantidad del stock del producto
                                                    int aux = m1.stockOfProducto(codigoProducto) - 1;
                                                    m1.setStockOfProducto(codigoProducto, aux);

                                                    System.out.println(Arrays.toString(moneda));//solo para deburar el codigo
                                                    System.out.println(Arrays.toString(prov));

                                                }
                                            }
                                        }

                                    } while (dineroIntroducido > 20);//si el dinero mas que 20

                                    break;

                                case 2://Pagar Tarjeta

                                    // Compruebo si hay stock del producto. En caso positivo continuo.
                                    if (m1.stockOfProducto(codigoProducto) > 0) {
                                        // Excepciones
                                        try {  // Pendiente revisar la activacion de tarjeta
                                            String numTarjeta = JOptionPane.showInputDialog(null, "Introduzca su numero de tarjeta");
                                            // Tarjeta 1
                                            if (tarjeta1.realizarPago(numTarjeta)) {
                                                if (tarjeta1.comprobarFechaCaduc(tarjeta1.getFechaCaducidadTarjeta())) {
                                                    System.out.println("Hola");
                                                } else {
                                                    System.out.println("Adios");
                                                }
                                                // Ajusto stock
                                                int aux = m1.stockOfProducto(codigoProducto) - 1;
                                                m1.setStockOfProducto(codigoProducto, aux);

                                                // Agregado dinero a recaudación
                                                double precio = m1.precioOfProducto(codigoProducto);
                                                rd.setDineroTarjetas(precio);

                                                // Finalizo compra
                                                JOptionPane.showMessageDialog(null, "Su pago se ha realizado correctamente. No olvide recoger su producto.", "info", 0, iconCogeProducto);
                                                // Tarjeta 2
                                            } else if (tarjeta2.realizarPago(numTarjeta)) {
                                                // Ajusto stock
                                                int aux = m1.stockOfProducto(codigoProducto) - 1;
                                                m1.setStockOfProducto(codigoProducto, aux);

                                                // Agregado dinero a recaudación
                                                double precio = m1.precioOfProducto(codigoProducto);
                                                rd.setDineroTarjetas(precio);

                                                // Finalizo compra
                                                JOptionPane.showMessageDialog(null, "Su pago se ha realizado correctamente. No olvide recoger su producto.", "info", 0, iconCogeProducto);

                                                // Tarjeta 3
                                            } else if (tarjeta3.realizarPago(numTarjeta)) {
                                                // Ajusto stock
                                                int aux = m1.stockOfProducto(codigoProducto) - 1;
                                                m1.setStockOfProducto(codigoProducto, aux);

                                                // Agregado dinero a recaudación
                                                double precio = m1.precioOfProducto(codigoProducto);
                                                rd.setDineroTarjetas(precio);

                                                // Finalizo compra
                                                JOptionPane.showMessageDialog(null, "Su pago se ha realizado correctamente. No olvide recoger su producto.", "info", 0, iconCogeProducto);
                                            }
                                        } catch (NullPointerException npe) {
                                            JOptionPane.showMessageDialog(null, "Debe introducir un número de tarjeta");
                                        }
                                    } else {
                                        // No hay stock
                                        JOptionPane.showMessageDialog(null, "No hay stock disponible. Intentelo con otro producto.", "Error", 0, iconOutOfStock);
                                    }
                                    break;

                                case 3://salir
                                    JOptionPane.showConfirmDialog(null, "Has eligido salir y anular la operación", "Seleccione una opción:",
                                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);

                                    break;
                            }
                            break;

                        case 2://Salir
                            JOptionPane.showConfirmDialog(null, "Quieres Salir?");
                            break;
                    }
                    break;

                case 2://Modo Admin
                    String idMaquinaIn;
                    int contador = 3;
                    do {
                        idMaquinaIn = JOptionPane.showInputDialog(null, "Código: " + m1.getCodigoAdmin() + "\n\nIntroduce el código para activar el modo mantenimiento\n");
                        if (!(idMaquinaIn.equals(m1.getCodigoAdmin()))) {
                            JOptionPane.showMessageDialog(null, "El código no es correcto. Te quedan " + (contador - 1) + " intentos", "Error", 0, iconErrorCode);
                            contador--;
                        }
                    } while (!(idMaquinaIn.equals(m1.getCodigoAdmin())) && contador != 0);//cuando el id introducido dif del idMaquina preguntarlo otraVez
                    if (contador == 0) {
                        JOptionPane.showMessageDialog(null, "Ha superado el máximo de intentos,vuelve a intentarlo mas tarde", "Error", 0, iconErrorCode);
                        break;
                    }
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n<html><div color=red>Menu Admin</div></html>\n"
                            + "\n1: Consultar / Cambiar codigos de bandejas\n"
                            + "\n2. Consultar / Cambiar productos en bandejas\n"
                            + "\n3. Consultar / Cambiar stock de productos\n"
                            + "\n4. Consultar / Recaudar / Recargar efectivo\n"
                            + "\n5. Consultar efectivo originados por tarjetas\n"
                            + "\n6. Salir\n"));
                    switch (opcion) {
                        case 1:// Consultar / Cambiar codigos de bandejas
                            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n<html><div color=red>Menu Admin</div></html>\n"
                                    + "\n1: Consultar\n"
                                    + "\n2: Cambiar códigos de bandejas\n\n"));

                            switch (opcion) {
                                case 1:// Consultar
                                    JOptionPane.showMessageDialog(null, "Código  Bandeja1 : " + m1.getCodigoBandeja1() + "\n"
                                            + "Código Bandeja2 : " + m1.getCodigoBandeja2() + "\n"
                                            + "Código Bandeja3 : " + m1.getCodigoBandeja3() + "\n"
                                            + "Código Bandeja4 : " + m1.getCodigoBandeja4() + "\n"
                                            + "Código Bandeja5 : " + m1.getCodigoBandeja5() + "\n"
                                            + "Código Bandeja6 : " + m1.getCodigoBandeja6() + "\n");
                                    break;
                                case 2:// Cambiar el codigo
                                    int codigoOld = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el código que quieres cambiar"));
                                    if (m1.verificarCodigoExist(codigoOld)) {
                                        int codigNew = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el nuevo código que quieres"));
                                        admin.cambiarElCodigoBandeja(codigoOld, codigNew);
                                        System.out.println(m1);//solo para debugar
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Ese código no existe", "Error", 0, iconErrorCode);
                                    }
                                    break;
                            }
                            break;
                        case 2: // Consultar / Cambiar productos de bandejas
                            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n<html><div color=red>Menu Admin</div></html>\n"
                                    + "\n1: Consultar\n"
                                    + "\n2: Cambiar productos de bandejas\n\n"));

                            switch (opcion) {
                                case 1:// Consultar
                                    JOptionPane.showMessageDialog(null, "Producto Bandeja1 : " + m1.getTipoProductoBandeja1() + "\n"
                                            + "Producto Bandeja2 : " + m1.getTipoProductoBandeja2() + "\n"
                                            + "Producto Bandeja3 : " + m1.getTipoProductoBandeja3() + "\n"
                                            + "Producto Bandeja4 : " + m1.getTipoProductoBandeja4() + "\n"
                                            + "Producto Bandeja5 : " + m1.getTipoProductoBandeja5() + "\n"
                                            + "Producto Bandeja6 : " + m1.getTipoProductoBandeja6() + "\n", "info", 0, iconproducts);
                                    break;
                                case 2:// Cambiar el producto
                                    int bandeja = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del producto que quieres cambiar"));
                                    if (m1.verificarCodigoExist(bandeja)) {
                                        String producto = JOptionPane.showInputDialog(null, "Introduce el nuevo producto");
                                        admin.cambiarProductoBandeja(bandeja, producto);
                                        System.out.println(m1);//solo para debugar
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Ese código no existe", "Error", 0, iconErrorCode);
                                    }
                                    break;
                            }
                            break;
                        case 3: // Consultar / Cambiar stock
                            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n<html><div color=red>Menu Admin</div></html>\n"
                                    + "\n1: Consultar\n"
                                    + "\n2: Cambiar stock de bandejas\n\n"));

                            switch (opcion) {
                                case 1:// Consultar
                                    JOptionPane.showMessageDialog(null, "Stock  Bandeja1 : " + m1.getCantidadBandeja1() + "\n"
                                            + "Stock Bandeja2 : " + m1.getCantidadBandeja2() + "\n"
                                            + "Stock Bandeja3 : " + m1.getCantidadBandeja3() + "\n"
                                            + "Stock Bandeja4 : " + m1.getCantidadBandeja4() + "\n"
                                            + "Stock Bandeja5 : " + m1.getCantidadBandeja5() + "\n"
                                            + "Stock Bandeja6 : " + m1.getCantidadBandeja6() + "\n", " info", 0, iconCantidad);
                                    break;
                                case 2:// Cambiar el stock
                                    int stock,
                                     bandeja = 0;
                                    boolean pedir = true;
                                    do {
                                        try {
                                            bandeja = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la bandeja que quieres cambiar"));
                                            pedir = false;
                                        } catch (NumberFormatException nfe) {
                                            JOptionPane.showMessageDialog(null, "Se ha introducido algo mal. Vuelva a introducir los datos");
                                        }
                                    } while (pedir);

                                    if (m1.verificarCodigoExist(bandeja)) {
                                        do {
                                            stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el nuevo stock que quieres, 15 es limite"));
                                        } while (stock > 15);

                                        admin.cambiarStockBandeja(bandeja, stock);
                                        System.out.println(m1);//solo para debugar
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Ese código no existe", "Error", 0, iconErrorCode);
                                    }
                                    break;

                            }
                            break;
                        case 4://"Consultar efectivo"
                            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n<html><div color=red>Consultar / Cambiar Efectivo </div></html>\n"
                                    + "\n1. Consultar\n"
                                    + "\n2. Recaudar\n"
                                    + "\n3. Recargar\n\n"));
                            switch (opcion2) {
                                case 1: //consultar efectivo
                                    //recorrer la lista moneda y tener el valor de las monedas que hay con el stock
                                    for (Moneda1 moneda1 : moneda) {
                                        JOptionPane.showMessageDialog(null, "Efectivo:\n" + moneda1, " \t\tTIME:  " + timeNow.getHour() + " : " + timeNow.getMinute(), 0, iconEfectivo);
                                    }
                                    break;

                                case 2://Recaudar efectivo
                                    double multiplyMonedaStock/*varibale para multiplay moneda y stock*/,
                                     sum = 0;

                                    for (int i = 0; i < moneda.length; i++) {//recorrer moneda[]
                                        multiplyMonedaStock = moneda[i].getMoneda() * moneda[i].getStock();
                                        sum += multiplyMonedaStock;//calcular la suma del effectivo que tenemos  
                                    }
                                    timeRecaudar.add(timeNow);//añadir a la lista el tiempo de recuadacion
                                    JOptionPane.showMessageDialog(null, "Total Effectivo:\n" + sum, "Time: " + timeNow.getHour() + " : " + timeNow.getMinute(), 0, iconMonedaStock);
                                    System.out.println("lista Recaudar" + timeRecaudar);//para debugar
                                    break;

                                case 3://Recargar efectivo 
                                    double monedaRecarga = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la moneda que quieres recargar: "));
                                    int stockRecarga = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce cuando quieres recargar "));
                                    for (int i = 0; i < moneda.length; i++) {
                                        if (moneda[i].getMoneda() == monedaRecarga) {
                                            moneda[i].recargarEffectivo(monedaRecarga, stockRecarga);
                                        }
                                    }
                                    timeRecargar.add(timeNow);//lista para cuardar la fecha de la carga
                                    System.out.println("lista Recargar" + timeRecargar);//para debugar
                                    for (int i = 0; i < moneda.length; i++) {//recorrer moneda[]
                                        if (moneda[i].getMoneda() == monedaRecarga) {
                                            JOptionPane.showMessageDialog(null, "Stock:\n Moneda: " + moneda[i].getMoneda() + " Stock : " + moneda[i].getStock(), " TIME: " + timeNow.getHour() + " : " + timeNow.getMinute(), 0, iconMonedaStock);//mostrar stock moneda
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 5:// Consultar efectivo originados por tarjetas
                            JOptionPane.showMessageDialog(null, "El dinero recaudado con tarjetas es de " + rd.getDineroTarjetas() + "€", "Recaudación", 1, iconDinero);
                            break;
                        case 6://salir
                            JOptionPane.showConfirmDialog(null, "¿Quieres Salir?");
                            break;
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Has elegido salir del programa");
                    break;
                default:
                    // Poner mensaje de error
                    JOptionPane.showMessageDialog(null, "Ha introducido una opción no valida", "Error", 0, iconErrorCode);
                    break;
            }
        } while (opcion != 3);
    }
}
