package ems.ProposalSubsystem;

import java.util.List;

import ems.DataSubsystem.Proposal;

/**
 * Shown here for purposes of documentation only. This will be implemented as a jsp page.
 * @author emsTeam 
 */
public class ProposalListPage {

	/**
	 * List of proposals to be displayed on this page.
	 */
	public List<Proposal> proposal;

	/**
	 * Getter of proposal
	 */
	public List<Proposal> getProposal() {
	 	 return proposal; 
	}

	/**
	 * Setter of proposal
	 */
	public void setProposal(List<Proposal> proposal) { 
		 this.proposal = proposal; 
	}

	/**
	 * Redirects to ReviewProposalPage.
	 * @param proposalName Name of the Proposal for which the review will be submitted.
	 */
	public void clickProposalTitle(String proposalName) { 
		// TODO Auto-generated method
	 } 

}
