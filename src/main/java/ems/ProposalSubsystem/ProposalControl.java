package ems.ProposalSubsystem;

import ems.DataSubsystem.Datastore;
import ems.DataSubsystem.Proposal;
import ems.DataSubsystem.ProposalReview;
import ems.DataSubsystem.User;

/**
 * This is the main control class of the accounts subsystem.
 * It will handle all the requests for all modifications of user
 * or user status.
 * @see ems.ProposalSubsystem
 * @author emsTeam
 */
public class ProposalControl {

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
	 * This method is in charge of proposalReview submissions. It 
	 * should result in a new proposalReview record in the database. 
	 * @param review ProposalReview object to be recorded.
	 * @return ProposalListPage of the current reviewer.
	 */
	public String submitProposalReview(ProposalReview review) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Redirects to reviewProposalPage for the proposal with 
	 * the given proposal name.
	 * @param proposalName The name of the Proposal which is going to be reviewed. 
	 * @return ReviewProposalPage with the appropriate proposal information.
	 */
	public String goToReviewProposal(String proposalName) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * This method is in charge of proposal submissions. It 
	 * should result in a new proposal record in the database.
	 * @param proposal The proposal object to be recorded in the database.
	 * @return EventDetailsPage for the event for which the proposal was submitted.
	 */
	public String submitProposal(Proposal proposal) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * Notifies the speaker that his proposal has been reviewed.
	 * @param user Speaker user which will be notified. 
	 */
	public void notifyProposalReviewed(User user) { 
		// TODO Auto-generated method
	 }

	/**
	 * This method confirms that the proposalReview is valid and complete.
	 * @param review The proposalReview being validated. 
	 * @return True if the review is valid, false if it is not.
	 */
	private boolean validateProposalReview(ProposalReview review) { 
		// TODO Auto-generated method
		return false;
	 }

	/**
	 * Redirects to the SubmitProposalPage for some event.
	 * @param eventName The name of the event for which the proposal will be submitted.
	 * @return SubmitProposal page for the specified event.
	 */
	public String goToSubmitProposal(String eventName) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * This methods confirms that the proposal is valid and complete.
	 * @param proposal The review being validated.
	 * @return True if the proposal is valid, false if it is not.
	 */
	public boolean validateProposal(Proposal proposal) { 
		// TODO Auto-generated method
		return false;
	 } 

}
