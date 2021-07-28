package codmind.ecommerce;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import codmind.ecommerce.entity.Customer;
import codmind.ecommerce.entity.enums.CustomerStatus;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Customer customer1 = new Customer();
		customer1.setId(1L);
		customer1.setFirstName("Ana");
		customer1.setLastName("Buitrago");
		customer1.setBirthDay(LocalDate.now());
		customer1.setStatus(CustomerStatus.ACTIVE);
		em.merge(customer1);
		//em.persist(customer1);
		em.getTransaction().commit();
	}
}
