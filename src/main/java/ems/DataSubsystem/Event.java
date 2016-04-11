package ems.DataSubsystem;

/**
 * Entity class used for the sole purpose of representing 
 * the state of an event object. JPA will be used to persist 
 * and retrieve these from the database by using the {@link ems.DataSubsystem.Datastore} 
 * and the {@link ems.DataSubsystem.EventRepository}.
 * @author emsTeam
 */
public class Event {

	/**
	 * Path of the event image on the server.
	 */
	public String image;
	/**
	 * Cost of a ticket for this event.
	 */
	public double ticketPrice;
	/**
	 * Starting time for this event.
	 */
	public String time;
	/**
	 * Long description of this event. Anything that doesn't 
	 * fit in any of the other fields can be put here.
	 */
	public String description;
	/**
	 * Name of this event.
	 */
	public String name;
	/**
	 * Category of the event(e.g. Trade Show)
	 */
	public String category;
	/**
	 * Starting date of the event. Should be in the future.
	 */
	public String startDate;
	/**
	 * Whether proposals can be submitted for this event.
	 */
	public Boolean proposalsAllowed;
	/**
	 * Location where this event will be held.
	 */
	public String location;
	/**
	 * Ending date of the event. Should be after the start date.
	 */
	public String endDate;
	
	public Event(String eventName, String date, String location, String category){
		name = eventName;
		startDate = date;
		this.location= location;
		this.category = category;
	}
	/**
	 * Getter of image
	 */
	public String getImage() {
	 	 return image; 
	}
	/**
	 * Setter of image
	 */
	public void setImage(String image) { 
		 this.image = image; 
	}
	/**
	 * Getter of ticketPrice
	 */
	public double getTicketPrice() {
	 	 return ticketPrice; 
	}
	/**
	 * Setter of ticketPrice
	 */
	public void setTicketPrice(double ticketPrice) { 
		 this.ticketPrice = ticketPrice; 
	}
	/**
	 * Getter of time
	 */
	public String getTime() {
	 	 return time; 
	}
	/**
	 * Setter of time
	 */
	public void setTime(String time) { 
		 this.time = time; 
	}
	/**
	 * Getter of description
	 */
	public String getDescription() {
	 	 return description; 
	}
	/**
	 * Setter of description
	 */
	public void setDescription(String description) { 
		 this.description = description; 
	}
	/**
	 * Getter of name
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * Getter of category
	 */
	public String getCategory() {
	 	 return category; 
	}
	/**
	 * Setter of category
	 */
	public void setCategory(String category) { 
		 this.category = category; 
	}
	/**
	 * Getter of startDate
	 */
	public String getStartDate() {
	 	 return startDate; 
	}
	/**
	 * Setter of startDate
	 */
	public void setStartDate(String startDate) { 
		 this.startDate = startDate; 
	}
	/**
	 * Getter of proposalsAllowed
	 */
	public Boolean getProposalsAllowed() {
	 	 return proposalsAllowed; 
	}
	/**
	 * Setter of proposalsAllowed
	 */
	public void setProposalsAllowed(Boolean proposalsAllowed) { 
		 this.proposalsAllowed = proposalsAllowed; 
	}
	/**
	 * Getter of location
	 */
	public String getLocation() {
	 	 return location; 
	}
	/**
	 * Setter of location
	 */
	public void setLocation(String location) { 
		 this.location = location; 
	}
	/**
	 * Getter of endDate
	 */
	public String getEndDate() {
	 	 return endDate; 
	}
	/**
	 * Setter of endDate
	 */
	public void setEndDate(String endDate) { 
		 this.endDate = endDate; 
	} 

}
