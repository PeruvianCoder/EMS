package ems.DataSubsystem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BoothRepository {
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * Initializes the EntityManager used throughout the repository
	 * @param man EntityManager used to access data source
	 */
	public BoothRepository(EntityManager man){
		this.manager = man;
	}

	/**
	 * Retrieves the number of booths of some size available for 
	 * booking from the database for a given event. 
	 * @param eventName Name of the event to check availability for. 
	 * @param size Size of the desired booths.
	 * @return Number of booths of the given size available to be booked for that event.
	 */
	public int retrieveNumBoothAvailable(String size, Event event) { 
		int result = (int) manager.createQuery("select b.Booths_count from booths b join exhibit e on e.Events_Id = :eventId where b.size = :size")
					.setParameter("size", size)
					.setParameter("eventName", event.id)
					.getSingleResult();
		return result;
	 }

	/**
	 * Stores a booth object in the database.
	 * @param booth The booth object to be stored in the database.
	 */
	public void storeBooth(Booth booth) { 
		manager.persist(booth);
	 }

	/**
	 * Retrieves the cost of a Booth for some event and 
	 * of certain size from the database.
	 * @param eventName Name of the event for the booth.
	 * @param size Desired booth size to be checked.
	 * @return Price of booking one booth of that size for that event.
	 */
	public double retrieveBoothCost(String size, Event event) { 
		// TODO Auto-generated method
		double result = (double) manager.createNativeQuery("select b.Booths_price from booths b join exhibit e on e.Events_Id = :eventId where b.size = :size")
						.setParameter("eventId", event.id)
						.setParameter("size", size)
						.getSingleResult();
		return result;
	 } 

}
