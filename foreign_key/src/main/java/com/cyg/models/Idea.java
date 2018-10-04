package com.cyg.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="idea")
@Access(AccessType.FIELD)
public class Idea extends IdEntity {
	
	@Column(name = "title", nullable = false, length = 45)
	private String title;
	
	@Column(name = "img", nullable = false, length = 45)
	private String img;
	
	@Column(name = "comment", nullable = false, length = 45)
	private String comment;
	
	@Column(name = "price", nullable = false)
	private int price;
	
	@Column(name = "jaime")
	private boolean jaime;
	
	@Column(name = "quantity", nullable = false)
	private int quantity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private ProjectsIdeas projectsIdeas;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getComment() {
		return comment;
	}
	public void setDesc(String comment) {
		this.comment = comment;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isJaime() {
		return jaime;
	}
	public void setJaime(boolean jaime) {
		this.jaime = jaime;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Idea(String title, String img, String comment, int price, boolean jaime, int quantity) {
		super();
		this.title = title;
		this.img = img;
		this.comment = comment;
		this.price = price;
		this.jaime = jaime;
		this.quantity = quantity;
	}

	public Idea() {	}

}
