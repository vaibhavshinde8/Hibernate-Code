package com.manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	
	Product product=new Product();
	product.setName("MI");
	product.setPrice(12000.7);
	
	Reviews review1=new Reviews();
	review1.setRating(1);
	review1.setReview("bad");
	review1.setProduct(product);

	Reviews review2=new Reviews();
	review2.setRating(3);
	review2.setReview("average");
	review2.setProduct(product);
	
	Reviews review3=new Reviews();
	review3.setRating(5);
	review3.setReview("good");
	review3.setProduct(product);
	
	
	transaction.begin();
	entityManager.persist(review1);
	entityManager.persist(review2);
	entityManager.persist(review3);
	entityManager.persist(product);
	transaction.commit();
	
	
	
}
}
