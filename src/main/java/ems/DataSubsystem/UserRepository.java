package ems.DataSubsystem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserRepository {
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * Initializes the EntityManager used throughout the repository
	 * @param man EntityManager used to access data source
	 */
	public UserRepository(EntityManager man){
		this.manager = man;
	}
	
	/**
	 * Retrieves a single user by username from the database.
	 * @param username The username of the user to be retrieved.
	 * @return The user object with the given username
	 */
	public User retrieveUser(String username) { 
		User user = manager.createQuery("select u from User where u.username = :username", User.class)
					.setParameter("username", username)
					.getSingleResult();
		return user;
	 }

	/**
	 * Stores a user object to the database.
	 * @param user The user object to be stored.
	 */
	public void storeUser(User user) { 
		manager.getTransaction().begin();
		if(!manager.contains(user)){
			manager.persist(user);
		}
		else{
			System.out.println("This user already exists.");
		}
		manager.getTransaction().commit();
	 } 
}
