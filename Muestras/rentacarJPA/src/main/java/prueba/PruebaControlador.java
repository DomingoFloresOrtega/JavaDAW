package prueba;

import java.util.List;

import controladores.ControladorVehiculo;
import entidades.Vehiculo;

public class PruebaControlador {

	public static void main(String[] args) {
		ControladorVehiculo cv = new ControladorVehiculo();

		// Se obtienen todas las instancias
		List<Vehiculo> listaVehiculos = cv.findAll();

		// Se imprime la lista
		System.out.println("Todas las entidades ------------ ");
		for (Vehiculo v : listaVehiculos) {
			System.out.println(v);
		}

		// Se obtiene una entidad
		System.out.println("Buscar Vehiculo de matrícula 0034AAB ------------ ");
		Vehiculo aux = cv.findByMatricula("0034AAB");
		System.out.println(aux);

		// Creación de una entidad
		Vehiculo v = new Vehiculo();
		v.setBastidor("66345TTZ01");
		v.setMatricula("0998FRR");
		v.setDisponible(true);
		v.setMarca("Ford");
		v.setModelo("Fiesta");
		v.setPrecio(13.00);
		cv.createVehiculo(v); // Si está creada lanzará una excepción

		// Se obtienen todas las instancias
		listaVehiculos = cv.findAll();
		System.out.println("Todas las entidades después de crear una ------------ ");
		listaVehiculos.forEach(System.out::println);

		// Se modifica el precio del vehículo id = 1
		Vehiculo vehicModificar = cv.findByPK(1);
		if (vehicModificar != null) {
			vehicModificar.setPrecio(24.2);
			cv.modifyVehiculo(vehicModificar);
		}

		// Se obtienen todas las instancias
		listaVehiculos = cv.findAll();
		System.out.println("Todas las entidades después de modificar una ------------ ");
		listaVehiculos.forEach(System.out::println);

		// Borrado del vehículo de matrícula 0998FRR
		Vehiculo vehicBorrar = cv.findByMatricula("0998FRR");
		cv.borrarVehiculo(vehicBorrar);

		// Se obtienen todas las instancias
		listaVehiculos = cv.findAll();
		System.out.println("Todas las entidades después de borrar una ------------ ");
		listaVehiculos.forEach(System.out::println);

		// Se obtienen todas las instancias de la marca Seat
		listaVehiculos = cv.findByMarca("Seat");
		System.out.println("Todas las entidades Seat ------------ ");
		listaVehiculos.forEach(System.out::println);

	}

}
