package ems.EventSubsystem;

import java.util.List;

import ems.DataSubsystem.Event;

/**
 * This class serves as the backend for the AndroidAPIProxy. It is 
 * accessed from android through AndroidAPIProxy to access data and
 * business logic from the server.
 * @author emsTeam
 */
public class AndroidAPI {

	/**
	 * This is called upon when a ticket purchase has to be 
	 * processed from the android client.
	 * @param count Number of tickets to be purchased. 
	 * @param event Event for which tickets will be bought.
	 */
	public void purchaseTicket(int count, Event event) { 
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
