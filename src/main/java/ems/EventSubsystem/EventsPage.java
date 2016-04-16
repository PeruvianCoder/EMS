package ems.EventSubsystem;

import java.util.List;

import ems.DataSubsystem.Event;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class EventsPage {

	/**
	 * List of events displayed to the user. 
	 */
	public List<Event> events;

	/**
	 * Getter of events
	 */
	public List<Event> getEvents() {
	 	 return events; 
	}

	/**
	 * Setter of events
	 */
	public void setEvents(List<Event> events) { 
		 this.events = events; 
	}

	/**
	 * Redirects the user to the EventDetailsPage.
	 * @param eventName The name of the event whose 
	 * details should be displayed.
	 */
	public void clickEvent(String eventName) { 
		// TODO Auto-generated method
	 }

	/**
	 * Filters the list of events shown to the user by date.
	 * @param date Date for which events should be shown.
	 */
	public void filterEvents(String date) { 
		// TODO Auto-generated method
	 }

	/**
	 * This is when the events page should be rendered and returned to the user.
	 * @param eventsList List of events to display on this page.
	 */
	public void display(Event eventsList) { 
		// TODO Auto-generated method
	 } 

}
