package ems.EventSubsystem;

import java.util.List;

import ems.DataSubsystem.Booth;
import ems.DataSubsystem.Payment;
import ems.DataSubsystem.Ticket;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class TransactionHistoryPage {

	/**
	 * Tickets purchases to show in the page. 
	 */
	public List<Ticket> tickets;
	/**
	 * Payments made to show in the page.
	 */
	public List<Payment> payments;
	/**
	 * Booth objects to show in the page.
	 */
	public List<Booth> booths;
	/**
	 * Getter of tickets
	 */
	public List<Ticket> getTickets() {
	 	 return tickets; 
	}
	/**
	 * Setter of tickets
	 */
	public void setTickets(List<Ticket> tickets) { 
		 this.tickets = tickets; 
	}
	/**
	 * Getter of payments
	 */
	public List<Payment> getPayments() {
	 	 return payments; 
	}
	/**
	 * Setter of payments
	 */
	public void setPayments(List<Payment> payments) { 
		 this.payments = payments; 
	}
	/**
	 * Getter of booths
	 */
	public List<Booth> getBooths() {
	 	 return booths; 
	}
	/**
	 * Setter of booths
	 */
	public void setBooths(List<Booth> booths) { 
		 this.booths = booths; 
	}
	/**
	 * Filters the transactions displayed by event.
	 * @param eventName Name of the event for which the user wants to see transactions. 
	 */
	public void filterTransactions(String eventName) { 
		// TODO Auto-generated method
	 }
	/**
	 * This is when the transactionHistory page should be rendered and returned to the user.
	 * @param transactions transactions to be displayed.
	 */
	public void display(List<Payment> transactions) { 
		// TODO Auto-generated method
	 } 

}
