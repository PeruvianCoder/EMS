package ems.DataSubsystem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TicketRepository {
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * Initializes the EntityManager used throughout the repository
	 * @param man EntityManager used to access data source
	 */
	public TicketRepository(EntityManager man){
		this.manager = man;
	}
	/**
	 * Retrieves the ticket for the given user and event 
	 * from the database.
	 * @param event Event for which the ticket was bought.
	 * @param username Username of the user that bought the ticket. 
	 * @return Ticket Object bought by the user for the given event. 
	 */
	public Ticket retrieveTicket(Event event, String username) { 
		Ticket result = (Ticket) manager.createQuery("select t from Ticket t where t.eventName = :eventName")
						.setParameter("eventName", event.name)
						.getSingleResult();
		return result;
	 }

	/**
	 * Stores a ticket to the database.
	 * @param ticket Ticket object to be stored.
	 */
	public void storeTicket(Ticket ticket) { 
		manager.persist(ticket);
	 } 

}
