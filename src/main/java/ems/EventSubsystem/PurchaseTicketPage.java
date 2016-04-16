package ems.EventSubsystem;

import ems.DataSubsystem.Event;
import ems.DataSubsystem.Ticket;
import ems.DataSubsystem.User;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class PurchaseTicketPage {

	/**
	 * Ticket info entered by the user on the form. 
	 */
	public Ticket ticket;

	/**
	 * Getter of ticket
	 */
	public Ticket getTicket() {
	 	 return ticket; 
	}

	/**
	 * Setter of ticket
	 */
	public void setTicket(Ticket ticket) { 
		 this.ticket = ticket; 
	}

	/**
	 * Notifies the user that the tickets have been purchased.
	 * @param user User ot be notified.
	 */
	public void notifyTicketPurchased(User user) { 
		// TODO Auto-generated method
	 }

	/**
	 * Sends the user to the paypal page to pay.
	 * @param ticket Tickets the user wants to pay for.
	 */
	public void clickPayNow(Ticket ticket) { 
		// TODO Auto-generated method
	 }

	/**
	 * This is when the registration page should be rendered and returned to the user.
	 * @param event The event for which the user wants to purchase the tickets.
	 */
	public void display(Event event) { 
		// TODO Auto-generated method
	 } 

}
