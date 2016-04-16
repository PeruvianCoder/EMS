package ems.EventSubsystem;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ems.DataSubsystem.Datastore;
import ems.DataSubsystem.Event;
import ems.DataSubsystem.Ticket;

/**
 * This class serves as the backend for the AndroidAPIProxy. It is 
 * accessed from android through AndroidAPIProxy to access data and
 * business logic from the server.
 * @author emsTeam
 */
@RestController
@RequestMapping(value="/android_api/")
public class AndroidAPI {

	//@Autowired
	Datastore datastore=  new Datastore();
	
	/**
	 * This is called upon when a ticket purchase has to be 
	 * processed from the android client.
	 * @param count Number of tickets to be purchased. 
	 * @param event Event for which tickets will be bought.
	 * @return Whether the purchase went through or not
	 */
	@RequestMapping(value="pay/{count}/{eventId}", consumes="application/json", produces="application/json")//this will need a spring formatter to create the event
	public boolean purchaseTicket(@PathVariable("count")int count, @PathVariable("eventId")Event event,@RequestBody Ticket ticket) {//todo change event to Event type, add formatter 
		//this feature is not implemented(MakePayment use case was not implemented
		//TODO store appropriate records in the database
		
		return true;
	 }

	/**
	 * Called upon by the android subsystem when it needs 
	 * a list of active events in the system.
	 * @return List of active events in the system.
	 */
	@RequestMapping(value = "events_list",produces="application/json")
	public List<Event> getEvents() {
		List<Event> events = datastore.retrieveEventsList();
		return events;
	 } 

}
