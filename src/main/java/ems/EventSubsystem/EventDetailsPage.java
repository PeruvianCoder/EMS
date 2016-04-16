package ems.EventSubsystem;

import ems.DataSubsystem.Event;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class EventDetailsPage {

	/**
	 * Event for which details are being displayed. 
	 */
	public Event event;

	/**
	 * Getter of event
	 */
	public Event getEvent() {
	 	 return event; 
	}

	/**
	 * Setter of event
	 */
	public void setEvent(Event event) { 
		 this.event = event; 
	}

	/**
	 * Hyperlink to purchase ticket page.
	 * @param eventName Name of the event for which the tickets will be bought.
	 */
	public void clickPurchaseTicket(String eventName) { 
		// TODO Auto-generated method
	 }

	/**
	 * Hyperlink to submitProposalPage.
	 * @param eventName Name of the event for which the proposal will be submitted.
	 */
	public void clickSubmitProposal(String eventName) { 
		// TODO Auto-generated method
	 }

	/**
	 * Hyperlink to bookBoothPage.
	 * @param eventName Name of the event for which the booth will be booked.
	 */
	public void clickBookBooth(String eventName) { 
		// TODO Auto-generated method
	 }

	/**
	 * This is when the event details page should be rendered and returned to the user.
	 * @param event Event which will be displayed in this page.
	 */
	public void display(Event event) { 
		// TODO Auto-generated method
	 } 

}
