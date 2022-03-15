package no.hvl.dat107;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TodoDAO {
	
	private EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("todoPersistenceUnit", 
			Map.of("javax.persistence.jdbc.password", Passwords.AZURE_PASSWORD));
	
	/* --------------------------------------------------------------------- */

	public Todo finnTodoMedPk(int id) {
		
		EntityManager em = emf.createEntityManager();

		try {
			return em.find(Todo.class, id);

		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public List<Todo> finnAlleTodos() {
		
		EntityManager em = emf.createEntityManager();
		
		try {
			return null; /*TODO*/
		
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public Todo finnTodoMedTekst(String tekst) {
		EntityManager em = emf.createEntityManager();
		
		try {
			return null; /*TODO*/
			
		} finally {
			em.close();
		}
	}
	
	/* --------------------------------------------------------------------- */

	public List<Todo> finnTodosMedTekst(String tekst) {
		EntityManager em = emf.createEntityManager();
		
		try {
			return null; /*TODO*/
		
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public void lagreNyTodo(int id, String tekst) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
			Todo todo = new Todo(id, tekst);
			em.persist(todo);
			
			tx.commit();

		} catch (Throwable e) {
			e.printStackTrace();
			if (tx.isActive()) {
				tx.rollback();
			}
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public void slettTodoMedPk(int id) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			
//			Todo todo = new Todo(id, "");
//			todo = em.merge(todo);
			
			Todo todo = em.find(Todo.class, id);
			em.remove(todo);
			em.
			tx.commit();

		} catch (Throwable e) {
			e.printStackTrace();
			if (tx.isActive()) {
				tx.rollback();
			}
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public void/*TODO*/ oppdaterTodo(/*TODO*/) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			/*TODO*/
			
			tx.commit();
		} catch (Throwable e) {
			e.printStackTrace();
			if (tx.isActive()) {
				tx.rollback();
			}
		} finally {
			em.close();
		}
	}

	/* --------------------------------------------------------------------- */

	public void/*TODO*/ oppdaterTekst(/*TODO*/) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			/*TODO*/
						
			tx.commit();
		} catch (Throwable e) {
			e.printStackTrace();
			if (tx.isActive()) {
				tx.rollback();
			}
		} finally {
			em.close();
		}
	}
}
