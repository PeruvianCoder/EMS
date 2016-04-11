package ems.AdminSubsystem;

import ems.DataSubsystem.Datastore;
import ems.DataSubsystem.Location;
import ems.DataSubsystem.User;

/**
 * This is the main control class of the admin subsystem.
 * It will handle all the requests for all privileged actions 
 * that can only be performed by the administrator of the system.
 * @see ems.AdminSubsystem
 * @author emsTeam
 */
public class AdminControl {

	/**
	 * Instance of the data subsystem facade. All operations on
	 * entity classes will be performed through this facade.
	 * @see ems.DataSubsystem 
	 */
	private Datastore datastore;

	/**
	 * Getter of datastore
	 */
	public Datastore getDatastore() {
	 	 return datastore; 
	}

	/**
	 * Setter of datastore
	 */
	public void setDatastore(Datastore datastore) { 
		 this.datastore = datastore; 
	}

	/**
	 * Redirects the user to the add location page.
	 * @return always returns the name of the add location page
	 */
	public String goToAddLocation() { 
		// TODO Auto-generated method
		return "addLocationPage";
	 }

	/**
	 * Redirects the user to the add user page.
	 * @return always returns the name of the add user page
	 */
	public String goToAddUser() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * This method will contain the logic to determine whether the
	 * new user information is valid or not
	 * @param user user info to be validated
	 * @return true if the user info is valid, false if it is not(it should not be added to the system)
	 */
	private boolean validateUser(User user) { 
		// TODO Auto-generated method
		return false;
	 }

	/**
	 * Adds a new location to the system. It should result in a new location
	 *  being store in the system.
	 * @param location The new location to be stored in the system.
	 * @return the name of the view to be displayed, dashboard if success, try again if not.
	 */
	public String addLocation(Location location) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * This method will contain the logic to determine whether the
	 * new location information is valid or not.
	 * @param location The location to be validated.
	 * @return true if the location is valid, false if it is not.
	 */
	public boolean validateLocation(Location location) { 
		// TODO Auto-generated method
		return false;
	 }

	/**
	 * This method adds a new User to the system. It should result 
	 * in the creation of a new user in the database.
	 * @param user info of the new user to be created.
	 * @return the name of the view to be displayed, dashboard if success, try again if not.
	 */
	public String addUser(User user) { 
		// TODO Auto-generated method
		return null;
	 } 

}
