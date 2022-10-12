import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import models.*;

public class Main_2 {

	public static final String pu = "D3";

	public static void main(String[] args) {

//		makePerson("Via Gino Paoli 1", "Roma", "Pippo Strong");
//
//		makePerson("Via Epicode 2", "Roma", "Gino Paoli");
//
//		makePerson("Via Fronzoli 3", "Milano", "Pino LaLavatrice");

		printAllPeople();
//		
//		printAllPeople2();

//		findPersonByName("Pippo Strong");

//		findPersonByAddressName("Via Fronzoli 3");

		// updatePersonById(1, "Stringify");
//		deletePersonById(4);
//
//		System.out.println("------------");
//
//		printAllPeople();

	}

	public static void makePerson(String addressName, String addressCity, String personName) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		EntityTransaction t = em.getTransaction();

		t.begin();

		Address a1 = new Address(addressName, addressCity);

		Person p1 = new Person(personName, a1);

		em.persist(p1);

		t.commit();

		em.close();
		emf.close();

	}

	public static void printAllPeople() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("SELECT p FROM Person p ORDER BY p.id DESC", Person.class // prendimi tutte le entità
																							// di tipo person con
		// SELECT p
		);
		q.setMaxResults(2);
		List<Person> r = q.getResultList();

		for (Person p : r) {
			System.out.println(p);
		}

		em.close();
		emf.close();
	}

	public static void printAllPeople2() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("SELECT p.name, a.name as address_name, a.city FROM Person p JOIN p.address a" // prendimi
																												// tutte
																												// le
																												// entità
																												// di
																												// tipo
																												// person
																												// con
		// SELECT p
		);

		List<Object[]> r = q.getResultList();

		for (int i = 0; i < r.size(); i++) {
			Object[] o = r.get(i);
			System.out.println(java.util.Arrays.toString(o));
		}

		em.close();
		emf.close();
	}

	public static void findPersonByName(String n) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		Query q = em.createNamedQuery("byName");

		q.setParameter("n", n);

		List<Person> r = q.getResultList();
		System.out.println(r);
		for (Person p : r) {
			System.out.println(p);
		}

		em.close();
		emf.close();

	}

	public static void findPersonByAddressName(String n) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		Query q = em.createNamedQuery("byAddressName");

		q.setParameter("n", n);

		List<String> r = q.getResultList();
		System.out.println("Le persone che vivono all'indirizzo " + n + " sono: ");

		for (String p : r) {
			System.out.println(p);
		}

		em.close();
		emf.close();

	}

	public static void updatePersonById(int id, String newName) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();

		Query q = em.createQuery("UPDATE Person p SET name = :n WHERE p.id = :id");

		q.setParameter("n", newName);

		q.setParameter("id", id);

		q.executeUpdate();

		t.commit();

		em.close();
		emf.close();

	}

	public static void deletePersonById(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();

		Query q = em.createQuery("DELETE Person p WHERE p.id = :id");

		q.setParameter("id", id);

		q.executeUpdate();

		t.commit();

		em.close();
		emf.close();

	}

}
