package ems.DataSubsystem;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PaymentRepository {
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * Initializes the EntityManager used throughout the repository
	 * @param man EntityManager used to access data source
	 */
	public PaymentRepository(EntityManager man){
		this.manager = man;
	}
	
	/**
	 * Stores a payment object to the database.
	 * @param payment Payment object to be stored.
	 */
	public void storePayment(Payment payment) { 
		// TODO Auto-generated method
		manager.getTransaction().begin();
		manager.persist(payment);
		manager.getTransaction().commit();
	 }

	/**
	 * Retrieves a list of payments for a user from the database.
	 * @param user The user whose transactions we want to retrieve.
	 * @return The list of transactions associated with the user.
	 */
	public List<Payment> retrievePaymentsList(User user) { 
		//todo: reminder to self please test this query! C.G.
		List<Payment> userPayments = manager.createNativeQuery("select p from paymenttransaction p join own o on o.Users_id = :userId", Payment.class)
									.setParameter("userId", user.id)
									.getResultList();
		return userPayments;
	 } 

}
