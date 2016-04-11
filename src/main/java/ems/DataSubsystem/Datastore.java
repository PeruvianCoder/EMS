package ems.DataSubsystem;

import java.util.ArrayList;
import java.util.List;

import ems.ProposalSubsystem.ReviewProposalPage;

/**
 * This is a facade for the data subsystem. Every access(retrieve/persist) to data  
 * will be done through this facade. This is the only class with direct knowledge 
 * about the repositories. Most methods in this class delegate to the repositories.
 * @author josecponce
 *
 */
public class Datastore {

	/**
	 * To be used for retrieving/persisting objects to the database.
	 */
	private TicketRepository ticketRepository;
	List<Ticket> tickets = new ArrayList<>();
	/**
	 * To be used for retrieving/persisting location objects to the database.
	 */
	private LocationRepository locationRepository;
	List<Location> locations = new ArrayList<>();;
	/**
	 * To be used for retrieving/persisting proposal objects to the database.
	 */
	private ProposalRepository proposalRepository;
	List<Proposal> proposals  = new ArrayList<>();
	/**
	 * To be used for retrieving/persisting user objects to the database.
	 */
	private UserRepository userRepository;
	List<User> users = new ArrayList<>();
	/**
	 * To be used for retrieving/persisting payment objects to the database.
	 */
	private PaymentRepository paymentRepository;
	List<Payment> payments= new ArrayList<>();
	/**
	 * To be used for retrieving/persisting proposalReview objects to the database.
	 */
	private ProposalReviewRepository proposalReviewRepository;
	List<ProposalReview> proposalReview = new ArrayList<>();
	/**
	 * To be used for retrieving/persisting event objects to the database.
	 */
	private EventRepository eventRepository;
	List<Event> events = new ArrayList<>();;
	/**
	 * To be used for retrieving/persisting booth objects to the database.
	 */
	private BoothRepository boothRepository;
	List<Booth> booths = new ArrayList<>();
	/**
	 * Getter of ticketRepository
	 */
	public TicketRepository getTicketRepository() {
	 	 return ticketRepository; 
	}
	/**
	 * Setter of ticketRepository
	 */
	public void setTicketRepository(TicketRepository ticketRepository) { 
		this.ticketRepository = ticketRepository; 
	}
	/**
	 * Getter of locationRepository
	 */
	public LocationRepository getLocationRepository() {
	 	 return locationRepository; 
	}
	/**
	 * Setter of locationRepository
	 */
	public void setLocationRepository(LocationRepository locationRepository) { 
		 this.locationRepository = locationRepository; 
	}
	/**
	 * Getter of proposalRepository
	 */
	public ProposalRepository getProposalRepository() {
	 	 return proposalRepository; 
	}
	/**
	 * Setter of proposalRepository
	 */
	public void setProposalRepository(ProposalRepository proposalRepository) { 
		 this.proposalRepository = proposalRepository; 
	}
	/**
	 * Getter of userRepository
	 */
	public UserRepository getUserRepository() {
	 	 return userRepository; 
	}
	/**
	 * Setter of userRepository
	 */
	public void setUserRepository(UserRepository userRepository) { 
		 this.userRepository = userRepository; 
	}
	/**
	 * Getter of paymentRepository
	 */
	public PaymentRepository getPaymentRepository() {
	 	 return paymentRepository; 
	}
	/**
	 * Setter of paymentRepository
	 */
	public void setPaymentRepository(PaymentRepository paymentRepository) { 
		 this.paymentRepository = paymentRepository; 
	}
	/**
	 * Getter of proposalReviewRepository
	 */
	public ProposalReviewRepository getProposalReviewRepository() {
	 	 return proposalReviewRepository; 
	}
	/**
	 * Setter of proposalReviewRepository
	 */
	public void setProposalReviewRepository(ProposalReviewRepository proposalReviewRepository) { 
		 this.proposalReviewRepository = proposalReviewRepository; 
	}
	/**
	 * Getter of eventRepository
	 */
	public EventRepository getEventRepository() {
	 	 return eventRepository; 
	}
	/**
	 * Setter of eventRepository
	 */
	public void setEventRepository(EventRepository eventRepository) { 
		 this.eventRepository = eventRepository; 
	}
	/**
	 * Getter of boothRepository
	 */
	public BoothRepository getBoothRepository() {
	 	 return boothRepository; 
	}
	/**
	 * Setter of boothRepository
	 */
	public void setBoothRepository(BoothRepository boothRepository) { 
		 this.boothRepository = boothRepository; 
	}
	/**
	 * Retrieves a single event by name from the database.
	 * @param eventName Name of the event to be retrieved.
	 * @return The event with the specified name.
	 */
	public Event retrieveEvent(String eventName) { 
		return null;
	 }
	/**
	 * Stores a ticket to the database.
	 * @param ticket Ticket object to be stored.
	 */
	public void storeTicket(Ticket ticket) { 
		// TODO Auto-generated method
	 }
	/**
	 * Retrieves the number of booths of some size available for 
	 * booking from the database for a given event. 
	 * @param eventName Name of the event to check availability for. 
	 * @param size Size of the desired booths.
	 * @return Number of booths of the given size available to be booked for that event.
	 */
	public int retrieveNumBoothAvailable(String eventName, String size) { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * Retrieves a single user by username from the database.
	 * @param username The username of the user to be retrieved.
	 * @return The user object with the given username
	 */
	public User retrieveUser(String username) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * Retrieves a single proposal by title from the database.
	 * @param proposalTitle The title of the Proposal to be retrieved.
	 * @return The proposal object with the given title.
	 */
	public Proposal retrieveProposal(String proposalTitle) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * Stores an event to the database.
	 * @param event Event to be stored.
	 */
	public void storeEvent(Event event) { 
		events.add(event);
		eventRepository.storeEvent(event);
	 }
	/**
	 * Retrieves the cost of a Booth for some event and 
	 * of certain size from the database.
	 * @param eventName Name of the event for the booth.
	 * @param size Desired booth size to be checked.
	 * @return Price of booking one booth of that size for that event.
	 */
	public double retrieveBoothCost(String eventName, String size) { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * Stores a user object to the database.
	 * @param user The user object to be stored.
	 */
	public void storeUser(User user) { 
		// TODO Auto-generated method
	 }
	/**
	 * Stores a payment object to the database.
	 * @param payment Payment object to be stored.
	 */
	public void storePayment(Payment payment) { 
		// TODO Auto-generated method
	 }
	/**
	 * Stores a proposal object to the database.
	 * @param proposal Proposal object to be stored.
	 */
	public void storeProposal(Proposal proposal) { 
		// TODO Auto-generated method
	 }
	/**
	 * Retrieves a list of events from the database.
	 * @return List of active events in the database.
	 */
	public Event retrieveEventsList() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * Retrieves a list of payments for a user from the database.
	 * @param user The user whose transactions we want to retrieve.
	 * @return The list of transactions associated with the user.
	 */
	public List<Payment> retrieveTransactionsList(User user) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * Stores a review object in the database.
	 * @param review The review object to be stored in the database.
	 */
	public void storeReview(ProposalReview review) { 
		// TODO Auto-generated method
	 }
	/**
	 * Stores a booth object in the database.
	 * @param booth The booth object to be stored in the database.
	 */
	public void storeBooth(Booth booth) { 
		// TODO Auto-generated method
	 }
	/**
	 * Stores a location object in the database.
	 * @param location The location object to be stored in the database.
	 */
	public void storeLocation(Location location) { 
		// TODO Auto-generated method
	 }
	/**
	 * Stores a new user in the database.
	 * @param user The user object to be stored in the database.Retrieves a single event by name from the database.
	 */
	public void storeNewUser(User user) { 
		// TODO Auto-generated method
	 } 

}
