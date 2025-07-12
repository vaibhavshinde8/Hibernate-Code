package com.qsp.oneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAccount {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	Bank bank = entityManager.find(Bank.class, 101);
	System.out.print("bank"+bank);
	
	transaction.begin();
	for (Accounts acc : bank.getAccount()) {
	    if (acc.getId() == 1) {
	        bank.getAccount().remove(acc);    
	        entityManager.remove(acc);
	        break;
	    }
	}
	entityManager.merge(bank);
	transaction.commit();
	
//	for(Bank ac:bank) {
//		
//	}
	 
	
//	if(account!=null) {
//	transaction.begin();
//	entityManager.remove(account);
//	transaction.commit();
//	}
//	else {
//		System.out.println("Account not found.......!");
//	}
	
	
	
}
}
