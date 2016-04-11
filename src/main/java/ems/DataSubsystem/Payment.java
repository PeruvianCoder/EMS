package ems.DataSubsystem;

/**
 * Entity class used for the sole purpose of representing 
 * the state of a payment object. JPA will be used to persist 
 * and retrieve these from the database by using the {@link ems.DataSubsystem.Datastore} 
 * and the {@link ems.DataSubsystem.PaymentRepository}.
 * @author emsTeam
 */
public class Payment {

	/**
	 * Full credit card number used for this payment.
	 */
	public String creditCardNumber;
	/**
	 * Date and time when this transaction was recorded.
	 */
	public String date;
	/**
	 * Email address associated with this transaction.
	 */
	public String email;
	/**
	 * Expiration date for the card used.
	 */
	public String creditCardExpirationDate;
	/**
	 * Amount charged to the credit card.
	 */
	public double amount;
	/**
	 * Billing address associated with the credit card.
	 */
	public String address;
	/**
	 * Getter of creditCardNumber
	 */
	public String getCreditCardNumber() {
	 	 return creditCardNumber; 
	}
	/**
	 * Setter of creditCardNumber
	 */
	public void setCreditCardNumber(String creditCardNumber) { 
		 this.creditCardNumber = creditCardNumber; 
	}
	/**
	 * Getter of date
	 */
	public String getDate() {
	 	 return date; 
	}
	/**
	 * Setter of date
	 */
	public void setDate(String date) { 
		 this.date = date; 
	}
	/**
	 * Getter of email
	 */
	public String getEmail() {
	 	 return email; 
	}
	/**
	 * Setter of email
	 */
	public void setEmail(String email) { 
		 this.email = email; 
	}
	/**
	 * Getter of creditCardExpirationDate
	 */
	public String getCreditCardExpirationDate() {
	 	 return creditCardExpirationDate; 
	}
	/**
	 * Setter of creditCardExpirationDate
	 */
	public void setCreditCardExpirationDate(String creditCardExpirationDate) { 
		 this.creditCardExpirationDate = creditCardExpirationDate; 
	}
	/**
	 * Getter of amount
	 */
	public double getAmount() {
	 	 return amount; 
	}
	/**
	 * Setter of amount
	 */
	public void setAmount(double amount) { 
		 this.amount = amount; 
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

}
