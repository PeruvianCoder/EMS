package ems.DataSubsystem;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity class used for the sole purpose of representing 
 * the state of a proposalReview object. JPA will be used to persist 
 * and retrieve these from the database by using the {@link ems.DataSubsystem.Datastore} 
 * and the {@link ems.DataSubsystem.ProposalReviewRepository}.
 * @author emsTeam
 */
public class ProposalReview {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	/**
	 * Title of proposal.
	 */
	public String title;
	/**
	 * Reviewer comments when reviewing the proposal.
	 */
	public String comments;
	/**
	 * Decision the reviewer reached when reviewing the proposal.
	 */
	public String decision;
	/**
	 * Getter of comments
	 */
	public String getComments() {
	 	 return comments; 
	}
	/**
	 * Setter of comments
	 */
	public void setComments(String comments) { 
		 this.comments = comments; 
	}
	/**
	 * Getter of decision
	 */
	public String getDecision() {
	 	 return decision; 
	}
	/**
	 * Setter of decision
	 */
	public void setDecision(String decision) { 
		 this.decision = decision; 
	}
	
	/**
	 * Getter of title
	 */
	public String getTitle() {
	 	 return title; 
	}

}
