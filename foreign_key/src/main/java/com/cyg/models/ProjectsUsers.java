package com.cyg.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@IdClass(ProjectsUsersId.class)
@Table(name="projects_users")
@Access(AccessType.FIELD)

public class ProjectsUsers {

	@EmbeddedId
	private ProjectsUsersId projectsUsersId;
	
///// VERSION 1
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "id", unique = true, nullable = false)
//	private int id;
//	
//	@Column(name = "id_users")
//	private int id_users;
//
//	@Column(name = "id_plan")
//	private int id_plan;

//	@OneToMany(mappedBy="projectsUsers",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JsonIgnore
//	private List <User> user;
	
//	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JsonIgnore
//	private List <Project> project;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "id_users", insertable = false, updatable = false)
	private User user;
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public int getId_users() {
//		return id_users;
//	}
//	public void setId_users(int id_users) {
//		this.id_users = id_users;
//	}
//	
//	public int getId_plan() {
//		return id_plan;
//	}
//	public void setId_plan(int id_plan) {
//		this.id_plan = id_plan;
//	}

//	public ProjectsUsers(int id_users, int id_plan) {
//		this.id = id;
//		this.id_users = id_users;
//		this.id_plan = id_plan;
//	}
//	
//	public ProjectsUsers(int id, int id_users) {
//	this.id = id;
//	this.id_users = id_users;
//}

	public ProjectsUsers() {}
	
//	public void setUser(List<User> user){
//		this.user = user;
//	}
//	
//	public List<User> getUser(){
//		return this.user;
//	}	

//	public void setProject(List<Project> project){
//		this.project = project;
//	}
//	
//	public List<Project> getProject(){
//		return this.project;
//	}	
	
//	public ProjectsUsers(int id, int id_users, int id_plan, List<User> user, List<Project> project) {
//		super();
//		this.id = id;
//		this.id_users = id_users;
//		this.id_plan = id_plan;
//		this.user = user;
//		this.project = project;
//	}
	
//	public String toString(){
//		String info = String.format("Id: %s ----- UserId: %s ----- ProjectId %s", this.id, this.id_users, this.id_plan);
//		return info;
//	}
//public ProjectsUsers(int id, int id_users, int id_plan, User user) {
//	super();
//	this.id = id;
//	this.id_users = id_users;
//	this.id_plan = id_plan;
//	this.user = user;
//}
	
//	public ProjectsUsers(int id, int id_users, List<User> user) {
//		super();
//		this.id = id;
//		this.id_users = id_users;
//		this.user = user;
//	}
	
	
	
///// FIN VERSION 1
	
//	@EmbeddedId
//	private ProjectsUsersId projectsUsersId;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//    private Set<User> user;
//	
//	public ProjectsUsers() {
//	}
//
//	public ProjectsUsers(ProjectsUsersId projectsUsersId, Set<User> user) {
//		super();
//		this.projectsUsersId = projectsUsersId;
//		this.user = user;
//	}
//
//	public Set<User> getUser() {
//		return user;
//	}
//
//	public void setUser(Set<User> user) {
//		this.user = user;
//	}
//
	public ProjectsUsersId getProjectsUsersId() {
		return projectsUsersId;
	}

	public void setProjectsUsersId(ProjectsUsersId projectsUsersId) {
		this.projectsUsersId = projectsUsersId;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public ProjectsUsers(ProjectsUsersId projectsUsersId, User user) {
		super();
		this.projectsUsersId = projectsUsersId;
		this.user = user;
	}
	
	
}
