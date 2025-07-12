package com.mapping.oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindCar {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Car car2 = entityManager.find(Car.class, 1);
		
		if(car2!=null) {
			System.out.println(car2.getId());
			System.out.println(car2.getName());
			System.out.println(car2.getPrice());
			
			Engine engine2 = car2.getEngine();
			System.out.println(engine2.getId());
			System.out.println(engine2.getHp());
			
		}
	}

	
}
