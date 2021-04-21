package com.akshay.eduportal.EduPortal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="first_name",nullable=false)
	private String firstName;

	@Column(name="last_name",nullable=false)
	private String lastName;

	@Column(name="email",nullable=false)
	private String email;

	@ManyToMany(mappedBy="users")
	private List<Course> courses=new ArrayList<>();;
	
	
	public User(){}
	
	public User(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Course> getCourses(){
		return courses;
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
}
