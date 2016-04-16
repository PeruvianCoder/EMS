package ems.AccountSubsystem;

import ems.DataSubsystem.User;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class RegistrationPage {

	/**
	 * Form information about the user.
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
	 * Hyperlink to submit the registration form. Should result in the user being. 
	 * logged in and redirected to the landing page as well as a new user record stored in the database.
	 * @param confirmpassword From the confirm password field in the form.
	 * @param user From the user field. Contains all information needed to create a new user. 
	 */
	public void register(String confirmpassword, User user) { 
		// TODO Auto-generated method
	 }

	/**
	 * This is when the registration page should be rendered and returned to the user.
	 */
	public void display() { 
		// TODO Auto-generated method
	 } 

}
