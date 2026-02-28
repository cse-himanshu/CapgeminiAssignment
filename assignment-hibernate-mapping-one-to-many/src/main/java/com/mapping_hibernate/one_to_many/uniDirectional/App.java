package com.mapping_hibernate.one_to_many.uniDirectional;

import java.util.Arrays;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		// Create EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

		// Create EntityManager
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();

			// CREATE (INSERT)

			Account account1 = new Account("ACC324");
			Account account2 = new Account("ACC517");
			Customer customer1 = new Customer("Daniel", Arrays.asList(account1, account2));
			em.persist(customer1);

			Account account3 = new Account("ACC289");
			Account account4 = new Account("ACC463");
			Customer customer2 = new Customer("Sophie", Arrays.asList(account3, account4));
			em.persist(customer2);

			Account account5 = new Account("ACC371");
			Account account6 = new Account("ACC602");
			Customer customer3 = new Customer("Steven", Arrays.asList(account5, account6));
			em.persist(customer3);


			// READ (FIND)
			Customer foundCustomer = em.find(Customer.class, 2);

			System.out.println("Found Customer: " + foundCustomer);

//			// UPDATE
//			if (foundCustomer != null) {
//				Account newAccount = new Account("ACC278");
//				foundCustomer.setAccountNumber(newAccount);
//
//				em.merge(foundCustomer);
//
//				System.out.println("Updated Customer: " + foundCustomer);
//			}

			// DELETE
			Customer customerToDelete = em.find(Customer.class, 5);

			if (customerToDelete != null) {
				em.remove(customerToDelete);
				System.out.println("Deleted Customer: " + customerToDelete);

			} else {
				System.out.println("Customer not found");
			}

			em.getTransaction().commit();

			System.out.println("Customer and Account saved Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
			emf.close();
		}
	}
}
