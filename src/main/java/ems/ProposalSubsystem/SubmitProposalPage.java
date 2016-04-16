package ems.ProposalSubsystem;

import ems.DataSubsystem.Proposal;
import ems.DataSubsystem.User;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class SubmitProposalPage {

	/**
	 * Proposal information entered by the speaker.
	 */
	public Proposal proposal;

	/**
	 * Getter of proposal
	 */
	public Proposal getProposal() {
	 	 return proposal; 
	}

	/**
	 * Setter of proposal
	 */
	public void setProposal(Proposal proposal) { 
		 this.proposal = proposal; 
	}

	/**
	 * This is when the events page should be rendered and returned to the user.
	 */
	public void display() { 
		// TODO Auto-generated method
	 }

	/**
	 * Notifies the user that his proposal has been submitted successfully.
	 * @param user User to be notified.
	 */
	public void notifyProposalSubmitted(User user) { 
		// TODO Auto-generated method
	 }

	/**
	 * Submits the proposal form to the server.
	 * @param proposal Proposal information entered by user to be submitted.
	 */
	public void clickSubmit(Proposal proposal) { 
		// TODO Auto-generated method
	 } 

}
