package ems.DataSubsystem;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LocationRepository {
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * Initializes the EntityManager used throughout the repository
	 * @param man EntityManager used to access data source
	 */
	public LocationRepository(EntityManager man){
		this.manager = man;
	}
	
	/**
	 * Retrieves a list of locations from the database.
	 * @return List of location objects from the database.
	 */
	public List<Location> retrieveLocationsList() { 
		List<Location> locations = manager.createQuery("Select e from Event e", Location.class).getResultList();
		return locations;
	 }

	/**
	 * Retrieves a location object from the database by name.
	 * @param locationName Name of the object to be retrieved.
	 * @return The location object with the specified name.
	 */
	public Location retrieveLocation(String locationName) { 
		Location location = manager.createQuery("Select l from Location l where l.name = :locationName", Location.class)
				.setParameter("locationName", locationName)
				.getSingleResult();
		return location;
	 }

	/**
	 * Stores a location object in the database.
	 * @param location The location object to be stored in the database.
	 */
	public void storeLocation(Location location) { 
		manager.getTransaction().begin();
		if(!manager.contains(location)){
			manager.persist(location);
		}
		else{
			System.out.println("This location already exists.");
		}
		manager.getTransaction().commit();
	 } 

}
