package com.akshay.eduportal.EduPortal.repository;

import java.util.List;

import com.akshay.eduportal.EduPortal.model.Course;

public interface CourseRepository {

	Course insertOrUpdate(Course c);
	Course findById(long id);
	void deleteById(long id);
	List<Course> listAll();
	
}
