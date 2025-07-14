package com.manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	Reviews reviews = new Reviews();
	Reviews reviews2 = entityManager.find(Reviews.class, 1);
System.out.println(reviews2.getId());
System.out.println(reviews2.getRating());
System.out.println(reviews2.getReview());
System.out.println(reviews2.getProduct());
}
}
