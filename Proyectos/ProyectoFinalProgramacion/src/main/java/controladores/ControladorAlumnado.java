package controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidades.Alumnado;

public class ControladorAlumnado {
		
		// Factoria para obtener objetos EntityManager
		private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prog2122");
		private EntityManager em;
		private Query consulta;
		
		public void borrarAlumno(int id) {
			this.em = entityManagerFactory.createEntityManager();
			Alumnado aux = null;
			// Se crea el objeto Query a partir de una SQL nativa
			this.consulta = em.createNativeQuery ("Delete from alumnado where codAlumnado = ?", Alumnado.class);
			this.consulta.setParameter(1, id);
			aux = (Alumnado) consulta.getSingleResult();
			this.em.close();
		}

		public void modificarAlumno(Alumnado a) {
			this.em = entityManagerFactory.createEntityManager();
			// En este caso es necesario iniciar una transacción en la base de datos
			// porque vamos a persistir información en la misma
			this.em.getTransaction().begin();
			// merge(Objeto) - Si una entidad con el mismo identificador que v existe en el
			// contexto de persistencia (caché), se actualizan sus atributos y se devuelve
			// como entidad gestionada
			// Si el objeto v no existe en la base de datos, se comporta como persist() y la
			// entidad gestionada es la devuelta por merge(), por lo que v es una entidad desconectada
			this.em.merge(a);
			this.em.getTransaction().commit();
			this.em.close();

		}

		public void crearAlumno(Alumnado a) {
			this.em = entityManagerFactory.createEntityManager();
			// En este caso es necesario iniciar una transacción en la base de datos
			// porque vamos a persistir información en la misma
			this.em.getTransaction().begin();
			// Se guarda el objeto en el contexto de persistencia (caché intermedia)
			// v es una entidad conectada
			this.em.persist(a);
			// Se vuelca la información del contexto (caché intermedia) en la base de datos
			this.em.getTransaction().commit();
			// Cierra el entityManager
			this.em.close();
		}

		public Alumnado findById(int id) {
			this.em = entityManagerFactory.createEntityManager();
			Alumnado aux = null;
			// Se crea el objeto Query a partir de una SQL nativa
			this.consulta = em.createNativeQuery ("Select * from alumnado where codAlumnado = ?", Alumnado.class);
			this.consulta.setParameter(1, id);
			aux = (Alumnado) consulta.getSingleResult();
			this.em.close();
			return aux;
		}

		public List<Alumnado> findAll() {
			this.em = entityManagerFactory.createEntityManager();
			this.consulta = em.createNamedQuery("Alumnado.findAll");
			List<Alumnado> listaAlumnado = (List<Alumnado>) consulta.getResultList();
			this.em.close();
			return listaAlumnado;
		}
}
