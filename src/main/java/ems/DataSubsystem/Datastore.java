package ems.DataSubsystem;

import java.util.List;

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

    /**
     * To be used for retrieving/persisting location objects to the database.
     */
    private LocationRepository locationRepository;

    /**
     * To be used for retrieving/persisting proposal objects to the database.
     */
    private ProposalRepository proposalRepository;

    /**
     * To be used for retrieving/persisting user objects to the database.
     */
    private UserRepository userRepository;

    /**
     * To be used for retrieving/persisting payment objects to the database.
     */
    private PaymentRepository paymentRepository;

    /**
     * To be used for retrieving/persisting proposalReview objects to the database.
     */
    private ProposalReviewRepository proposalReviewRepository;

    /**
     * To be used for retrieving/persisting event objects to the database.
     */
    private EventRepository eventRepository;

    /**
     * To be used for retrieving/persisting booth objects to the database.
     */
    private BoothRepository boothRepository;

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
        return eventRepository.retrieveEvent(eventName);
    }
    /**
     * Stores a ticket to the database.
     * @param ticket Ticket object to be stored.
     */
    public void storeTicket(Ticket ticket) {
        ticketRepository.storeTicket(ticket);
    }
    /**
     * Retrieves the number of booths of some size available for
     * booking from the database for a given event.
     * @param eventName Name of the event to check availability for.
     * @param size Size of the desired booths.
     * @return Number of booths of the given size available to be booked for that event.
     */
    public int retrieveNumBoothAvailable(Event event, String size) {
        return boothRepository.retrieveNumBoothAvailable(size,event);
    }
    /**
     * Retrieves a single user by username from the database.
     * @param username The username of the user to be retrieved.
     * @return The user object with the given username
     */
    public User retrieveUser(String username) {
        return userRepository.retrieveUser(username);
    }
    /**
     * Retrieves a single proposal by title from the database.
     * @param proposalTitle The title of the Proposal to be retrieved.
     * @return The proposal object with the given title.
     */
    public Proposal retrieveProposal(String proposalTitle) {
        return proposalRepository.retrieveProposal(proposalTitle);
    }
    /**
     * Stores an event to the database.
     * @param event Event to be stored.
     */
    public void storeEvent(Event event) {
        eventRepository.storeEvent(event);
    }
    /**
     * Retrieves the cost of a Booth for some event and
     * of certain size from the database.
     * @param eventName Name of the event for the booth.
     * @param size Desired booth size to be checked.
     * @return Price of booking one booth of that size for that event.
     */
    public double retrieveBoothCost(Event event, String size) {
        return boothRepository.retrieveBoothCost(size,event);
    }
    /**
     * Stores a user object to the database.
     * @param user The user object to be stored.
     */
    public void storeUser(User user) {
        //todo logic to verify whether the user already exists or not
        userRepository.storeUser(user);
    }
    /**
     * Stores a payment object to the database.
     * @param payment Payment object to be stored.
     */
    public void storePayment(Payment payment) {
        paymentRepository.storePayment(payment);
    }
    /**
     * Stores a proposal object to the database.
     * @param proposal Proposal object to be stored.
     */
    public void storeProposal(Proposal proposal) {
        proposalRepository.storeProposal(proposal);
    }
    /**
     * Retrieves a list of events from the database.
     * @return List of active events in the database.
     */
    public List<Event> retrieveEventsList() {
        return eventRepository.retrieveEventsList();
    }
    /**
     * Retrieves a list of payments for a user from the database.
     * @param user The user whose transactions we want to retrieve.
     * @return The list of transactions associated with the user.
     */
    public List<Payment> retrieveTransactionsList(User user) {
        // TODO i believe a transaction is more than just a payment???
        return paymentRepository.retrievePaymentsList(user);
    }
    /**
     * Stores a review object in the database.
     * @param review The review object to be stored in the database.
     */
    public void storeReview(ProposalReview review) {
        proposalReviewRepository.storeProposalReview(review);
    }
    /**
     * Stores a booth object in the database.
     * @param booth The booth object to be stored in the database.
     */
    public void storeBooth(Booth booth) {
        boothRepository.storeBooth(booth);
    }
    /**
     * Stores a location object in the database.
     * @param location The location object to be stored in the database.
     */
    public void storeLocation(Location location) {
        locationRepository.storeLocation(location);
    }
    /**
     * Stores a new user in the database.
     * @param user The user object to be stored in the database.Retrieves a single event by name from the database.
     */
    public void storeNewUser(User user) {
        userRepository.storeUser(user);
    }
    
    /**
     * Retrieves a list of locations available for a particular event.
     */
    public List<Location> retrieveLocationsList(){
    	return locationRepository.retrieveLocationsList();
    }
}

