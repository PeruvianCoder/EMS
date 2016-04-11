package ems.EventSubsystem;

import ems.DataSubsystem.Booth;
import ems.DataSubsystem.User;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class BookBoothPage {

	/**
	 * Booth information from the form.
	 */
	public Booth booth;

	/**
	 * Getter of booth
	 */
	public Booth getBooth() {
	 	 return booth; 
	}

	/**
	 * Setter of booth
	 */
	public void setBooth(Booth booth) { 
		 this.booth = booth; 
	}

	/**
	 * This is when the bookBooth page should be rendered and returned to the user.
	 */
	public void display() { 
		// TODO Auto-generated method
	 }

	/**
	 * User is notified that his booth was booked successfully.
	 * @param user User to be notified.
	 */
	public void notifyBoothBooked(User user) { 
		// TODO Auto-generated method
	 }

	/**
	 * Displays the number of booths available. 
	 * Normally done after choosing booth size.
	 * @param count Number of booths available. 
	 */
	public void displayBoothAvailable(Integer count) { 
		// TODO Auto-generated method
	 }

	/**
	 * When the user selects the book size from a dropdown.
	 * @param size size chosen by the user.
	 */
	public void selectBoothSize(String size) { 
		// TODO Auto-generated method
	 }

	/**
	 * Redirects the user to the payment page.
	 * @param booth The booth object containing info of booths being rented.
	 */
	public void clickPayNow(Booth booth) { 
		// TODO Auto-generated method
	 } 

}
