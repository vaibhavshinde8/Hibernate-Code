package com.qsp.oneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class getOneAccount {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	Bank bank = entityManager.find(Bank.class, 101);
	//System.out.print("bank"+bank);
	
	for (Accounts acc : bank.getAccount()) {
	    if (acc.getId() == 2) {
	       System.out.println(acc.getAccno());   
	       System.out.println(acc.getBal());   
	       System.out.println(acc.getId());   
	        break;
	    }
	}
	;
	
}
}
