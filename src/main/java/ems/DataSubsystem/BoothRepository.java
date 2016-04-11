package ems.DataSubsystem;

public class BoothRepository {

	/**
	 * Retrieves the number of booths of some size available for 
	 * booking from the database for a given event. 
	 * @param eventName Name of the event to check availability for. 
	 * @param size Size of the desired booths.
	 * @return Number of booths of the given size available to be booked for that event.
	 */
	public int retrieveNumBoothAvailable(String size, String eventName) { 
		// TODO Auto-generated method
		return 0;
	 }

	/**
	 * Stores a booth object in the database.
	 * @param booth The booth object to be stored in the database.
	 */
	public void storeBooth(Booth booth) { 
		// TODO Auto-generated method
	 }

	/**
	 * Retrieves the cost of a Booth for some event and 
	 * of certain size from the database.
	 * @param eventName Name of the event for the booth.
	 * @param size Desired booth size to be checked.
	 * @return Price of booking one booth of that size for that event.
	 */
	public double retrieveBoothCost(String size, String eventName) { 
		// TODO Auto-generated method
		return 0;
	 } 

}
