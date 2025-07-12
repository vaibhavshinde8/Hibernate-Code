package com.mapping.oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Engine engine=new Engine();
		engine.setId(101);
		engine.setHp(1200);
		
		
		Car car=new Car();
		car.setId(1);
		car.setName("Maruti");
		car.setPrice(7.2);
		car.setEngine(engine);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		entityManager.persist(engine);
		entityManager.persist(car);
		
		transaction.commit();
		
	}
}
