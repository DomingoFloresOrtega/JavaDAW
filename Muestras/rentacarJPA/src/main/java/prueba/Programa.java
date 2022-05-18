package prueba;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidades.Vehiculo;

public class Programa {

	public static void main(String[] args) {

		// Se obtienen todas las instancias
		List<Vehiculo> listaVehiculos = findAll();

		// Se imprime la lista
		System.out.println("\n\nTodas las entidades ------------ ");
		for (Vehiculo v : listaVehiculos) {
			System.out.println(v);
		}

		// Se obtiene una entidad
		System.out.println("\n\nBuscar Vehiculo de matrícula 0034AAB ------------ ");
		Vehiculo aux = findByMatricula("0034AAB");
		System.out.println(aux);

		// Creación de una entidad
		Vehiculo v = new Vehiculo();
		v.setBastidor("6634543Z01");
		v.setMatricula("0998FRR");
		v.setDisponible(true);
		v.setMarca("Renault");
		v.setModelo("Clio");
		v.setPrecio(14.00);
		createVehiculo(v); // Si está creada lanzará una excepción

		// Se obtienen todas las instancias
		listaVehiculos = findAll();
		System.out.println("\n\nTodas las entidades después de crear una nueva ------------ ");
		listaVehiculos.forEach(System.out::println);

		// Se modifica el precio del vehículo id = 1
		Vehiculo vehicModificar = findByPK(1);
		if (vehicModificar != null) {
			vehicModificar.setPrecio(138);
			modifyVehiculo(vehicModificar);
		}

		// Se obtienen todas las instancias
		listaVehiculos = findAll();
		System.out.println("\n\nTodas las entidades después de modificar una ------------ ");
		listaVehiculos.forEach(System.out::println);

		// Borrado del vehículo de matrícula 1235ACB
		Vehiculo vehicBorrar = findByMatricula("1235ACB");
		deleteVehiculo(vehicBorrar);

		// Se obtienen todas las instancias
		listaVehiculos = findAll();
		System.out.println("\n\nTodas las entidades después de borrar una ------------ ");
		listaVehiculos.forEach(System.out::println);

	}

	// Borra un registro de la tabla, aquel que tenga la misma pk que v
	// Si no existe esa pk no hace nada
	public static void deleteVehiculo(Vehiculo v) {
		EntityManager em = getEntityManager();
		Vehiculo aux = null;
		// En este caso es necesario iniciar una transacción en la base de datos
		// porque vamos a borrar información en la misma
		em.getTransaction().begin();
		// Si v no es un objeto gestionado por el contexto de persistencia
		if (!em.contains(v)) {
			// Carga v en el contexto de persistencia y se guarda en aux
			aux = em.merge(v);
		}
		// Ahora se puede borrar usando aux, porque es una entidad gestionada por la
		// caché
		em.remove(aux);
		// Se vuelca la información del contexto (caché intermedia) en la base de datos
		em.getTransaction().commit();
		// Cierra el entityManager
		em.close();
	}

	// Modifica un registro de la tabla, en concreto aquel que tenga la misma pk que v
	// Si esa pk no existe, se inserta un nuevo registro con los valores de v
	public static void modifyVehiculo(Vehiculo v) {
		EntityManager em = getEntityManager();
		// En este caso es necesario iniciar una transacción en la base de datos
		// porque vamos a persistir información en la misma
		em.getTransaction().begin();
		// merge - Si una entidad con el mismo identificador que v existe en el
		// contexto de persistencia (caché), se actualizan sus atributos y se devuelve
		// como entidad gestionada, para guardar cambios con commit
		// Si el objeto v no existe en la base de datos, entonces merge() se comporta 
		// como persist()
		em.merge(v);
		em.getTransaction().commit();
		em.close();

	}

	// Inserta un objeto en la tabla vehiculo. Si ya existe lanza una excepcion EntityExistsException
	public static void createVehiculo(Vehiculo v) {
		EntityManager em = getEntityManager();
		// En este caso es necesario iniciar una transacción en la base de datos
		// porque vamos a persistir información en la misma
		em.getTransaction().begin();
		// Se guarda el objeto en el contexto de persistencia (caché intermedia)
		em.persist(v);
		// Se vuelca la información del contexto (caché intermedia) en la base de datos
		em.getTransaction().commit();
		// Cierra el entityManager
		em.close();
	}

	// Obtiene una entidad por clave primaria, pk. Si no existe lanza 
	// una excepción NoResultException
	public static Vehiculo findByPK(int pk) {
		EntityManager em = getEntityManager();
		Vehiculo aux = null;
		// Se crea el objeto Query a partir de una SQL nativa, que permite pasar
		// código SQL directamente a la base de datos
		Query q = em.createNativeQuery("Select * from vehiculo where id = ?", Vehiculo.class);
		// Se establece que el parámetro a usar en la query es la pk que se pasa como parámetro
		// al método
		q.setParameter(1, pk);
		// Se ejecuta la consulta
		aux = (Vehiculo) q.getSingleResult();
		// Cierra el entityManager
		em.close();
		return aux;

	}

	// Este método obtiene todos los registros de la tabla. Si no hay registros
	// devuelve una lista vacía
	public static List<Vehiculo> findAll() {
		EntityManager em = getEntityManager();
		// Se crea la Query a partir del nombre de la NamedQuery de la clase Vehiculo
		Query q = em.createNamedQuery("Vehiculo.findAll");
		// Se ejecuta la consulta y se hace un casting
		List<Vehiculo> listaVehiculos = (List<Vehiculo>) q.getResultList();
		// Cierra el entityManager
		em.close();
		return listaVehiculos;
	}

	// Devuelve un vehículo coincidente con la matrícula. Si no existe lanza 
	// una excepción NoResultException
	// Si existen varios registros con misma matrícula lanza NonUniqueResultException
	public static Vehiculo findByMatricula(String matricula) {
		EntityManager em = getEntityManager();
		// Se crea la Query a partir del nombre de la NamedQuery de la clase Vehiculo
		Query q = em.createNamedQuery("Vehiculo.findMatricula");
		// Se establece el parámetro de la consulta
		q.setParameter("matricula", matricula);
		// Se ejecuta la consulta
		Vehiculo v = (Vehiculo) q.getSingleResult();
		// Cierra el entityManager
		em.close();
		return v;
	}

	// Crea un objeto EntityManager usando una unidad de persistencia
	private static EntityManager getEntityManager() {
		// EntityManager permite realizar operaciones con la BD
		// Se obtiene a través del EntityManagerFactory y este a su vez se genera
		// a partir del nombre de la unidad de persistencia (fichero persistence.xml)
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rentacar");
		EntityManager em = entityManagerFactory.createEntityManager();
		return em;
	}

}
