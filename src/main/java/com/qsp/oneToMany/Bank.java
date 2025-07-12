package com.qsp.oneToMany;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int id;
	private String name;
	private String ifdc;
	
	@OneToMany
	List<Accounts>account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIfdc() {
		return ifdc;
	}

	public void setIfdc(String ifdc) {
		this.ifdc = ifdc;
	}

	public List<Accounts> getAccount() {
		return account;
	}

	public void setAccount(List<Accounts> account) {
		this.account = null;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", ifdc=" + ifdc + ", account=" + account + "]";
	}
	
	
	
}
