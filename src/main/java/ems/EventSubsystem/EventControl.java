package ems.EventSubsystem;

import ems.DataSubsystem.Datastore;
import ems.DataSubsystem.Event;
import ems.DataSubsystem.Payment;
import ems.DataSubsystem.User;

/**
 * This is the main control class of the events subsystem.
 * It will handle all the requests for all modifications of events
 * or event related information.
 * @see ems.EventSubsystem
 * @author emsTeam
 */
public class EventControl {

	/**
	 * Instance of the data subsystem facade. All operations on
	 * entity classes will be performed through this facade.
	 * @see ems.DataSubsystem 
	 */
	private Datastore datastore;

	/**
	 * Getter of datastore
	 */
	public Datastore getDatastore() {
	 	 return datastore; 
	}

	/**
	 * Setter of datastore
	 */
	public void setDatastore(Datastore datastore) { 
		 this.datastore = datastore; 
	}

	/**
	 * Called on by the paypal API when some user returns from paypal.
	 * @param payment payment completed by the user.
	 * @return View to be displayed by the user, success if the payment completed, failure if canceled.
	 */
	public String paymentComplete(Payment payment) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Filters the transactions by name for some user.
	 * @param eventName Name of the event for which the user wants to see the transactions.
	 * @return View to be displayed to the user, TransactionHistory page with the appropriate list of transactions. 
	 */
	public String filterTransactions(String eventName) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects the user to the transactionHistory page with the appropriate list of transactions displayed.
	 * @param user User for which the transactions will be displayed.
	 * @return View to be displayed to the user, TransactionHistory page with the appropriate list of transactions.
	 */
	public String viewTransactionHistory(User user) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects the user to EventsPage.
	 * @return eventsPage.
	 */
	public String listEvents() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * This method is called when the user selects the 
	 * size of the booth he wants to book.
	 * @param size Booth size selected by user.
	 * @return BookBooth page with the appropriate size and boothAvailability selected.
	 */
	public String selectBoothSize(String size) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects user to the paypal page to pay.
	 * @param payment Payment to be made on the paypal website.
	 * @return the paypal page with the appropriate cart information.
	 */
	public String makePayment(Payment payment) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects to the purchase ticket page.
	 * @param eventName Name of the event to purchase tickets from.
	 * @return PurchaseTicket page.
	 */
	public String purchaseTicket(String eventName) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Filters the events by date.
	 * @param date Desired date of the events to be displayed.
	 * @return EventsPage, with a filtered list of events shown.
	 */
	public String filterEvents(String date) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects to BookBoothPage for some event.
	 * @param eventName Name of the event for which a booth will be booked.
	 * @return bookBooth page for the appropriate event.
	 */
	public String goToBookBooth(String eventName) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Creates a new event in the system. Should result in the creation of
	 * an event in the database.
	 * @param event Data of the event to be created.
	 * @return dashboardPage of the user.
	 */
	public String createEvent(Event event) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects to new Event page.
	 * @return newEventPage.
	 */
	public String newEvent() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects to the event details page.
	 * @param eventName Name for which details will be displyed.
	 * @return eventDetails page with the details of the appropriate event.
	 */
	public String showEventDetails(String eventName) { 
		// TODO Auto-generated method
		return null;
	 } 

}
