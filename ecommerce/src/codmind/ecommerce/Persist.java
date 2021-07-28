package codmind.ecommerce;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import codmind.ecommerce.entity.Customer;
import codmind.ecommerce.entity.enums.CustomerStatus;

public class Persist {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
		EntityManager em = factory.createEntityManager();
		
		Customer customer1 = new Customer();
		customer1.setFirstName("David");
		customer1.setLastName("Ramirez");
		customer1.setBirthDay(LocalDate.now());
		customer1.setStatus(CustomerStatus.ACTIVE);
		em.persist(customer1);

	}

}
