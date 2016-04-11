package ems.AdminSubsystem;

import ems.DataSubsystem.User;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class AddUserPage {

	/**
	 * Information of the new user to be created.
	 */
	public User user;

	/**
	 * Getter of user
	 */
	public User getUser() {
	 	 return user; 
	}

	/**
	 * Setter of user
	 */
	public void setUser(User user) { 
		 this.user = user; 
	}

	/**
	 * This is when the addUser page should be rendered and returned to the user. 
	 */
	public void display() { 
		// TODO Auto-generated method
	 }

	/**
	 * Notifies the user that the new user has been successfully added to the system.
	 * @param admin Admin to be notified of this event.
	 */
	public void notifyUserCreated(User admin) { 
		// TODO Auto-generated method
	 }

	/**
	 * Hyperlink to submit the form. It should result in the creation of a new user in the database. 
	 * @param user Information to create a new user in the database.
	 */
	public void clickAdd(User user) { 
		// TODO Auto-generated method
	 } 

}
