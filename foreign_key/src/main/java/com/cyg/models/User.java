package com.cyg.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="user")
@Access(AccessType.FIELD)

public class User extends IdEntity {


	private static final long serialVersionUID = 1314151617181920L;	

	@Column(name = "firstname", nullable = false, length = 45)
	private String firstname;
	@Column(name = "lastname", nullable = false, length = 45)
	private String lastname;
	@Column(name = "money", nullable = false)
	private int money;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roles_id")
	private Roles roles;
	
	////// VERSION 1
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id", insertable = false, updatable = false)
//	private ProjectsUsers projectsUsers;
	////// FIN VERSION 1
	
//	@ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name = "id_users")
//	private ProjectsUsers projectsUsers;
//	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ProjectsUsers> projectsUsers;
	
	public User() {
		
	}
	
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
    
	public User(String firstname, String lastname, int money) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.money = money;
	}
	
	public User(String firstname, String lastname, int money, Roles roles) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.money = money;
		this.roles = roles;
	}
	
//	public User(String firstname, String lastname, int money, ProjectsUsers projectsUsers) {
//
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.money = money;
//		this.projectsUsers = projectsUsers;
//	}
	
	public String toString(){
	String info = String.format("User: %s is %s", this.firstname, this.roles.getRoles_rolecode());
	return info;
}

public User(String firstname, String lastname, int money, Roles roles, List<ProjectsUsers> projectsUsers) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.money = money;
	this.roles = roles;
	this.projectsUsers = projectsUsers;
}
}
