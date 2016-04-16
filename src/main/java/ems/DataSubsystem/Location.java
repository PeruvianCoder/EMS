package ems.DataSubsystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class used for the sole purpose of representing 
 * the state of a location object. JPA will be used to persist 
 * and retrieve these from the database by using the {@link ems.DataSubsystem.Datastore} 
 * and the {@link ems.DataSubsystem.LocationRepository}.
 * @author emsTeam
 */
@Entity
@Table (name="location")
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	/**
	 * Number of booths of medium size still available for booking.
	 */
	public Integer mediumBoothAvailable;
	/**
	 * Full address of this location.
	 */
	public String address;
	/**
	 * Maximum number of medium booths that can be booked in this location.
	 */
	public Integer mediumBoothMax;
	/**
	 * Maximum number of large booths that can be booked in this location.
	 */
	public Integer largeBoothMax;
	/**
	 * Maximum number of small booths that can be booked in this location.
	 */
	public Integer smallBoothMax;
	/**
	 * Number of booths of small size still available for booking.
	 */
	public Integer smallBoothAvailable;
	/**
	 * Number of booths of large size still available for booking.
	 */
	public Integer largeBoothAvailable;
	/**
	 * Name assigned to this location by the administrator.
	 */
	public String name;
	/**
	 * Getter of mediumBoothAvailable
	 */
	public Integer getMediumBoothAvailable() {
	 	 return mediumBoothAvailable; 
	}
	/**
	 * Setter of mediumBoothAvailable
	 */
	public void setMediumBoothAvailable(Integer mediumBoothAvailable) { 
		 this.mediumBoothAvailable = mediumBoothAvailable; 
	}
	/**
	 * Getter of address
	 */
	public String getAddress() {
	 	 return address; 
	}
	/**
	 * Setter of address
	 */
	public void setAddress(String address) { 
		 this.address = address; 
	}
	/**
	 * Getter of mediumBoothMax
	 */
	public Integer getMediumBoothMax() {
	 	 return mediumBoothMax; 
	}
	/**
	 * Setter of mediumBoothMax
	 */
	public void setMediumBoothMax(Integer mediumBoothMax) { 
		 this.mediumBoothMax = mediumBoothMax; 
	}
	/**
	 * Getter of largeBoothMax
	 */
	public Integer getLargeBoothMax() {
	 	 return largeBoothMax; 
	}
	/**
	 * Setter of largeBoothMax
	 */
	public void setLargeBoothMax(Integer largeBoothMax) { 
		 this.largeBoothMax = largeBoothMax; 
	}
	/**
	 * Getter of smallBoothMax
	 */
	public Integer getSmallBoothMax() {
	 	 return smallBoothMax; 
	}
	/**
	 * Setter of smallBoothMax
	 */
	public void setSmallBoothMax(Integer smallBoothMax) { 
		 this.smallBoothMax = smallBoothMax; 
	}
	/**
	 * Getter of smallBoothAvailable
	 */
	public Integer getSmallBoothAvailable() {
	 	 return smallBoothAvailable; 
	}
	/**
	 * Setter of smallBoothAvailable
	 */
	public void setSmallBoothAvailable(Integer smallBoothAvailable) { 
		 this.smallBoothAvailable = smallBoothAvailable; 
	}
	/**
	 * Getter of largeBoothAvailable
	 */
	public Integer getLargeBoothAvailable() {
	 	 return largeBoothAvailable; 
	}
	/**
	 * Setter of largeBoothAvailable
	 */
	public void setLargeBoothAvailable(Integer largeBoothAvailable) { 
		 this.largeBoothAvailable = largeBoothAvailable; 
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

}
