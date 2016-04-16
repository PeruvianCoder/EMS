package ems.DataSubsystem;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class used for the sole purpose of representing 
 * the state of a ticket object. JPA will be used to persist 
 * and retrieve these from the database by using the {@link ems.DataSubsystem.Datastore} 
 * and the {@link ems.DataSubsystem.TicketRepository}.
 * @author emsTeam
 */
@Entity
@Table (name="tickets")
public class Ticket {

	/**
	 * Number of tickets purchased.
	 */
	public Integer count;
	/**
	 * Price per ticket paid.
	 */
	public double price;
	/**
	 * Number of this ticket transaction.
	 */
	public Integer number;
	/**
	 * Name of the event for which this ticket was purchased.
	 */
	public String eventName;
	/**
	 * Getter of count
	 */
	public Integer getCount() {
	 	 return count; 
	}
	/**
	 * Setter of count
	 */
	public void setCount(Integer count) { 
		 this.count = count; 
	}
	/**
	 * Getter of price
	 */
	public double getPrice() {
	 	 return price; 
	}
	/**
	 * Setter of price
	 */
	public void setPrice(double price) { 
		 this.price = price; 
	}
	/**
	 * Getter of number
	 */
	public Integer getNumber() {
	 	 return number; 
	}
	/**
	 * Setter of number
	 */
	public void setNumber(Integer number) { 
		 this.number = number; 
	}
	/**
	 * Getter of eventName
	 */
	public String getEventName() {
	 	 return eventName; 
	}
	/**
	 * Setter of eventName
	 */
	public void setEventName(String eventName) { 
		 this.eventName = eventName; 
	} 

}
