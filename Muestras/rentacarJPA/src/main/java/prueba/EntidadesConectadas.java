package prueba;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import controladores.ControladorVehiculo;
import entidades.Vehiculo;

public class EntidadesConectadas {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rentacar");
		EntityManager em = entityManagerFactory.createEntityManager();
		// En este punto el objeto em está activo, toda entidad que se obtiene de la BD
		// se mantiene en la caché intermedia (contexto de persistencia)
		// mantenida por JPA (entidad conectada) y se guarda en em
		
		// Si se cierra el contexto de persistencia (em)
		// la entidad queda desconectada (detached). Sigue existiendo como objeto Java
		// en el programa pero no estará vinculada con la base de datos. Cualquier operación
		// sobre una entidad desconectada no se propagará a la base de datos

		// Para realizar operaciones en la BD, el flujo de trabajo habitual en JPA es el
		// siguiente:
		// 1.- Crear el entityManager
		// 2.- Comenzar una transacción - em.getTransaction().begin()
		// 3.- Realizar operaciones sobre las entidades
		// 4.- Volcar la información de la transacción - em.getTransaction().commit()
		// 5.- Cerrar el entityManager

		// Vamos a realizar un cambio en el vehículo de id=3 para cambiar su modelo
		// 1.- Crear el entityManager
		em = entityManagerFactory.createEntityManager();
		// Busco otra vez el objeto anterior
		Query q = em.createNativeQuery("Select * from vehiculo where id = ?", Vehiculo.class);
		// Se busca al vehículo de id = 3
		q.setParameter(1, 3);
		Vehiculo aux = (Vehiculo) q.getSingleResult();
		System.out.println("Entidad conectada id = 3");
		System.out.println(aux);
		// En este punto aux está conectada (existe en el contexto de persistencia)

		// 2.- Comenzar una transacción - em.getTransaction().begin()
		em.getTransaction().begin();

		// 3.- Realizar operaciones sobre las entidades
		aux.setModelo("Córdoba");
		// Este cambio no se propaga automáticamente, hay que realizar el commit()

		// 4.- Volcar la información de la transacción - em.getTransaction().commit()
		// JPA chequea el contexto de persistencia, detecta los cambios y los vuelca en
		// la BD
		em.getTransaction().commit();
		// Se ha realizado el cambio en la base de datos. El vehículo de id=3 tiene
		// otro modelo

		// Se realiza otro cambio en aux
		// Este cambio no está en la base de datos, sí está en el contexto de
		// persistencia
		aux.setMarca("Renault"); // Si no se hace commit, no se vuelca en la BD

		// 5.- Cerrar el entityManager
		em.close(); // Todas las entidades quedan desconectadas de la BD
		
		
		System.out.println("Objeto aux (desconectado): ");
		System.out.println(aux);
		
		// Se comprueba lo que hay en la base de datos
		em = entityManagerFactory.createEntityManager();
		q = em.createNativeQuery("Select * from vehiculo where id = ?", Vehiculo.class);
		// Se busca al vehículo de id = 3
		q.setParameter(1, 3);
		Vehiculo aux2 = (Vehiculo) q.getSingleResult();
		System.out.println("Objeto aux2 (conectado): ");
		// Se puede ver que en la BD cambia modelo pero no la marca
		System.out.println(aux2);
		
		em.close(); 
		// Todas las entidades quedan en estado "detached" (desconectadas)
	}

}
