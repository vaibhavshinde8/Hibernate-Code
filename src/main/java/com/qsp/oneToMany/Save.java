package com.qsp.oneToMany;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Bank bank=new Bank();
		bank.setId(101);
		bank.setName("SBI");
		bank.setIfdc("SBI00007");
		
		
		Accounts account1=new Accounts();
		account1.setId(1);
		account1.setAccno(7982622);
		account1.setBal(80000);
		
		
		Accounts account2=new Accounts();
		account2.setId(2);
		account2.setAccno(976622);
		account2.setBal(960000);
		
		Accounts account3=new Accounts();
		account3.setId(3);
		account3.setAccno(32622);
		account3.setBal(420000);
		
		
		List<Accounts>accounts=new ArrayList<Accounts>();
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);	
		
		bank.setAccount(accounts);
		
		transaction.begin();
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityManager.persist(account3);
		entityManager.persist(bank);
		transaction.commit();
		
		
		
	}
}
