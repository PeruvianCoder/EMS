package ems.DataSubsystem;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EventRepository {
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * Initializes the EntityManager used throughout the repository
	 * @param man EntityManager used to access data source
	 */
	public EventRepository(EntityManager man){
		this.manager = man;
	}
	
	/**
	 * Retrieves a list of events from the database.
	 * @return List of active events in the database.
	 */
	public List<Event> retrieveEventsList() { 
		List<Event> events = manager.createQuery("Select e from Event e", Event.class).getResultList();
		return events;
	 }

	/**
	 * Stores an event to the database.
	 * @param event Event to be stored.
	 */
	public void storeEvent(Event event) { 
		manager.getTransaction().begin();
		if(!manager.contains(event)){
			manager.persist(event);
		}
		else{
			System.out.println("This event already exists.");
		}
		manager.getTransaction().commit();
	 }

	/**
	 * Retrieves a single event by name from the database.
	 * @param eventName Name of the event to be retrieved.
	 * @return The event with the specified name.
	 */
	public Event retrieveEvent(String eventName) { 
		Event event = manager.createQuery("Select e from Event e where e.name = :eventName", Event.class)
						.setParameter("eventName", eventName)
						.getSingleResult();
		return event;
	 } 

}
