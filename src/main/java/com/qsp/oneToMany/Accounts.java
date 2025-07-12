package com.qsp.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {
	
	@Id
	private int id;
	private long accno;
	private long bal;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public long getBal() {
		return bal;
	}
	public void setBal(long bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Accounts [id=" + id + ", accno=" + accno + ", bal=" + bal + "]";
	}
	
}
