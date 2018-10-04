package com.cyg.models;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="ProjectsIdeas")
@Table(name="projects_ideas")
@Access(AccessType.FIELD)
public class ProjectsIdeas {

//	@EmbeddedId 
//	ProjectsIdeasId id;
//
//	public ProjectsIdeasId getId() {
//		return id;
//	}
//
//	public void setId(ProjectsIdeasId id) {
//		this.id = id;
//	}
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "id_ideas")
	private int id_ideas;
	
	@Column(name = "id_projects")
	private int id_projects;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	List<Idea> idea;
	
	public int getId_ideas() {
		return id_ideas;
	}
	public void setId_ideas(int id_ideas) {
		this.id_ideas = id_ideas;
	}
	public int getId_projects() {
		return id_projects;
	}
	public void setId_projects(int id_projects) {
		this.id_projects = id_projects;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public ProjectsIdeas() {
	}
	
	public ProjectsIdeas(int id, int id_ideas, int id_projects) {
		super();
		this.id = id;
		this.id_ideas = id_ideas;
		this.id_projects = id_projects;
	}
	
	public List<Idea> getIdea() {
		return idea;
	}
	public void setIdea(List<Idea> idea) {
		this.idea = idea;
	}
//	
//	public ProjectsIdeasId() {
//	}
//	
//	public ProjectsIdeasId(int id, int id_ideas, int id_projects) {
//		this.id = id;
//		this.id_ideas = id_ideas;
//		this.id_projects = id_projects;
//	}
	
	public String toString(){
		String info = String.format("IdeaId: %s", this.id_ideas);
		return info;
	}
}
