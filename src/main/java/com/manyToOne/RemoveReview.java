package com.manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveReview {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
			Reviews reviews = entityManager.find(Reviews.class, 7);
			transaction.begin();
			if(reviews!=null) {
				entityManager.remove(reviews);
			}
			else {
				System.out.println("Review is not found with given Id");
			}
			transaction.commit();
	}
	
	
}
