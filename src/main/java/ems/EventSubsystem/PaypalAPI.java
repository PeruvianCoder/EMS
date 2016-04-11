package ems.EventSubsystem;

import ems.DataSubsystem.Payment;

/**
 * This class is in charge of all communication with the paypal API. 
 * It is sort of a facade class for the Paypal web service.
 * @author emsTeam
 *
 */
public class PaypalAPI {

	/**
	 * Redirects the user to paypal so that he can pay.
	 * @param payment Payment to be made on paypal.
	 */
	public void displayPaymentPage(Payment payment) { 
		// TODO Auto-generated method
	 }

	/**
	 * This is what happens when the user finally pays on Paypal.
	 * @param payment Payment that the user made on Paypal.
	 */
	public void payNow(Payment payment) { 
		// TODO Auto-generated method
	 } 

}
