package ems.ProposalSubsystem;

import ems.DataSubsystem.Proposal;
import ems.DataSubsystem.ProposalReview;
import ems.DataSubsystem.User;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam
 */
public class ReviewProposalPage {

	/**
	 * Information entered by the reviewer.
	 */
	public ProposalReview review;

	/**
	 * Getter of review
	 */
	public ProposalReview getReview() {
	 	 return review; 
	}

	/**
	 * Setter of review
	 */
	public void setReview(ProposalReview review) { 
		 this.review = review; 
	}

	/**
	 * Submits the proposal review form.
	 * @param review The object containing the info entered by the reviewer.
	 */
	public void submitProposalReview(ProposalReview review) { 
		// TODO Auto-generated method
	 }

	/**
	 * Notifies the reviewer that his review has been submitted successfully. 
	 * @param user 
	 */
	public void notifyReviewSubmitted(User user) { 
		// TODO Auto-generated method
	 }

	/**
	 * This is when the reviewProposalsPage should be rendered and returned to the user.
	 * @param proposal the proposal to be reviewed.
	 */
	public void display(Proposal proposal) { 
		// TODO Auto-generated method
	 } 

}
