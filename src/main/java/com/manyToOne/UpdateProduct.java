package com.manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateProduct {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Reviews reviews = entityManager.find(Reviews.class, 1);
		if(reviews!=null) {
			transaction.begin();
			Product product = reviews.getProduct();
			product.setPrice(806);
			entityManager.merge(product);
			transaction.commit();
		}
		else {
			System.out.println("Reviews not found");
		}
		
		//System.out.print(reviews);
	}
}
