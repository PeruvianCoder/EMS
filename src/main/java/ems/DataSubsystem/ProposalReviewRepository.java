package ems.DataSubsystem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProposalReviewRepository {
	@PersistenceContext
	private EntityManager manager;
	
	/**
	 * Initializes the EntityManager used throughout the repository
	 * @param man EntityManager used to access data source
	 */
	public ProposalReviewRepository(EntityManager man){
		this.manager = man;
	}
	
	/**
	 * Retrieves the proposal review for the proposal 
	 * with the given title from the database.
	 * @param proposalTitle Title of the proposal for which the review was made.
	 * @return The proposal review made for that proposal.
	 */
	public ProposalReview retrieveProposalReview(String proposalTitle) { 
		ProposalReview propReview = manager.createQuery("select pr from ProposalReview pr where pr.title = :proposalTitle", ProposalReview.class)
									.setParameter("proposalTitle", proposalTitle)
									.getSingleResult();
		return propReview;
	 }

	/**
	 * Stores a review object in the database.
	 * @param review The review object to be stored in the database.
	 */
	public void storeProposalReview(ProposalReview review) { 
		manager.getTransaction().begin();
		manager.persist(review);
		manager.getTransaction().commit();
	 } 

}
