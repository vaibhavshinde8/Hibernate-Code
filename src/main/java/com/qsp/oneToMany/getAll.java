package com.qsp.oneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class getAll {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	Bank bank = entityManager.find(Bank.class, 101);
	if(bank!=null) {
		System.out.println(bank.getId());
		System.out.println(bank.getName());
		System.out.println(bank.getIfdc());
		
		List<Accounts> account = bank.getAccount();
		System.out.println(account);
		for(Accounts ac:account) {
			
			System.out.println(ac.getAccno());
			System.out.println(ac.getId());
			System.out.println(ac.getBal());			
		}
	}
	
}
}
