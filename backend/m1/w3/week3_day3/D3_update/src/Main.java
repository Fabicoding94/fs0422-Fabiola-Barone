import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import models.s1.*;
import models.s2.*;
import models.s3.*;
import models.s4.*;

public class Main {

	public static final String pu = "D3";

	public static void main(String[] args) {

//		s1();

//		s2();

//		s2Query();

		s3();
		
//		s4();
	}

	public static void s1() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		EntityTransaction t = em.getTransaction();

		t.begin();

		S1_Dog d1 = new S1_Dog("Pippo", 3, "Gianfranco");

		S1_Dog d2 = new S1_Dog("Giovanni", 3, "Giacomo");

		S1_Cat c1 = new S1_Cat("Ciccio", 2, 10);

		S1_Cat c2 = new S1_Cat("Pollo", 4, 5);

		em.persist(d1);

		em.persist(d2);

		em.persist(c1);

		em.persist(c2);

		t.commit();

		em.close();
		emf.close();
	}

	public static void s2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		EntityTransaction t = em.getTransaction();

		t.begin();

		S2_FastCar f1 = new S2_FastCar("XB200", "Jaguar", 300, 70);

		S2_FastCar f2 = new S2_FastCar("CBM2", "Lamborghini", 280, 50);

		S2_UtilityCar u1 = new S2_UtilityCar("Punto", "Fiat", true, 6);

		S2_UtilityCar u2 = new S2_UtilityCar("Giulietta", "Alfa Romeo", true, 5);

		em.persist(f1);

		em.persist(f2);

		em.persist(u1);

		em.persist(u2);

		t.commit();

		em.close();
		emf.close();
	}

	public static void s2Query() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);

		EntityManager em = emf.createEntityManager();

		try {

			Query q = em.createNativeQuery(" SELECT s2_car.id as ciao, name, brand, for_family, comfort_level\r\n"
					+ "FROM s2_car JOIN s2_utilitycar ON s2_utilitycar.id = s2_car.id\r\n"
					+ "WHERE s2_utilitycar.id = 3 ");

			List<Object[]> r = q.getResultList();

			for (int i = 0; i < r.size(); i++) {
				Object[] o = r.get(i);
				System.out.println("Id: " + o[0]);
				System.out.println("Name: " + o[1]);
				System.out.println("Brand: " + o[2]);
				System.out.println("For Family: " + o[3]);
				System.out.println("Comfort Level: " + o[4]);
			}

		} catch (Exception e) {
			e.getMessage();
		}

		em.close();
		emf.close();
	}

	public static void s3() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		EntityTransaction t = em.getTransaction();

		t.begin();

		S3_C1 c1 = new S3_C1("Papà", "Dove");
		S3_C1 c1_2 = new S3_C1("Sei", "?");
		S3_C2 c2 = new S3_C2("Ciao", "Io", "Sono");
		S3_C2 c2_2 = new S3_C2("Tuo", "Padre", "Luke");
		S3_C3 c3 = new S3_C3("Sono", "stufo", "di");
		S3_C3 c3_3 = new S3_C3("Pagarti", "gli", "alimenti");

		em.persist(c1);

		em.persist(c1_2);

		em.persist(c2);

		em.persist(c2_2);

		em.persist(c3);

		em.persist(c3_3);

		t.commit();

		em.close();
		emf.close();

	}

	public static void s4() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();

		EntityTransaction t = em.getTransaction();

		t.begin();

		S4_C2 c2 = new S4_C2("Ciao", "Io", "Sono");
		S4_C2 c2_2 = new S4_C2("Tuo", "Padre", "Luke");
		S4_C3 c3 = new S4_C3("Sono", "stufo", "di");
		S4_C3 c3_3 = new S4_C3("Pagarti", "gli", "alimenti");

		em.persist(c2);

		em.persist(c2_2);

		em.persist(c3);

		em.persist(c3_3);

		t.commit();

		em.close();
		emf.close();

	}

}
