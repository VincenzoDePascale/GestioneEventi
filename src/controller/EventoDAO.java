package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Evento;

public class EventoDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneventi");
	static EntityManager em = emf.createEntityManager();
	
	
	public static void save(Evento e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Evento aggiunto al calendario!");
	}
	
	//funzione gatById()
	
	public static Evento findEvento(Long id) {
		em.getTransaction().begin();
		Evento e = em.find(Evento.class, id);
		em.getTransaction().commit();
		return e;
	}
	
	//funzione delete
	
	public static void removeUser(Evento e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Evento eliminato!");
	};
	
	//fidnAllUser()
	public static List<Evento> findAllEvento(){
		Query q = em.createNamedQuery("Evento.findAll");
		return q.getResultList();
	}
	
	
	
}
