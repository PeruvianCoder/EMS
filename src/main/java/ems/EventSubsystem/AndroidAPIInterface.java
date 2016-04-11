package ems.EventSubsystem;

import java.util.List;

import ems.DataSubsystem.Event;

/**
 * Interface to use a proxy pattern for the android subsystem to 
 * have a simple interface to access data and business logic in the server. 
 * @author emsTeam
 */
public class AndroidAPIInterface {

	/**
	 * This is called upon when a ticket purchase has to be 
	 * processed from the android client.
	 * @param count Number of tickets to be purchased. 
	 * @param event Event for which tickets will be bought.
	 */
	public void purchaseTicket(Event event, int count) { 
		// TODO Auto-generated method
	 }


	/**
	 * Called upon by the android subsystem when it needs 
	 * a list of active events in the system.
	 * @return List of active events in the system.
	 */
	public List<Event> getEvents() { 
		return null;
	 } 

}
