package com.aut.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="invites")
@Access(AccessType.FIELD)
public class Invites extends IdEntity {

	private static final long serialVersionUID = 1314151617181920L;	

	@Column(name = "firstname", nullable = false, length = 45)
	private String firstname;
	@Column(name = "lastname", nullable = false, length = 45)
	private String lastname;
	@Column(name = "money", nullable = false)
	private int money;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Invites(String firstname, String lastname, int money) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.money = money;
	}
	
	public Invites() {
		
	}
}
