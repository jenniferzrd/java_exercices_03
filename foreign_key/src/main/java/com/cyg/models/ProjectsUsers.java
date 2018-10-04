package com.cyg.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="projects_users")
@Access(AccessType.FIELD)

public class ProjectsUsers {
	
	@Id
	@Column(name = "id_users")
	private int id_users;

	@Column(name = "id_plan")
	private int id_plan;

	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private List <User> user;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private List <Project> project;
	
	public int getId_users() {
		return id_users;
	}
	public void setId_users(int id_users) {
		this.id_users = id_users;
	}
	public int getId_plan() {
		return id_plan;
	}
	public void setId_plan(int id_plan) {
		this.id_plan = id_plan;
	}

	public ProjectsUsers(int id_users, int id_plan) {

		this.id_users = id_users;
		this.id_plan = id_plan;
	}

	public ProjectsUsers() {}
	
	public void setUser(List<User> user){
		this.user = user;
	}
	
	public List<User> getUser(){
		return this.user;
	}	

	public void setProject(List<Project> project){
		this.project = project;
	}
	
	public List<Project> getProject(){
		return this.project;
	}	
	
	public String toString(){
		String info = String.format("UserId: %s ----- ProjectId %s", this.id_users, this.id_plan);
		return info;
	}
}
