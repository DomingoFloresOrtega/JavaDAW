package controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidades.Tutore;

public class ControladorTutores {
		
		// Factoria para obtener objetos EntityManager
		private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prog2122");
		private EntityManager em;
		private Query consulta;
		
		public void borrarTutor(Tutore a) {
			this.em = entityManagerFactory.createEntityManager();
			Tutore aux = null;
			this.em.getTransaction().begin();
			// Si a no es un objeto gestionado por el contexto de persistencia
			if (!this.em.contains(a)) {
				// Carga a en el contexto de persistencia y se guarda en aux
				aux = this.em.merge(a);
			}
			// Ahora se puede borrar usando aux, porque es una entidad gestionada por la
			// caché
			this.em.remove(aux);
			// Se vuelca la información del contexto (caché intermedia) en la base de datos
			this.em.getTransaction().commit();
			// Cierra el entityManager
			this.em.close();
		}

		public void modificarTutor(Tutore a) {
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

		public void crearTutor(Tutore a) {
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

		public Tutore findByPK(int pk) {
			this.em = entityManagerFactory.createEntityManager();
			Tutore aux = null;
			// Se crea el objeto Query a partir de una SQL nativa
			this.consulta = em.createNativeQuery ("Select * from tutores where codTutor = ?", Tutore.class);
			this.consulta.setParameter(1, pk);
			aux = (Tutore) consulta.getSingleResult();
			this.em.close();
			return aux;

		}

		public Tutore findByNombre(String nombre) {
			this.em = entityManagerFactory.createEntityManager();
			this.consulta = em.createNamedQuery("Tutores.findNombre");
			this.consulta.setParameter("Nombre", nombre);
			Tutore a = (Tutore) consulta.getSingleResult();
			this.em.close();
			return a;
		}

		public List<Tutore> findAll() {
			this.em = entityManagerFactory.createEntityManager();
			this.consulta = em.createNamedQuery("Tutore.findAll");
			List<Tutore> listaTutores = (List<Tutore>) consulta.getResultList();
			this.em.close();
			return listaTutores;
		}
}
