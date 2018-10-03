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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="roles")
@Access(AccessType.FIELD)

public class Roles  {

	@Id
	@Column(name = "roles_rolecode")
	private String roles_rolecode;

	@Column(name = "roles_rolename")
	private String roles_rolename;
	
//	@OneToMany(fetch = FetchType.LAZY)
//	@JsonManagedReference
//	
//	private List<User> user;
	
	public Roles() {
		
	}
	
	public String getRoles_rolecode() {
		return roles_rolecode;
	}

	public void setRoles_rolecode(String roles_rolecode) {
		this.roles_rolecode = roles_rolecode;
	}

	public String getRoles_rolename() {
		return roles_rolename;
	}
	
	public Roles(String roles_rolecode, String roles_rolename) {
		
		this.roles_rolecode = roles_rolecode;
		this.roles_rolename = roles_rolename;
	}
	
//	public void setUser(List<User> user){
//		this.user = user;
//	}
//	
//	public List<User> getUser(){
//		return this.user;
//	}	
	
//	public String toString(){
//		String info = String.format("Roles: %s", this.roles_rolename);
//		return info;
//	}
}
