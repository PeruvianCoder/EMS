package ems.AccountSubsystem;

import ems.DataSubsystem.Datastore;
import ems.DataSubsystem.User;

/**
 * This is the main control class of the accounts subsystem.
 * It will handle all the requests for all modifications of user
 * or user status.
 * @see ems.AccountSubsystem
 * @author emsTeam
 */
public class AccountControl {

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
	 * This method will contain the logic to determine whether the
	 * new user information is valid or not
	 * @param user user info to be validated
	 * @return true if the user info is valid, false if it is not(it should not be added to the system)
	 */
	private boolean validateRegistration(User user) { 
		return false;
	 }

	/**
	 * This method logs the given user out of the system.
	 * @param user user which should be logged out of the system
	 * @return name of the view to present to the user
	 */
	public String logout(User user) { 
		return null;
	 }

	/**
	 * Validates the information provided by the user.
	 * @param user Information provided by the user.
	 * @return true if the user information is valid, false if it isn't
	 */
	private boolean validateLogin(User user) { 
		return false;
	 }

	/**
	 * Logs the user into the system, given that the information is valid
	 * @param password user entered password
	 * @param username  user entered username
	 * @return name of the view to show to the user, try again if not valid, and dashboardPage if valid
	 */
	public String login(String password, String username) { 
		return null;
	 }

	/**
	 * Deletes the user session in the system.
	 * @param user User whose session should be terminated.
	 */
	public void closeUserSession(User user) { 
	 }

	/**
	 * Registers a new user to the system. It should result in the user
	 * being stored in the database if input is valid.
	 * @param user information entered by the user
	 * @return name of the view to show, dashboard if valid information was entered, try again page if not
	 */
	public String register(User user) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects the user to the register page.
	 * @return always returns the name of the registration page
	 */
	public String goToRegister() { 
		return null;
	 }

	/**
	 * Redirects the user to the login page.
	 * @return always returns the name of the login page
	 */
	public String goToLogin() { 
		return null;
	 } 

}
