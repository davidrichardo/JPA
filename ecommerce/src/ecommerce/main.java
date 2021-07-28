package ecommerce;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import codmind.ecommerce.entity.Customer;

public class main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Customer customer1 = new Customer();
		customer1.setFirstName("David");
		customer1.setLastName("Ramirez");
		em.persist(customer1);
		
		Customer customer2 = new Customer();
		
		customer2.setFirstName("Oscar");
		customer2.setLastName("Bancarte");
		em.persist(customer2);
		
		em.getTransaction().commit();
		
		Customer findCustomer = em.find(Customer.class, 1L);
		Customer findCustomer2 = em.find(Customer.class, 2L);
		System.out.println(findCustomer.getFirstName());
		System.out.println(findCustomer2.getFirstName());
	}

}
