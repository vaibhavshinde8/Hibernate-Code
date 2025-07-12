package com.mapping.oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	Car car2 = entityManager.find(Car.class, 1);
	Engine engine = entityManager.find(Engine.class,101);
	
	if(car2!=null ) {
		Engine engine2 = car2.getEngine();
		transaction.begin();
		entityManager.remove(car2);
		entityManager.remove(engine2);
		transaction.commit();
	}

}
}
