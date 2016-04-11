package ems.AdminSubsystem;

import ems.DataSubsystem.Location;
import ems.DataSubsystem.User;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class AddLocationPage {

	/**
	 * Location information entered by the admin.
	 */
	public Location location;

	/**
	 * Getter of location
	 */
	public Location getLocation() {
	 	 return location; 
	}

	/**
	 * Setter of location
	 */
	public void setLocation(Location location) { 
		 this.location = location; 
	}

	/**
	 * This notifies the admin of the success in adding the new location.
	 * @param user The user/admin receiving the notification.
	 */
	public void notifyNewLocationAdded(User user) { 
		// TODO Auto-generated method
	 }

	/**
	 * This is when the addLocation page should be rendered and returned to the user. 
	 */
	public void display() { 
		// TODO Auto-generated method
	 }

	/**
	 * Hyperlink to submit the form. Should result in a new location being added to the database.
	 * @param location Location information to add to the database.
	 */
	public void clickAdd(Location location) { 
		// TODO Auto-generated method
	 } 

}
