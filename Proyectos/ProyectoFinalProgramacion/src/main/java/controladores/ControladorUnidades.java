package controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import entidades.Unidade;

public class ControladorUnidades {
	// Factoria para obtener objetos EntityManager
			private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prog2122");
			private EntityManager em;
			private Query consulta;
			
			public void borrarUnidad(Unidade a) {
				this.em = entityManagerFactory.createEntityManager();
				Unidade aux = null;
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

			public void modificarUnidad(Unidade a) {
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

			public void crearUnidad(Unidade a) {
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

			public Unidade findByPK(int pk) {
				this.em = entityManagerFactory.createEntityManager();
				Unidade aux = null;
				// Se crea el objeto Query a partir de una SQL nativa
				this.consulta = (Query) em.createNativeQuery ("Select * from unidades where codUnidad = ?", Unidade.class);
				((javax.persistence.Query) this.consulta).setParameter(1, pk);
				aux = (Unidade) ((javax.persistence.Query) consulta).getSingleResult();
				this.em.close();
				return aux;

			}

			public Unidade findByUnidad(String unidad) {
				this.em = entityManagerFactory.createEntityManager();
				this.consulta = (Query) em.createNamedQuery("Alumnado.findNombre");
				((javax.persistence.Query) this.consulta).setParameter("Nombre", unidad);
				Unidade a = (Unidade) ((javax.persistence.Query) consulta).getSingleResult();
				this.em.close();
				return a;
			}

			public List<Unidade> findAll() {
				this.em = entityManagerFactory.createEntityManager();
				this.consulta = (Query) em.createNamedQuery("Alumnado.findAll");
				List<Unidade> listaUnidades = (List<Unidade>) ((javax.persistence.Query) consulta).getResultList();
				this.em.close();
				return listaUnidades;
			}
}
