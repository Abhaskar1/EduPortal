package com.akshay.eduportal.EduPortal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="course_name",nullable=false)
	private String courseName;

	@Column(name="course_description",nullable=false)
	private String courseDescription;

	@Column(name="course_duration",nullable=false)
	private String courseDuration;
	
	@ManyToMany
	private List<User> users=new ArrayList<>();;
	
	public Course() {}
	
	public Course(String courseName, String courseDescription, String courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseDuration = courseDuration;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	public List<User> getUsers(){
		return users;
	}
	
	public void addUser(User u) {
		users.add(u);
	}
	
	
}
