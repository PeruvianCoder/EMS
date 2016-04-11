package ems.DataSubsystem;

/**
 * Entity class used for the sole purpose of representing 
 * the state of a proposal object. JPA will be used to persist 
 * and retrieve these from the database by using the {@link ems.DataSubsystem.Datastore} 
 * and the {@link ems.DataSubsystem.ProposalRepository}.
 * @author emsTeam
 */
public class Proposal {

	/**
	 * Full text of the proposal.
	 */
	public String text;
	/**
	 * Title of provided by the speaker at submission of this proposal.
	 */
	public String title;
	/**
	 * Date on which the speaker wishes to present this proposal.
	 */
	public String date;
	/**
	 * The domain of expertise associated with this proposal.
	 * Used to chose the appropriate reviewer for it.
	 */
	public String domain;
	/**
	 * Abstract of this proposal.
	 */
	public String abstracts;
	/**
	 * Getter of text
	 */
	public String getText() {
	 	 return text; 
	}
	/**
	 * Setter of text
	 */
	public void setText(String text) { 
		 this.text = text; 
	}
	/**
	 * Getter of title
	 */
	public String getTitle() {
	 	 return title; 
	}
	/**
	 * Setter of title
	 */
	public void setTitle(String title) { 
		 this.title = title; 
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
	 * Getter of domain
	 */
	public String getDomain() {
	 	 return domain; 
	}
	/**
	 * Setter of domain
	 */
	public void setDomain(String domain) { 
		 this.domain = domain; 
	}
	/**
	 * Getter of abstracts
	 */
	public String getAbstracts() {
	 	 return abstracts; 
	}
	/**
	 * Setter of abstracts
	 */
	public void setAbstracts(String abstracts) { 
		 this.abstracts = abstracts; 
	} 

}
