package ems.DataSubsystem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProposalRepository {
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * Initializes the EntityManager used throughout the repository
	 * @param man EntityManager used to access data source
	 */
	public ProposalRepository(EntityManager man){
		this.manager = man;
	}
	
	/**
	 * Stores a proposal object to the database.
	 * @param proposal Proposal object to be stored.
	 */
	public void storeProposal(Proposal proposal) { 
		manager.getTransaction().begin();
		manager.persist(proposal);
		manager.getTransaction().commit();
	 }

	/**
	 * Retrieves a single proposal by title from the database.
	 * @param proposalTitle The title of the Proposal to be retrieved.
	 * @return The proposal object with the given title.
	 */
	public Proposal retrieveProposal(String proposalTitle) { 
		Proposal proposal = manager.createQuery("select p from Proposal p where p.title = :proposalTitle", Proposal.class)
							.setParameter("proposalTitle", proposalTitle)
							.getSingleResult();
		return proposal;
	 } 

}
